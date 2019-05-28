package com.surafel.mvp.ui.movie.Old;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class Adapter_MembersInjector implements MembersInjector<Adapter> {
  private final Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider;

  public Adapter_MembersInjector(Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<Adapter> create(
      Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider) {
    return new Adapter_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(Adapter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      Adapter instance, Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
