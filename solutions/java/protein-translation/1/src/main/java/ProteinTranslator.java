import java.util.*;

class ProteinTranslator {
    Map<String, String> codonTable = new HashMap<>() {
        {
            put("AUG", "Methionine");
            put("UUU", "Phenylalanine");
            put("UUC", "Phenylalanine");
            put("UUA", "Leucine");
            put("UUG", "Leucine");
            put("UCU", "Serine");
            put("UCC", "Serine");
            put("UCA", "Serine");
            put("UCG", "Serine");
            put("UAU", "Tyrosine");
            put("UAC", "Tyrosine");
            put("UGU", "Cysteine");
            put("UGC", "Cysteine");
            put("UGG", "Tryptophan");
            put("UAA", "Stop");
            put("UAG", "Stop");
            put("UGA", "Stop");
        }
    };

    List<String> translate(String rnaSequence) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            if (i + 3 > rnaSequence.length()) {
                throw new IllegalArgumentException("Invalid codon");
            }
            String codon = rnaSequence.substring(i, i + 3);
            if (codonTable.containsKey(codon)) {
                String aminoAcid = codonTable.get(codon);
                if (aminoAcid.equals("Stop")) {
                    break;
                } else {
                    res.add(aminoAcid);
                }
            } else {
                throw new IllegalArgumentException("Invalid codon");
            }
        }
        return res;
    }
}
