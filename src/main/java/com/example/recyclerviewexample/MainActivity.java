package com.example.recyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView contactsRecView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsRecView = findViewById(R.id.contactsRecView);

        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Marija", "mar@gmail.com","https://upload.wikimedia.org/wikipedia/commons/5/57/SYDNEY%2C_AUSTRALIA_-_JANUARY_23_Margot_Robbie_arrives_at_the_Australian_Premiere_of_%27I%2C_Tonya%27_on_January_23%2C_2018_in_Sydney%2C_Australia_%2828074883999%29_%28cropped_2%29.jpg"));
        contacts.add(new Contact("ana","an@gmail.com", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/47/Anne_Hathaway_at_the_2007_Deauville_American_Film_Festival-01A.jpg/170px-Anne_Hathaway_at_the_2007_Deauville_American_Film_Festival-01A.jpg"));
        contacts.add(new Contact("Heat", "heat@gmail.com", "https://www.biography.com/.image/t_share/MTE5NTU2MzE2MDQ4NjIzMTE1/heath-ledger-266035-1-402.jpg"));
        contacts.add(new Contact("Jake", "jake@gmail.com", "https://www.biography.com/.image/t_share/MTE4MDAzNDEwNzk1MjAyMDYy/jake-gyllenhaal-16242387-1-402.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new GridLayoutManager(this,2));
    }
}