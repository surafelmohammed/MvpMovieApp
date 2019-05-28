package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Top.TopAdapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideTopAdapterFactory implements Factory<TopAdapter> {
  private final ActivityModule module;

  public ActivityModule_ProvideTopAdapterFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public TopAdapter get() {
    return Preconditions.checkNotNull(
        module.provideTopAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TopAdapter> create(ActivityModule module) {
    return new ActivityModule_ProvideTopAdapterFactory(module);
  }

  /** Proxies {@link ActivityModule#provideTopAdapter()}. */
  public static TopAdapter proxyProvideTopAdapter(ActivityModule instance) {
    return instance.provideTopAdapter();
  }
}
