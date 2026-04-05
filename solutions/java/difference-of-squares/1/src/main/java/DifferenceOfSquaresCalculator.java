class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int res = 0;
        for (int i = 1; i <= input; i++) {
            res += i;
        }
        return res * res;
    }

    int computeSumOfSquaresTo(int input) {
        int res = 0;
        for (int i = 1; i <= input; i++) {
            res += i * i;
        }
        return res;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}
