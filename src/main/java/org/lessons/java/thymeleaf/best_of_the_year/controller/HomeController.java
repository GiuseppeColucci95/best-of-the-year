package org.lessons.java.thymeleaf.best_of_the_year.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.lessons.java.thymeleaf.best_of_the_year.classes.Movie;
import org.lessons.java.thymeleaf.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  ArrayList<Movie> movies = new ArrayList<Movie>();
  ArrayList<Song> songs = new ArrayList<Song>();

  // ! CONSTRUCTORS
  public HomeController() {

    Movie firstMovie = new Movie(1, "Fast and Furious", new ArrayList<>(Arrays.asList("Vin Diesel")), 2.3f,
        new ArrayList<>(Arrays.asList("action")), 5);
    Movie secondMovie = new Movie(2, "Mine Vaganti", new ArrayList<>(Arrays.asList("Angelina Jolie")), 2f,
        new ArrayList<>(Arrays.asList("romance")), 4);
    Movie thirdMovie = new Movie(3, "L'immortale", new ArrayList<>(Arrays.asList("Brad Pitt")), 2.3f,
        new ArrayList<>(Arrays.asList("action")), 5);
    Movie fourthMovie = new Movie(4, "La vetta degli dei", new ArrayList<>(Arrays.asList("George Clooney")), 1.3f,
        new ArrayList<>(Arrays.asList("action")), 1);
    Movie fifthMovie = new Movie(5, "The Tank", new ArrayList<>(Arrays.asList("Jennifer Aniston")), 2f,
        new ArrayList<>(Arrays.asList("action")), 4);

    Song firstSong = new Song(1, "Azizam", new ArrayList<>(Arrays.asList("Ed Sheeran")), 3.40f,
        new ArrayList<>(Arrays.asList("techno")), 5);
    Song secondSong = new Song(2, "Bottiglie vuote", new ArrayList<>(Arrays.asList("Pinguini Tattici Nucleari")), 2.30f,
        new ArrayList<>(Arrays.asList("rock")), 2);
    Song thirdSong = new Song(3, "Bmf", new ArrayList<>(Arrays.asList("Sza")), 3.30f,
        new ArrayList<>(Arrays.asList("relax")), 3);
    Song fourthSong = new Song(4, "Alibi", new ArrayList<>(Arrays.asList("Tananai")), 3.55f,
        new ArrayList<>(Arrays.asList("pop")), 1);
    Song fifthSong = new Song(5, "Anxiety", new ArrayList<>(Arrays.asList("Alfa")), 2.40f,
        new ArrayList<>(Arrays.asList("anxiety")), 2);

    this.movies.add(firstMovie);
    this.movies.add(secondMovie);
    this.movies.add(thirdMovie);
    this.movies.add(fourthMovie);
    this.movies.add(fifthMovie);

    this.songs.add(firstSong);
    this.songs.add(secondSong);
    this.songs.add(thirdSong);
    this.songs.add(fourthSong);
    this.songs.add(fifthSong);

  }

  // ! APPLICATION ROUTES

  @GetMapping("/")
  public String home(Model model) {

    model.addAttribute("name", "Giuseppe");

    return "home";
  }

  @GetMapping("/movies")
  public String movies(Model model) {

    ArrayList<Movie> bestMovies = getBestMovies();

    String bestMoviesString = "";
    for (int i = 0; i < bestMovies.size() - 1; i++) {
      bestMoviesString = bestMoviesString + bestMovies.get(i).getTitle() + ", ";
    }
    bestMoviesString += bestMovies.get(bestMovies.size() - 1).getTitle();

    model.addAttribute("name", "Giuseppe");
    model.addAttribute("moviesList", bestMoviesString);

    return "movies";
  }

  @GetMapping("/songs")
  public String songs(Model model) {

    ArrayList<Song> bestSongs = getBestSongs();

    String bestSongsString = "";
    for (int i = 0; i < bestSongs.size() - 1; i++) {
      bestSongsString = bestSongsString + bestSongs.get(i).getTitle() + ", ";
    }
    bestSongsString += bestSongs.get(bestSongs.size() - 1).getTitle();

    model.addAttribute("name", "Giuseppe");
    model.addAttribute("songsList", bestSongsString);

    return "songs";
  }

  // ! OTHER METHODS
  private ArrayList<Movie> getBestMovies() {

    ArrayList<Movie> bestMovies = new ArrayList<>();
    for (Movie movie : this.movies) {
      if (movie.getRating() > 3) {
        bestMovies.add(movie);
      }
    }

    return bestMovies;
  }

  private ArrayList<Song> getBestSongs() {

    ArrayList<Song> bestSongs = new ArrayList<>();
    for (Song song : this.songs) {
      if (song.getRating() >= 3) {
        bestSongs.add(song);
      }
    }

    return bestSongs;
  }

}
