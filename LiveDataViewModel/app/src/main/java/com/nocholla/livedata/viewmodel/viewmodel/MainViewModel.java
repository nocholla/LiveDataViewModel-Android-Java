package com.nocholla.livedata.viewmodel.viewmodel;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.nocholla.livedata.viewmodel.model.Blog;
import com.nocholla.livedata.viewmodel.repository.BlogRepository;
import java.util.List;

public class MainViewModel extends AndroidViewModel {
    private BlogRepository blogRepository;

    public MainViewModel(@NonNull Application application) {
        super(application);
        blogRepository = new BlogRepository(application);
    }

    public LiveData<List<Blog>> getAllBlogs() {
        return blogRepository.getMutableLiveData();
    }


}
