package com.surafel.mvp.ui.movie.Old;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OldPresenter_MembersInjector<V extends OldMvpView>
    implements MembersInjector<OldPresenter<V>> {
  private final Provider<Adapter> mAdapterProvider;

  public OldPresenter_MembersInjector(Provider<Adapter> mAdapterProvider) {
    assert mAdapterProvider != null;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static <V extends OldMvpView> MembersInjector<OldPresenter<V>> create(
      Provider<Adapter> mAdapterProvider) {
    return new OldPresenter_MembersInjector<V>(mAdapterProvider);
  }

  @Override
  public void injectMembers(OldPresenter<V> instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.mAdapter = mAdapterProvider.get();
  }

  public static <V extends OldMvpView> void injectMAdapter(
      OldPresenter<V> instance, Provider<Adapter> mAdapterProvider) {
    instance.mAdapter = mAdapterProvider.get();
  }
}
