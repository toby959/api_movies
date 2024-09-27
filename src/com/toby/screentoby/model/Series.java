package com.toby.screentoby.model;

public class Series extends Title {

    int sessons;
    int episodesPerSeason;
    int minutesPerEpisode;

    public Series(int releaseDate, String name) {
        super(releaseDate, name);
    }

    @Override
    public int getDurationInMinutes() {
        return sessons * episodesPerSeason * minutesPerEpisode;
    }

    public int getSessons() {
        return sessons;
    }

    public void setSessons(int sessons) {
        this.sessons = sessons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public String toString() {
        return "Series: " + this.getName() + " (" + this.getReleaseDate() + ")";
    }
}
