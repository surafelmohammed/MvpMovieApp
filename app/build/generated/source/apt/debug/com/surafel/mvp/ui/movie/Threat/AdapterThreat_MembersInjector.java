package com.surafel.mvp.ui.movie.Threat;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AdapterThreat_MembersInjector implements MembersInjector<AdapterThreat> {
  private final Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider;

  public AdapterThreat_MembersInjector(
      Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<AdapterThreat> create(
      Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider) {
    return new AdapterThreat_MembersInjector(mPresenterProvider);
  }

  @Override
  public void injectMembers(AdapterThreat instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMPresenter(
      AdapterThreat instance, Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
