package com.example.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button toastBut;
    private EditText toastText;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main);
        toastBut = findViewById(R.id.toastbut);
        toastText = findViewById(R.id.toastentering);
    }

    public void MakeToast(View view){
        String enteringText = toastText.getText().toString();
        for (int i = 0; i < enteringText.length(); i++) {
            count += 1;
        }
        String popText = "СТУДЕНТ №11 ГРУППА БСБО-09-21 КОЛИЧЕСТВО СИМВОЛОВ - " + count;
        Toast toast = Toast.makeText(getApplicationContext(), popText, Toast.LENGTH_LONG);
        toast.show();
        count = 0;
    }
}