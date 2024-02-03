package com.example.githubuser.database.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0012\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000f0\u000eJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/githubuser/database/repository/FaveUserRepo;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "executorService", "Ljava/util/concurrent/ExecutorService;", "mFaveUserDao", "Lcom/example/githubuser/database/room/FaveUserDao;", "delete", "", "faveUser", "Lcom/example/githubuser/database/entity/FaveUser;", "getAllFaveUser", "Landroidx/lifecycle/LiveData;", "", "getAllFaveUserByLogin", "login", "", "insert", "app_debug"})
public final class FaveUserRepo {
    private final com.example.githubuser.database.room.FaveUserDao mFaveUserDao = null;
    private final java.util.concurrent.ExecutorService executorService = null;
    
    public FaveUserRepo(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.githubuser.database.entity.FaveUser>> getAllFaveUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.githubuser.database.entity.FaveUser> getAllFaveUserByLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String login) {
        return null;
    }
    
    public final void insert(@org.jetbrains.annotations.NotNull()
    com.example.githubuser.database.entity.FaveUser faveUser) {
    }
    
    public final void delete(@org.jetbrains.annotations.NotNull()
    com.example.githubuser.database.entity.FaveUser faveUser) {
    }
}