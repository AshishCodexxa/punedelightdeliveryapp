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

public final class DialogConfirmSendRequestBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edtAmount;

  @NonNull
  public final EditText edtMsg;

  @NonNull
  public final TextView tvDialogCancel;

  @NonNull
  public final TextView tvDialogSend;

  private DialogConfirmSendRequestBinding(@NonNull LinearLayout rootView,
      @NonNull EditText edtAmount, @NonNull EditText edtMsg, @NonNull TextView tvDialogCancel,
      @NonNull TextView tvDialogSend) {
    this.rootView = rootView;
    this.edtAmount = edtAmount;
    this.edtMsg = edtMsg;
    this.tvDialogCancel = tvDialogCancel;
    this.tvDialogSend = tvDialogSend;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogConfirmSendRequestBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogConfirmSendRequestBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_confirm_send_request, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogConfirmSendRequestBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.edtAmount;
      EditText edtAmount = ViewBindings.findChildViewById(rootView, id);
      if (edtAmount == null) {
        break missingId;
      }

      id = R.id.edtMsg;
      EditText edtMsg = ViewBindings.findChildViewById(rootView, id);
      if (edtMsg == null) {
        break missingId;
      }

      id = R.id.tvDialogCancel;
      TextView tvDialogCancel = ViewBindings.findChildViewById(rootView, id);
      if (tvDialogCancel == null) {
        break missingId;
      }

      id = R.id.tvDialogSend;
      TextView tvDialogSend = ViewBindings.findChildViewById(rootView, id);
      if (tvDialogSend == null) {
        break missingId;
      }

      return new DialogConfirmSendRequestBinding((LinearLayout) rootView, edtAmount, edtMsg,
          tvDialogCancel, tvDialogSend);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
