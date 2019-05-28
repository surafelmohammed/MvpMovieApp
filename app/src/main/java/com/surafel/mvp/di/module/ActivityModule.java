/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.surafel.mvp.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;

import com.surafel.mvp.data.db.model.MovieItems;
import com.surafel.mvp.data.network.model.BlogResponse;
import com.surafel.mvp.data.network.model.OpenSourceResponse;
import com.surafel.mvp.di.ActivityContext;
import com.surafel.mvp.di.PerActivity;
import com.surafel.mvp.ui.about.AboutMvpPresenter;
import com.surafel.mvp.ui.about.AboutMvpView;
import com.surafel.mvp.ui.about.AboutPresenter;
import com.surafel.mvp.ui.feed.FeedMvpPresenter;
import com.surafel.mvp.ui.feed.FeedMvpView;
import com.surafel.mvp.ui.feed.FeedPagerAdapter;
import com.surafel.mvp.ui.feed.FeedPresenter;
import com.surafel.mvp.ui.feed.blogs.BlogAdapter;
import com.surafel.mvp.ui.feed.blogs.BlogMvpPresenter;
import com.surafel.mvp.ui.feed.blogs.BlogMvpView;
import com.surafel.mvp.ui.feed.blogs.BlogPresenter;
import com.surafel.mvp.ui.feed.opensource.OpenSourceAdapter;
import com.surafel.mvp.ui.feed.opensource.OpenSourceMvpPresenter;
import com.surafel.mvp.ui.feed.opensource.OpenSourceMvpView;
import com.surafel.mvp.ui.feed.opensource.OpenSourcePresenter;
import com.surafel.mvp.ui.login.LoginMvpPresenter;
import com.surafel.mvp.ui.login.LoginMvpView;
import com.surafel.mvp.ui.login.LoginPresenter;
import com.surafel.mvp.ui.main.MainMvpPresenter;
import com.surafel.mvp.ui.main.MainMvpView;
import com.surafel.mvp.ui.main.MainPresenter;
import com.surafel.mvp.ui.main.rating.RatingDialogMvpPresenter;
import com.surafel.mvp.ui.main.rating.RatingDialogMvpView;
import com.surafel.mvp.ui.main.rating.RatingDialogPresenter;
import com.surafel.mvp.ui.movie.MovieMvpPresenter;
import com.surafel.mvp.ui.movie.MovieMvpView;
import com.surafel.mvp.ui.movie.MoviePresenter;
import com.surafel.mvp.ui.movie.Old.Adapter;
import com.surafel.mvp.ui.movie.Old.OldMvpPresenter;
import com.surafel.mvp.ui.movie.Old.OldMvpView;
import com.surafel.mvp.ui.movie.Old.OldPresenter;
import com.surafel.mvp.ui.movie.PagerAdapter;
import com.surafel.mvp.ui.movie.Threat.AdapterThreat;
import com.surafel.mvp.ui.movie.Threat.ThreatMvpPresenter;
import com.surafel.mvp.ui.movie.Threat.ThreatMvpView;
import com.surafel.mvp.ui.movie.Threat.ThreatPresenter;
import com.surafel.mvp.ui.movie.Top.TopAdapter;
import com.surafel.mvp.ui.movie.Top.TopMvpPresenter;
import com.surafel.mvp.ui.movie.Top.TopMvpView;
import com.surafel.mvp.ui.movie.Top.TopPresenter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingAdapter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingMvpPresenter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingMvpView;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingPresenter;
import com.surafel.mvp.ui.splash.SplashMvpPresenter;
import com.surafel.mvp.ui.splash.SplashMvpView;
import com.surafel.mvp.ui.splash.SplashPresenter;
import com.surafel.mvp.utils.rx.AppSchedulerProvider;
import com.surafel.mvp.utils.rx.SchedulerProvider;

import java.util.ArrayList;

import dagger.Module;
import dagger.Provides;
import io.reactivex.disposables.CompositeDisposable;

/**
 * Created by janisharali on 27/01/17.
 */

@Module
public class ActivityModule {

    private AppCompatActivity mActivity;

    public ActivityModule(AppCompatActivity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    AppCompatActivity provideActivity() {
        return mActivity;
    }

    @Provides
    CompositeDisposable provideCompositeDisposable() {
        return new CompositeDisposable();
    }

    @Provides
    SchedulerProvider provideSchedulerProvider() {
        return new AppSchedulerProvider();
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashPresenter(
            SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }

    @Provides
    AboutMvpPresenter<AboutMvpView> provideAboutPresenter(
            AboutPresenter<AboutMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginPresenter(
            LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    MainMvpPresenter<MainMvpView> provideMainPresenter(
            MainPresenter<MainMvpView> presenter) {
        return presenter;
    }

    @Provides
    RatingDialogMvpPresenter<RatingDialogMvpView> provideRateUsPresenter(
            RatingDialogPresenter<RatingDialogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedMvpPresenter<FeedMvpView> provideFeedPresenter(
            FeedPresenter<FeedMvpView> presenter) {
        return presenter;
    }

    @Provides
    OpenSourceMvpPresenter<OpenSourceMvpView> provideOpenSourcePresenter(
            OpenSourcePresenter<OpenSourceMvpView> presenter) {
        return presenter;
    }

    @Provides
    BlogMvpPresenter<BlogMvpView> provideBlogMvpPresenter(
            BlogPresenter<BlogMvpView> presenter) {
        return presenter;
    }

    @Provides
    FeedPagerAdapter provideFeedPagerAdapter(AppCompatActivity activity) {
        return new FeedPagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OpenSourceAdapter provideOpenSourceAdapter() {
        return new OpenSourceAdapter(new ArrayList<OpenSourceResponse.Repo>());
    }

    @Provides
    BlogAdapter provideBlogAdapter() {
        return new BlogAdapter(new ArrayList<BlogResponse.Blog>());
    }

    @Provides
    LinearLayoutManager provideLinearLayoutManager(AppCompatActivity activity) {
        return new LinearLayoutManager(activity);
    }

    @Provides
    MovieMvpPresenter<MovieMvpView> provideMovieMvpPresenter(
            MoviePresenter<MovieMvpView> presenter) {
        return presenter;
    }

    @Provides
    PagerAdapter providePagerAdapter(AppCompatActivity activity) {
        return new PagerAdapter(activity.getSupportFragmentManager());
    }

    @Provides
    OldMvpPresenter<OldMvpView> provideOldMvpPresenter(
            OldPresenter<OldMvpView> presenter) {
        return presenter;
    }

    @Provides
    Adapter provideAdapter() {
        return new Adapter(new ArrayList<MovieItems>());
    }

    @Provides
    AdapterThreat provideAdapterThreat() {
        return new AdapterThreat(new ArrayList<MovieItems>());
    }

    @Provides
    ThreatMvpPresenter<ThreatMvpView> provideThreatMvpPresenter(
            ThreatPresenter<ThreatMvpView> presenter) {
        return presenter;
    }

    @Provides
    TopMvpPresenter<TopMvpView> provideTopMvpPresenter(
            TopPresenter<TopMvpView> presenter) {
        return presenter;
    }

    @Provides
    TopAdapter provideTopAdapter() {
        return new TopAdapter(new ArrayList<MovieItems>());
    }

    @Provides
    UpcomingMvpPresenter<UpcomingMvpView> provideUpcomingMvpPresenter(
            UpcomingPresenter<UpcomingMvpView> presenter) {
        return presenter;
    }
    @Provides
    UpcomingAdapter provideUpcomingAdapter()
    {
        return new UpcomingAdapter(new ArrayList<MovieItems>());
    }
}
