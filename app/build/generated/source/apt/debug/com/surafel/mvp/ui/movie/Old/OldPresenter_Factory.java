package com.surafel.mvp.ui.movie.Old;

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
public final class OldPresenter_Factory<V extends OldMvpView> implements Factory<OldPresenter<V>> {
  private final MembersInjector<OldPresenter<V>> oldPresenterMembersInjector;

  private final Provider<DataManager> dataManagerProvider;

  private final Provider<SchedulerProvider> schedulerProvider;

  private final Provider<CompositeDisposable> compositeDisposableProvider;

  public OldPresenter_Factory(
      MembersInjector<OldPresenter<V>> oldPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    assert oldPresenterMembersInjector != null;
    this.oldPresenterMembersInjector = oldPresenterMembersInjector;
    assert dataManagerProvider != null;
    this.dataManagerProvider = dataManagerProvider;
    assert schedulerProvider != null;
    this.schedulerProvider = schedulerProvider;
    assert compositeDisposableProvider != null;
    this.compositeDisposableProvider = compositeDisposableProvider;
  }

  @Override
  public OldPresenter<V> get() {
    return MembersInjectors.injectMembers(
        oldPresenterMembersInjector,
        new OldPresenter<V>(
            dataManagerProvider.get(), schedulerProvider.get(), compositeDisposableProvider.get()));
  }

  public static <V extends OldMvpView> Factory<OldPresenter<V>> create(
      MembersInjector<OldPresenter<V>> oldPresenterMembersInjector,
      Provider<DataManager> dataManagerProvider,
      Provider<SchedulerProvider> schedulerProvider,
      Provider<CompositeDisposable> compositeDisposableProvider) {
    return new OldPresenter_Factory<V>(
        oldPresenterMembersInjector,
        dataManagerProvider,
        schedulerProvider,
        compositeDisposableProvider);
  }
}
