package org.lessons.java.thymeleaf.best_of_the_year.controller;

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
}
