package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private CheckBox checkBoxHarry, checkBoxMatrix, checkBoxJocker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxHarry = findViewById(R.id.checkboxHarry);
        checkBoxMatrix = findViewById(R.id.checkboxMatrix);
        checkBoxJocker = findViewById(R.id.checkboxJocker);
        
        if (checkBoxHarry.isChecked()) {
            Toast.makeText(this, "You watch Harry Potter", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
        }

        checkBoxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "You watch Harry Potter", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "You need to watch Harry Potter", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}