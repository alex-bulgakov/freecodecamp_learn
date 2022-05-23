package com.example.uibasics;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  {

    private RecyclerView contactsRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ivan", "ivan@mail.com", "https://img.uslugio.com/img/86/96/869620e774a3948a94d2adb071538fc2.jpg"));
        contacts.add(new Contact("Vovan", "vovan@mail.com", "https://fb.ru/misc/i/thumb/a/2/1/6/6/5/4/3/2166543.jpg"));
        contacts.add(new Contact("Sanya",  "sanya@mail.com", "https://image.shutterstock.com/image-photo/sad-young-man-portrait-on-260nw-91159184.jpg"));
        contacts.add(new Contact("Alex", "alex@mail.com", "https://mijory.by/uploads/posts/2017-01/thumbs/1485778210_30.jpg"));
        contacts.add(new Contact("John", "john@mail.com", "https://okvitamin.org/images/kompleksi/1412490181_kak-sdelat-vashego-muzhchinu-samim-schastlivim-1036-14885.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this, 2));
    }
}