public class PangramChecker {

    public boolean isPangram(String input) {
        boolean[] letters = new boolean[26];
        char[] ch = input.toLowerCase().toCharArray();
        int cot = 0;
        for (char c : ch) {
            if (c >= 'a' && c <= 'z') {
                if (!letters[c - 'a']) {
                    letters[c - 'a'] = true;
                    cot++;
                }
            }
        }
        return cot == 26;
    }

}
