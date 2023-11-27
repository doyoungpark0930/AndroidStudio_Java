package com.example.assignment2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;
//2018038077 박도영
public class MainActivity extends AppCompatActivity {
    EditText editText;
    Button button1;
    Button button2;
    RadioGroup rg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editText = (EditText) findViewById(R.id.Edit1);
        button1 = (Button) findViewById(R.id.button1);  //버튼1
        button2 = (Button) findViewById(R.id.button2);  //버튼2
        rg=(RadioGroup)findViewById(R.id.radioGroup);   //라디오버튼
        ImageView imageView=(ImageView)findViewById(R.id.imageView);    //이미지 뷰

        button1.setOnClickListener(new View.OnClickListener() { //버튼1이 클릭되었을때
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),editText.getText().toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() { //버튼2가 클릭되었을때
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(editText.getText().toString()));
                startActivity(intent);
            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkdid) {
                if(checkdid == R.id.radioButton)
                {

                    imageView.setImageResource(R.drawable.penguin);
                }
                else if(checkdid ==R.id.radioButton2)
                {
                    imageView.setImageResource(R.drawable.b);
                }
            }
        });
    }
}