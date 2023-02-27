package com.example.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragments.Fragments.FirstFragment;
import com.example.fragments.Fragments.SecondFragment;

public class MainActivity extends AppCompatActivity {
Button first,second;
LinearLayout linearLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first= findViewById(R.id.btnFirst);
        second = findViewById(R.id.btnSecond);
        linearLayout = findViewById(R.id.linearLayout);


    first.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            FirstFragment firstFragment= new FirstFragment();
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.linearLayout, firstFragment);
            transaction.commit();

        }
    });
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SecondFragment secondFragment= new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearLayout, secondFragment);
                transaction.commit();

            }
        });



    }
}