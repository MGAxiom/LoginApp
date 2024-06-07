package com.example.loginapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapp.Contacts.Adapter;
import com.example.loginapp.Contacts.Contact;
import com.example.loginapp.Contacts.ListData;
import com.example.loginapp.databinding.FragmentMessagePageBinding;

import java.util.ArrayList;


public class MessagePage extends Fragment {
    private @NonNull FragmentMessagePageBinding binding;
    String name = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle text = getArguments();
        name = text.getString("key");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMessagePageBinding.inflate(inflater, container, false);
        binding.infoMessage.setText("Hello " + name + " you've successfully logged in!");
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.showListButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (binding.recycleView.getVisibility() != View.VISIBLE) {
                    binding.recycleView.setVisibility(View.VISIBLE);
                }
                binding.showListButton.setText("Reset list");
                binding.infoMessage.setText(name + ", here's your list of contacts:");
                loadList(view);
            }
        });
       }

       void loadList(View view) {
        ArrayList<Contact> contactList = ListData.getContactData();
        Adapter itemAdapter = new Adapter(contactList);
        RecyclerView recyclerView = view.findViewById(R.id.recycleView);
        recyclerView.setLayoutManager( new LinearLayoutManager(getContext()) );
        recyclerView.setAdapter(itemAdapter);
    }
}