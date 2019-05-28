package com.surafel.mvp.di.component;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import com.surafel.mvp.data.DataManager;
import com.surafel.mvp.di.module.ActivityModule;
import com.surafel.mvp.di.module.ActivityModule_ProvideAboutPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideActivityFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideAdapterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideAdapterThreatFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideBlogAdapterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideBlogMvpPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideCompositeDisposableFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideFeedPagerAdapterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideFeedPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideLinearLayoutManagerFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideLoginPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideMainPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideMovieMvpPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideOldMvpPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideOpenSourceAdapterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideOpenSourcePresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvidePagerAdapterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideRateUsPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideSchedulerProviderFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideSplashPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideThreatMvpPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideTopAdapterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideTopMvpPresenterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideUpcomingAdapterFactory;
import com.surafel.mvp.di.module.ActivityModule_ProvideUpcomingMvpPresenterFactory;
import com.surafel.mvp.ui.about.AboutFragment;
import com.surafel.mvp.ui.about.AboutFragment_MembersInjector;
import com.surafel.mvp.ui.about.AboutMvpPresenter;
import com.surafel.mvp.ui.about.AboutMvpView;
import com.surafel.mvp.ui.about.AboutPresenter;
import com.surafel.mvp.ui.about.AboutPresenter_Factory;
import com.surafel.mvp.ui.feed.FeedActivity;
import com.surafel.mvp.ui.feed.FeedActivity_MembersInjector;
import com.surafel.mvp.ui.feed.FeedMvpPresenter;
import com.surafel.mvp.ui.feed.FeedMvpView;
import com.surafel.mvp.ui.feed.FeedPagerAdapter;
import com.surafel.mvp.ui.feed.FeedPresenter;
import com.surafel.mvp.ui.feed.FeedPresenter_Factory;
import com.surafel.mvp.ui.feed.blogs.BlogAdapter;
import com.surafel.mvp.ui.feed.blogs.BlogFragment;
import com.surafel.mvp.ui.feed.blogs.BlogFragment_MembersInjector;
import com.surafel.mvp.ui.feed.blogs.BlogMvpPresenter;
import com.surafel.mvp.ui.feed.blogs.BlogMvpView;
import com.surafel.mvp.ui.feed.blogs.BlogPresenter;
import com.surafel.mvp.ui.feed.blogs.BlogPresenter_Factory;
import com.surafel.mvp.ui.feed.opensource.OpenSourceAdapter;
import com.surafel.mvp.ui.feed.opensource.OpenSourceFragment;
import com.surafel.mvp.ui.feed.opensource.OpenSourceFragment_MembersInjector;
import com.surafel.mvp.ui.feed.opensource.OpenSourceMvpPresenter;
import com.surafel.mvp.ui.feed.opensource.OpenSourceMvpView;
import com.surafel.mvp.ui.feed.opensource.OpenSourcePresenter;
import com.surafel.mvp.ui.feed.opensource.OpenSourcePresenter_Factory;
import com.surafel.mvp.ui.login.LoginActivity;
import com.surafel.mvp.ui.login.LoginActivity_MembersInjector;
import com.surafel.mvp.ui.login.LoginMvpPresenter;
import com.surafel.mvp.ui.login.LoginMvpView;
import com.surafel.mvp.ui.login.LoginPresenter;
import com.surafel.mvp.ui.login.LoginPresenter_Factory;
import com.surafel.mvp.ui.main.MainActivity;
import com.surafel.mvp.ui.main.MainActivity_MembersInjector;
import com.surafel.mvp.ui.main.MainMvpPresenter;
import com.surafel.mvp.ui.main.MainMvpView;
import com.surafel.mvp.ui.main.MainPresenter;
import com.surafel.mvp.ui.main.MainPresenter_Factory;
import com.surafel.mvp.ui.main.rating.RateUsDialog;
import com.surafel.mvp.ui.main.rating.RateUsDialog_MembersInjector;
import com.surafel.mvp.ui.main.rating.RatingDialogMvpPresenter;
import com.surafel.mvp.ui.main.rating.RatingDialogMvpView;
import com.surafel.mvp.ui.main.rating.RatingDialogPresenter;
import com.surafel.mvp.ui.main.rating.RatingDialogPresenter_Factory;
import com.surafel.mvp.ui.movie.MovieActivity;
import com.surafel.mvp.ui.movie.MovieActivity_MembersInjector;
import com.surafel.mvp.ui.movie.MovieMvpPresenter;
import com.surafel.mvp.ui.movie.MovieMvpView;
import com.surafel.mvp.ui.movie.MoviePresenter;
import com.surafel.mvp.ui.movie.MoviePresenter_Factory;
import com.surafel.mvp.ui.movie.Old.Adapter;
import com.surafel.mvp.ui.movie.Old.OldFragment;
import com.surafel.mvp.ui.movie.Old.OldFragment_MembersInjector;
import com.surafel.mvp.ui.movie.Old.OldMvpPresenter;
import com.surafel.mvp.ui.movie.Old.OldMvpView;
import com.surafel.mvp.ui.movie.Old.OldPresenter;
import com.surafel.mvp.ui.movie.Old.OldPresenter_Factory;
import com.surafel.mvp.ui.movie.Old.OldPresenter_MembersInjector;
import com.surafel.mvp.ui.movie.PagerAdapter;
import com.surafel.mvp.ui.movie.Threat.AdapterThreat;
import com.surafel.mvp.ui.movie.Threat.ThreatFragment;
import com.surafel.mvp.ui.movie.Threat.ThreatFragment_MembersInjector;
import com.surafel.mvp.ui.movie.Threat.ThreatMvpPresenter;
import com.surafel.mvp.ui.movie.Threat.ThreatMvpView;
import com.surafel.mvp.ui.movie.Threat.ThreatPresenter;
import com.surafel.mvp.ui.movie.Threat.ThreatPresenter_Factory;
import com.surafel.mvp.ui.movie.Top.TopAdapter;
import com.surafel.mvp.ui.movie.Top.TopFragment;
import com.surafel.mvp.ui.movie.Top.TopFragment_MembersInjector;
import com.surafel.mvp.ui.movie.Top.TopMvpPresenter;
import com.surafel.mvp.ui.movie.Top.TopMvpView;
import com.surafel.mvp.ui.movie.Top.TopPresenter;
import com.surafel.mvp.ui.movie.Top.TopPresenter_Factory;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingAdapter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingFragment;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingFragment_MembersInjector;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingMvpPresenter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingMvpView;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingPresenter;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingPresenter_Factory;
import com.surafel.mvp.ui.splash.SplashActivity;
import com.surafel.mvp.ui.splash.SplashActivity_MembersInjector;
import com.surafel.mvp.ui.splash.SplashMvpPresenter;
import com.surafel.mvp.ui.splash.SplashMvpView;
import com.surafel.mvp.ui.splash.SplashPresenter;
import com.surafel.mvp.ui.splash.SplashPresenter_Factory;
import com.surafel.mvp.utils.rx.SchedulerProvider;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerActivityComponent implements ActivityComponent {
  private Provider<DataManager> getDataManagerProvider;

  private Provider<SchedulerProvider> provideSchedulerProvider;

  private Provider<CompositeDisposable> provideCompositeDisposableProvider;

  private Provider<MainPresenter<MainMvpView>> mainPresenterProvider;

  private Provider<MainMvpPresenter<MainMvpView>> provideMainPresenterProvider;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private Provider<LoginPresenter<LoginMvpView>> loginPresenterProvider;

  private Provider<LoginMvpPresenter<LoginMvpView>> provideLoginPresenterProvider;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private Provider<SplashPresenter<SplashMvpView>> splashPresenterProvider;

  private Provider<SplashMvpPresenter<SplashMvpView>> provideSplashPresenterProvider;

  private MembersInjector<SplashActivity> splashActivityMembersInjector;

  private Provider<FeedPresenter<FeedMvpView>> feedPresenterProvider;

  private Provider<FeedMvpPresenter<FeedMvpView>> provideFeedPresenterProvider;

  private Provider<AppCompatActivity> provideActivityProvider;

  private Provider<FeedPagerAdapter> provideFeedPagerAdapterProvider;

  private MembersInjector<FeedActivity> feedActivityMembersInjector;

  private Provider<AboutPresenter<AboutMvpView>> aboutPresenterProvider;

  private Provider<AboutMvpPresenter<AboutMvpView>> provideAboutPresenterProvider;

  private MembersInjector<AboutFragment> aboutFragmentMembersInjector;

  private Provider<OpenSourcePresenter<OpenSourceMvpView>> openSourcePresenterProvider;

  private Provider<OpenSourceMvpPresenter<OpenSourceMvpView>> provideOpenSourcePresenterProvider;

  private Provider<OpenSourceAdapter> provideOpenSourceAdapterProvider;

  private Provider<LinearLayoutManager> provideLinearLayoutManagerProvider;

  private MembersInjector<OpenSourceFragment> openSourceFragmentMembersInjector;

  private Provider<BlogPresenter<BlogMvpView>> blogPresenterProvider;

  private Provider<BlogMvpPresenter<BlogMvpView>> provideBlogMvpPresenterProvider;

  private Provider<BlogAdapter> provideBlogAdapterProvider;

  private MembersInjector<BlogFragment> blogFragmentMembersInjector;

  private Provider<RatingDialogPresenter<RatingDialogMvpView>> ratingDialogPresenterProvider;

  private Provider<RatingDialogMvpPresenter<RatingDialogMvpView>> provideRateUsPresenterProvider;

  private MembersInjector<RateUsDialog> rateUsDialogMembersInjector;

  private Provider<MoviePresenter<MovieMvpView>> moviePresenterProvider;

  private Provider<MovieMvpPresenter<MovieMvpView>> provideMovieMvpPresenterProvider;

  private Provider<PagerAdapter> providePagerAdapterProvider;

  private MembersInjector<MovieActivity> movieActivityMembersInjector;

  private Provider<Adapter> provideAdapterProvider;

  private MembersInjector<OldPresenter<OldMvpView>> oldPresenterOfOldMvpViewMembersInjector;

  private Provider<OldPresenter<OldMvpView>> oldPresenterProvider;

  private Provider<OldMvpPresenter<OldMvpView>> provideOldMvpPresenterProvider;

  private MembersInjector<OldFragment> oldFragmentMembersInjector;

  private Provider<ThreatPresenter<ThreatMvpView>> threatPresenterProvider;

  private Provider<ThreatMvpPresenter<ThreatMvpView>> provideThreatMvpPresenterProvider;

  private Provider<AdapterThreat> provideAdapterThreatProvider;

  private MembersInjector<ThreatFragment> threatFragmentMembersInjector;

  private Provider<TopAdapter> provideTopAdapterProvider;

  private Provider<TopPresenter<TopMvpView>> topPresenterProvider;

  private Provider<TopMvpPresenter<TopMvpView>> provideTopMvpPresenterProvider;

  private MembersInjector<TopFragment> topFragmentMembersInjector;

  private Provider<UpcomingPresenter<UpcomingMvpView>> upcomingPresenterProvider;

  private Provider<UpcomingMvpPresenter<UpcomingMvpView>> provideUpcomingMvpPresenterProvider;

  private Provider<UpcomingAdapter> provideUpcomingAdapterProvider;

  private MembersInjector<UpcomingFragment> upcomingFragmentMembersInjector;

  private DaggerActivityComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.getDataManagerProvider =
        new Factory<DataManager>() {
          private final ApplicationComponent applicationComponent = builder.applicationComponent;

          @Override
          public DataManager get() {
            return Preconditions.checkNotNull(
                applicationComponent.getDataManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.provideSchedulerProvider =
        ActivityModule_ProvideSchedulerProviderFactory.create(builder.activityModule);

    this.provideCompositeDisposableProvider =
        ActivityModule_ProvideCompositeDisposableFactory.create(builder.activityModule);

    this.mainPresenterProvider =
        MainPresenter_Factory.create(
            MembersInjectors.<MainPresenter<MainMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMainPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideMainPresenterFactory.create(
                builder.activityModule, mainPresenterProvider));

    this.mainActivityMembersInjector =
        MainActivity_MembersInjector.create(provideMainPresenterProvider);

    this.loginPresenterProvider =
        LoginPresenter_Factory.create(
            MembersInjectors.<LoginPresenter<LoginMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideLoginPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideLoginPresenterFactory.create(
                builder.activityModule, loginPresenterProvider));

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(provideLoginPresenterProvider);

    this.splashPresenterProvider =
        SplashPresenter_Factory.create(
            MembersInjectors.<SplashPresenter<SplashMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideSplashPresenterProvider =
        DoubleCheck.provider(
            ActivityModule_ProvideSplashPresenterFactory.create(
                builder.activityModule, splashPresenterProvider));

    this.splashActivityMembersInjector =
        SplashActivity_MembersInjector.create(provideSplashPresenterProvider);

    this.feedPresenterProvider =
        FeedPresenter_Factory.create(
            MembersInjectors.<FeedPresenter<FeedMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideFeedPresenterProvider =
        ActivityModule_ProvideFeedPresenterFactory.create(
            builder.activityModule, feedPresenterProvider);

    this.provideActivityProvider =
        ActivityModule_ProvideActivityFactory.create(builder.activityModule);

    this.provideFeedPagerAdapterProvider =
        ActivityModule_ProvideFeedPagerAdapterFactory.create(
            builder.activityModule, provideActivityProvider);

    this.feedActivityMembersInjector =
        FeedActivity_MembersInjector.create(
            provideFeedPresenterProvider, provideFeedPagerAdapterProvider);

    this.aboutPresenterProvider =
        AboutPresenter_Factory.create(
            MembersInjectors.<AboutPresenter<AboutMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideAboutPresenterProvider =
        ActivityModule_ProvideAboutPresenterFactory.create(
            builder.activityModule, aboutPresenterProvider);

    this.aboutFragmentMembersInjector =
        AboutFragment_MembersInjector.create(provideAboutPresenterProvider);

    this.openSourcePresenterProvider =
        OpenSourcePresenter_Factory.create(
            MembersInjectors.<OpenSourcePresenter<OpenSourceMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideOpenSourcePresenterProvider =
        ActivityModule_ProvideOpenSourcePresenterFactory.create(
            builder.activityModule, openSourcePresenterProvider);

    this.provideOpenSourceAdapterProvider =
        ActivityModule_ProvideOpenSourceAdapterFactory.create(builder.activityModule);

    this.provideLinearLayoutManagerProvider =
        ActivityModule_ProvideLinearLayoutManagerFactory.create(
            builder.activityModule, provideActivityProvider);

    this.openSourceFragmentMembersInjector =
        OpenSourceFragment_MembersInjector.create(
            provideOpenSourcePresenterProvider,
            provideOpenSourceAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.blogPresenterProvider =
        BlogPresenter_Factory.create(
            MembersInjectors.<BlogPresenter<BlogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideBlogMvpPresenterProvider =
        ActivityModule_ProvideBlogMvpPresenterFactory.create(
            builder.activityModule, blogPresenterProvider);

    this.provideBlogAdapterProvider =
        ActivityModule_ProvideBlogAdapterFactory.create(builder.activityModule);

    this.blogFragmentMembersInjector =
        BlogFragment_MembersInjector.create(
            provideBlogMvpPresenterProvider,
            provideBlogAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.ratingDialogPresenterProvider =
        RatingDialogPresenter_Factory.create(
            MembersInjectors.<RatingDialogPresenter<RatingDialogMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideRateUsPresenterProvider =
        ActivityModule_ProvideRateUsPresenterFactory.create(
            builder.activityModule, ratingDialogPresenterProvider);

    this.rateUsDialogMembersInjector =
        RateUsDialog_MembersInjector.create(provideRateUsPresenterProvider);

    this.moviePresenterProvider =
        MoviePresenter_Factory.create(
            MembersInjectors.<MoviePresenter<MovieMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideMovieMvpPresenterProvider =
        ActivityModule_ProvideMovieMvpPresenterFactory.create(
            builder.activityModule, moviePresenterProvider);

    this.providePagerAdapterProvider =
        ActivityModule_ProvidePagerAdapterFactory.create(
            builder.activityModule, provideActivityProvider);

    this.movieActivityMembersInjector =
        MovieActivity_MembersInjector.create(
            provideMovieMvpPresenterProvider, providePagerAdapterProvider);

    this.provideAdapterProvider =
        ActivityModule_ProvideAdapterFactory.create(builder.activityModule);

    this.oldPresenterOfOldMvpViewMembersInjector =
        OldPresenter_MembersInjector.create(provideAdapterProvider);

    this.oldPresenterProvider =
        OldPresenter_Factory.create(
            oldPresenterOfOldMvpViewMembersInjector,
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideOldMvpPresenterProvider =
        ActivityModule_ProvideOldMvpPresenterFactory.create(
            builder.activityModule, oldPresenterProvider);

    this.oldFragmentMembersInjector =
        OldFragment_MembersInjector.create(
            provideOldMvpPresenterProvider,
            provideAdapterProvider,
            provideLinearLayoutManagerProvider);

    this.threatPresenterProvider =
        ThreatPresenter_Factory.create(
            MembersInjectors.<ThreatPresenter<ThreatMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideThreatMvpPresenterProvider =
        ActivityModule_ProvideThreatMvpPresenterFactory.create(
            builder.activityModule, threatPresenterProvider);

    this.provideAdapterThreatProvider =
        ActivityModule_ProvideAdapterThreatFactory.create(builder.activityModule);

    this.threatFragmentMembersInjector =
        ThreatFragment_MembersInjector.create(
            provideThreatMvpPresenterProvider, provideAdapterThreatProvider);

    this.provideTopAdapterProvider =
        ActivityModule_ProvideTopAdapterFactory.create(builder.activityModule);

    this.topPresenterProvider =
        TopPresenter_Factory.create(
            MembersInjectors.<TopPresenter<TopMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideTopMvpPresenterProvider =
        ActivityModule_ProvideTopMvpPresenterFactory.create(
            builder.activityModule, topPresenterProvider);

    this.topFragmentMembersInjector =
        TopFragment_MembersInjector.create(
            provideTopAdapterProvider, provideTopMvpPresenterProvider);

    this.upcomingPresenterProvider =
        UpcomingPresenter_Factory.create(
            MembersInjectors.<UpcomingPresenter<UpcomingMvpView>>noOp(),
            getDataManagerProvider,
            provideSchedulerProvider,
            provideCompositeDisposableProvider);

    this.provideUpcomingMvpPresenterProvider =
        ActivityModule_ProvideUpcomingMvpPresenterFactory.create(
            builder.activityModule, upcomingPresenterProvider);

    this.provideUpcomingAdapterProvider =
        ActivityModule_ProvideUpcomingAdapterFactory.create(builder.activityModule);

    this.upcomingFragmentMembersInjector =
        UpcomingFragment_MembersInjector.create(
            provideLinearLayoutManagerProvider,
            provideUpcomingMvpPresenterProvider,
            provideUpcomingAdapterProvider);
  }

  @Override
  public void inject(MainActivity activity) {
    mainActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(LoginActivity activity) {
    loginActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(SplashActivity activity) {
    splashActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(FeedActivity activity) {
    feedActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(AboutFragment fragment) {
    aboutFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(OpenSourceFragment fragment) {
    openSourceFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(BlogFragment fragment) {
    blogFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(RateUsDialog dialog) {
    rateUsDialogMembersInjector.injectMembers(dialog);
  }

  @Override
  public void inject(MovieActivity activity) {
    movieActivityMembersInjector.injectMembers(activity);
  }

  @Override
  public void inject(OldFragment fragment) {
    oldFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(ThreatFragment fragment) {
    threatFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(TopFragment fragment) {
    topFragmentMembersInjector.injectMembers(fragment);
  }

  @Override
  public void inject(UpcomingFragment fragment) {
    upcomingFragmentMembersInjector.injectMembers(fragment);
  }

  public static final class Builder {
    private ActivityModule activityModule;

    private ApplicationComponent applicationComponent;

    private Builder() {}

    public ActivityComponent build() {
      if (activityModule == null) {
        throw new IllegalStateException(ActivityModule.class.getCanonicalName() + " must be set");
      }
      if (applicationComponent == null) {
        throw new IllegalStateException(
            ApplicationComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerActivityComponent(this);
    }

    public Builder activityModule(ActivityModule activityModule) {
      this.activityModule = Preconditions.checkNotNull(activityModule);
      return this;
    }

    public Builder applicationComponent(ApplicationComponent applicationComponent) {
      this.applicationComponent = Preconditions.checkNotNull(applicationComponent);
      return this;
    }
  }
}
