public class Say {
    static final String[] ONES = {
            "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
    };
    static final String[] TENS = {
            "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    static final String[] THOUSANDS = { "", "thousand", "million", "billion" };

    public String say(long number) {
        if (number < 0 || number >= 1_000_000_000_000L) {
            throw new IllegalArgumentException("Number must be between 0 and 999,999,999,999");
        }
        if (number == 0) {
            return "zero";
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; number > 0; i++) {
            int chunk = (int) (number % 1000);
            if (chunk != 0) {
                res.insert(0, convert(chunk) + (i > 0 ? " " + THOUSANDS[i] + (res.length() > 0 ? " " : "") : ""));
            }
            number /= 1000;
        }
        return res.toString();
    }

    String convert(int n) {
        String res = "";
        if (n >= 100) {
            res = ONES[n / 100] + " hundred";
            n %= 100;
            if (n > 0) {
                res += " ";
            }
        }
        if (n >= 20) {
            res += TENS[n / 10];
            n %= 10;
            if (n > 0)
                res += "-" + ONES[n];
        } else if (n > 0) {
            res += ONES[n];
        }
        return res;
    }
}
