import java.util.*;

class DnDCharacter {
    private final int Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, Hitpoints;

    DnDCharacter() {
        this.Strength = ability(rollDice());
        this.Dexterity = ability(rollDice());
        this.Constitution = ability(rollDice());
        this.Intelligence = ability(rollDice());
        this.Wisdom = ability(rollDice());
        this.Charisma = ability(rollDice());
        this.Hitpoints = 10 + modifier(this.Constitution);
    }

    int ability(List<Integer> scores) {
        List<Integer> sortedScores = new ArrayList<>(scores);
        Collections.sort(sortedScores);
        return sortedScores.get(1) + sortedScores.get(2) + sortedScores.get(3);
    }

    List<Integer> rollDice() {
        List<Integer> dice = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 4; i++) {
            dice.add(random.nextInt(6) + 1);
        }
        return dice;
    }

    int modifier(int input) {
        return Math.floorDiv(input - 10, 2);
    }

    int getStrength() {
        return this.Strength;
    }

    int getDexterity() {
        return this.Dexterity;
    }

    int getConstitution() {
        return this.Constitution;
    }

    int getIntelligence() {
        return this.Intelligence;
    }

    int getWisdom() {
        return this.Wisdom;
    }

    int getCharisma() {
        return this.Charisma;
    }

    int getHitpoints() {
        return this.Hitpoints;
    }
}
