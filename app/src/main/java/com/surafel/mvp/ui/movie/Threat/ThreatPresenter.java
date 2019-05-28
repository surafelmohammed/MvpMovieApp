package com.surafel.mvp.ui.movie.Threat;

import com.surafel.mvp.R;
import com.surafel.mvp.data.DataManager;
import com.surafel.mvp.data.db.model.MovieItems;
import com.surafel.mvp.ui.base.BasePresenter;
import com.surafel.mvp.utils.rx.SchedulerProvider;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.disposables.CompositeDisposable;

public class ThreatPresenter<V extends ThreatMvpView> extends BasePresenter<V>
        implements ThreatMvpPresenter<V> {

    List<MovieItems> mData;
    @Inject
    public ThreatPresenter(DataManager dataManager,
                           SchedulerProvider schedulerProvider,
                           CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void getmData() {
        mData = new ArrayList<>();
        mData.add(new MovieItems("Skyscraper","skyscrapter is a movie i don't know", R.drawable.skyscraper));
        mData.add(new MovieItems("Game of Thrones","The best Series movie ever in the history of series movies",R.drawable.gameofthrones));
        mData.add(new MovieItems("Xla","Robotic movie in the future... ",R.drawable.xl));
        mData.add(new MovieItems("Avengers Infinity War","the collection of super hero",R.drawable.avengersinfinitywar));
        mData.add(new MovieItems("The Little mermaid ","is owesome",R.drawable.littlemermaid));
        mData.add(new MovieItems("Robin hood ","is owesome",R.drawable.robenhood));
        mData.add(new MovieItems("Venom ","The SuperV becomes Super hero",R.drawable.venom));
        mData.add(new MovieItems("Scorpion","series movie",R.drawable.image7));

        getMvpView().loadMovies(mData);
    }
}
