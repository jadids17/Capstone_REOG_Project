package com.reihan.reogapp.module;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;

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
public final class NetworkModule_ProvideOkHttpClientFactory implements Factory<OkHttpClient> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public NetworkModule_ProvideOkHttpClientFactory(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkHttpClient(sharedPreferencesProvider.get());
  }

  public static NetworkModule_ProvideOkHttpClientFactory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new NetworkModule_ProvideOkHttpClientFactory(sharedPreferencesProvider);
  }

  public static OkHttpClient provideOkHttpClient(SharedPreferences sharedPreferences) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.provideOkHttpClient(sharedPreferences));
  }
}
