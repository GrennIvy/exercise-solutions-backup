class Darts {
    int score(double xOfDart, double yOfDart) {
        double d = distance(xOfDart, yOfDart);
        if (d <= 1) {
            return 10;
        } else if (d <= 5) {
            return 5;
        } else if (d <= 10) {
            return 1;
        } else {
            return 0;
        }
    }

    double distance(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }
}
