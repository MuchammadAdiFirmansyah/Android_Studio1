package com.example.inentactivity;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class PembelianActivity extends AppCompatActivity {

    TextView tvBeli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pembelian);
        load();
        ambilData();

    }

    public void load(){
        tvBeli = findViewById(R.id.tvBeli);
    }

    public void ambilData(){
        String ambil = getIntent().getStringExtra("ISI");
        tvBeli.setText(ambil);
    }
}
