package com.example.dentalone.ui.folleto;

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
import com.example.dentalone.R;
import com.example.dentalone.ui.home.HomeViewModel;

public class FolletoFragment extends Fragment
{
    private FolletoViewModel folletoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        folletoViewModel =
                new ViewModelProvider( this).get(FolletoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_folleto, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        folletoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}
