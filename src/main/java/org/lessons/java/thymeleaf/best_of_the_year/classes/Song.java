package org.lessons.java.thymeleaf.best_of_the_year.classes;

import java.util.ArrayList;

public class Song {

  private int id;
  private String title;
  private ArrayList<String> authors;
  private float duration;
  private ArrayList<String> genres;
  private int rating;

  // ! constructors
  public Song(int id, String title, ArrayList<String> authors, float duration, ArrayList<String> genres, int rating) {
    this.id = id;
    this.title = title;
    this.authors = authors;
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

  public ArrayList<String> getAuthors() {
    return this.authors;
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

  public void setAuthor(ArrayList<String> authors) {
    this.authors = authors;
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
