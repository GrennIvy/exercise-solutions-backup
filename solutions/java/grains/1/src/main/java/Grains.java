import java.math.BigInteger;

class Grains {
    private BigInteger[] arr = new BigInteger[64];
    private BigInteger sum = BigInteger.ONE;

    Grains() {
        arr[0] = BigInteger.ONE;
        for (int i = 1; i < 64; i++) {
            arr[i] = arr[i - 1].multiply(BigInteger.valueOf(2));
            sum = sum.add(arr[i]);
        }
    }

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return arr[square - 1];
    }

    BigInteger grainsOnBoard() {
        return sum;
    }

}
