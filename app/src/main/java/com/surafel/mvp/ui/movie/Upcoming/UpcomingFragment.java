package com.surafel.mvp.ui.movie.Upcoming;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
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
public class UpcomingFragment extends BaseFragment implements UpcomingMvpView{

    @Inject
    LinearLayoutManager linearLayoutManager;

    @BindView(R.id.rv_upcoming_movies)
    RecyclerView recyclerView;

    @Inject
    UpcomingMvpPresenter<UpcomingMvpView> mPresenter;

    @Inject
    UpcomingAdapter mAdapter;

    public UpcomingFragment() {
        // Required empty public constructor
    }

    public static UpcomingFragment newInstance() {

        Bundle args = new Bundle();

        UpcomingFragment fragment = new UpcomingFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void loadItems(List<MovieItems> mData) {
            mAdapter.setmData(mData);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view  = inflater.inflate(R.layout.fragment_upcoming,container,false);
        ActivityComponent component = getActivityComponent();
        if (component!=null){
            component.inject(this);
            setUnBinder(ButterKnife.bind(this,view));
            mPresenter.onAttach(this);
        }
        return view;
    }

    @Override
    protected void setUp(View view) {
                setUpRecyclerView();
                mPresenter.getmData();
    }

    public void setUpRecyclerView(){

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseActivity()));
        recyclerView.setAdapter(mAdapter);
    }
}
