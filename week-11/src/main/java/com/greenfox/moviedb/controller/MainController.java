package com.greenfox.moviedb.controller;

import com.greenfox.moviedb.dto.genre.RootForGenre;
import com.greenfox.moviedb.dto.popular.RootForPopular;
import com.greenfox.moviedb.service.GenreService;
import com.greenfox.moviedb.service.PopularService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;

@Controller
public class MainController {

    private final GenreService genreService;
    private final PopularService popularService;

    @Autowired
    public MainController(GenreService genreService, PopularService popularService) {
        this.genreService = genreService;
        this.popularService = popularService;
    }

    @GetMapping("/genres")
    public ResponseEntity getGenres(@RequestParam(value = "api_key") String apiKey) {
        try {
            RootForGenre rootForGenre = genreService.fetchGenres(apiKey);
            return new ResponseEntity(rootForGenre, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/popular")
    public ResponseEntity getPopularMovies(@RequestParam(value = "api_key") String apiKey) {
        try {
            RootForPopular rootPopular = popularService.fetchPopularMovies(apiKey);
            return new ResponseEntity(rootPopular, HttpStatus.OK);
        } catch (IOException e) {
            e.printStackTrace();
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
