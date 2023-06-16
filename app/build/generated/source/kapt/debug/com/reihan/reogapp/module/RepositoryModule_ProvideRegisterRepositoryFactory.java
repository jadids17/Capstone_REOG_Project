package com.reihan.reogapp.module;

import com.reihan.reogapp.api.ApiService;
import com.reihan.reogapp.ui.register.RegisterRepository;
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
public final class RepositoryModule_ProvideRegisterRepositoryFactory implements Factory<RegisterRepository> {
  private final Provider<ApiService> apiServiceProvider;

  public RepositoryModule_ProvideRegisterRepositoryFactory(
      Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RegisterRepository get() {
    return provideRegisterRepository(apiServiceProvider.get());
  }

  public static RepositoryModule_ProvideRegisterRepositoryFactory create(
      Provider<ApiService> apiServiceProvider) {
    return new RepositoryModule_ProvideRegisterRepositoryFactory(apiServiceProvider);
  }

  public static RegisterRepository provideRegisterRepository(ApiService apiService) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideRegisterRepository(apiService));
  }
}
