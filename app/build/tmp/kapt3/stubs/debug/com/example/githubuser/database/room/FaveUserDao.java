package com.example.githubuser.database.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lcom/example/githubuser/database/room/FaveUserDao;", "", "delete", "", "faveUser", "Lcom/example/githubuser/database/entity/FaveUser;", "getAllFaveUser", "Landroidx/lifecycle/LiveData;", "", "getFaveUserByLogin", "login", "", "insert", "app_debug"})
public abstract interface FaveUserDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    com.example.githubuser.database.entity.FaveUser faveUser);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.githubuser.database.entity.FaveUser faveUser);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM fave_user")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.githubuser.database.entity.FaveUser>> getAllFaveUser();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM fave_user WHERE login = :login")
    public abstract androidx.lifecycle.LiveData<com.example.githubuser.database.entity.FaveUser> getFaveUserByLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login);
}