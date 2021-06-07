package com.example.dentalone.ui.folleto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FolletoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FolletoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is folleto fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}