import java.util.*;

class ResistorColorDuo {
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

    int value(String[] colors) {
        if (colors.length == 0) {
            throw new IllegalArgumentException("no colors provided");
        }
        int res = Color.valueOf(colors[0]).ordinal();
        if (colors.length > 1) {
            res = res * 10 + Color.valueOf(colors[1]).ordinal();
        }
        return res;
    }
}
