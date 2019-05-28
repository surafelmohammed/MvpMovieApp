package com.surafel.mvp.ui.movie;

import com.surafel.mvp.data.DataManager;
import com.surafel.mvp.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MoviePresenter_Factory<V extends MovieMvpView>
    implements Factory<MoviePresenter<V>> {
  private final MembersInjector<MoviePresenter<V>> moviePresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public MoviePresenter_Factory(
      MembersInjector<MoviePresenter<V>> moviePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert moviePresenterMembersInjector != null;
    this.moviePresenterMembersInjector = moviePresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public MoviePresenter<V> get() {
    return MembersInjectors.injectMembers(
        moviePresenterMembersInjector,
        new MoviePresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends MovieMvpView> Factory<MoviePresenter<V>> create(
      MembersInjector<MoviePresenter<V>> moviePresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new MoviePresenter_Factory<V>(
        moviePresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
