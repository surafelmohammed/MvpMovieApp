package com.surafel.mvp.ui.movie.Top;

import com.surafel.mvp.ui.base.MvpPresenter;

public interface TopMvpPresenter<V extends TopMvpView> extends MvpPresenter<V> {

    void getmData();
}
