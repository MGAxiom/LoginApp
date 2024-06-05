package com.example.loginapp;

import static java.sql.DriverManager.println;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.loginapp.databinding.FragmentMessagePageBinding;
import com.example.loginapp.databinding.FragmentWelcomePageBinding;


public class MessagePage extends Fragment {

    public static MessagePage newInstance() {
        MessagePage fragment = new MessagePage();
        return fragment;
    }
    private @NonNull FragmentMessagePageBinding binding;
    Bundle mBundle = this.getArguments();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String name = null;
        // Inflate the layout for this fragment
        if( mBundle != null ){
            name = mBundle.getString("key");
            println(name);
        }
        println(String.valueOf(mBundle));
        binding = FragmentMessagePageBinding.inflate(inflater, container, false);
        binding.infoMessage.setText("Hello " + name + " you've succesufully logged in!");
        return binding.getRoot();

//        View inf = inflater.inflate(R.layout.fragment_message_page, container, false);
//        TextView textView = (TextView) inf.findViewById(R.id.infoMessage);
//        textView.setText("Hello " + name + " you've succesufully logged in!");
//        return inf;

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.showListButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                binding.listView.setVisibility(View.VISIBLE);
                binding.infoMessage.setVisibility(View.INVISIBLE);
            }
        });
       }
}