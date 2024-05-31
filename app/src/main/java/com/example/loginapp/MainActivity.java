package com.example.loginapp;

import android.os.Bundle;
import android.view.LayoutInflater;


import androidx.appcompat.app.AppCompatActivity;

import com.example.loginapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private String mEditText;

    public String getEditText(){
        return mEditText;
    }

    public void setEditText(String et){
        this.mEditText = et;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = ActivityMainBinding.inflate(LayoutInflater.from(this));
        setContentView(binding.getRoot());
    }
}