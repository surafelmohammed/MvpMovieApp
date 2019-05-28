package com.surafel.mvp.ui.movie.Upcoming;

import android.support.v7.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpcomingFragment_MembersInjector implements MembersInjector<UpcomingFragment> {
  private final Provider<LinearLayoutManager> linearLayoutManagerProvider;

  private final Provider<UpcomingMvpPresenter<UpcomingMvpView>> mPresenterProvider;

  private final Provider<UpcomingAdapter> mAdapterProvider;

  public UpcomingFragment_MembersInjector(
      Provider<LinearLayoutManager> linearLayoutManagerProvider,
      Provider<UpcomingMvpPresenter<UpcomingMvpView>> mPresenterProvider,
      Provider<UpcomingAdapter> mAdapterProvider) {
    assert linearLayoutManagerProvider != null;
    this.linearLayoutManagerProvider = linearLayoutManagerProvider;
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mAdapterProvider != null;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<UpcomingFragment> create(
      Provider<LinearLayoutManager> linearLayoutManagerProvider,
      Provider<UpcomingMvpPresenter<UpcomingMvpView>> mPresenterProvider,
      Provider<UpcomingAdapter> mAdapterProvider) {
    return new UpcomingFragment_MembersInjector(
        linearLayoutManagerProvider, mPresenterProvider, mAdapterProvider);
  }

  @Override
  public void injectMembers(UpcomingFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.linearLayoutManager = linearLayoutManagerProvider.get();
    instance.mPresenter = mPresenterProvider.get();
    instance.mAdapter = mAdapterProvider.get();
  }

  public static void injectLinearLayoutManager(
      UpcomingFragment instance, Provider<LinearLayoutManager> linearLayoutManagerProvider) {
    instance.linearLayoutManager = linearLayoutManagerProvider.get();
  }

  public static void injectMPresenter(
      UpcomingFragment instance,
      Provider<UpcomingMvpPresenter<UpcomingMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMAdapter(
      UpcomingFragment instance, Provider<UpcomingAdapter> mAdapterProvider) {
    instance.mAdapter = mAdapterProvider.get();
  }
}
