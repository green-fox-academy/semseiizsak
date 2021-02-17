package com.greenfox.moviedb.service;

import com.greenfox.moviedb.dao.popular.PopularDao;
import com.greenfox.moviedb.dto.popular.RootForPopular;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PopularService {

    @Autowired
    private PopularDao popularDAO;

    public RootForPopular fetchPopularMovies(String apiKey) throws IOException {
        return popularDAO.fetchPopularFilms(apiKey);
    }
}