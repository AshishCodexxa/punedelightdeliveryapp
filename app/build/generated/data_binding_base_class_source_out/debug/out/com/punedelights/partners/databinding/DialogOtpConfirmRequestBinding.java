// Generated by view binder compiler. Do not edit!
package com.punedelights.partners.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

public final class DialogOtpConfirmRequestBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edtOTP;

  @NonNull
  public final TextView tvDialogCancel;

  @NonNull
  public final TextView tvDialogConfirm;

  private DialogOtpConfirmRequestBinding(@NonNull LinearLayout rootView, @NonNull EditText edtOTP,
      @NonNull TextView tvDialogCancel, @NonNull TextView tvDialogConfirm) {
    this.rootView = rootView;
    this.edtOTP = edtOTP;
    this.tvDialogCancel = tvDialogCancel;
    this.tvDialogConfirm = tvDialogConfirm;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogOtpConfirmRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogOtpConfirmRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_otp_confirm_request, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogOtpConfirmRequestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtOTP;
      EditText edtOTP = ViewBindings.findChildViewById(rootView, id);
      if (edtOTP == null) {
        break missingId;
      }

      id = R.id.tvDialogCancel;
      TextView tvDialogCancel = ViewBindings.findChildViewById(rootView, id);
      if (tvDialogCancel == null) {
        break missingId;
      }

      id = R.id.tvDialogConfirm;
      TextView tvDialogConfirm = ViewBindings.findChildViewById(rootView, id);
      if (tvDialogConfirm == null) {
        break missingId;
      }

      return new DialogOtpConfirmRequestBinding((LinearLayout) rootView, edtOTP, tvDialogCancel,
          tvDialogConfirm);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}