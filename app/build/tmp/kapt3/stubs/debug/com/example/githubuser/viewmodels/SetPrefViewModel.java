package com.example.githubuser.viewmodels;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/example/githubuser/viewmodels/SetPrefViewModel;", "Landroidx/lifecycle/ViewModel;", "pref", "Lcom/example/githubuser/SettingPreferences;", "(Lcom/example/githubuser/SettingPreferences;)V", "getThemeSettings", "Landroidx/lifecycle/LiveData;", "", "saveThemeSetting", "", "isDarkModeActive", "app_debug"})
public final class SetPrefViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.githubuser.SettingPreferences pref = null;
    
    public SetPrefViewModel(@org.jetbrains.annotations.NotNull()
    com.example.githubuser.SettingPreferences pref) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getThemeSettings() {
        return null;
    }
    
    public final void saveThemeSetting(boolean isDarkModeActive) {
    }
}