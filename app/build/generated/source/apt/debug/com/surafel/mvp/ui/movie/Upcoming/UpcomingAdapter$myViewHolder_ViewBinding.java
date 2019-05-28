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

public class UpcomingAdapter$myViewHolder_ViewBinding implements Unbinder {
  private UpcomingAdapter.myViewHolder target;

  @UiThread
  public UpcomingAdapter$myViewHolder_ViewBinding(UpcomingAdapter.myViewHolder target, View source) {
    this.target = target;

    target.imageViewMovie = Utils.findRequiredViewAsType(source, R.id.iv_movie_cell, "field 'imageViewMovie'", ImageView.class);
    target.titleTextView = Utils.findRequiredViewAsType(source, R.id.tv_movie_title, "field 'titleTextView'", TextView.class);
    target.descriptionTextView = Utils.findRequiredViewAsType(source, R.id.tv_movie_description, "field 'descriptionTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    UpcomingAdapter.myViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageViewMovie = null;
    target.titleTextView = null;
    target.descriptionTextView = null;
  }
}
