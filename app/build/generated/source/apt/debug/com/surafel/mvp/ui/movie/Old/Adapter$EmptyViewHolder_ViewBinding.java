// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Old;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.surafel.mvp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Adapter$EmptyViewHolder_ViewBinding implements Unbinder {
  private Adapter.EmptyViewHolder target;

  @UiThread
  public Adapter$EmptyViewHolder_ViewBinding(Adapter.EmptyViewHolder target, View source) {
    this.target = target;

    target.retryButton = Utils.findRequiredViewAsType(source, R.id.btn_retry, "field 'retryButton'", Button.class);
    target.retryMessage = Utils.findRequiredViewAsType(source, R.id.tv_message, "field 'retryMessage'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Adapter.EmptyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.retryButton = null;
    target.retryMessage = null;
  }
}
