package com.example.githubuser.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\r\u001a\u00020\u0019H\u0002J\u0016\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fJ\u0014\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u000e2\u0006\u0010\u0014\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/githubuser/viewmodels/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_detailUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/githubuser/responses/DetailUserResponse;", "_followList", "", "Lcom/example/githubuser/responses/ItemsItem;", "_isLoading", "", "_login", "", "detailUser", "Landroidx/lifecycle/LiveData;", "getDetailUser", "()Landroidx/lifecycle/LiveData;", "followList", "getFollowList", "isLoading", "login", "getLogin", "mFaveUserRepo", "Lcom/example/githubuser/database/repository/FaveUserRepo;", "delete", "", "faveUser", "Lcom/example/githubuser/database/entity/FaveUser;", "follUser", "isFollower", "getAllFaveUserByLogin", "insert", "setLogin", "app_debug"})
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.githubuser.responses.ItemsItem>> _followList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.githubuser.responses.ItemsItem>> followList = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _login = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.lang.String> login = null;
    private final androidx.lifecycle.MutableLiveData<com.example.githubuser.responses.DetailUserResponse> _detailUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.example.githubuser.responses.DetailUserResponse> detailUser = null;
    private final com.example.githubuser.database.repository.FaveUserRepo mFaveUserRepo = null;
    
    public DetailViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.githubuser.responses.ItemsItem>> getFollowList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.githubuser.responses.DetailUserResponse> getDetailUser() {
        return null;
    }
    
    public final void setLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
    }
    
    private final void detailUser() {
    }
    
    public final void follUser(boolean isFollower, @org.jetbrains.annotations.NotNull()
    java.lang.String login) {
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.githubuser.database.entity.FaveUser faveUser) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.githubuser.database.entity.FaveUser faveUser) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.githubuser.database.entity.FaveUser> getAllFaveUserByLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return null;
    }
}