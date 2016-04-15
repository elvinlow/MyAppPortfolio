package com.example.elvin.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void PopularMovies(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app!", Toast.LENGTH_LONG).show();
    }

    public void stockHawk(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk app!", Toast.LENGTH_LONG).show();
    }

    public void buildItBigger(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger app!", Toast.LENGTH_LONG).show();
    }

    public void makeYourAppMaterial(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material app!", Toast.LENGTH_LONG).show();
    }

    public void goUbiquitous(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous app!", Toast.LENGTH_LONG).show();
    }

    public void capStone(View view) {
        Toast.makeText(MainActivity.this, "This button will launch my CapStone app!", Toast.LENGTH_LONG).show();
    }
}
