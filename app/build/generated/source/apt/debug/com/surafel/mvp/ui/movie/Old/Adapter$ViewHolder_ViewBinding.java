// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Old;

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

public class Adapter$ViewHolder_ViewBinding implements Unbinder {
  private Adapter.ViewHolder target;

  @UiThread
  public Adapter$ViewHolder_ViewBinding(Adapter.ViewHolder target, View source) {
    this.target = target;

    target.movieImageView = Utils.findRequiredViewAsType(source, R.id.iv_movie_cell, "field 'movieImageView'", ImageView.class);
    target.titleTextView = Utils.findRequiredViewAsType(source, R.id.tv_movie_title, "field 'titleTextView'", TextView.class);
    target.descriptionTextView = Utils.findRequiredViewAsType(source, R.id.tv_movie_description, "field 'descriptionTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Adapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.movieImageView = null;
    target.titleTextView = null;
    target.descriptionTextView = null;
  }
}
