package com.example.github_dmos5.network;

import com.example.github_dmos5.model.GitHubRepo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHubServiceRepos {

        @GET("users/{user}/repos")
        Call<List<GitHubRepo>> getRepo (@Path("user") String user);
}
