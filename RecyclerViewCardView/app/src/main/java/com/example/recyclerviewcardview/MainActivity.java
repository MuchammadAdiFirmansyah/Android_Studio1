package com.example.recyclerviewcardview;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SiswaAdapter adapter;
    List <Siswa> siswaList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        load();
        isiData();
    }

    public void load() {
        recyclerView = findViewById(R.id.rcvSiswa);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void isiData() {
        siswaList = new ArrayList<Siswa>();
        siswaList.add(new Siswa( "Fuad", "ngawi"));
        siswaList.add(new Siswa( "Rusdi", "ngawi"));
        siswaList.add(new Siswa( "Amba", "ngawi"));
        siswaList.add(new Siswa( "Asep", "ngawi"));
        siswaList.add(new Siswa( "Mamak", "Bogor"));
        siswaList.add(new Siswa( "Mimik", "Purwa Dadi"));
        siswaList.add(new Siswa( "Mumuk", "Sampang"));
        siswaList.add(new Siswa( "Memey", "Jakarta"));
        siswaList.add(new Siswa( "Vina", "Garut"));

        adapter = new SiswaAdapter(this, siswaList);
        recyclerView.setAdapter(adapter);

    }

    public void btnTambah(View view) {
        siswaList.add(new Siswa(" Joko Tole", " Surabaya"));
        adapter.notifyDataSetChanged();
    }
}