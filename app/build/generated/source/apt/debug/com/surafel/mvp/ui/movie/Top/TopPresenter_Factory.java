package com.surafel.mvp.ui.movie.Top;

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
public final class TopPresenter_Factory<V extends TopMvpView> implements Factory<TopPresenter<V>> {
  private final MembersInjector<TopPresenter<V>> topPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public TopPresenter_Factory(
      MembersInjector<TopPresenter<V>> topPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert topPresenterMembersInjector != null;
    this.topPresenterMembersInjector = topPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public TopPresenter<V> get() {
    return MembersInjectors.injectMembers(
        topPresenterMembersInjector,
        new TopPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends TopMvpView> Factory<TopPresenter<V>> create(
      MembersInjector<TopPresenter<V>> topPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new TopPresenter_Factory<V>(
        topPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
