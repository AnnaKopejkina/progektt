package com.example.progekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

    public void vodorod(View view) {

   Intent intent = new Intent(getApplicationContext(), Vodorod.class);
    startActivity(intent);

    }

    public void litiy(View view) {
        Intent intent = new Intent(getApplicationContext(), Litiy.class);
        startActivity(intent);

    }

    public void Bor(View view) {
        Intent intent = new Intent(getApplicationContext(), Bor.class);
        startActivity(intent);
    }

    public void beriliy(View view) {
        Intent intent = new Intent(getApplicationContext(), Beriliy.class);
        startActivity(intent);
    }

    public void C(View view) {
        Intent intent = new Intent(getApplicationContext(), Uglerod.class);
        startActivity(intent);
    }

    public void azot(View view) {
        Intent intent = new Intent(getApplicationContext(), Azot.class);
        startActivity(intent);
    }

    public void kislorod(View view) {
        Intent intent = new Intent(getApplicationContext(), Kislorod.class);
        startActivity(intent);
    }

    public void ftor(View view) {
        Intent intent = new Intent(getApplicationContext(), Ftor.class);
        startActivity(intent);
    }

    public void ne(View view) {
        Intent intent = new Intent(getApplicationContext(), Neon.class);
        startActivity(intent);
    }


    public void he(View view) {
        Intent intent = new Intent(getApplicationContext(), Heli.class);
        startActivity(intent);
    }


    public void na(View view) {
        Intent intent = new Intent(getApplicationContext(), Natri.class);
        startActivity(intent);
    }


    public void mg(View view) {
        Intent intent = new Intent(getApplicationContext(), Magni.class);
        startActivity(intent);
    }


    public void al(View view) {
        Intent intent = new Intent(getApplicationContext(), Alumini.class);
        startActivity(intent);
    }

    public void si(View view) {
        Intent intent = new Intent(getApplicationContext(), Sili.class);
        startActivity(intent);
    }

    public void p(View view) {
        Intent intent = new Intent(getApplicationContext(), P.class);
        startActivity(intent);
    }


    public void s(View view) {
        Intent intent = new Intent(getApplicationContext(), Sera.class);
        startActivity(intent);
    }

    public void cl(View view) {
        Intent intent = new Intent(getApplicationContext(), Clor.class);
        startActivity(intent);
    }

    public void ar(View view) {
        Intent intent = new Intent(getApplicationContext(), Ar.class);
        startActivity(intent);
    }
}



