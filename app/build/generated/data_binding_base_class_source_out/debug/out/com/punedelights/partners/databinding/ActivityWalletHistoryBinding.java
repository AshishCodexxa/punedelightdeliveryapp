// Generated by view binder compiler. Do not edit!
package com.punedelights.partners.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.punedelights.partners.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityWalletHistoryBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btnSendWithdrawalRequest;

  @NonNull
  public final RecyclerView recyclerView;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final ShimmerFrameLayout shimmerFrameLayout;

  @NonNull
  public final SwipeRefreshLayout swipeRefresh;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final TextView tvBalance;

  @NonNull
  public final TextView tvTitleBalance;

  private ActivityWalletHistoryBinding(@NonNull RelativeLayout rootView,
      @NonNull Button btnSendWithdrawalRequest, @NonNull RecyclerView recyclerView,
      @NonNull NestedScrollView scrollView, @NonNull ShimmerFrameLayout shimmerFrameLayout,
      @NonNull SwipeRefreshLayout swipeRefresh, @NonNull Toolbar toolbar,
      @NonNull TextView tvBalance, @NonNull TextView tvTitleBalance) {
    this.rootView = rootView;
    this.btnSendWithdrawalRequest = btnSendWithdrawalRequest;
    this.recyclerView = recyclerView;
    this.scrollView = scrollView;
    this.shimmerFrameLayout = shimmerFrameLayout;
    this.swipeRefresh = swipeRefresh;
    this.toolbar = toolbar;
    this.tvBalance = tvBalance;
    this.tvTitleBalance = tvTitleBalance;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityWalletHistoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityWalletHistoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_wallet_history, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityWalletHistoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnSendWithdrawalRequest;
      Button btnSendWithdrawalRequest = ViewBindings.findChildViewById(rootView, id);
      if (btnSendWithdrawalRequest == null) {
        break missingId;
      }

      id = R.id.recyclerView;
      RecyclerView recyclerView = ViewBindings.findChildViewById(rootView, id);
      if (recyclerView == null) {
        break missingId;
      }

      id = R.id.scrollView;
      NestedScrollView scrollView = ViewBindings.findChildViewById(rootView, id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.shimmerFrameLayout;
      ShimmerFrameLayout shimmerFrameLayout = ViewBindings.findChildViewById(rootView, id);
      if (shimmerFrameLayout == null) {
        break missingId;
      }

      id = R.id.swipeRefresh;
      SwipeRefreshLayout swipeRefresh = ViewBindings.findChildViewById(rootView, id);
      if (swipeRefresh == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      id = R.id.tvBalance;
      TextView tvBalance = ViewBindings.findChildViewById(rootView, id);
      if (tvBalance == null) {
        break missingId;
      }

      id = R.id.tvTitleBalance;
      TextView tvTitleBalance = ViewBindings.findChildViewById(rootView, id);
      if (tvTitleBalance == null) {
        break missingId;
      }

      return new ActivityWalletHistoryBinding((RelativeLayout) rootView, btnSendWithdrawalRequest,
          recyclerView, scrollView, shimmerFrameLayout, swipeRefresh, toolbar, tvBalance,
          tvTitleBalance);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}