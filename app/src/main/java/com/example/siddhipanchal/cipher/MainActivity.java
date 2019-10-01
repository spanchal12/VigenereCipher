package com.example.siddhipanchal.cipher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void goToEncrypt(View view){
        Intent intent = new Intent(this, encryptActivity.class);
        startActivity(intent);
    }

    public void goToDecrypt(View view){
        Intent intent = new Intent(this, decryptActivity.class);
        startActivity(intent);
    }
}
