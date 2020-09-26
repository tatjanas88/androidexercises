package com.example.materialcomponents;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnshowSnackbar;
    private RelativeLayout parent;
    private MaterialCardView cardView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnshowSnackbar = findViewById(R.id.button);
        parent = findViewById(R.id.parent);
        cardView = findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Card clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btnshowSnackbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackbar();
            }
        });
    }
    private void showSnackbar()
    {
        Snackbar.make(parent,"This is a snackbar", Snackbar.LENGTH_INDEFINITE).setAction("Retry", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Retry clicked", Toast.LENGTH_SHORT).show();
            }
        })
                .setActionTextColor(Color.CYAN)
                .setTextColor(Color.YELLOW)
                .show();
    }
}