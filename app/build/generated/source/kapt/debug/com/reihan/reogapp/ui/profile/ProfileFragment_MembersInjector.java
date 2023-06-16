package com.reihan.reogapp.ui.profile;

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
public final class ProfileFragment_MembersInjector implements MembersInjector<ProfileFragment> {
  private final Provider<ReogPreference> reogPreferenceProvider;

  public ProfileFragment_MembersInjector(Provider<ReogPreference> reogPreferenceProvider) {
    this.reogPreferenceProvider = reogPreferenceProvider;
  }

  public static MembersInjector<ProfileFragment> create(
      Provider<ReogPreference> reogPreferenceProvider) {
    return new ProfileFragment_MembersInjector(reogPreferenceProvider);
  }

  @Override
  public void injectMembers(ProfileFragment instance) {
    injectReogPreference(instance, reogPreferenceProvider.get());
  }

  @InjectedFieldSignature("com.reihan.reogapp.ui.profile.ProfileFragment.reogPreference")
  public static void injectReogPreference(ProfileFragment instance, ReogPreference reogPreference) {
    instance.reogPreference = reogPreference;
  }
}
