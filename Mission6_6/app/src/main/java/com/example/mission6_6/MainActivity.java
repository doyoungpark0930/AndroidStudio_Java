package com.example.mission6_6;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.EditText;
import android.widget.ProgressBar;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar;
    EditText editText;
    SeekBar seekBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Mission6_6_박도영");
        progressBar = findViewById(R.id.progressBar); //프로그래스바
        editText=findViewById(R.id.editText); //밑에 프로그래스바 진행정도 숫자로나타냄
        seekBar=findViewById(R.id.seekBar); //Seek바
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { //seek바 조정에따라
                //progress바가 바뀜
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressBar.setProgress(progress);
                editText.setText(String.valueOf(progress));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }
}