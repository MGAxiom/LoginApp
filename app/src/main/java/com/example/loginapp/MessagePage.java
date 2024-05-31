package com.example.loginapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class MessagePage extends Fragment {

    public static MessagePage newInstance() {
        MessagePage fragment = new MessagePage();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String name = null;
        // Inflate the layout for this fragment
        if( ((MainActivity) getActivity()).getEditText() != null ){
            name = String.valueOf(((MainActivity) getActivity()).getEditText());
        }
        View inf = inflater.inflate(R.layout.fragment_message_page, container, false);
        TextView textView = (TextView) inf.findViewById(R.id.infoMessage);
        textView.setText("Hello " + name + " you've succesufully logged in!");
        return inf;
    }
}