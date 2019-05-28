// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Top;

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

public class TopAdapter$myViewHolder_ViewBinding implements Unbinder {
  private TopAdapter.myViewHolder target;

  @UiThread
  public TopAdapter$myViewHolder_ViewBinding(TopAdapter.myViewHolder target, View source) {
    this.target = target;

    target.movieImageview = Utils.findRequiredViewAsType(source, R.id.iv_movie_cell, "field 'movieImageview'", ImageView.class);
    target.titleTextView = Utils.findRequiredViewAsType(source, R.id.tv_movie_title, "field 'titleTextView'", TextView.class);
    target.descriptionTextView = Utils.findRequiredViewAsType(source, R.id.tv_movie_description, "field 'descriptionTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TopAdapter.myViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.movieImageview = null;
    target.titleTextView = null;
    target.descriptionTextView = null;
  }
}
