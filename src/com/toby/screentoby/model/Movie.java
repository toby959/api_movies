package com.toby.screentoby.model;

import com.toby.screentoby.calculations.Classification;

public class Movie extends Title implements Classification {

   private String director;



    public Movie(int releaseDate, String name) {
        super(releaseDate, name);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) (calculateAverage() / 2);
    }

    @Override
    public String toString() {
        return "Pelicula: " + this.getName() + " (" + getReleaseDate() + ")";
    }
}
