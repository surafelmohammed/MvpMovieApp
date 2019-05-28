package com.surafel.mvp.ui.movie.Old;

import com.surafel.mvp.data.db.model.MovieItems;
import com.surafel.mvp.ui.base.MvpView;

import java.util.List;

public interface OldMvpView extends MvpView {
    void loadMovies(List<MovieItems> movieItems);
}
