package com.example.siddhipanchal.cipher;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class encryptActivity extends AppCompatActivity {

    EditText messageReal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt_activity);
        getSupportActionBar().hide();

        messageReal = findViewById(R.id.messageReal);
    }


    public void goToCodedMessage(View view) {


        SharedPreferences sharedPreferences = getSharedPreferences("myData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("MessageReal", messageReal.getText().toString());
        editor.commit();



        Intent intent = new Intent(this, codedMessage.class);
        startActivity(intent);
    }
}
