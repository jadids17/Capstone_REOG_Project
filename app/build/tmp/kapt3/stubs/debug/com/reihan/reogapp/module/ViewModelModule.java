package com.reihan.reogapp.module;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lcom/reihan/reogapp/module/ViewModelModule;", "", "()V", "provideLoginViewModel", "Lcom/reihan/reogapp/ui/login/LoginViewModel;", "loginRepository", "Lcom/reihan/reogapp/ui/login/LoginRepository;", "provideRegisterViewModel", "Lcom/reihan/reogapp/ui/register/RegisterViewModel;", "registerRepository", "Lcom/reihan/reogapp/ui/register/RegisterRepository;", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class ViewModelModule {
    @org.jetbrains.annotations.NotNull
    public static final com.reihan.reogapp.module.ViewModelModule INSTANCE = null;
    
    private ViewModelModule() {
        super();
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.reihan.reogapp.ui.register.RegisterViewModel provideRegisterViewModel(@org.jetbrains.annotations.NotNull
    com.reihan.reogapp.ui.register.RegisterRepository registerRepository) {
        return null;
    }
    
    @dagger.Provides
    @javax.inject.Singleton
    @org.jetbrains.annotations.NotNull
    public final com.reihan.reogapp.ui.login.LoginViewModel provideLoginViewModel(@org.jetbrains.annotations.NotNull
    com.reihan.reogapp.ui.login.LoginRepository loginRepository) {
        return null;
    }
}