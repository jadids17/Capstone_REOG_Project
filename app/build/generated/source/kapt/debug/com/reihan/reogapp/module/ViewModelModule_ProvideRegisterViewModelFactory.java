package com.reihan.reogapp.module;

import com.reihan.reogapp.ui.register.RegisterRepository;
import com.reihan.reogapp.ui.register.RegisterViewModel;
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
public final class ViewModelModule_ProvideRegisterViewModelFactory implements Factory<RegisterViewModel> {
  private final Provider<RegisterRepository> registerRepositoryProvider;

  public ViewModelModule_ProvideRegisterViewModelFactory(
      Provider<RegisterRepository> registerRepositoryProvider) {
    this.registerRepositoryProvider = registerRepositoryProvider;
  }

  @Override
  public RegisterViewModel get() {
    return provideRegisterViewModel(registerRepositoryProvider.get());
  }

  public static ViewModelModule_ProvideRegisterViewModelFactory create(
      Provider<RegisterRepository> registerRepositoryProvider) {
    return new ViewModelModule_ProvideRegisterViewModelFactory(registerRepositoryProvider);
  }

  public static RegisterViewModel provideRegisterViewModel(RegisterRepository registerRepository) {
    return Preconditions.checkNotNullFromProvides(ViewModelModule.INSTANCE.provideRegisterViewModel(registerRepository));
  }
}
