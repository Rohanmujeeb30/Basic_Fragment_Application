package com.example.fragments.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragments.MainActivity;
import com.example.fragments.MainActivity2;
import com.example.fragments.R;


public class FirstFragment extends Fragment {



    public FirstFragment() {
        // Required empty public constructor
    }

    TextView tv;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        tv = view.findViewById(R.id.textview);

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MainActivity2.class);
                startActivity(intent);
            }
        });

    return view;
    }
}