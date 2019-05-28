package com.surafel.mvp.ui.movie.Top;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class TopAdapter_MembersInjector implements MembersInjector<TopAdapter> {
  private final Provider<TopMvpPresenter<TopMvpView>> mpresenterProvider;

  public TopAdapter_MembersInjector(Provider<TopMvpPresenter<TopMvpView>> mpresenterProvider) {
    assert mpresenterProvider != null;
    this.mpresenterProvider = mpresenterProvider;
  }

  public static MembersInjector<TopAdapter> create(
      Provider<TopMvpPresenter<TopMvpView>> mpresenterProvider) {
    return new TopAdapter_MembersInjector(mpresenterProvider);
  }

  @Override
  public void injectMembers(TopAdapter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mpresenter = mpresenterProvider.get();
  }

  public static void injectMpresenter(
      TopAdapter instance, Provider<TopMvpPresenter<TopMvpView>> mpresenterProvider) {
    instance.mpresenter = mpresenterProvider.get();
  }
}
