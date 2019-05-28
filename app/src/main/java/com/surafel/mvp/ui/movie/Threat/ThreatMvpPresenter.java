package com.surafel.mvp.ui.movie.Threat;

import com.surafel.mvp.ui.base.MvpPresenter;

public interface ThreatMvpPresenter<V extends ThreatMvpView> extends MvpPresenter<V> {

    void getmData();
}
