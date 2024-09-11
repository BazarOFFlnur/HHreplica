// Generated by view binder compiler. Do not edit!
package com.lightcore.hhreplica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lightcore.hhreplica.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFullVacancyBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton filtersFull;

  @NonNull
  public final ConstraintLayout frameLayout;

  @NonNull
  public final RecyclerView fullVacancyList;

  @NonNull
  public final ImageButton imageButton;

  @NonNull
  public final EditText searchEditTextFull;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  private FragmentFullVacancyBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton filtersFull, @NonNull ConstraintLayout frameLayout,
      @NonNull RecyclerView fullVacancyList, @NonNull ImageButton imageButton,
      @NonNull EditText searchEditTextFull, @NonNull TextView textView2,
      @NonNull TextView textView3) {
    this.rootView = rootView;
    this.filtersFull = filtersFull;
    this.frameLayout = frameLayout;
    this.fullVacancyList = fullVacancyList;
    this.imageButton = imageButton;
    this.searchEditTextFull = searchEditTextFull;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFullVacancyBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFullVacancyBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_full_vacancy, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFullVacancyBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.filters_full;
      ImageButton filtersFull = ViewBindings.findChildViewById(rootView, id);
      if (filtersFull == null) {
        break missingId;
      }

      ConstraintLayout frameLayout = (ConstraintLayout) rootView;

      id = R.id.fullVacancyList;
      RecyclerView fullVacancyList = ViewBindings.findChildViewById(rootView, id);
      if (fullVacancyList == null) {
        break missingId;
      }

      id = R.id.imageButton;
      ImageButton imageButton = ViewBindings.findChildViewById(rootView, id);
      if (imageButton == null) {
        break missingId;
      }

      id = R.id.search_EditText_full;
      EditText searchEditTextFull = ViewBindings.findChildViewById(rootView, id);
      if (searchEditTextFull == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new FragmentFullVacancyBinding((ConstraintLayout) rootView, filtersFull, frameLayout,
          fullVacancyList, imageButton, searchEditTextFull, textView2, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}