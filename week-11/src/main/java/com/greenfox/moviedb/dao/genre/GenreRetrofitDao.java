package com.greenfox.moviedb.dao.genre;

import com.greenfox.moviedb.dto.genre.RootForGenre;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;


public interface GenreRetrofitDao {

    @GET("/3/genre/movie/list")
    Call<RootForGenre> getGenres(@Query("api_key") String apiKey);

}
