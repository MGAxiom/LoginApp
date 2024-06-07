package com.example.loginapp.Contacts;

import com.example.loginapp.R;

import java.util.ArrayList;

public class ListData {

    public static ArrayList<Contact> getContactData()
    {
        ArrayList<Contact> contacts
                = new ArrayList<Contact>();
        Contact emp1 = new Contact("Beluga",
                "Always joyous", R.drawable.dog1);
        contacts.add(emp1);
        Contact emp2
                = new Contact("Myrtle", "Follows Juniper everywhere", R.drawable.dog2);
        contacts.add(emp2);
        Contact emp3 = new Contact("Juniper",
                "Loves to roam the world", R.drawable.dog3);
        contacts.add(emp3);
        Contact emp4 = new Contact("Montana",
                "Too much energy", R.drawable.dog4jpg);
        contacts.add(emp4);
        Contact emp5 = new Contact(
                "Moona", "Loves cuddles", R.drawable.dog5);
        contacts.add(emp5);
        Contact emp6 = new Contact("Sindhu",
                "Master of the coach", R.drawable.dog6);
        contacts.add(emp6);
        Contact emp7 = new Contact("Midi",
                "Got the best nose", R.drawable.dog7);
        contacts.add(emp7);
        Contact emp8 = new Contact("Volt",
                "Needs constant attention", R.drawable.dog8);
        contacts.add(emp8);
        Contact emp9 = new Contact("Zen",
                "Mostly on his own", R.drawable.dog9);
        contacts.add(emp9);
        Contact emp10 = new Contact("Lassie",
                "Doesn't like doors", R.drawable.dog10);
        contacts.add(emp10);

        return contacts;
    }
}
