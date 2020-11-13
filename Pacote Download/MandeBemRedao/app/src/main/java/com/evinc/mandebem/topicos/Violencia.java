package com.evinc.mandebem.topicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.evinc.mandebem.R;

public class Violencia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_violencia);
        getSupportActionBar().setTitle("Violência");
    }
}