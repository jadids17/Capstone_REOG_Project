package com.reihan.reogapp.preferences;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\b\u0010\u0007\u001a\u0004\u0018\u00010\bJ\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/reihan/reogapp/preferences/ReogPreference;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "clearUser", "", "getUser", "Lcom/reihan/reogapp/preferences/ReogModel;", "saveUser", "reogModel", "Companion", "app_debug"})
public final class ReogPreference {
    @org.jetbrains.annotations.NotNull
    private final android.content.SharedPreferences sharedPreferences = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_ID = "user_id";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_NAME = "user_name";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String USER_TOKEN = "user token";
    @org.jetbrains.annotations.NotNull
    public static final com.reihan.reogapp.preferences.ReogPreference.Companion Companion = null;
    
    public ReogPreference(@org.jetbrains.annotations.NotNull
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull
    com.reihan.reogapp.preferences.ReogModel reogModel) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.reihan.reogapp.preferences.ReogModel getUser() {
        return null;
    }
    
    public final void clearUser() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/reihan/reogapp/preferences/ReogPreference$Companion;", "", "()V", "USER_ID", "", "USER_NAME", "USER_TOKEN", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}