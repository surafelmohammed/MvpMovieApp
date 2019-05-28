package com.surafel.mvp.ui.movie.Threat;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ThreatFragment_MembersInjector implements MembersInjector<ThreatFragment> {
  private final Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider;

  private final Provider<AdapterThreat> adapterThreatProvider;

  public ThreatFragment_MembersInjector(
      Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider,
      Provider<AdapterThreat> adapterThreatProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert adapterThreatProvider != null;
    this.adapterThreatProvider = adapterThreatProvider;
  }

  public static MembersInjector<ThreatFragment> create(
      Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider,
      Provider<AdapterThreat> adapterThreatProvider) {
    return new ThreatFragment_MembersInjector(mPresenterProvider, adapterThreatProvider);
  }

  @Override
  public void injectMembers(ThreatFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
    instance.adapterThreat = adapterThreatProvider.get();
  }

  public static void injectMPresenter(
      ThreatFragment instance, Provider<ThreatMvpPresenter<ThreatMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectAdapterThreat(
      ThreatFragment instance, Provider<AdapterThreat> adapterThreatProvider) {
    instance.adapterThreat = adapterThreatProvider.get();
  }
}
