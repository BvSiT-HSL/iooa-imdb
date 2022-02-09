package nl.hsleiden;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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
        List<TvShow> filteredTvShows = imdb.filterOpGenre(Genre.COMEDY);
        imdb.printTvShows(filteredTvShows);

        //BvS//Debug// Show all tv shows
        //imdb.laatAlleTvShowsZien();

        //6. Maak hier de functionaliteit om een cijfer te geven aan een show d.m.v. een scanner en gebruikers input
        addRating(imdb);

        //BvS Test adding ratings
        breakingBad.geefRating(8.0);
        breakingBad.geefRating(9.0);

        System.out.println("");
        imdb.laatAlleTvShowsZien();


        //7. Voeg een show toe aan de lijst en print de lijst
        TvShow clan = new TvShow("Clan",Genre.COMEDY);
        imdb.voegShowToe(clan);
        //TODO message in method with verbose arg?
        System.out.println("Tv-show toegevoegd met naam: " + clan.getNaam());
        imdb.laatAlleTvShowsZien();

        //8. Verwijder een show uit de lijst en print de lijst
        //TODO message in method with verbose arg?
        imdb.verwijderShow(gameOfThrones);
        System.out.println("Tv-show verwijderd met naam: " + breakingBad.getNaam());
        imdb.laatAlleTvShowsZien();
    }

    static public void addRating(IMDB imdb){
        List<TvShow> tvShows = imdb.getTvShows();
        if (tvShows.size()==0 || tvShows==null) {
            System.out.println("Geen TV shows aanwezig");
            return;
        }
        //TODO als 1 show aanwezig
        String msg = "Geef nummer rangorde in de lijst van de TV show die u wilt beoordelen (tussen 1 en " + tvShows.size() + ") :";
        System.out.println(msg);
        for (int i = 0; i < tvShows.size(); i++) {
            System.out.println( (i+1) + ". " + tvShows.get(i).getNaam());
        }

        ConsoleReader consoleReader = new ConsoleReader() ;
        int choice = consoleReader.read(1,tvShows.size());
        TvShow tvShow = tvShows.get(choice - 1);
        System.out.println("Geef cijfer tussen 1 en " + imdb.MAX_RATING + " voor " +tvShow.getNaam() +" :");
        int rating = consoleReader.read(1, imdb.MAX_RATING);
        tvShow.geefRating(Double.valueOf(rating));
        System.out.println(tvShow.getNaam() + " heeft een gemiddelde rating " + tvShow.getGemiddeldeRating() );
    }

}
