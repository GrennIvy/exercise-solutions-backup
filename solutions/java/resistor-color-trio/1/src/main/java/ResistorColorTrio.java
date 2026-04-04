class ResistorColorTrio {
    enum Color {
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        violet,
        grey,
        white
    }

    String label(String[] colors) {
        if (colors.length == 0) {
            throw new IllegalArgumentException("no colors provided");
        }
        long res = Color.valueOf(colors[0]).ordinal();
        String unit = "ohms";
        if (colors.length > 1) {
            res = res * 10 + Color.valueOf(colors[1]).ordinal();
            if (colors.length > 2) {
                long t = Color.valueOf(colors[2]).ordinal();
                res *= Math.pow(10, t);
            }
        }
        if (res >= 1e9 && res % 1e9 == 0) {
            unit = "gigaohms";
            res /= 1e9;
        } else if (res >= 1e6 && res % 1e6 == 0) {
            unit = "megaohms";
            res /= 1e6;
        } else if (res >= 1e3 && res % 1e3 == 0) {
            unit = "kiloohms";
            res /= 1e3;
        }
        return res + " " + unit;
    }
}
