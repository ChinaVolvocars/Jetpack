package com.volvo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.paging.LivePagedListBuilder;
import androidx.paging.PagedList;

import java.util.concurrent.Executor;

public class UserViewModel extends ViewModel {

    public LiveData<PagedList<User>> userList;
    public LiveData<NetworkState> networkState;
    Executor executor;
    LiveData<ItemKeyedUserDataSource> tDataSource;
    private final GitHubUserDataSourceFactory githubUserDataSourceFacteory;
    private final PagedList.Config pagedListConfig;

    public UserViewModel() {
        githubUserDataSourceFacteory = new GitHubUserDataSourceFactory(executor);

        tDataSource = githubUserDataSourceFacteory.getMutableLiveData();

        networkState = Transformations.switchMap(githubUserDataSourceFacteory.getMutableLiveData(), dataSource -> {
            return dataSource.getNetworkState();
        });

        pagedListConfig = (new PagedList.Config.Builder()).setEnablePlaceholders(false)
                .setInitialLoadSizeHint(10)
                .setPageSize(20).build();

        userList = (new LivePagedListBuilder(githubUserDataSourceFacteory, pagedListConfig))
                .build();
    }


    public LiveData<PagedList<User>> getRefreshLiveData() {
        userList = (new LivePagedListBuilder(githubUserDataSourceFacteory, pagedListConfig))
                .build();

        return userList;
    }


}