import java.util.*;

class RnaTranscription {
    Map<Character, Character> m = new HashMap<Character, Character>() {
        {
            put('G', 'C');
            put('C', 'G');
            put('T', 'A');
            put('A', 'U');
        }
    };

    String transcribe(String dnaStrand) {
        StringBuilder sb = new StringBuilder();
        for (char c : dnaStrand.toCharArray()) {
            sb.append(m.get(c));
        }
        return sb.toString();
    }
}
