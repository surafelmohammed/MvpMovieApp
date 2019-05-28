package com.surafel.mvp.ui.movie.Upcoming;

import com.surafel.mvp.ui.base.MvpPresenter;

public interface UpcomingMvpPresenter<V extends UpcomingMvpView> extends MvpPresenter<V> {
    void getmData();
}
