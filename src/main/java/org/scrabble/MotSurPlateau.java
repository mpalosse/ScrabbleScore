package org.scrabble;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Représente un mot placé sur le plateau de Scrabble
 */
public class MotSurPlateau {

    private Map<Tuile, Prime> lettresSurPlateau = new LinkedHashMap<>();

    /**
     * Ajoute une lettre qui compose le mot sur une case "normale", sans prime
     *
     * @param tuile la tuile
     */
    public void addTuileToMot(Tuile tuile) {
        addTuileToMot(tuile, null);
    }

    /**
     * Ajoute une lettre qui compose le mot sur une case dotée d'une prime
     *
     * @param tuile la tuile
     * @param prime la prime associé à la case sur laquelle est déposé la tuile
     */
    public void addTuileToMot(Tuile tuile, Prime prime) {
        lettresSurPlateau.put(tuile, prime);
    }

    /**
     * Calcule et retourne le nombre de points que rapporte le mot
     *
     * @return le score calculé pour le mot
     */
    public int calculeScore() {
        // Pour calculer le score :
        // - si la lettre est sur une case non primée, alors on ajoute le nombre
        // de points de la lettre au score
        // - si la lettre est sur une case primée LETTRE_DOUBLE : on double le
        // nombre de points de la lettre et on ajoute au score
        // - si la lettre est sur une case primée LETTRE_TRIPLE : on triple le
        // nombre de points de la lettre et on ajoute au score
        // - si une des lettres est sur une case primée MOT_DOUBLE alors
        // on double le score du mot
        // - si une des lettres est sur une case primée MOT_TRIPLE alors
        // on triple le score du mot
        // - si un mot recouvre plus d'un case primée MOT_***, on cumule les primes.
        int score = 0;
        for(Map.Entry<Tuile,Prime> lettrePlacee: lettresSurPlateau.entrySet()) {
            // ...
        }
        return score;
    }

}

enum Prime {
    MOT_TRIPLE,
    MOT_DOUBLE,
    LETTRE_DOUBLE,
    LETTRE_TRIPLE
}