package com.example.dentalone.ui.somos;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SomosViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SomosViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Este laboratorio es conocido en toda la Unión Europea y parte de EEUU, con una experiencia de más de 70 años. DentalOne, estudia las nuevas actualizaciones continuamente, para así, crecer con ellas. Trabajamos con las nuevas tecnológicas del sector, pero sin olvidar el trabajo manual, perfeccionando así cada detalle para la completa satisfacción de nuestros pacientes. El 99% de clínicas con las que hemos trabajado, han quedado completamente satisfechas, y han acabado fidelizándose con nosotros.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}