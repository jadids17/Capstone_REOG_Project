// Generated by view binder compiler. Do not edit!
package com.reihan.reogapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.reihan.reogapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySettingBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final SwitchMaterial switchTheme;

  @NonNull
  public final TextView tvThemeTitle;

  private ActivitySettingBinding(@NonNull ConstraintLayout rootView,
      @NonNull SwitchMaterial switchTheme, @NonNull TextView tvThemeTitle) {
    this.rootView = rootView;
    this.switchTheme = switchTheme;
    this.tvThemeTitle = tvThemeTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySettingBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_setting, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySettingBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.switch_theme;
      SwitchMaterial switchTheme = ViewBindings.findChildViewById(rootView, id);
      if (switchTheme == null) {
        break missingId;
      }

      id = R.id.tv_theme_title;
      TextView tvThemeTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvThemeTitle == null) {
        break missingId;
      }

      return new ActivitySettingBinding((ConstraintLayout) rootView, switchTheme, tvThemeTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
