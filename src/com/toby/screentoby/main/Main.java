package com.toby.screentoby.main;

import com.toby.screentoby.model.Episode;
import com.toby.screentoby.model.Movie;
import com.toby.screentoby.model.Series;
import com.toby.screentoby.calculations.RecommendationFilter;
import com.toby.screentoby.calculations.TimeCalculator;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Movie myMovie = new Movie(2001, "Crown");

        myMovie.setReleaseDate(2002);
        myMovie.setDurationInMinutes(123);
        myMovie.setIncludedInPlan(true);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        myMovie.showTechnicalSheet();
        myMovie.evaluate(9);
        myMovie.evaluate(9);


        System.out.println(myMovie.getTotalOfEvaluations());
        System.out.println(myMovie.calculateAverage());

        Series casaDragon = new Series(2006, "La Prueba");
        casaDragon.setName("La casa del dragon");
        casaDragon.setReleaseDate(2022);
        casaDragon.setSessons(1);
        casaDragon.setMinutesPerEpisode(50);
        casaDragon.setEpisodesPerSeason(10);
        casaDragon.showTechnicalSheet();
        System.out.println(casaDragon.getDurationInMinutes());
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        Movie myMovie2 = new Movie(2000, "Matrix");

        myMovie2.setReleaseDate(2000);
        myMovie2.setDurationInMinutes(190);
        myMovie2.setIncludedInPlan(true);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(casaDragon);
        calculator.include(myMovie2);
        System.out.println("Tiempo necesario para ver tus titulos: "
                + calculator.getTotalTime() + " minutos");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
        RecommendationFilter recommendationFilter = new RecommendationFilter();
        recommendationFilter.filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
      /*  episode.setName("La casa negra");*/
        episode.setSeries(casaDragon);
        episode.setTotalViews(50);

        recommendationFilter.filter(episode);
        System.out.println("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");

        var movie3 = new Movie( 2015, "Rapido y Furioso 13");

        movie3.setDurationInMinutes(180);
        movie3.setReleaseDate(2025);

        ArrayList<Movie> listMovie = new ArrayList<>();
        listMovie.add(movie3);
        listMovie.add(myMovie);
        listMovie.add(myMovie2);


        System.out.println("Tamaño de la lista: " + listMovie.size());
        System.out.println("La primera pelicula es: " + listMovie.get(0).getName() );

        System.out.println(listMovie);

        System.out.println("toString de la pelicula: " + listMovie.get(0).toString());
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");




      /*  System.out.println("Mi pelicual es: " + myMovie.name);
        System.out.println("Su fecha de lanzamiento es: " + myMovie.releaseDate);

      */

    /*
        System.out.println("Mi pelicula es: " + myMovie2.name);
        System.out.println("El plan es: " + myMovie2.includedInPlan);

 */
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
    }
}
