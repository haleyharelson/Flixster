package com.example.flixster.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Movie {

    //values from API
    private String title;
    private String overview;
    private String posterPath; //only the path

    //create an instance of movie by passing a JSON object and access the 3 parsed values
    //using these getters

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterPath() {
        return posterPath;
    }

    //initialize from JSON data
    public Movie(JSONObject object) throws JSONException {
        title = object.getString("title");
        overview = object.getString("overview");
        posterPath = object.getString("poster_path");
    }
}
