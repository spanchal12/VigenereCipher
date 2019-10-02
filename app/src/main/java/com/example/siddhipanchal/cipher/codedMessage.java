package com.example.siddhipanchal.cipher;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class codedMessage extends AppCompatActivity {


    //activity with the encrypted message
    //will display CODE
    //come here after encryption

    public static String DEFAULT = "N/A";
    TextView originalMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coded_message);
        getSupportActionBar().hide();

        //initialization
        originalMessage = findViewById(R.id.originalMessage);

        //shared preference
        SharedPreferences sharedPreferences = getSharedPreferences("mydata", Context.MODE_PRIVATE);

        String OriginalMessage = sharedPreferences.getString("MessageReal", DEFAULT);

        //set the new text
        originalMessage.setText(OriginalMessage);

    }


    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
