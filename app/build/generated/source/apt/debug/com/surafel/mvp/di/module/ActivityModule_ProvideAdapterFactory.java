package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Old.Adapter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideAdapterFactory implements Factory<Adapter> {
  private final ActivityModule module;

  public ActivityModule_ProvideAdapterFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Adapter get() {
    return Preconditions.checkNotNull(
        module.provideAdapter(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Adapter> create(ActivityModule module) {
    return new ActivityModule_ProvideAdapterFactory(module);
  }

  /** Proxies {@link ActivityModule#provideAdapter()}. */
  public static Adapter proxyProvideAdapter(ActivityModule instance) {
    return instance.provideAdapter();
  }
}
