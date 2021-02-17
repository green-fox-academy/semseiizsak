package com.greenfox.moviedb.dto.popular;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

public @Data
class Popular {
    public boolean adult;
    @JsonIgnore
    @SerializedName("genre_ids")
    public List<Integer> genreIds;
    @JsonIgnore
    public int id;
    @JsonIgnore
    @SerializedName("original_language")
    public String originalLanguage;
    @SerializedName("original_title")
    public String originalTitle;
    public String overview;
    @JsonIgnore
    public double popularity;
    @SerializedName("release_date")
    public String releaseDate;
    @JsonIgnore
    public String title;
    @SerializedName("vote_average")
    public double voteAverage;
    @SerializedName("vote_count")
    public int voteCount;
}
