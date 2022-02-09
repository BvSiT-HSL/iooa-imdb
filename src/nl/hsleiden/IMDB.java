package nl.hsleiden;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class IMDB {

    //1. Implementeer de constructor en attributen
    private ArrayList<TvShow> tvShows;
    public final int MAX_RATING=10;   //TODO Only positive ratings?

    //TODO final error messages in array?

    public IMDB(ArrayList<TvShow> tvShows) {
        this.tvShows = tvShows;
    }


    public ArrayList<TvShow> filterOpGenre(Genre filterGenre){
        //2. Geeft lijst terug met alleen de elementen van het gevraagde genre
        ArrayList<TvShow> results = new ArrayList<>();
        for(TvShow tvShow:tvShows){
            if (tvShow.getGenre().name()== filterGenre.name()){
                results.add(tvShow);
            }
        }
        return results;
    }

    public void geefShowCijfer(String showNaam, double cijfer){
        //3. zoekt de show aan de hand van de naam op in de tvshow lijst en geeft deze het opgegeven cijfer.
        // Dit cijfer wordt vervolgens op de console geprint

        TvShow tvShow = findTvShow(showNaam);
        if (tvShow!=null){
            tvShow.getBeoordelingen().add(cijfer); //?? beter als methode in TvShow
            System.out.println("Beoordeling " + cijfer +  " toegevoegd aan tvshow " + tvShow.getNaam());
        }
        else {
            //TODO add message constants
            System.out.println("Tv-show met naam " + showNaam + " niet gevonden." );
        }
    }

    public void voegShowToe(TvShow tvShow){
        //geef de optie om een show toe te voegen
        if (findTvShow(tvShow.getNaam())==null) {
            tvShows.add(tvShow);
        }
        else {
            //TODO
        }
    }

    public void verwijderShow(TvShow tvShow){
        //geef de optie om een show te verwijderen
        TvShow foundTvShow = findTvShow(tvShow.getNaam());
        if (foundTvShow!=null) {
            tvShows.remove(tvShow);
        }
        else {
            //TODO
        }
    }

    public void laatAlleTvShowsZien(){
        // geef hier alle waardes van de TvShows weer als {naam} - {genre} en
        //als er een gemiddelde beoordeling hoger dan 0 is voeg - {gemiddeldecijfer} toe.
        printTvShows(tvShows);
    }

    public void printTvShows(List<TvShow> tvShows) {
        for(TvShow tvShow: tvShows){
            String message = tvShow.getNaam() + " - "  + tvShow.getGenre().toString();
            //TODO ?? Beter via local var?
            DecimalFormat df = new DecimalFormat("#.#",new DecimalFormatSymbols(Locale.US));
            if (tvShow.getGemiddeldeRating()>0) message+=" - gem. rating: "+ df.format(tvShow.getGemiddeldeRating());
            System.out.println(message);
            //DONE //als er een gemiddelde beoordeling hoger dan 0 is voeg - {gemiddeldecijfer} toe.
        }
    }

    //BvS
    public TvShow findTvShow(String name){
        for(TvShow tvShow: tvShows){
            if (tvShow.getNaam().equalsIgnoreCase(name)) return tvShow;
        }
        return null;
    }

    public ArrayList<TvShow> getTvShows() {
        return tvShows;
    }
}
