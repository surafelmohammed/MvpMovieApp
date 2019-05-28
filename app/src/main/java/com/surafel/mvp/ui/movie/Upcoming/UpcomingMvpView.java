package com.surafel.mvp.ui.movie.Upcoming;

import com.surafel.mvp.data.db.model.MovieItems;
import com.surafel.mvp.ui.base.MvpView;

import java.util.List;

public interface UpcomingMvpView extends MvpView {

    void loadItems(List<MovieItems> mData);
}
