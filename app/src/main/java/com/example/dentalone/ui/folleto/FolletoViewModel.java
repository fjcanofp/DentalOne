package com.example.dentalone.ui.folleto;

import android.content.Intent;
import android.net.Uri;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FolletoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FolletoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Haga click para ver nuestro folleto");

    }

    public LiveData<String> getText() {
        return mText;
    }
}