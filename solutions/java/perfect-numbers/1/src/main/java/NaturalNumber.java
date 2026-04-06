import java.util.*;

class NaturalNumber {
    int number;
    List<Integer> factors;

    NaturalNumber(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        }
        this.number = number;
        factors = new ArrayList<>();
        if (number != 1) {
            factors.add(1);
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
                if (i != number / i) {
                    factors.add(number / i);
                }
            }
        }
    }

    Classification getClassification() {
        if (number == 1) {
            return Classification.DEFICIENT;
        }
        int sum = 0;
        for (int i : factors) {
            sum += i;
        }
        if (sum > number) {
            return Classification.ABUNDANT;
        } else if (sum == number) {
            return Classification.PERFECT;
        } else {
            return Classification.DEFICIENT;
        }
    }
}
