package com.greenfox.moviedb.dao.popular;

import com.greenfox.moviedb.dto.popular.RootForPopular;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PopularRetrofitDao {
    @GET("/3/movie/popular")
    Call<RootForPopular> getPopularMovies(@Query("api_key") String apiKey);
}