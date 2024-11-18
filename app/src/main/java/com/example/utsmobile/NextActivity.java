package com.example.utsmobile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import com.example.utsmobile.R;

public class NextActivity extends AppCompatActivity {
    private EditText username, password;
    private Button loginButton;
    private Button registerButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);


        registerButton = findViewById(R.id.registerButton);
        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ambil input dari pengguna
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if (user.isEmpty() || pass.isEmpty()) {
                    Toast.makeText(NextActivity.this, "Harap isi semua bidang", Toast.LENGTH_SHORT).show();
                } else {
                    // Implementasi logika login
                    Toast.makeText(NextActivity.this, "Login berhasil", Toast.LENGTH_SHORT).show();
                }
            }


        });
    }
}
