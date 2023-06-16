package com.reihan.reogapp.module;

import com.reihan.reogapp.api.ApiService;
import com.reihan.reogapp.ui.login.LoginRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideLoginRepositoryFactory implements Factory<LoginRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public RepositoryModule_ProvideLoginRepositoryFactory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public LoginRepository get() {
    return provideLoginRepository(apiServiceProvider.get());
  }

  public static RepositoryModule_ProvideLoginRepositoryFactory create(
      Provider<ApiService> apiServiceProvider) {
    return new RepositoryModule_ProvideLoginRepositoryFactory(apiServiceProvider);
  }

  public static LoginRepository provideLoginRepository(ApiService apiService) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideLoginRepository(apiService));
  }
}
