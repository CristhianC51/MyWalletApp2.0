package com.fabiansuarez.mywallet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegistrarseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrarse);
    }

    public void buttonRegresar(View view) {
        Intent myIntent = new Intent(RegistrarseActivity.this, LoginActivity.class);
        startActivity(myIntent);
        finish();
    }
}