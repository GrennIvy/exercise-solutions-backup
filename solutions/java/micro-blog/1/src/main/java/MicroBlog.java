class MicroBlog {
    public String truncate(String input) {
        if (input == null) {
            return input;
        }
        int codePointCount = input.codePointCount(0, input.length());
        if (codePointCount <= 5) {
            return input;
        }
        int end = input.offsetByCodePoints(0, 5);
        return input.substring(0, end);
    }
}
