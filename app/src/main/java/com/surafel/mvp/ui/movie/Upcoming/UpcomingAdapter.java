package com.surafel.mvp.ui.movie.Upcoming;

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

import butterknife.BindView;
import butterknife.ButterKnife;

public class UpcomingAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    public static final int VIEW_TYPE_NORMAL = 0;
    public static final int VIEW_TYPE_EMPTY = 1;
    List<MovieItems> mData;

    public UpcomingAdapter(List<MovieItems> mData) {
        this.mData = mData;
    }

    public void setmData(List<MovieItems> mData) {
        this.mData = mData;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == VIEW_TYPE_NORMAL) {
            return new myViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_cell, parent, false));
        } else {
            return new myEmptyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_empty_view, parent, false));
        }
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        holder.onBind(position);
    }

    @Override
    public int getItemViewType(int position) {
        if (mData != null && mData.size() >= 0) {
            return VIEW_TYPE_NORMAL;
        } else {
            return VIEW_TYPE_EMPTY;
        }
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    class myViewHolder extends BaseViewHolder {

        @BindView(R.id.iv_movie_cell)// since it is binder it works only on global scope
        ImageView imageViewMovie;

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
            imageViewMovie.setImageDrawable(null);
            titleTextView.setText("");
            descriptionTextView.setText("");
        }

        @Override
        public void onBind(int position) {
            super.onBind(position);
            Glide.with(itemView.getContext()).load(mData.get(position).getMovieImage()).into(imageViewMovie);
            titleTextView.setText(mData.get(position).getMovieTitle());
            descriptionTextView.setText(mData.get(position).getMovieDescription());
        }
    }

    class myEmptyViewHolder extends BaseViewHolder {

        @BindView(R.id.imageViewEmpty)
        ImageView emptyImageView;

        @BindView(R.id.tv_message)
        TextView Textview;

        public myEmptyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(itemView);
        }

        @Override
        protected void clear() {
            emptyImageView.setImageDrawable(null);
            Textview.setText("");
        }

        @Override
        public int getCurrentPosition() {
            return super.getCurrentPosition();
        }
    }
}
