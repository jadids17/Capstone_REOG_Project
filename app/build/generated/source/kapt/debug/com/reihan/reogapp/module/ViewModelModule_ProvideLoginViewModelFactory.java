package com.reihan.reogapp.module;

import com.reihan.reogapp.ui.login.LoginRepository;
import com.reihan.reogapp.ui.login.LoginViewModel;
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
public final class ViewModelModule_ProvideLoginViewModelFactory implements Factory<LoginViewModel> {
  private final Provider<LoginRepository> loginRepositoryProvider;

  public ViewModelModule_ProvideLoginViewModelFactory(
      Provider<LoginRepository> loginRepositoryProvider) {
    this.loginRepositoryProvider = loginRepositoryProvider;
  }

  @Override
  public LoginViewModel get() {
    return provideLoginViewModel(loginRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideLoginViewModelFactory create(
      Provider<LoginRepository> loginRepositoryProvider) {
    return new ViewModelModule_ProvideLoginViewModelFactory(loginRepositoryProvider);
  }

  public static LoginViewModel provideLoginViewModel(LoginRepository loginRepository) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideLoginViewModel(loginRepository));
  }
}
