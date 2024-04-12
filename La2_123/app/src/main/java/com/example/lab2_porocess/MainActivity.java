package com.example.lab2_porocess;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnTrang21 = findViewById(R.id.btnTrang21);
        Button btnTrang22 = findViewById(R.id.btnTrang22);
        Button btnTrang3 = findViewById(R.id.btnTrang3);
        Button btnTrang6 = findViewById(R.id.btnTrang6);
        Button btnTrang9 = findViewById(R.id.btnTrang9);

        btnTrang21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, trang2TH1.class);
                startActivity(intent);
            }
        });
        btnTrang22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, trang2TH2.class);
                startActivity(intent);
            }
        });
        btnTrang3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, trang3.class);
                startActivity(intent);
            }
        });
        btnTrang6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, trang6.class);
                startActivity(intent);
            }
        });

    }
}