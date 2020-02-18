package com.example.newsapp;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.NewsViewHolder> {

    private List<News> newsList;

    public NewsAdapter(@NonNull List<News> newsList) {
        this.newsList = newsList;
    }

    @NonNull
    @Override
    public NewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View newsView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_news, null, false);
        return new NewsViewHolder(newsView);
    }

    @Override
    public void onBindViewHolder(@NonNull final NewsViewHolder holder, int position) {
        News currentNews = newsList.get(position);
        holder.tvTitle.setText(currentNews.getTitle());
        holder.tvAuthor.setText(currentNews.getAuthor());
        holder.tvDescription.setText(currentNews.getDescription());
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v ) {
                Toast.makeText(v.getContext(), "The position is: "+holder.getAdapterPosition(), Toast.LENGTH_SHORT).show();

            }
    });}

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    class NewsViewHolder extends RecyclerView.ViewHolder  {

        TextView tvTitle;
        TextView tvDescription;
        TextView tvAuthor;
        Button btn;

        public NewsViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.tv_title);
            tvDescription = itemView.findViewById(R.id.tv_description);
            tvAuthor = itemView.findViewById(R.id.tv_author);
            btn = itemView.findViewById(R.id.btn);
        }

    }
}
