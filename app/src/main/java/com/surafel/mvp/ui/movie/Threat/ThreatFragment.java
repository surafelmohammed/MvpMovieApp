package com.surafel.mvp.ui.movie.Threat;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.surafel.mvp.R;
import com.surafel.mvp.data.db.model.MovieItems;
import com.surafel.mvp.di.component.ActivityComponent;
import com.surafel.mvp.ui.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * A simple {@link Fragment} subclass.
 */
public class ThreatFragment extends BaseFragment implements ThreatMvpView {

    @Inject
    ThreatMvpPresenter<ThreatMvpView> mPresenter;
    @Inject
    AdapterThreat adapterThreat;
    @BindView(R.id.rv_threatmovie)
    RecyclerView recyclerViewThreat;

    public ThreatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_threat, container, false);
        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            setUnBinder(ButterKnife.bind(this, view));
            mPresenter.onAttach(this);
        }

        setUp(view);

        return view;
    }

    @Override
    protected void setUp(View view) {
        setUpRecyclerView();
        mPresenter.getmData();
    }

    public void setUpRecyclerView() {
        recyclerViewThreat.setHasFixedSize(true);
        recyclerViewThreat.setLayoutManager(new GridLayoutManager(getBaseActivity(), 2));
        recyclerViewThreat.setAdapter(adapterThreat);
    }

    @Override
    public void loadMovies(List<MovieItems> movieItems) {
        adapterThreat.addItems(movieItems);
    }
}
