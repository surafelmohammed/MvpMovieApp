package com.surafel.mvp.di.module;

import com.surafel.mvp.ui.movie.Old.OldMvpPresenter;
import com.surafel.mvp.ui.movie.Old.OldMvpView;
import com.surafel.mvp.ui.movie.Old.OldPresenter;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ActivityModule_ProvideOldMvpPresenterFactory
    implements Factory<OldMvpPresenter<OldMvpView>> {
  private final ActivityModule module;

  private final Provider<OldPresenter<OldMvpView>> presenterProvider;

  public ActivityModule_ProvideOldMvpPresenterFactory(
      ActivityModule module, Provider<OldPresenter<OldMvpView>> presenterProvider) {
    assert module != null;
    this.module = module;
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  @Override
  public OldMvpPresenter<OldMvpView> get() {
    return Preconditions.checkNotNull(
        module.provideOldMvpPresenter(presenterProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<OldMvpPresenter<OldMvpView>> create(
      ActivityModule module, Provider<OldPresenter<OldMvpView>> presenterProvider) {
    return new ActivityModule_ProvideOldMvpPresenterFactory(module, presenterProvider);
  }

  /** Proxies {@link ActivityModule#provideOldMvpPresenter(OldPresenter)}. */
  public static OldMvpPresenter<OldMvpView> proxyProvideOldMvpPresenter(
      ActivityModule instance, OldPresenter<OldMvpView> presenter) {
    return instance.provideOldMvpPresenter(presenter);
  }
}
