package com.surafel.mvp.ui.movie.Threat;

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
public final class ThreatPresenter_Factory<V extends ThreatMvpView>
    implements Factory<ThreatPresenter<V>> {
  private final MembersInjector<ThreatPresenter<V>> threatPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public ThreatPresenter_Factory(
      MembersInjector<ThreatPresenter<V>> threatPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert threatPresenterMembersInjector != null;
    this.threatPresenterMembersInjector = threatPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public ThreatPresenter<V> get() {
    return MembersInjectors.injectMembers(
        threatPresenterMembersInjector,
        new ThreatPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends ThreatMvpView> Factory<ThreatPresenter<V>> create(
      MembersInjector<ThreatPresenter<V>> threatPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new ThreatPresenter_Factory<V>(
        threatPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
