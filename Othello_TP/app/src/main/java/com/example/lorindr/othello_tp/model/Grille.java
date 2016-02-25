package com.example.lorindr.othello_tp.model;

/**
 * Created by lorindr on 2/9/2016.
 */
public class Grille {

    private Case[][] matrice_cases;

    // A quel joueur de jouer
    private Boolean tour;

    public Grille() {
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                matrice_cases[i][j] = new Case();
            }
        }
    }

    public Boolean getTour() {
        return tour;
    }

    public void setTour(Boolean tour) {
        this.tour = tour;
    }

    public void inverserTour(){
        if (this.getTour()) {
            this.setTour(false);
        }
        else
            this.setTour(true);
    }
}
