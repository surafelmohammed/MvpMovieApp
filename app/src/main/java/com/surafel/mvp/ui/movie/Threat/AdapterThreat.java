package com.surafel.mvp.ui.movie.Threat;

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

public class AdapterThreat extends RecyclerView.Adapter<BaseViewHolder> {

    public static final int VIEW_TYPE_NORMAL = 1;
    public static final int VIEW_TYPE_EMPTY = 0;

    List<MovieItems> movieItems;

    public AdapterThreat(List<MovieItems> movieItems) {
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
    public int getItemCount() {
        return movieItems.size();
    }


    public void addItems(List<MovieItems> movieItems) {
        this.movieItems = movieItems;
        notifyDataSetChanged();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public class myViewHolder extends BaseViewHolder {

        @BindView(R.id.tv_movie_title)
        TextView movieTitleTextVeiw;

        @BindView(R.id.tv_movie_description)
        TextView movieDescriptionTextVeiw;

        @BindView(R.id.iv_movie_cell)
        ImageView movieImageView;

        public myViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }

        @Override
        protected void clear() {
            movieTitleTextVeiw.setText("");
            movieDescriptionTextVeiw.setText("");
            movieImageView.setImageDrawable(null);
        }

        @Override
        public void onBind(int position) {
            super.onBind(position);
            movieTitleTextVeiw.setText(movieItems.get(position).getMovieTitle());
            movieDescriptionTextVeiw.setText(movieItems.get(position).getMovieDescription());
            Glide.with(itemView.getContext()).load(movieItems.get(position).getMovieImage()).into(movieImageView);
        }
    }
}
