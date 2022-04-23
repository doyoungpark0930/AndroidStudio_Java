package com.example.mission6_8;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SalesActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        setTitle("Mission6_8_박도영");
        findViewById(R.id.btnCustomMenu).setOnClickListener(this);
        findViewById(R.id.btnCustomLogin).setOnClickListener(this);

        Intent intent = getIntent();
        String prev = intent.getExtras().getString("from");

        Toast.makeText(getApplicationContext(), prev + " -> Sales", Toast.LENGTH_SHORT).show();
    }

    ActivityResultLauncher MoveAtCustom = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
        @Override
        public void onActivityResult(ActivityResult result) {

        }
    });
    @Override
    public void onClick(View view) {
        Intent intent;
        switch(view.getId()) {
            case R.id.btnCustomMenu:
                intent = new Intent(this, MenuActivity.class);
                intent.putExtra("from", "Sales");
                MoveAtCustom.launch(intent);
                finish();
                break;
            case R.id.btnCustomLogin:
                intent = new Intent(this, MainActivity.class);
                intent.putExtra("from", "Sales");
                MoveAtCustom.launch(intent);
                finish();
                break;
        }
    }
}
