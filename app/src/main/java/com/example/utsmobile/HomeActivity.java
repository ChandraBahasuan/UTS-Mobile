package com.example.utsmobile;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.utsmobile.R;

public class HomeActivity extends AppCompatActivity {

    private ImageButton btnAdidas, btnNike, btnPuma;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnAdidas = findViewById(R.id.btnAdidas);
        btnNike = findViewById(R.id.btnNike);
        btnPuma = findViewById(R.id.btnPuma);

        btnAdidas = findViewById(R.id.btnAdidas);
        if (btnAdidas != null) {
            btnAdidas.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this, "Adidas clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
        btnNike = findViewById(R.id.btnNike);
        if (btnNike != null) {
            btnNike.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this, "Nike clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }
        btnPuma = findViewById(R.id.btnPuma);
        if (btnPuma !=null) {
            btnPuma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(HomeActivity.this, "Puma clicked", Toast.LENGTH_SHORT).show();
                }
            });
        }


    }
}
