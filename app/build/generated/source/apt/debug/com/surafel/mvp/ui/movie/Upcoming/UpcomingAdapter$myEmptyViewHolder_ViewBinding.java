// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Upcoming;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.surafel.mvp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class UpcomingAdapter$myEmptyViewHolder_ViewBinding implements Unbinder {
  private UpcomingAdapter.myEmptyViewHolder target;

  @UiThread
  public UpcomingAdapter$myEmptyViewHolder_ViewBinding(UpcomingAdapter.myEmptyViewHolder target, View source) {
    this.target = target;

    target.emptyImageView = Utils.findRequiredViewAsType(source, R.id.imageViewEmpty, "field 'emptyImageView'", ImageView.class);
    target.Textview = Utils.findRequiredViewAsType(source, R.id.tv_message, "field 'Textview'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UpcomingAdapter.myEmptyViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.emptyImageView = null;
    target.Textview = null;
  }
}
