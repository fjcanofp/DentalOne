package com.example.dentalone.ui.cadcam;

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

public class CADCAMFragment extends Fragment
{
    private CADCAMViewModel cadcamViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cadcamViewModel =
                new ViewModelProvider(this).get(CADCAMViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cadcam, container, false);
        final TextView textView = root.findViewById(R.id.text_cadcam);
        cadcamViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}


