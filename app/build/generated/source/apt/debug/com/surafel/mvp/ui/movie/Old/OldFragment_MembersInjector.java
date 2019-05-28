package com.surafel.mvp.ui.movie.Old;

import android.support.v7.widget.LinearLayoutManager;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OldFragment_MembersInjector implements MembersInjector<OldFragment> {
  private final Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider;

  private final Provider<Adapter> mAdapterProvider;

  private final Provider<LinearLayoutManager> mLinearLayoutManagerProvider;

  public OldFragment_MembersInjector(
      Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider,
      Provider<Adapter> mAdapterProvider,
      Provider<LinearLayoutManager> mLinearLayoutManagerProvider) {
    assert mPresenterProvider != null;
    this.mPresenterProvider = mPresenterProvider;
    assert mAdapterProvider != null;
    this.mAdapterProvider = mAdapterProvider;
    assert mLinearLayoutManagerProvider != null;
    this.mLinearLayoutManagerProvider = mLinearLayoutManagerProvider;
  }

  public static MembersInjector<OldFragment> create(
      Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider,
      Provider<Adapter> mAdapterProvider,
      Provider<LinearLayoutManager> mLinearLayoutManagerProvider) {
    return new OldFragment_MembersInjector(
        mPresenterProvider, mAdapterProvider, mLinearLayoutManagerProvider);
  }

  @Override
  public void injectMembers(OldFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mPresenter = mPresenterProvider.get();
    instance.mAdapter = mAdapterProvider.get();
    instance.mLinearLayoutManager = mLinearLayoutManagerProvider.get();
  }

  public static void injectMPresenter(
      OldFragment instance, Provider<OldMvpPresenter<OldMvpView>> mPresenterProvider) {
    instance.mPresenter = mPresenterProvider.get();
  }

  public static void injectMAdapter(OldFragment instance, Provider<Adapter> mAdapterProvider) {
    instance.mAdapter = mAdapterProvider.get();
  }

  public static void injectMLinearLayoutManager(
      OldFragment instance, Provider<LinearLayoutManager> mLinearLayoutManagerProvider) {
    instance.mLinearLayoutManager = mLinearLayoutManagerProvider.get();
  }
}
