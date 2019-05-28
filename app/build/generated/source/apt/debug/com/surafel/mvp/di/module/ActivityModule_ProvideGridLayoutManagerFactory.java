package com.surafel.mvp.di.module;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideGridLayoutManagerFactory
    implements Factory<GridLayoutManager> {
  private final ActivityModule module;

  private final Provider<AppCompatActivity> activityProvider;

  public ActivityModule_ProvideGridLayoutManagerFactory(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    assert module != null;
    this.module = module;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
  }

  @Override
  public GridLayoutManager get() {
    return Preconditions.checkNotNull(
        module.provideGridLayoutManager(activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<GridLayoutManager> create(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    return new ActivityModule_ProvideGridLayoutManagerFactory(module, activityProvider);
  }

  /** Proxies {@link ActivityModule#provideGridLayoutManager(AppCompatActivity)}. */
  public static GridLayoutManager proxyProvideGridLayoutManager(
      ActivityModule instance, AppCompatActivity activity) {
    return instance.provideGridLayoutManager(activity);
  }
}
