package com.surafel.mvp.data.db.model;

public class MovieItems {

    private String movieTitle;
    private String movieDescription;
    private int movieImage;

    public MovieItems(String movieTitle, String movieDescription, int movieImage) {
        this.movieTitle = movieTitle;
        this.movieDescription = movieDescription;
        this.movieImage = movieImage;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public int getMovieImage() {
        return movieImage;
    }

    public void setMovieImage(int movieImage) {
        this.movieImage = movieImage;
    }
}
