package com.surafel.mvp.ui.movie.Upcoming;

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
public final class UpcomingPresenter_Factory<V extends UpcomingMvpView>
    implements Factory<UpcomingPresenter<V>> {
  private final MembersInjector<UpcomingPresenter<V>> upcomingPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public UpcomingPresenter_Factory(
      MembersInjector<UpcomingPresenter<V>> upcomingPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert upcomingPresenterMembersInjector != null;
    this.upcomingPresenterMembersInjector = upcomingPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public UpcomingPresenter<V> get() {
    return MembersInjectors.injectMembers(
        upcomingPresenterMembersInjector,
        new UpcomingPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends UpcomingMvpView> Factory<UpcomingPresenter<V>> create(
      MembersInjector<UpcomingPresenter<V>> upcomingPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new UpcomingPresenter_Factory<V>(
        upcomingPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
