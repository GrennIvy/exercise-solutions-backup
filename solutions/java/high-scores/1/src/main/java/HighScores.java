import java.util.*;

class HighScores {
    private List<Integer> highScores;

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.isEmpty() ? null : highScores.get(highScores.size() - 1);
    }

    Integer personalBest() {
        return highScores.isEmpty() ? null : Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> sortedScores = new ArrayList<>(highScores);
        Collections.sort(sortedScores, Collections.reverseOrder());
        if (sortedScores.size() < 3) {
            return sortedScores;
        } else {
            return sortedScores.subList(0, 3);
        }
    }

}
