package com.greenfox.moviedb.dao.genre;

import com.greenfox.moviedb.dto.RetrofitClientInstance;
import com.greenfox.moviedb.dto.genre.RootForGenre;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

@Repository
public class GenreDao {
    public RootForGenre fetchGenres(String apiKey) throws IOException {
        Retrofit retrofitInstance = RetrofitClientInstance.getRetrofitInstance();

        GenreRetrofitDao genreRetrofitDAO = retrofitInstance.create(GenreRetrofitDao.class);
        Call<RootForGenre> allGenres = genreRetrofitDAO.getGenres(apiKey);
        Response<RootForGenre> execute = allGenres.execute();

        return execute.body();
    }
}

