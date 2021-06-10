package com.example.dentalone.ui.planosMaquinas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlanoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PlanoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Haga click aquí para acceder al plano y maquinaria de nuestra clínica");
    }

    public LiveData<String> getText() {
        return mText;
    }
}