package com.example.myui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TableLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Test3_1Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_1_main);
    }
    public void customView(View source){
        LinearLayout loginForm=(LinearLayout) getLayoutInflater().inflate(R.layout.teachercode1,null);
        new AlertDialog.Builder(this)
                .setView(loginForm)
                .create().show();
    }
}
