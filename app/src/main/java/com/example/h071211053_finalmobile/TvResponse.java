package com.example.h071211053_finalmobile;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TvResponse {
    @SerializedName("results")
    private List<Tv> tvShows;

    public List<Tv> getTvShows() {
        return tvShows;
    }
}

