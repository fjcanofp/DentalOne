package com.example.dentalone.ui.cadcam;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CADCAMViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CADCAMViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Haga click aquí para acceder al CAD-CAM.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}