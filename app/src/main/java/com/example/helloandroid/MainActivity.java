package com.example.helloandroid;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {    //main역할
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //이게없으면 화면에 아무것도 안 뜰것이다
    }
}