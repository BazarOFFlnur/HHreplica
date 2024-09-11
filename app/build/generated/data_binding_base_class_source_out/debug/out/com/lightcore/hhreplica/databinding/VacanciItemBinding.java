// Generated by view binder compiler. Do not edit!
package com.lightcore.hhreplica.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.lightcore.hhreplica.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class VacanciItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button OtklickBtn;

  @NonNull
  public final TextView city;

  @NonNull
  public final TextView companyName;

  @NonNull
  public final TextView datePublish;

  @NonNull
  public final ImageButton isFavoriteBtn;

  @NonNull
  public final TextView looktxt;

  @NonNull
  public final TextView opit;

  @NonNull
  public final TextView vacName;

  @NonNull
  public final TextView zp;

  private VacanciItemBinding(@NonNull LinearLayout rootView, @NonNull Button OtklickBtn,
      @NonNull TextView city, @NonNull TextView companyName, @NonNull TextView datePublish,
      @NonNull ImageButton isFavoriteBtn, @NonNull TextView looktxt, @NonNull TextView opit,
      @NonNull TextView vacName, @NonNull TextView zp) {
    this.rootView = rootView;
    this.OtklickBtn = OtklickBtn;
    this.city = city;
    this.companyName = companyName;
    this.datePublish = datePublish;
    this.isFavoriteBtn = isFavoriteBtn;
    this.looktxt = looktxt;
    this.opit = opit;
    this.vacName = vacName;
    this.zp = zp;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static VacanciItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static VacanciItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.vacanci_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static VacanciItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.OtklickBtn;
      Button OtklickBtn = ViewBindings.findChildViewById(rootView, id);
      if (OtklickBtn == null) {
        break missingId;
      }

      id = R.id.city;
      TextView city = ViewBindings.findChildViewById(rootView, id);
      if (city == null) {
        break missingId;
      }

      id = R.id.companyName;
      TextView companyName = ViewBindings.findChildViewById(rootView, id);
      if (companyName == null) {
        break missingId;
      }

      id = R.id.datePublish;
      TextView datePublish = ViewBindings.findChildViewById(rootView, id);
      if (datePublish == null) {
        break missingId;
      }

      id = R.id.isFavoriteBtn;
      ImageButton isFavoriteBtn = ViewBindings.findChildViewById(rootView, id);
      if (isFavoriteBtn == null) {
        break missingId;
      }

      id = R.id.looktxt;
      TextView looktxt = ViewBindings.findChildViewById(rootView, id);
      if (looktxt == null) {
        break missingId;
      }

      id = R.id.opit;
      TextView opit = ViewBindings.findChildViewById(rootView, id);
      if (opit == null) {
        break missingId;
      }

      id = R.id.vac_name;
      TextView vacName = ViewBindings.findChildViewById(rootView, id);
      if (vacName == null) {
        break missingId;
      }

      id = R.id.zp;
      TextView zp = ViewBindings.findChildViewById(rootView, id);
      if (zp == null) {
        break missingId;
      }

      return new VacanciItemBinding((LinearLayout) rootView, OtklickBtn, city, companyName,
          datePublish, isFavoriteBtn, looktxt, opit, vacName, zp);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
