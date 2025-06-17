package org.lessons.java.thymeleaf.best_of_the_year.classes;

import java.util.ArrayList;

public class Movie {

  private int id;
  private String title;
  private ArrayList<String> actors;
  private float duration;
  private ArrayList<String> genres;
  private int rating;

  // ! constructors
  public Movie(int id, String title, ArrayList<String> actors, float duration, ArrayList<String> genres, int rating) {
    this.id = id;
    this.title = title;
    this.actors = actors;
    this.duration = duration;
    this.genres = genres;
    this.rating = rating;
  }

  // ! getters
  public int getId() {
    return this.id;
  }

  public String getTitle() {
    return this.title;
  }

  public ArrayList<String> getActors() {
    return this.actors;
  }

  public float getDuration() {
    return this.duration;
  }

  public ArrayList<String> getGenres() {
    return this.genres;
  }

  public int getRating() {
    return this.rating;
  }

  // ! setters
  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setActors(ArrayList<String> actors) {
    this.actors = actors;
  }

  public void setDuration(float duration) {
    this.duration = duration;
  }

  public void setGenres(ArrayList<String> genres) {
    this.genres = genres;
  }

  public void setRating(int rating) {
    this.rating = rating;
  }

  // ! other methods
}
