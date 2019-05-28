package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Threat.AdapterThreat;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideAdapterThreatFactory implements Factory<AdapterThreat> {
  private final ActivityModule module;

  public ActivityModule_ProvideAdapterThreatFactory(ActivityModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public AdapterThreat get() {
    return Preconditions.checkNotNull(
        module.provideAdapterThreat(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<AdapterThreat> create(ActivityModule module) {
    return new ActivityModule_ProvideAdapterThreatFactory(module);
  }

  /** Proxies {@link ActivityModule#provideAdapterThreat()}. */
  public static AdapterThreat proxyProvideAdapterThreat(ActivityModule instance) {
    return instance.provideAdapterThreat();
  }
}
