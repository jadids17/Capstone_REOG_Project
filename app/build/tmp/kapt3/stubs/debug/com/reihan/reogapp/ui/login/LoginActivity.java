package com.reihan.reogapp.ui.login;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u0012H\u0002J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lcom/reihan/reogapp/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/reihan/reogapp/databinding/ActivityLoginBinding;", "reogPreference", "Lcom/reihan/reogapp/preferences/ReogPreference;", "getReogPreference", "()Lcom/reihan/reogapp/preferences/ReogPreference;", "setReogPreference", "(Lcom/reihan/reogapp/preferences/ReogPreference;)V", "viewModel", "Lcom/reihan/reogapp/ui/login/LoginViewModel;", "getViewModel", "()Lcom/reihan/reogapp/ui/login/LoginViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "animateElements", "", "enableButton", "isEnable", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "showLoading", "it", "", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.reihan.reogapp.databinding.ActivityLoginBinding binding;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @javax.inject.Inject
    public com.reihan.reogapp.preferences.ReogPreference reogPreference;
    
    public LoginActivity() {
        super();
    }
    
    private final com.reihan.reogapp.ui.login.LoginViewModel getViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.reihan.reogapp.preferences.ReogPreference getReogPreference() {
        return null;
    }
    
    public final void setReogPreference(@org.jetbrains.annotations.NotNull
    com.reihan.reogapp.preferences.ReogPreference p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void enableButton() {
    }
    
    private final void animateElements() {
    }
    
    private final void isEnable() {
    }
    
    private final void showLoading(boolean it) {
    }
}