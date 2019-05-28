package com.surafel.mvp.di.module;

import android.support.v7.app.AppCompatActivity;
import com.surafel.mvp.ui.movie.PagerAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvidePagerAdapterFactory implements Factory<PagerAdapter> {
  private final ActivityModule module;

  private final Provider<AppCompatActivity> activityProvider;

  public ActivityModule_ProvidePagerAdapterFactory(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    assert module != null;
    this.module = module;
    assert activityProvider != null;
    this.activityProvider = activityProvider;
  }

  @Override
  public PagerAdapter get() {
    return Preconditions.checkNotNull(
        module.providePagerAdapter(activityProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<PagerAdapter> create(
      ActivityModule module, Provider<AppCompatActivity> activityProvider) {
    return new ActivityModule_ProvidePagerAdapterFactory(module, activityProvider);
  }

  /** Proxies {@link ActivityModule#providePagerAdapter(AppCompatActivity)}. */
  public static PagerAdapter proxyProvidePagerAdapter(
      ActivityModule instance, AppCompatActivity activity) {
    return instance.providePagerAdapter(activity);
  }
}
