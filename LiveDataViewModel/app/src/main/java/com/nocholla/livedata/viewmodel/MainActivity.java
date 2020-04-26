package com.nocholla.livedata.viewmodel;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.nocholla.livedata.viewmodel.adapter.BlogAdapter;
import com.nocholla.livedata.viewmodel.model.Blog;
import com.nocholla.livedata.viewmodel.viewmodel.MainViewModel;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    private MainViewModel mainViewModel;
    BlogAdapter blogAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);

        initializationViews();

        mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);

        getTopBlogs();
    }

    private void initializationViews() {
        recyclerView = findViewById(R.id.blogRecyclerView);
    }

    public void getTopBlogs() {
        mainViewModel.getAllBlogs().observe(this, blogList -> prepareRecyclerView(blogList));
    }

    private void prepareRecyclerView(List<Blog> blogList) {
        blogAdapter = new BlogAdapter(blogList);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(blogAdapter);
        blogAdapter.notifyDataSetChanged();
    }

}

