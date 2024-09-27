package com.toby.screentoby.main;

import com.toby.screentoby.model.Movie;
import com.toby.screentoby.model.Series;
import com.toby.screentoby.model.Title;

import java.util.*;

public class MainList {

    public static void main(String[] args) {


        Movie myMovie = new Movie(2001, "Crown");
        myMovie.evaluate(8);
        Movie myMovie2 = new Movie(2000, "Matrix");
        myMovie2.evaluate(5);
        var movie3 = new Movie(2015, "Rapido y Furioso 13");
        movie3.evaluate(8);
        Series casaDragon = new Series(2006, "La Prueba");

        ArrayList<Title> list = new ArrayList<>();
        list.add(myMovie);
        list.add(myMovie2);
        list.add(movie3);
        list.add(casaDragon);

        for(Title item : list) {
            System.out.println(item.getName());
            if (item instanceof Movie) {
                Movie movie = (Movie) item;
                System.out.println(movie.getClassification());
            }
        }

        List<String> listOfArtists = new LinkedList<>();
        listOfArtists.add("Penelope Cruz");
        listOfArtists.add("Antonio Banderaa");
        listOfArtists.add("Ricardo Darin");
        System.out.println(listOfArtists);
        System.out.println("##################################################");

        Collections.sort(listOfArtists);
        System.out.println("Lista de artistas ordenada: " + listOfArtists);
        System.out.println("****************************************************");
        Collections.sort(list);
        System.out.println("Lista ordenada Pelicula alfabeticamente : " + list);

        list.sort(Comparator.comparing(Title::getReleaseDate));
        System.out.println("Lista ordenada por fecha: " + list);
    }
}