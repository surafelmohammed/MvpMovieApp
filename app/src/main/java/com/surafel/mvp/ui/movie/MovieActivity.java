package com.surafel.mvp.ui.movie;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.surafel.mvp.R;
import com.surafel.mvp.ui.base.BaseActivity;
import com.surafel.mvp.ui.main.MainActivity;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class MovieActivity extends BaseActivity implements MovieMvpView{

    @Inject
    MovieMvpPresenter<MovieMvpView> mPresenter;

    @Inject
    PagerAdapter mAdapter;

    @BindView(R.id.movie_drawer_layout)
    DrawerLayout drawerLayout;

    @BindView(R.id.toolbar_movie)
    Toolbar toolbarMovie;

    @BindView(R.id.tab_layout_movie)
    TabLayout tabLayoutMoive;

    @BindView(R.id.movie_view_pager)
    ViewPager viewPagerMovie;

    private ActionBarDrawerToggle mdrawer;

    public static Intent getStartIntent(Context context)
    {
        Intent intent = new Intent(context,MovieActivity.class);
        return intent;
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));

        mPresenter.onAttach(this);

        setUp();
    }

    @Override
    protected void setUp() {
        setSupportActionBar(toolbarMovie);
        mdrawer = new ActionBarDrawerToggle(
                this,
                drawerLayout,
                toolbarMovie,
                R.string.open_drawer,
                R.string.close_drawer)
        {
            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
            }
        };
        drawerLayout.addDrawerListener(mdrawer);
        mdrawer.syncState();


        mAdapter.setCount(4);
        viewPagerMovie.setAdapter(mAdapter);

        tabLayoutMoive.addTab(tabLayoutMoive.newTab().setText("Old"));
        tabLayoutMoive.addTab(tabLayoutMoive.newTab().setText("Threat"));
        tabLayoutMoive.addTab(tabLayoutMoive.newTab().setText("Top"));
        tabLayoutMoive.addTab(tabLayoutMoive.newTab().setText("Upcoming"));

        viewPagerMovie.setOffscreenPageLimit(2);

        viewPagerMovie.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayoutMoive));
        tabLayoutMoive.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPagerMovie));


    }

    @Override
    protected void onDestroy() {
        mPresenter.onDetach();
        super.onDestroy();
    }

}
