// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Threat;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.surafel.mvp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ThreatFragment_ViewBinding implements Unbinder {
  private ThreatFragment target;

  @UiThread
  public ThreatFragment_ViewBinding(ThreatFragment target, View source) {
    this.target = target;

    target.recyclerViewThreat = Utils.findRequiredViewAsType(source, R.id.rv_threatmovie, "field 'recyclerViewThreat'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ThreatFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.recyclerViewThreat = null;
  }
}
