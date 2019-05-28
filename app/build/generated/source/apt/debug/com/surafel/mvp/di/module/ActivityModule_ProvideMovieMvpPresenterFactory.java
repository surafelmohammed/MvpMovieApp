package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.MovieMvpPresenter;
import com.surafel.mvp.ui.movie.MovieMvpView;
import com.surafel.mvp.ui.movie.MoviePresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideMovieMvpPresenterFactory
    implements Factory<MovieMvpPresenter<MovieMvpView>> {
  private final ActivityModule module;

  private final Provider<MoviePresenter<MovieMvpView>> presenterProvider;

  public ActivityModule_ProvideMovieMvpPresenterFactory(
      ActivityModule module, Provider<MoviePresenter<MovieMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public MovieMvpPresenter<MovieMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideMovieMvpPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<MovieMvpPresenter<MovieMvpView>> create(
      ActivityModule module, Provider<MoviePresenter<MovieMvpView>> presenterProvider) {
    return new ActivityModule_ProvideMovieMvpPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideMovieMvpPresenter(MoviePresenter)}. */
  public static MovieMvpPresenter<MovieMvpView> proxyProvideMovieMvpPresenter(
      ActivityModule instance, MoviePresenter<MovieMvpView> presenter) {
    return instance.provideMovieMvpPresenter(presenter);
  }
}
