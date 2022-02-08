package nl.hsleiden;

import java.util.ArrayList;

public class IMDB {

    //1. Implementeer de constructor en attributen
    private ArrayList<TvShow> tvShows;

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
            tvShow.getBeoordelingen().add(cijfer);
        }
    }

    public void voegShowToe(TvShow tvShow){
        //geef de optie om een show toe te voegen

    }

    public void verwijderShow(TvShow tvShow){
        //geef de optie om een show te verwijderen
    }

    public void laatAlleTvShowsZien(){
        // geef hier alle waardes van de TvShows weer als {naam} - {genre} en
        //als er een gemiddelde beoordeling hoger dan 0 is voeg - {gemiddeldecijfer} toe.
    }

    public TvShow findTvShow(String name){
        for(TvShow tvShow: tvShows){
            if (tvShow.getNaam().equalsIgnoreCase(name)) return tvShow;
        }
        return null;
    }

}
