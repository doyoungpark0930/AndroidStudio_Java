package com.example.mission6_8;

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

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MenuActivity";
    public static final int MENU_CODE_CUSTOM = 1000127;
    public static final int MENU_CODE_SALES = 1000373;
    public static final int MENU_CODE_PRODUCT = 1000117;

    Button btnCustomCare, btnProductCare, btnSalesCare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        setTitle("Mission6_8_박도영");

        btnCustomCare = findViewById(R.id.btnCustomCare);
        btnProductCare = findViewById(R.id.btnProductCare);
        btnSalesCare = findViewById(R.id.btnSalesCare);

        btnCustomCare.setOnClickListener(this);
        btnProductCare.setOnClickListener(this);
        btnSalesCare.setOnClickListener(this);

        Intent intent = getIntent();
        String prev = intent.getExtras().getString("from");

        Toast.makeText(getApplicationContext(), prev + " -> Menu", Toast.LENGTH_SHORT).show();
    }

    ActivityResultLauncher moveActivity = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {

        }
    });

    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()){
            case R.id.btnCustomCare:
                intent = new Intent(this, CustomActivity.class);
                intent.putExtra("from", "Menu");
                moveActivity.launch(intent);
                finish();
                break;
            case R.id.btnProductCare:
                intent = new Intent(this, ProductActivity.class);
                intent.putExtra("from", "Menu");
                moveActivity.launch(intent);
                finish();
                break;
            case R.id.btnSalesCare:
                intent = new Intent(this, SalesActivity.class);
                intent.putExtra("from", "Menu");
                moveActivity.launch(intent);
                finish();
                break;
        }
    }
}
