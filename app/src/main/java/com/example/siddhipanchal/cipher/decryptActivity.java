package com.example.siddhipanchal.cipher;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class decryptActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.decrypt_activity);
        getSupportActionBar().hide();

    }

    public void goToMessage (View view){
        Intent intent = new Intent(this, message.class);
        startActivity(intent);
    }

}
