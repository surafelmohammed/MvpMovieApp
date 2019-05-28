package com.surafel.mvp.ui.movie.Top;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopFragment_MembersInjector implements MembersInjector<TopFragment> {
  private final Provider<TopAdapter> topAdapterProvider;

  private final Provider<TopMvpPresenter<TopMvpView>> mPresenterProvider;

  public TopFragment_MembersInjector(
      Provider<TopAdapter> topAdapterProvider,
      Provider<TopMvpPresenter<TopMvpView>> mPresenterProvider) {
    assert topAdapterProvider != null;
    this.topAdapterProvider = topAdapterProvider;
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
  }

  public static MembersInjector<TopFragment> create(
      Provider<TopAdapter> topAdapterProvider,
      Provider<TopMvpPresenter<TopMvpView>> mPresenterProvider) {
    return new TopFragment_MembersInjector(topAdapterProvider, mPresenterProvider);
  }

  @Override
  public void injectMembers(TopFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.topAdapter = topAdapterProvider.get();
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectTopAdapter(
      TopFragment instance, Provider<TopAdapter> topAdapterProvider) {
    instance.topAdapter = topAdapterProvider.get();
  }

  public static void injectMPresenter(
      TopFragment instance, Provider<TopMvpPresenter<TopMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }
}
