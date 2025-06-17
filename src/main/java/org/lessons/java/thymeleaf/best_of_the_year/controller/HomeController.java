package org.lessons.java.thymeleaf.best_of_the_year.controller;

import java.util.ArrayList;

import org.lessons.java.thymeleaf.best_of_the_year.classes.Movie;
import org.lessons.java.thymeleaf.best_of_the_year.classes.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

  @GetMapping("")
  public String home(Model model) {

    model.addAttribute("name", "Giuseppe");

    return "home";
  }

  @GetMapping("/movies")
  public String movies(Model model) {

    ArrayList<Movie> moviesList = getBestMovies();

    model.addAttribute("movies", moviesList);

    return "movies";
  }

  // !other methods
  private ArrayList<Movie> getBestMovies() {

    return new ArrayList<Movie>();
  }

  private ArrayList<Song> getBestSongs() {
    return new ArrayList<Song>();
  }

}
