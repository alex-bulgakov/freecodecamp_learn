package com.example.uibasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private TextView txtHello;
    private EditText edtTxtName;

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnHello:
//                Toast.makeText(this, "Hello User!!!", Toast.LENGTH_SHORT).show();
                txtHello.setText("Hello " + edtTxtName.getText().toString());
                break;
            case R.id.edtText:
                Toast.makeText(this, "Attempting to type some", Toast.LENGTH_SHORT).show();
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

        edtTxtName = findViewById(R.id.edtText);
        edtTxtName.setOnClickListener(this);
        txtHello = findViewById(R.id.txtHello);

    }

}