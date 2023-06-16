package com.reihan.reogapp.module;

import android.app.Application;
import android.content.SharedPreferences;
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
public final class LocalModule_ProvideSharedPreferencesFactory implements Factory<SharedPreferences> {
  private final Provider<Application> applicationProvider;

  public LocalModule_ProvideSharedPreferencesFactory(Provider<Application> applicationProvider) {
    this.applicationProvider = applicationProvider;
  }

  @Override
  public SharedPreferences get() {
    return provideSharedPreferences(applicationProvider.get());
  }

  public static LocalModule_ProvideSharedPreferencesFactory create(
      Provider<Application> applicationProvider) {
    return new LocalModule_ProvideSharedPreferencesFactory(applicationProvider);
  }

  public static SharedPreferences provideSharedPreferences(Application application) {
    return Preconditions.checkNotNullFromProvides(LocalModule.INSTANCE.provideSharedPreferences(application));
  }
}
