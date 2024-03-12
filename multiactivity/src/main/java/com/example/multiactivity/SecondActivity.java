package com.example.multiactivity;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.multiactivity.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {

    public TextView text;
    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text = findViewById(R.id.res);
        Log.i(TAG, "Запуск onCreate в SecondActivity");
//        Bundle arguments = getIntent().getExtras();
//        String receiveText = arguments.get("key").toString();
        String receiveText = (String) getIntent().getSerializableExtra("key");
        text.setText(receiveText);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Запуск onStart в SecondActivity");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "Запуск onRestoreInstanceState в SecondActivity");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(TAG, "Запуск onPostCreate в SecondActivity");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Запуск onResume в SecondActivity");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "Запуск onPostResume в SecondActivity");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "Запуск onAttachedToWindow в SecondActivity");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Запуск onPause в SecondActivity");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG, "Запуск onSaveInstanceState в SecondActivity");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Запуск onStop в SecondActivity");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Запуск onDestroy в SecondActivity");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "Запуск onDetachedFromWindow в SecondActivity");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Запуск onRestart в SecondActivity");
    }
}