package com.surafel.mvp.ui.movie;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.surafel.mvp.ui.movie.Old.OldFragment;
import com.surafel.mvp.ui.movie.Threat.ThreatFragment;
import com.surafel.mvp.ui.movie.Top.TopFragment;
import com.surafel.mvp.ui.movie.Upcoming.UpcomingFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    private int count;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
        this.count = 0;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new OldFragment();
            case 1:
                return new ThreatFragment();
            case 2:
                return new TopFragment();
            case 3:
                return new UpcomingFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
}
