package com.example.chattingonic3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView penerima;
    public static final String KONTAK = "NAMA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        penerima = (TextView) findViewById(R.id.penerima);
    }
    public void pageKevin(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingonic3.halaman2.class);
        page1.putExtra(KONTAK, "DIDIT");
        startActivity(page1);
    }
    public void pageJamal(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingonic3.halaman2.class);
        page1.putExtra(KONTAK, "JAMAL");
        startActivity(page1);
    }
    public void pageTina(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingonic3.halaman2.class);
        page1.putExtra(KONTAK, "TINA");
        startActivity(page1);
    }
    public void pageJason(View view) {
        Intent page1 = new Intent(MainActivity.this, com.example.chattingonic3.halaman2.class);
        page1.putExtra(KONTAK, "AYOSS");
        startActivity(page1);
    }
}
