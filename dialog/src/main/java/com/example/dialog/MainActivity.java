package com.example.dialog;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickShowDialog(View view){
        AlertDialogFragment dialogFragment = new AlertDialogFragment();
        dialogFragment.show(getSupportFragmentManager(), "mirea");
    }
    public void onOkClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Иду дальше\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onCancelClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"Нет\"!",
                Toast.LENGTH_LONG).show();
    }
    public void onNeutralClicked() {
        Toast.makeText(getApplicationContext(), "Вы выбрали кнопку \"На паузе\"!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickTimeDialog(View view){
        TimeDialogFragment timeDialog = new TimeDialogFragment();
        timeDialog.show(getSupportFragmentManager(), "timeMirea");
    }
    public void onTimeClicked(){
        Toast.makeText(getApplicationContext(), "Вы выбрали время!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickDateDialog(View view){
        DateDialogFragment dateDialog = new DateDialogFragment();
        dateDialog.show(getSupportFragmentManager(), "dateMirea");
    }
    public void onDateClicked(){
        Toast.makeText(getApplicationContext(), "Вы выбрали дату!",
                Toast.LENGTH_LONG).show();
    }

    public void onClickProgressDialog(View view){
        ProgressDialogFragment progressDialog = new ProgressDialogFragment();
        progressDialog.show(getSupportFragmentManager(), "progressMirea");
    }
}