package org.scrabble;

/**
 * Classe représentant une lettre du scrabble
 */
public class Tuile {

    private char lettre;
    private int points;

    /**
     * Créé une lettre avec le nombre de points associés
     *
     * @param lettre la lettre
     * @param points les points associés à la lettre
     */
    public Tuile(char lettre, int points) {
        this.lettre = lettre;
        this.points = points;
    }

    /**
     *
     * @return la lettre
     */
    public char getLettre() {
        return lettre;
    }

    /**
     *
     * @return le nombre de points correspondant à la lettre
     */
    public int getPoints() {
        return points;
    }
}
