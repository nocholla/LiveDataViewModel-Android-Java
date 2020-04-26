package com.nocholla.livedata.viewmodel.networking;

import com.nocholla.livedata.viewmodel.model.BlogWrapper;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RestApiService {

    @GET("feed.json")
    Call<BlogWrapper> getBlogs();

}
