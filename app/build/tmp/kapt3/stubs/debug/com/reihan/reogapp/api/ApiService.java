package com.reihan.reogapp.api;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J/\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/reihan/reogapp/api/ApiService;", "", "reogLogin", "Lcom/reihan/reogapp/response/Login;", "email", "", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reogRegister", "Lcom/reihan/reogapp/response/Register;", "name", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiService {
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "signup")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object reogRegister(@retrofit2.http.Field(value = "name")
    @org.jetbrains.annotations.NotNull
    java.lang.String name, @retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.reihan.reogapp.response.Register> $completion);
    
    @retrofit2.http.FormUrlEncoded
    @retrofit2.http.POST(value = "signin")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object reogLogin(@retrofit2.http.Field(value = "email")
    @org.jetbrains.annotations.NotNull
    java.lang.String email, @retrofit2.http.Field(value = "password")
    @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.reihan.reogapp.response.Login> $completion);
}