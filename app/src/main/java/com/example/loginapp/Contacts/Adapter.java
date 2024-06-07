package com.example.loginapp.Contacts;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.loginapp.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
private ArrayList<Contact> contactlist;

public Adapter(ArrayList<Contact> contactlist) {
    this.contactlist = contactlist;
}

@Override
public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
    // Inflate the layout for each item and return a new ViewHolder object
    View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
    return new MyViewHolder(itemView);
}

@Override
public int getItemCount() {
    return contactlist.size();
}

@Override
public void onBindViewHolder(MyViewHolder holder, int position) {
    Contact currentContact = contactlist.get(position);
    holder.name.setText(currentContact.getName());
    holder.email.setText(currentContact.getDescription());
    holder.image.setImageResource(currentContact.getImage());
    holder.deleteButton.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            notifyItemRangeChanged(position, getItemCount());
            contactlist.remove(position);
            notifyItemRemoved(position);

        }
    });
}

public static class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    private TextView email;
    private ImageView image;
    private Button deleteButton;

    public MyViewHolder(View itemView) {
        super(itemView);
        name = itemView.findViewById(R.id.contact_name);
        email = itemView.findViewById(R.id.contact_description);
        image = itemView.findViewById(R.id.contact_image);
        deleteButton = itemView.findViewById(R.id.contact_button);
    }
}
}
