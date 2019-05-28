package com.surafel.mvp.ui.movie.Top;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.surafel.mvp.R;
import com.surafel.mvp.data.db.model.MovieItems;
import com.surafel.mvp.ui.base.BaseViewHolder;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TopAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    @Inject
    TopMvpPresenter<TopMvpView> mpresenter;

    List<MovieItems> movieItems;

    public TopAdapter(List<MovieItems> movieItems) {
        this.movieItems = movieItems;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_cell, parent, false);
        return new myViewHolder(view);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    @Override
    public int getItemCount() {
        return movieItems.size();
    }

    void addItems(List<MovieItems> movieItems) {
        this.movieItems = movieItems;
    }

    class myViewHolder extends BaseViewHolder {

        @BindView(R.id.iv_movie_cell)
        ImageView movieImageview;

        @BindView(R.id.tv_movie_title)
        TextView titleTextView;

        @BindView(R.id.tv_movie_description)
        TextView descriptionTextView;


        public myViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {
            titleTextView.setText("");
            descriptionTextView.setText("");
            movieImageview.setImageDrawable(null);// null pointer exception be coz of the binding #(ButterKniff.bind(this))
        }

        @Override
        public void onBind(int position) {
            super.onBind(position);
            titleTextView.setText(movieItems.get(position).getMovieTitle());
            descriptionTextView.setText(movieItems.get(position).getMovieDescription());
            Glide.with(itemView.getContext()).load(movieItems.get(position).getMovieImage()).into(movieImageview);
        }
    }
}
