package com.nocholla.livedata.viewmodel.repository;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.nocholla.livedata.viewmodel.model.Blog;
import com.nocholla.livedata.viewmodel.model.BlogWrapper;
import com.nocholla.livedata.viewmodel.networking.RestApiService;
import com.nocholla.livedata.viewmodel.networking.RetrofitInstance;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BlogRepository {
    private ArrayList<Blog> blogs = new ArrayList<>();
    private MutableLiveData<List<Blog>> mutableLiveData = new MutableLiveData<>();
    private Application application;

    public BlogRepository(Application application) {
        this.application = application;
    }

    public MutableLiveData<List<Blog>> getMutableLiveData() {

        RestApiService apiService = RetrofitInstance.getApiService();

        Call<BlogWrapper> call = apiService.getBlogs();

        call.enqueue(new Callback<BlogWrapper>() {
            @Override
            public void onResponse(Call<BlogWrapper> call, Response<BlogWrapper> response) {
                BlogWrapper mBlogWrapper = response.body();
                if (mBlogWrapper != null && mBlogWrapper.getBlog() != null) {
                    blogs = (ArrayList<Blog>) mBlogWrapper.getBlog();
                    mutableLiveData.setValue(blogs);
                }
            }

            @Override
            public void onFailure(Call<BlogWrapper> call, Throwable t) {

            }
        });

        return mutableLiveData;
    }
}
