class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        if (numberToCheck >= 0 && numberToCheck < 10) {
            return true;
        }
        int sum = 0, n = (int) Math.log10(numberToCheck) + 1, t = numberToCheck;
        while (t > 0) {
            int digit = t % 10;
            t /= 10;
            sum += Math.pow(digit, n);
        }
        return sum == numberToCheck;
    }

}
