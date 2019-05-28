// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie.Old;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.surafel.mvp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class OldFragment_ViewBinding implements Unbinder {
  private OldFragment target;

  @UiThread
  public OldFragment_ViewBinding(OldFragment target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.rv_oldmoives, "field 'mRecyclerView'", RecyclerView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    OldFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
  }
}
