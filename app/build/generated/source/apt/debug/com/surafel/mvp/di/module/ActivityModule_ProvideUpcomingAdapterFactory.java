package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Upcoming.UpcomingAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideUpcomingAdapterFactory
    implements Factory<UpcomingAdapter> {
  private final ActivityModule module;

  public ActivityModule_ProvideUpcomingAdapterFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public UpcomingAdapter get() {
    return Preconditions.checkNotNull(
        module.provideUpcomingAdapter(),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UpcomingAdapter> create(ActivityModule module) {
    return new ActivityModule_ProvideUpcomingAdapterFactory(module);
  }

  /** Proxies {@link ActivityModule#provideUpcomingAdapter()}. */
  public static UpcomingAdapter proxyProvideUpcomingAdapter(ActivityModule instance) {
    return instance.provideUpcomingAdapter();
  }
}
