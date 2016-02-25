package com.example.lorindr.othello_tp.model;

/**
 * Created by lorindr on 2/23/2016.
 */
public class Joueur {

    private String nom;
    private Boolean type;
    private int score;
    private boolean couleur_joue;

    public Joueur(Boolean type, Boolean couleur_joue) {
        this.type = type;
        this.couleur_joue = couleur_joue;
    }

    // Nom de Joueur
    public String getNom() {

        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    // Type de Joueur
    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    // Score de Joueur
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // Couleur que le joueur veut jouer
    public boolean isCouleur_joue() {
        return couleur_joue;
    }

    public void setCouleur_joue(boolean couleur_joue) {
        this.couleur_joue = couleur_joue;
    }
}
