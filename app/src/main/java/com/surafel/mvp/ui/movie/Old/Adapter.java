package com.surafel.mvp.ui.movie.Old;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public class Adapter extends RecyclerView.Adapter<BaseViewHolder> {

    public static final int VIEW_TYPE_EMPTY = 0;
    public static final int VIEW_TYPE_NORMAL = 1;


    List<MovieItems> movieItems;

    public Adapter(List<MovieItems> movieItems) {
        this.movieItems = movieItems;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_cell, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);

    }

    @Override
    public int getItemViewType(int position) {
        if (movieItems != null && movieItems.size() > 0)
            return VIEW_TYPE_NORMAL;
        else
            return VIEW_TYPE_EMPTY;
    }

    @Override
    public int getItemCount() {
        return movieItems.size();
    }

    public class EmptyViewHolder extends BaseViewHolder {
        @BindView(R.id.btn_retry)
        Button retryButton;

        @BindView(R.id.tv_message)
        TextView retryMessage;


        public EmptyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {

        }
    }

    void addItems(List<MovieItems> movieItems){
        this.movieItems = movieItems;
        notifyDataSetChanged();
    }

    public class ViewHolder extends BaseViewHolder {
        @BindView(R.id.iv_movie_cell)
        ImageView movieImageView;

        @BindView(R.id.tv_movie_title)
        TextView titleTextView;

        @BindView(R.id.tv_movie_description)
        TextView descriptionTextView;


        public ViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        public void onBind(int position) {
            super.onBind(position);
            titleTextView.setText(movieItems.get(position).getMovieTitle());
            descriptionTextView.setText(movieItems.get(position).getMovieDescription());
            Glide.with(itemView.getContext()).load(movieItems.get(position).getMovieImage()).centerCrop().into(movieImageView);

        }

        @Override
        protected void clear() {
            movieImageView.setImageDrawable(null);
            titleTextView.setText("");
            descriptionTextView.setText("");
        }
    }
}
