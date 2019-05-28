// Generated code from Butter Knife. Do not modify!
package com.surafel.mvp.ui.movie;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.surafel.mvp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MovieActivity_ViewBinding implements Unbinder {
  private MovieActivity target;

  @UiThread
  public MovieActivity_ViewBinding(MovieActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MovieActivity_ViewBinding(MovieActivity target, View source) {
    this.target = target;

    target.drawerLayout = Utils.findRequiredViewAsType(source, R.id.movie_drawer_layout, "field 'drawerLayout'", DrawerLayout.class);
    target.toolbarMovie = Utils.findRequiredViewAsType(source, R.id.toolbar_movie, "field 'toolbarMovie'", Toolbar.class);
    target.tabLayoutMoive = Utils.findRequiredViewAsType(source, R.id.tab_layout_movie, "field 'tabLayoutMoive'", TabLayout.class);
    target.viewPagerMovie = Utils.findRequiredViewAsType(source, R.id.movie_view_pager, "field 'viewPagerMovie'", ViewPager.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MovieActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.drawerLayout = null;
    target.toolbarMovie = null;
    target.tabLayoutMoive = null;
    target.viewPagerMovie = null;
  }
}
