package com.example.mission4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
//2018038077 박도영 미션4
public class MainActivity extends AppCompatActivity {

    ImageButton btn1,btn2;
    ImageView image1,image2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(ImageButton) findViewById(R.id.upButton);
        btn2=(ImageButton) findViewById(R.id.downButton);
        image1=(ImageView) findViewById(R.id.Image1);
        image2=(ImageView) findViewById(R.id.Image2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setVisibility(View.VISIBLE);
                image2.setVisibility(View.INVISIBLE);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.VISIBLE);
            }
        });
    }

}