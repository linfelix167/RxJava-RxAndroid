package com.felix;

import android.arch.lifecycle.ViewModel;

import java.util.concurrent.Future;

import io.reactivex.Observable;
import okhttp3.ResponseBody;

public class MainViewModel extends ViewModel {

    private Repository repository;

    public MainViewModel() {
        repository = Repository.getInstance();
    }

    public Future<Observable<ResponseBody>> makeFutureQuery(){
        return repository.makeFutureQuery();
    }
}
