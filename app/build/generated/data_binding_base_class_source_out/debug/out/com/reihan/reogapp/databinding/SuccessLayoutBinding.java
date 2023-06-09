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
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SuccessLayoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView imageView;

  @NonNull
  public final Button okButton;

  @NonNull
  public final TextView successDesc;

  @NonNull
  public final TextView successText;

  private SuccessLayoutBinding(@NonNull ConstraintLayout rootView, @NonNull ImageView imageView,
      @NonNull Button okButton, @NonNull TextView successDesc, @NonNull TextView successText) {
    this.rootView = rootView;
    this.imageView = imageView;
    this.okButton = okButton;
    this.successDesc = successDesc;
    this.successText = successText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static SuccessLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SuccessLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.success_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SuccessLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageView;
      ImageView imageView = ViewBindings.findChildViewById(rootView, id);
      if (imageView == null) {
        break missingId;
      }

      id = R.id.ok_button;
      Button okButton = ViewBindings.findChildViewById(rootView, id);
      if (okButton == null) {
        break missingId;
      }

      id = R.id.success_desc;
      TextView successDesc = ViewBindings.findChildViewById(rootView, id);
      if (successDesc == null) {
        break missingId;
      }

      id = R.id.success_text;
      TextView successText = ViewBindings.findChildViewById(rootView, id);
      if (successText == null) {
        break missingId;
      }

      return new SuccessLayoutBinding((ConstraintLayout) rootView, imageView, okButton, successDesc,
          successText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
