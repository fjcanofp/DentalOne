package com.example.dentalone.ui.planosMaquinas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.dentalone.R;

public class PlanoFragment extends Fragment
{
    private PlanoViewModel contactoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        contactoViewModel =
                new ViewModelProvider(this).get(PlanoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_plano, container, false);
        final TextView textView = root.findViewById(R.id.text_plano);
        contactoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}


