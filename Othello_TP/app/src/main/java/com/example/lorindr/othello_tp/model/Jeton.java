package com.example.lorindr.othello_tp.model;

/**
 * Created by lorindr on 2/9/2016.
 */
public class Jeton {

    private Boolean couleur;

    public Jeton(Boolean couleur) {
        this.couleur = couleur;
    }

    public Boolean getCouleur() {
        return couleur;
    }

    public void setCouleur(Boolean couleur) {
        this.couleur = couleur;
    }

    public void inverserJeton(){
        if (this.getCouleur()) {
            this.setCouleur(false);
        }
        else
            this.setCouleur(true);
    }
}
