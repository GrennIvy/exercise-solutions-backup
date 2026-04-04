import java.util.*;

class Acronym {
    String[] words;
    String abbrev;

    Acronym(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            abbrev = "";
            return;
        }
        words = phrase.split("[\\s-_]+");
        StringBuilder res = new StringBuilder();
        for (String word : words) {
            res.append(Character.toUpperCase(word.charAt(0)));
        }
        abbrev = res.toString();
    }

    String get() {
        return abbrev;
    }

}
