package com.reihan.reogapp.ui.login;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  public LoginViewModel_Factory(Provider<LoginRepository> loginRepositoryProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(loginRepositoryProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<LoginRepository> loginRepositoryProvider) {
    return new LoginViewModel_Factory(loginRepositoryProvider);
  }

  public static LoginViewModel newInstance(LoginRepository loginRepository) {
    return new LoginViewModel(loginRepository);
  }
}
