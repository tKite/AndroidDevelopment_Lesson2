package com.example.activitylifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Запуск onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Запуск onStart");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "Запуск onRestoreInstanceState");
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        Log.i(TAG, "Запуск onPostCreate");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Запуск onResume");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG, "Запуск onPostResume");
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Log.i(TAG, "Запуск onAttachedToWindow");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Запуск onPause");
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.i(TAG, "Запуск onSaveInstanceState");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Запуск onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Запуск onDestroy");
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Log.i(TAG, "Запуск onDetachedFromWindow");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Запуск onRestart");
    }
}