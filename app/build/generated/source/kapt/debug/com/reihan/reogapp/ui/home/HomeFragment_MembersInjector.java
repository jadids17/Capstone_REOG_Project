package com.reihan.reogapp.ui.home;

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
public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<ReogPreference> reogPreferenceProvider;

  public HomeFragment_MembersInjector(Provider<ReogPreference> reogPreferenceProvider) {
    this.reogPreferenceProvider = reogPreferenceProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<ReogPreference> reogPreferenceProvider) {
    return new HomeFragment_MembersInjector(reogPreferenceProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectReogPreference(instance, reogPreferenceProvider.get());
  }

  @InjectedFieldSignature("com.reihan.reogapp.ui.home.HomeFragment.reogPreference")
  public static void injectReogPreference(HomeFragment instance, ReogPreference reogPreference) {
    instance.reogPreference = reogPreference;
  }
}
