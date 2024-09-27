package com.toby.screentoby.model;


import com.toby.screentoby.exception.ErrorConversionException;

public class Title implements Comparable<Title>{

    private String name;
    private int releaseDate;
    private int durationInMinutes;
    private boolean includedInPlan;
    private double sumOfEvaluations;
    private int totalOfEvaluations;

// Constructor que recibe parámetros individuales
    public Title(int releaseDate, String name) {
        this.releaseDate = releaseDate;
        this.name = name;

    }

    // Constructor que recibe un objeto TitleOmdb y otros parámetros
    public Title(TitleOmdb myTitleOmdb) {
        this.name = myTitleOmdb.title();
        this.releaseDate = Integer.parseInt(myTitleOmdb.year()); // Usar parseInt en lugar de valueOf


        // Verificación de la duration
        if (myTitleOmdb.runtime().contains("N/A")) {
            throw new ErrorConversionException("No puede convertir 'runtime' porque contiene un valor N/A");
        }

        // Extraer y convertir la duración a minutos
        try {
            this.durationInMinutes = Integer.parseInt(myTitleOmdb.runtime().substring(0, 3).trim());
        } catch (NumberFormatException e) {
            throw new ErrorConversionException("Error al convertir la duración: " + e.getMessage());
        }
    }



    public void setName(String name) {
        this.name = name;
    }

    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getTotalOfEvaluations() {
        return totalOfEvaluations;
    }

    public boolean isIncludedInPlan() {
        return includedInPlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public int getReleaseDate() {
        return releaseDate;
    }


    public String getName() {
        return name;
    }

    public void showTechnicalSheet(){
        System.out.println("El nombre de la pelicula es: " + name);
        System.out.println("Su fecha de lanzamiento es: " + releaseDate);
        System.out.println("Duracion en minutos: " + getDurationInMinutes());
    }

    public void evaluate(double nota) {
        sumOfEvaluations += nota;
        totalOfEvaluations++;
    }

    public double calculateAverage() {
        return sumOfEvaluations / totalOfEvaluations;
    }

    @Override
    public int compareTo(Title otherTitle) {
        return this.getName().compareTo(otherTitle.getName());
    }

    @Override
    public String toString() {
        return  "(name='" + name + '\'' +
                ", releaseDate=" + releaseDate +
                ", duration= " + durationInMinutes + " min" + ")";
        }



}
