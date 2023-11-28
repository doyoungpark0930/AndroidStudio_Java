package com.example.project4_4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
//2018038077 박도영 과제 4_4
public class MainActivity extends AppCompatActivity {

    TextView text1,text2;
    Switch chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoAndroid1,rdoAndroid2,rdoAndroid3;
    ImageView imgPet;
    Button Btn1,Btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 보기");

        text1=(TextView) findViewById(R.id.Text1);
        chkAgree=(Switch) findViewById(R.id.ChkAgree);

        text2=(TextView) findViewById(R.id.Text2);
        rGroup1=(RadioGroup) findViewById(R.id.Rgroup1);
        rdoAndroid1=(RadioButton) findViewById(R.id.RdoAndroid1);
        rdoAndroid2=(RadioButton) findViewById(R.id.RdoAndroid2);
        rdoAndroid3=(RadioButton) findViewById(R.id.RdoAndroid3);

        imgPet=(ImageView) findViewById(R.id.ImgPet);

        Btn1=(Button)findViewById(R.id.btn1);
        Btn2=(Button)findViewById(R.id.btn2);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                if(chkAgree.isChecked()==true){
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    imgPet.setVisibility(View.VISIBLE);
                }
                else
                {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    imgPet.setVisibility(View.INVISIBLE);
                }
            }
        });

        rGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                switch(checkedId)
                {
                    case R.id.RdoAndroid1:
                        imgPet.setImageResource(R.drawable.android1);
                        break;
                    case R.id.RdoAndroid2:
                        imgPet .setImageResource(R.drawable.android2);
                        break;
                    case R.id.RdoAndroid3:
                        imgPet.setImageResource(R.drawable.android3);
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물 먼저 선택하세요",Toast.LENGTH_SHORT).show();
                }
            }
        });

        Btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkAgree.setChecked(false);
                rdoAndroid1.setChecked(false);
                rdoAndroid2.setChecked(false);
                rdoAndroid3.setChecked(false);
            }
        });

    }
}