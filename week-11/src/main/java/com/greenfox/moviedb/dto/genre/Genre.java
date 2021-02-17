package com.greenfox.moviedb.dto.genre;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public @Data class Genre{
    public int id;
    public String name;
}