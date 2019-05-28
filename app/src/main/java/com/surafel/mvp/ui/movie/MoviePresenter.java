package com.surafel.mvp.ui.movie;

import com.surafel.mvp.data.DataManager;
import com.surafel.mvp.ui.base.BasePresenter;
import com.surafel.mvp.utils.rx.SchedulerProvider;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class MoviePresenter<V extends MovieMvpView> extends BasePresenter<V>
        implements MovieMvpPresenter<V> {

    public static final String TAG = "MoviePresenter";

    @Inject
    public MoviePresenter(DataManager dataManager,
                          SchedulerProvider schedulerProvider,
                          CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }
}
