package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Top.TopMvpPresenter;
import com.surafel.mvp.ui.movie.Top.TopMvpView;
import com.surafel.mvp.ui.movie.Top.TopPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideTopMvpPresenterFactory
    implements Factory<TopMvpPresenter<TopMvpView>> {
  private final ActivityModule module;

  private final Provider<TopPresenter<TopMvpView>> presenterProvider;

  public ActivityModule_ProvideTopMvpPresenterFactory(
      ActivityModule module, Provider<TopPresenter<TopMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public TopMvpPresenter<TopMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideTopMvpPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<TopMvpPresenter<TopMvpView>> create(
      ActivityModule module, Provider<TopPresenter<TopMvpView>> presenterProvider) {
    return new ActivityModule_ProvideTopMvpPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideTopMvpPresenter(TopPresenter)}. */
  public static TopMvpPresenter<TopMvpView> proxyProvideTopMvpPresenter(
      ActivityModule instance, TopPresenter<TopMvpView> presenter) {
    return instance.provideTopMvpPresenter(presenter);
  }
}
