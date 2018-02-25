package com.example.brahmantyo.ratih_1202150244_modul3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar =  findViewById(R.id.progressBar);

        progressBar.setVisibility(View.VISIBLE);
        Toast.makeText(MainActivity.this,"Ratih_1202150244",Toast.LENGTH_LONG).show();

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {

            @Override
            public void run() {

                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                Intent a = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(a);
                progressBar.setVisibility(View.GONE);
                finish();
            }
        }, 5000L); //1000 L = 1 detik
    }

    }
