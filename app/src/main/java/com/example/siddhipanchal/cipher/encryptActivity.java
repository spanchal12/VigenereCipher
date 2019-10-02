package com.example.siddhipanchal.cipher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class encryptActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.encrypt_activity);
        getSupportActionBar().hide();

    }


    public void goToCodedMessage(View view) {
        Intent intent = new Intent(this, codedMessage.class);
        startActivity(intent);
    }
}
