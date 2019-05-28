// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Top;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.surafel.mvp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class TopFragment_ViewBinding implements Unbinder {
  private TopFragment target;

  @UiThread
  public TopFragment_ViewBinding(TopFragment target, View source) {
    this.target = target;

    target.topRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_topmovies, "field 'topRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    TopFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.topRecyclerView = null;
  }
}
