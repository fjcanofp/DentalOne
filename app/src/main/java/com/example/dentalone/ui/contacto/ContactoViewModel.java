package com.example.dentalone.ui.contacto;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactoViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ContactoViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Calle Don Alberto,7\n" +
                "Metro Sol, Línea 1, línea 2 y línea 3\n" +
                "Correo electrónico: DentalOne@protesisdental.com\n" +
                "Tlf.: 639485768 / 915637584\n" +
                "Fax: 918273647");
    }

    public LiveData<String> getText() {
        return mText;
    }
}