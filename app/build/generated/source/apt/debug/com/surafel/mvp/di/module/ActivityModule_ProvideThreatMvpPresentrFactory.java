package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Threat.ThreatMvpPresenter;
import com.surafel.mvp.ui.movie.Threat.ThreatMvpView;
import com.surafel.mvp.ui.movie.Threat.ThreatPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideThreatMvpPresentrFactory
    implements Factory<ThreatMvpPresenter<ThreatMvpView>> {
  private final ActivityModule module;

  private final Provider<ThreatPresenter<ThreatMvpView>> presenterProvider;

  public ActivityModule_ProvideThreatMvpPresentrFactory(
      ActivityModule module, Provider<ThreatPresenter<ThreatMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public ThreatMvpPresenter<ThreatMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideThreatMvpPresentr(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<ThreatMvpPresenter<ThreatMvpView>> create(
      ActivityModule module, Provider<ThreatPresenter<ThreatMvpView>> presenterProvider) {
    return new ActivityModule_ProvideThreatMvpPresentrFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideThreatMvpPresentr(ThreatPresenter)}. */
  public static ThreatMvpPresenter<ThreatMvpView> proxyProvideThreatMvpPresentr(
      ActivityModule instance, ThreatPresenter<ThreatMvpView> presenter) {
    return instance.provideThreatMvpPresentr(presenter);
  }
}
