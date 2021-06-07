package com.example.dentalone.ui.especialidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EspecialidadesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EspecialidadesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is especialidades fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}