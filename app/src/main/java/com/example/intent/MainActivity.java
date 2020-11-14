package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView top ;
    EditText search ;
    Button loginBtn , searchBtn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            searchBtn = (Button) findViewById(R.id.search_btn);
            search = (EditText) findViewById(R.id.search);

//        email = (EditText) findViewById(R.id.Email);
//        pass = (EditText) findViewById(R.id.Pass);
//        loginBtn = (Button) findViewById(R.id.Login);

    }
    public void setSearch (View v) {
        
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        String searchFor = search.getText().toString();
        intent.putExtra(SearchManager.QUERY , searchFor );
        if(intent.resolveActivity(getPackageManager()) != null){
            startActivity(intent);
        }
    }

//    public void createNote(String subject, String text) {
//        Intent intent = new Intent(NoteIntents.ACTION_CREATE_NOTE)
//                .putExtra(NoteIntents.EXTRA_NAME, subject)
//                .putExtra(NoteIntents.EXTRA_TEXT, text);
//        if (intent.resolveActivity(getPackageManager()) != null) {
//            startActivity(intent);
//        }
//    }
}
