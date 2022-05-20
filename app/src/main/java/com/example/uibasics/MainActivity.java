package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHello:
                Toast.makeText(this, "Hello User!!!", Toast.LENGTH_SHORT).show();
            default:
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        btnHello.setOnLongClickListener(v -> {
            Toast.makeText(MainActivity.this, "OnLongClickLiestener", Toast.LENGTH_LONG).show();
            return true;
        });

        EditText edtTxtName = findViewById(R.id.edtText);
        TextView txtHello = findViewById(R.id.txtHello);

    }

}