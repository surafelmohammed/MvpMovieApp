package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Upcoming.UpcomingMvpPresenter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingMvpView;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideUpcomingMvpPresenterFactory
    implements Factory<UpcomingMvpPresenter<UpcomingMvpView>> {
  private final ActivityModule module;

  private final Provider<UpcomingPresenter<UpcomingMvpView>> presenterProvider;

  public ActivityModule_ProvideUpcomingMvpPresenterFactory(
      ActivityModule module, Provider<UpcomingPresenter<UpcomingMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public UpcomingMvpPresenter<UpcomingMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideUpcomingMvpPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<UpcomingMvpPresenter<UpcomingMvpView>> create(
      ActivityModule module, Provider<UpcomingPresenter<UpcomingMvpView>> presenterProvider) {
    return new ActivityModule_ProvideUpcomingMvpPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideUpcomingMvpPresenter(UpcomingPresenter)}. */
  public static UpcomingMvpPresenter<UpcomingMvpView> proxyProvideUpcomingMvpPresenter(
      ActivityModule instance, UpcomingPresenter<UpcomingMvpView> presenter) {
    return instance.provideUpcomingMvpPresenter(presenter);
  }
}
