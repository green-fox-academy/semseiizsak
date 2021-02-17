package com.greenfox.moviedb.service;

import com.greenfox.moviedb.dao.genre.GenreDao;
import com.greenfox.moviedb.dto.genre.RootForGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class GenreService {

    @Autowired
    private GenreDao genreDao;

    public RootForGenre fetchGenres(String apiKey) throws IOException {
        return genreDao.fetchGenres(apiKey);
    }
}