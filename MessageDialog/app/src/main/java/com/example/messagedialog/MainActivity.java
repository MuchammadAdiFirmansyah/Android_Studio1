package com.example.messagedialog;

import android.os.Bundle;

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

        System.out.println("onCreate");
    }

    @Override
    protected void onStart(){
        super.onStart();

        System.out.println("onStart");
        }

    @Override
    protected void onPostResume(){
        super.onPostResume();

        System.out.println("onPostResume");
        }

    @Override
    protected  void onPause() {
        super.onPause();

        System.out.println("onPause");
        }

    @Override
    protected void onStop(){
        super.onStop();

        System.out.println("onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        System.out.println("onDestroy");
    }
}