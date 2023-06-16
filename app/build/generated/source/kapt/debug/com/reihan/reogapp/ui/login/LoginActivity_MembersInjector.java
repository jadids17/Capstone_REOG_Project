package com.reihan.reogapp.ui.login;

import com.reihan.reogapp.preferences.ReogPreference;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class LoginActivity_MembersInjector implements MembersInjector<LoginActivity> {
  private final Provider<ReogPreference> reogPreferenceProvider;

  public LoginActivity_MembersInjector(Provider<ReogPreference> reogPreferenceProvider) {
    this.reogPreferenceProvider = reogPreferenceProvider;
  }

  public static MembersInjector<LoginActivity> create(
      Provider<ReogPreference> reogPreferenceProvider) {
    return new LoginActivity_MembersInjector(reogPreferenceProvider);
  }

  @Override
  public void injectMembers(LoginActivity instance) {
    injectReogPreference(instance, reogPreferenceProvider.get());
  }

  @InjectedFieldSignature("com.reihan.reogapp.ui.login.LoginActivity.reogPreference")
  public static void injectReogPreference(LoginActivity instance, ReogPreference reogPreference) {
    instance.reogPreference = reogPreference;
  }
}
