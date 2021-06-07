package com.example.dentalone.ui.tarifas;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import com.example.dentalone.R;

import com.example.dentalone.ui.tarifas.TarifasViewModel;

public class TarifasFragment extends Fragment
{
    private TarifasViewModel tarifasViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        tarifasViewModel =
                new ViewModelProvider((ViewModelStoreOwner) this).get(TarifasViewModel.class);
        View root = inflater.inflate(R.layout.fragment_tarifas, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        tarifasViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
