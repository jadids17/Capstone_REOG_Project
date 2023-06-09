// Generated by view binder compiler. Do not edit!
package com.reihan.reogapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.reihan.reogapp.R;
import com.reihan.reogapp.customui.CustomButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button aboutButton;

  @NonNull
  public final Button aboutLanguage;

  @NonNull
  public final Button faqButton;

  @NonNull
  public final View group4;

  @NonNull
  public final View groupDivider;

  @NonNull
  public final View groupDivider2;

  @NonNull
  public final View groupDivider3;

  @NonNull
  public final ImageView ivPhotoProfile;

  @NonNull
  public final CustomButton logoutButton;

  @NonNull
  public final Button settingsButton;

  @NonNull
  public final TextView tvNameEmail;

  @NonNull
  public final TextView tvNameLocation;

  @NonNull
  public final TextView tvNameProfile;

  @NonNull
  public final TextView tvNameYears;

  @NonNull
  public final View viewProfile;

  private FragmentProfileBinding(@NonNull ConstraintLayout rootView, @NonNull Button aboutButton,
      @NonNull Button aboutLanguage, @NonNull Button faqButton, @NonNull View group4,
      @NonNull View groupDivider, @NonNull View groupDivider2, @NonNull View groupDivider3,
      @NonNull ImageView ivPhotoProfile, @NonNull CustomButton logoutButton,
      @NonNull Button settingsButton, @NonNull TextView tvNameEmail,
      @NonNull TextView tvNameLocation, @NonNull TextView tvNameProfile,
      @NonNull TextView tvNameYears, @NonNull View viewProfile) {
    this.rootView = rootView;
    this.aboutButton = aboutButton;
    this.aboutLanguage = aboutLanguage;
    this.faqButton = faqButton;
    this.group4 = group4;
    this.groupDivider = groupDivider;
    this.groupDivider2 = groupDivider2;
    this.groupDivider3 = groupDivider3;
    this.ivPhotoProfile = ivPhotoProfile;
    this.logoutButton = logoutButton;
    this.settingsButton = settingsButton;
    this.tvNameEmail = tvNameEmail;
    this.tvNameLocation = tvNameLocation;
    this.tvNameProfile = tvNameProfile;
    this.tvNameYears = tvNameYears;
    this.viewProfile = viewProfile;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.about_button;
      Button aboutButton = ViewBindings.findChildViewById(rootView, id);
      if (aboutButton == null) {
        break missingId;
      }

      id = R.id.about_language;
      Button aboutLanguage = ViewBindings.findChildViewById(rootView, id);
      if (aboutLanguage == null) {
        break missingId;
      }

      id = R.id.faq_button;
      Button faqButton = ViewBindings.findChildViewById(rootView, id);
      if (faqButton == null) {
        break missingId;
      }

      id = R.id.group_4;
      View group4 = ViewBindings.findChildViewById(rootView, id);
      if (group4 == null) {
        break missingId;
      }

      id = R.id.group_divider;
      View groupDivider = ViewBindings.findChildViewById(rootView, id);
      if (groupDivider == null) {
        break missingId;
      }

      id = R.id.group_divider2;
      View groupDivider2 = ViewBindings.findChildViewById(rootView, id);
      if (groupDivider2 == null) {
        break missingId;
      }

      id = R.id.group_divider3;
      View groupDivider3 = ViewBindings.findChildViewById(rootView, id);
      if (groupDivider3 == null) {
        break missingId;
      }

      id = R.id.iv_photo_profile;
      ImageView ivPhotoProfile = ViewBindings.findChildViewById(rootView, id);
      if (ivPhotoProfile == null) {
        break missingId;
      }

      id = R.id.logout_button;
      CustomButton logoutButton = ViewBindings.findChildViewById(rootView, id);
      if (logoutButton == null) {
        break missingId;
      }

      id = R.id.settings_button;
      Button settingsButton = ViewBindings.findChildViewById(rootView, id);
      if (settingsButton == null) {
        break missingId;
      }

      id = R.id.tv_name_email;
      TextView tvNameEmail = ViewBindings.findChildViewById(rootView, id);
      if (tvNameEmail == null) {
        break missingId;
      }

      id = R.id.tv_name_location;
      TextView tvNameLocation = ViewBindings.findChildViewById(rootView, id);
      if (tvNameLocation == null) {
        break missingId;
      }

      id = R.id.tv_name_profile;
      TextView tvNameProfile = ViewBindings.findChildViewById(rootView, id);
      if (tvNameProfile == null) {
        break missingId;
      }

      id = R.id.tv_name_years;
      TextView tvNameYears = ViewBindings.findChildViewById(rootView, id);
      if (tvNameYears == null) {
        break missingId;
      }

      id = R.id.view_profile;
      View viewProfile = ViewBindings.findChildViewById(rootView, id);
      if (viewProfile == null) {
        break missingId;
      }

      return new FragmentProfileBinding((ConstraintLayout) rootView, aboutButton, aboutLanguage,
          faqButton, group4, groupDivider, groupDivider2, groupDivider3, ivPhotoProfile,
          logoutButton, settingsButton, tvNameEmail, tvNameLocation, tvNameProfile, tvNameYears,
          viewProfile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
