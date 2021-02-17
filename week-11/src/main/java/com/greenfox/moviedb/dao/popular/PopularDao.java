package com.greenfox.moviedb.dao.popular;

import com.greenfox.moviedb.dto.RetrofitClientInstance;
import com.greenfox.moviedb.dto.popular.RootForPopular;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class PopularDao {
    public RootForPopular fetchPopularFilms(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        PopularRetrofitDao popularRetrofitDAO = retrofitInstance.create(PopularRetrofitDao.class);
        Call<RootForPopular> allPopularMovies = popularRetrofitDAO.getPopularMovies(apiKey);
        Response<RootForPopular> execute = allPopularMovies.execute();

        return execute.body();
    }
}