package com.reihan.reogapp.module;

import android.content.SharedPreferences;
import com.reihan.reogapp.preferences.ReogPreference;
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
public final class SharedPreferencesModule_ProvideUserPreferencesFactory implements Factory<ReogPreference> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SharedPreferencesModule_ProvideUserPreferencesFactory(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public ReogPreference get() {
    return provideUserPreferences(sharedPreferencesProvider.get());
  }

  public static SharedPreferencesModule_ProvideUserPreferencesFactory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SharedPreferencesModule_ProvideUserPreferencesFactory(sharedPreferencesProvider);
  }

  public static ReogPreference provideUserPreferences(SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(SharedPreferencesModule.INSTANCE.provideUserPreferences(sharedPreferences));
  }
}
