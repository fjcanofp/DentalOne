package com.example.dentalone.ui.tarifas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TarifasViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public TarifasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is tarifa fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}