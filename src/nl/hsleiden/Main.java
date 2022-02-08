package nl.hsleiden;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //1. Maak een ArrayList met TvShows genaamd tvShows
        ArrayList<TvShow> tvShows = new ArrayList<>();

        //2. Maak hier je eigen favoriete shows!
        TvShow breakingBad = new TvShow("Breaking Bad", Genre.DRAMA);
        TvShow gameOfThrones = new TvShow("Game of Thrones", Genre.FANTASY);
        TvShow vikings = new TvShow("Vikings",  Genre.DRAMA);
        TvShow westWorld = new TvShow("Westworld", Genre.THRILLER);
        TvShow brooklynNineNine = new TvShow("Brooklyn Nine-Nine", Genre.COMEDY);
        TvShow falconAndTheWinterSoldier = new TvShow("The Falcon and the Winter Soldier", Genre.SCIENCE_FICTION);

        //3. Voeg alle series toe aan de tvShows ArrayList

        tvShows.add(breakingBad);
        tvShows.add(gameOfThrones);
        tvShows.add(vikings);
        tvShows.add(westWorld);
        tvShows.add(brooklynNineNine);
        tvShows.add(falconAndTheWinterSoldier);

        IMDB imdb = new IMDB(tvShows);

        //5. test hier je filter op genre
        imdb.filterOpGenre(Genre.COMEDY);




        //6. Maak hier de functionaliteit om een cijfer te geven aan een show d.m.v. een scanner en gebruikers input

        //7. Voeg een show toe aan de lijst en print de lijst

        //8. Verwijder een show uit de lijst en print de lijst


    }

}
