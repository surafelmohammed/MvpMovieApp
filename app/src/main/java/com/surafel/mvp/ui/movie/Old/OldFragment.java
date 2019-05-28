package com.surafel.mvp.ui.movie.Old;


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
import com.surafel.mvp.di.component.ApplicationComponent;
import com.surafel.mvp.ui.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * A simple {@link Fragment} subclass.
 */
public class OldFragment extends BaseFragment implements OldMvpView {

    @Inject
    OldMvpPresenter<OldMvpView> mPresenter;

    @Inject
    Adapter mAdapter;

    @Inject
    LinearLayoutManager mLinearLayoutManager;

    @BindView(R.id.rv_oldmoives)
    RecyclerView mRecyclerView;

    public OldFragment() {
        // Required empty public constructor
    }

    public static OldFragment newInstance() {

        Bundle args = new Bundle();

        OldFragment fragment = new OldFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_old, container, false);
        ActivityComponent component = getActivityComponent();
        if (component!=null){
            component.inject(this);
            setUnBinder(ButterKnife.bind(this,view));
            mPresenter.onAttach(this);
            setUp(view);
        }
        return view;
    }

    @Override
    protected void setUp(View view) {
        setUpRecyclerView();
        mPresenter.getmData();
    }

    public void setUpRecyclerView(){
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(mLinearLayoutManager);
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    public void loadMovies(List<MovieItems> movieItems) {
        mAdapter.addItems(movieItems);
    }
}
