package com.surafel.mvp.ui.movie.Top;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
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
public class TopFragment extends BaseFragment implements TopMvpView{

    @BindView(R.id.rv_topmovies)
    RecyclerView topRecyclerView;

    @Inject
    TopAdapter topAdapter;

    @Inject
    TopMvpPresenter<TopMvpView> mPresenter;

    public TopFragment() {
        // Required empty public constructor
    }

    public static TopFragment newInstance() {

        Bundle args = new Bundle();

        TopFragment fragment = new TopFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_top, container, false);
        ActivityComponent component = getActivityComponent();
        if (component!=null){
            component.inject(this);
            setUnBinder(ButterKnife.bind(this,view));
            mPresenter.onAttach(this);
        }
        return view;
    }

    @Override
    public void loadMovies(List<MovieItems> movieItems) {
        topAdapter.addItems(movieItems);
    }

    @Override
    protected void setUp(View view) {
        setUpRecyclerView();
        mPresenter.getmData();
    }

    public void setUpRecyclerView(){
        topRecyclerView.setHasFixedSize(true);
        topRecyclerView.setLayoutManager(new GridLayoutManager(getBaseActivity(),
                4,
                GridLayoutManager.HORIZONTAL,
                false));
        topRecyclerView.setAdapter(topAdapter);
    }
}
