package com.example.dentalone.ui.somos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SomosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SomosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is somos fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}