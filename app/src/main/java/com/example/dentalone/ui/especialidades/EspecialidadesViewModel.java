package com.example.dentalone.ui.especialidades;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class EspecialidadesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public EspecialidadesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Nuestras especialidades:\n\u1405\tOrtodoncia.\n" +
                "\u1405\tPrótesis Fijas.\n" +
                "\u1405\tPrótesis Removibles.\n" +
                "\u1405\tImplantes.\n" +
                "\u1405\tFérulas de blanqueamiento, contención y descarga.\n" +
                "\u1405\tCerámica. \n" +
                "\u1405\tCAD-CAM.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}