package com.example.githubuser;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/githubuser/ApiService;", "", "detailUser", "Lretrofit2/Call;", "Lcom/example/githubuser/responses/DetailUserResponse;", "login", "", "getFollowers", "", "Lcom/example/githubuser/responses/ItemsItem;", "getFollowing", "getUser", "Lcom/example/githubuser/responses/UserResponse;", "app_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/users")
    public abstract retrofit2.Call<com.example.githubuser.responses.UserResponse> getUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{login}")
    public abstract retrofit2.Call<com.example.githubuser.responses.DetailUserResponse> detailUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "login")
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{login}/followers")
    public abstract retrofit2.Call<java.util.List<com.example.githubuser.responses.ItemsItem>> getFollowers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "login")
    java.lang.String login);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{login}/following")
    public abstract retrofit2.Call<java.util.List<com.example.githubuser.responses.ItemsItem>> getFollowing(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "login")
    java.lang.String login);
}