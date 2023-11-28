package com.example.mission6_7;


import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    private static final String TAG = "MenuActivity";
    public static final int MENU_CODE_CUSTOM = 10002;
    public static final int MENU_CODE_SALES = 10003;
    public static final int MENU_CODE_PRODUCT = 10004;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Button btnCustomCare, btnProductCare, btnSalesCare;

        btnCustomCare = findViewById(R.id.btnCustomCare);
        btnProductCare = findViewById(R.id.btnProductCare);
        btnSalesCare = findViewById(R.id.btnSalesCare);

        btnCustomCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "고객 관리", Toast.LENGTH_SHORT).show();
                backActivity.launch(intent);
            }
        });

        btnSalesCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "매출 관리", Toast.LENGTH_SHORT).show();
                backActivity.launch(intent);
            }
        });

        btnProductCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "상품 관리", Toast.LENGTH_SHORT).show();
                backActivity.launch(intent);
            }
        });

    }
    ActivityResultLauncher backActivity = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {

        }
    });

}