// Generated by view binder compiler. Do not edit!
package com.punedelights.partners.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.punedelights.partners.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LytNotificationListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final LinearLayout lytNotification;

  @NonNull
  public final TextView tvMessage;

  @NonNull
  public final TextView tvMessageMore;

  @NonNull
  public final TextView tvOrderDate;

  @NonNull
  public final TextView tvShowMore;

  @NonNull
  public final TextView tvTitle;

  private LytNotificationListBinding(@NonNull LinearLayout rootView,
      @NonNull LinearLayout lytNotification, @NonNull TextView tvMessage,
      @NonNull TextView tvMessageMore, @NonNull TextView tvOrderDate, @NonNull TextView tvShowMore,
      @NonNull TextView tvTitle) {
    this.rootView = rootView;
    this.lytNotification = lytNotification;
    this.tvMessage = tvMessage;
    this.tvMessageMore = tvMessageMore;
    this.tvOrderDate = tvOrderDate;
    this.tvShowMore = tvShowMore;
    this.tvTitle = tvTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LytNotificationListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LytNotificationListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.lyt_notification_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LytNotificationListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      LinearLayout lytNotification = (LinearLayout) rootView;

      id = R.id.tvMessage;
      TextView tvMessage = ViewBindings.findChildViewById(rootView, id);
      if (tvMessage == null) {
        break missingId;
      }

      id = R.id.tvMessageMore;
      TextView tvMessageMore = ViewBindings.findChildViewById(rootView, id);
      if (tvMessageMore == null) {
        break missingId;
      }

      id = R.id.tvOrderDate;
      TextView tvOrderDate = ViewBindings.findChildViewById(rootView, id);
      if (tvOrderDate == null) {
        break missingId;
      }

      id = R.id.tvShowMore;
      TextView tvShowMore = ViewBindings.findChildViewById(rootView, id);
      if (tvShowMore == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      return new LytNotificationListBinding((LinearLayout) rootView, lytNotification, tvMessage,
          tvMessageMore, tvOrderDate, tvShowMore, tvTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
