package nl.hsleiden;

import java.util.ArrayList;

public class TvShow {
    //Maak attributen
    private String naam;
    private Genre genre;
    private double gemiddeldeRating;
    private ArrayList<Double> beoordelingen;


    //Maak de juiste constructor, onthoud niet alle attributen hoeven hier aan meegegeven te worden!

    public TvShow(String naam, Genre genre) {
        this.naam = naam;
        this.genre = genre;
        beoordelingen = new ArrayList<>();
    }

    public void geefRating(double cijfer){
        //Voeg beoordeling toe aan de beoordelignen lijst
        //herbereken nu het gemiddelde met de berekenGemiddeldeCijfer functie
        beoordelingen.add(cijfer);
        berekenGemiddeldCijfer(); //?? Beter in getGemiddeldeRating
    }

    private void berekenGemiddeldCijfer(){
        //bereken het gemiddelde cijfer aan de hand van de beoordelingen lijst zet vervolgens
        // dit gemiddelde op het attribuut gemiddeldeRating

        //TODO double not set = 0?

        double totalOfRatings = 0;
        int numOfRatings = beoordelingen.size();
        for (Double rating : beoordelingen){
            totalOfRatings+=rating;
        }
        if (numOfRatings>0) gemiddeldeRating=totalOfRatings/numOfRatings;

    }

    //Maak getters en setters van de benodigde attributen, dus niet allemaal!!
    public String getNaam() {
        return naam;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getGemiddeldeRating() {
        return gemiddeldeRating;
    }

    public ArrayList<Double> getBeoordelingen() {
        return beoordelingen;
    }

}
