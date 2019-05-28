// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Threat;

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

public class AdapterThreat$myViewHolder_ViewBinding implements Unbinder {
  private AdapterThreat.myViewHolder target;

  @UiThread
  public AdapterThreat$myViewHolder_ViewBinding(AdapterThreat.myViewHolder target, View source) {
    this.target = target;

    target.movieTitleTextVeiw = Utils.findRequiredViewAsType(source, R.id.tv_movie_title, "field 'movieTitleTextVeiw'", TextView.class);
    target.movieDescriptionTextVeiw = Utils.findRequiredViewAsType(source, R.id.tv_movie_description, "field 'movieDescriptionTextVeiw'", TextView.class);
    target.movieImageView = Utils.findRequiredViewAsType(source, R.id.iv_movie_cell, "field 'movieImageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AdapterThreat.myViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.movieTitleTextVeiw = null;
    target.movieDescriptionTextVeiw = null;
    target.movieImageView = null;
  }
}
