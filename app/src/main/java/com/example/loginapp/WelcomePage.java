package com.example.loginapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.loginapp.databinding.FragmentWelcomePageBinding;

public class WelcomePage extends Fragment {

    private FragmentWelcomePageBinding binding;

    MessagePage messagePageFragment = new MessagePage();

    public static MessagePage newInstance(String data2){
        MessagePage messagePageFragment = new MessagePage();
        Bundle bundle = new Bundle();
        bundle.putString("key",data2);
        messagePageFragment.setArguments(bundle);
        return messagePageFragment;
    }
    Bundle bundle = new Bundle();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWelcomePageBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //binding.loginButton.setEnabled(false);
        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String username = binding.nameEditText.getText().toString();
                String email = binding.emailEditText.getText().toString();
                String password = binding.passwordEditText.getText().toString();

                if (email.equals("email@gmail.com") && password.equals("123")) {
                    Toast.makeText(getContext(), "Login successful", Toast.LENGTH_SHORT).show();
                    FragmentManager fragmentManager = getParentFragmentManager();
                    FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//                    bundle.putString("name", username);
//                    messagePageFragment.setArguments(bundle);
                    fragmentTransaction.replace(R.id.container, newInstance(username));
                    fragmentTransaction.addToBackStack(null);
                    fragmentTransaction.commit();
                } else {
                    Toast.makeText(getContext(), "Invalid email or password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}