package com.example.lorindr.othello_tp.model;

/**
 * Created by lorindr on 2/9/2016.
 */
public class Case {
    private Jeton jeton;

    public Case() {

    }

    public void creer_jeton(Boolean couleur_joueur){
        Jeton jeton = new Jeton(couleur_joueur);
    }

    public Jeton getJeton() {
        return jeton;
    }

    public void setJeton(Jeton jeton) {
        this.jeton = jeton;
    }
}
