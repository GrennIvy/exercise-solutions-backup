public class EliudsEggs {
    public int eggCount(int number) {
        String binary = Integer.toBinaryString(number);
        int res = 0;
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                res++;
            }
        }
        return res;
    }
}
