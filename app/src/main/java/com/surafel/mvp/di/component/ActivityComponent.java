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

package com.surafel.mvp.di.component;

import com.surafel.mvp.di.PerActivity;
import com.surafel.mvp.di.module.ActivityModule;
import com.surafel.mvp.ui.about.AboutFragment;
import com.surafel.mvp.ui.feed.FeedActivity;
import com.surafel.mvp.ui.feed.blogs.BlogFragment;
import com.surafel.mvp.ui.feed.opensource.OpenSourceFragment;
import com.surafel.mvp.ui.login.LoginActivity;
import com.surafel.mvp.ui.main.MainActivity;
import com.surafel.mvp.ui.main.rating.RateUsDialog;
import com.surafel.mvp.ui.movie.MovieActivity;
import com.surafel.mvp.ui.movie.Old.OldFragment;
import com.surafel.mvp.ui.movie.Threat.ThreatFragment;
import com.surafel.mvp.ui.movie.Top.TopFragment;
import com.surafel.mvp.ui.movie.Top.TopPresenter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingFragment;
import com.surafel.mvp.ui.splash.SplashActivity;

import dagger.Component;

/**
 * Created by janisharali on 27/01/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(LoginActivity activity);

    void inject(SplashActivity activity);

    void inject(FeedActivity activity);

    void inject(AboutFragment fragment);

    void inject(OpenSourceFragment fragment);

    void inject(BlogFragment fragment);

    void inject(RateUsDialog dialog);

    void inject(MovieActivity activity);

    void inject(OldFragment fragment);

    void inject(ThreatFragment fragment);

    void inject(TopFragment fragment);

    void inject(UpcomingFragment fragment);
}
