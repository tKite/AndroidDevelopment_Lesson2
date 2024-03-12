package com.example.multiactivity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button but;
    private EditText edit;
    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Запуск onCreate в MainActivity");
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view) {
        but = findViewById(R.id.eventButton);
        edit = findViewById(R.id.editorForAct);
        String enteringText = edit.getText().toString();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("key", enteringText);
        startActivity(intent);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Запуск onStart в MainActivity");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "Запуск onRestoreInstanceState в MainActivity");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(TAG, "Запуск onPostCreate в MainActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Запуск onResume в MainActivity");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "Запуск onPostResume в MainActivity");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "Запуск onAttachedToWindow в MainActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Запуск onPause в MainActivity");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG, "Запуск onSaveInstanceState в MainActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Запуск onStop в MainActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Запуск onDestroy в MainActivity");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "Запуск onDetachedFromWindow в MainActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Запуск onRestart в MainActivity");
    }
}