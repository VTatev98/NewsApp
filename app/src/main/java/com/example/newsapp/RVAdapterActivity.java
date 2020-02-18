package com.example.newsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RVAdapterActivity extends AppCompatActivity {

    private RecyclerView rvNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rvadapter);
        rvNews = findViewById(R.id.rv_news);

        final List<News> newsList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            News news = new News();
            news.setTitle("News_" + i);
            news.setAuthor("Author_" + i);
            news.setDescription("Description_" + i);
            newsList.add(news);

        }

        NewsAdapter newsAdapter = new NewsAdapter(newsList);


        rvNews.setAdapter(newsAdapter);

        rvNews.setLayoutManager(new LinearLayoutManager(this));





    }
}
