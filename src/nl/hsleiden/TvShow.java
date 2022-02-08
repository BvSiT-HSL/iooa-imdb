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
    }

    public void geefRating(double cijfer){
        //Voeg beoordeling toe aan de beoordelignen lijst
        //herbereken nu het gemiddelde met de berekenGemiddeldeCijfer functie
    }

    private void berekenGemiddeldCijfer(){
        //bereken het gemiddelde cijfer aan de hand van de beoordelingen lijst zet vervolgens
        // dit gemiddelde op het attribuut gemiddeldeRating
    }

    //Maak getters en setters van de benodigde attributen, dus niet allemaal!!


    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getGemiddeldeRating() {
        return gemiddeldeRating;
    }

    public void setGemiddeldeRating(double gemiddeldeRating) {
        this.gemiddeldeRating = gemiddeldeRating;
    }

    public ArrayList<Double> getBeoordelingen() {
        return beoordelingen;
    }

    public void setBeoordelingen(ArrayList<Double> beoordelingen) {
        this.beoordelingen = beoordelingen;
    }
}
