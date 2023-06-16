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
import com.reihan.reogapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFaqBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView textAnswer1;

  @NonNull
  public final TextView textAnswer2;

  @NonNull
  public final TextView textAnswer3;

  @NonNull
  public final TextView textAnswer4;

  @NonNull
  public final TextView textAnswer5;

  @NonNull
  public final TextView textFaq;

  @NonNull
  public final TextView textQuestion1;

  @NonNull
  public final TextView textQuestion2;

  @NonNull
  public final TextView textQuestion3;

  @NonNull
  public final TextView textQuestion4;

  @NonNull
  public final TextView textQuestion5;

  private ActivityFaqBinding(@NonNull ConstraintLayout rootView, @NonNull TextView textAnswer1,
      @NonNull TextView textAnswer2, @NonNull TextView textAnswer3, @NonNull TextView textAnswer4,
      @NonNull TextView textAnswer5, @NonNull TextView textFaq, @NonNull TextView textQuestion1,
      @NonNull TextView textQuestion2, @NonNull TextView textQuestion3,
      @NonNull TextView textQuestion4, @NonNull TextView textQuestion5) {
    this.rootView = rootView;
    this.textAnswer1 = textAnswer1;
    this.textAnswer2 = textAnswer2;
    this.textAnswer3 = textAnswer3;
    this.textAnswer4 = textAnswer4;
    this.textAnswer5 = textAnswer5;
    this.textFaq = textFaq;
    this.textQuestion1 = textQuestion1;
    this.textQuestion2 = textQuestion2;
    this.textQuestion3 = textQuestion3;
    this.textQuestion4 = textQuestion4;
    this.textQuestion5 = textQuestion5;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFaqBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFaqBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_faq, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFaqBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.text_answer_1;
      TextView textAnswer1 = ViewBindings.findChildViewById(rootView, id);
      if (textAnswer1 == null) {
        break missingId;
      }

      id = R.id.text_answer_2;
      TextView textAnswer2 = ViewBindings.findChildViewById(rootView, id);
      if (textAnswer2 == null) {
        break missingId;
      }

      id = R.id.text_answer_3;
      TextView textAnswer3 = ViewBindings.findChildViewById(rootView, id);
      if (textAnswer3 == null) {
        break missingId;
      }

      id = R.id.text_answer_4;
      TextView textAnswer4 = ViewBindings.findChildViewById(rootView, id);
      if (textAnswer4 == null) {
        break missingId;
      }

      id = R.id.text_answer_5;
      TextView textAnswer5 = ViewBindings.findChildViewById(rootView, id);
      if (textAnswer5 == null) {
        break missingId;
      }

      id = R.id.text_faq;
      TextView textFaq = ViewBindings.findChildViewById(rootView, id);
      if (textFaq == null) {
        break missingId;
      }

      id = R.id.text_question_1;
      TextView textQuestion1 = ViewBindings.findChildViewById(rootView, id);
      if (textQuestion1 == null) {
        break missingId;
      }

      id = R.id.text_question_2;
      TextView textQuestion2 = ViewBindings.findChildViewById(rootView, id);
      if (textQuestion2 == null) {
        break missingId;
      }

      id = R.id.text_question_3;
      TextView textQuestion3 = ViewBindings.findChildViewById(rootView, id);
      if (textQuestion3 == null) {
        break missingId;
      }

      id = R.id.text_question_4;
      TextView textQuestion4 = ViewBindings.findChildViewById(rootView, id);
      if (textQuestion4 == null) {
        break missingId;
      }

      id = R.id.text_question_5;
      TextView textQuestion5 = ViewBindings.findChildViewById(rootView, id);
      if (textQuestion5 == null) {
        break missingId;
      }

      return new ActivityFaqBinding((ConstraintLayout) rootView, textAnswer1, textAnswer2,
          textAnswer3, textAnswer4, textAnswer5, textFaq, textQuestion1, textQuestion2,
          textQuestion3, textQuestion4, textQuestion5);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}