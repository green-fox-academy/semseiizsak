package com.greenfox.moviedb.dto.genre;

import com.greenfox.moviedb.dto.genre.Genre;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RootForGenre {
    public List<Genre> genres;
}