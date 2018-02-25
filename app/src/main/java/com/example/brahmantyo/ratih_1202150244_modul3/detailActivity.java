package com.example.brahmantyo.ratih_1202150244_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class detailActivity extends AppCompatActivity {
    TextView title, liter;
    ImageView photo,baterry;
    ImageButton ButtonMin, ButtonPlus;

    private int liters = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent = getIntent();
        String mjudul = intent.getStringExtra("judul");
        Integer mgambar = intent.getIntExtra("gambar",0);

        title = findViewById(R.id.detailjudul); //memberikan inisial untuk digunakan pada detailActivity
        liter = findViewById(R.id.Liter);
        photo =  findViewById(R.id.detailgambar);
        baterry =  findViewById(R.id.baterry);
        ButtonPlus = findViewById(R.id.btn_plus);
        ButtonMin = findViewById(R.id.btn_minus);


        title.setText(mjudul);
        Battery();
        photo.setImageResource(mgambar);

        ButtonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liters++;
                Battery();
            }
        });

        ButtonMin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                liters--;
                Battery();
            }
        });
    }


    public void Battery() {
        if (liters <= 0) {
            // 20%
            liter.setText("1L");
            baterry.setImageResource(R.drawable.ic_battery_20);
            Toast.makeText(this, "Air sedikit", Toast.LENGTH_SHORT).show();
        } else if (liters == 1) {
            // 30%
            liter.setText("2L");
            baterry.setImageResource(R.drawable.ic_battery_30_);
        } else if (liters == 2) {
            // 50%
            liter.setText("3L");
            baterry.setImageResource(R.drawable.ic_battery_50);
        } else if (liters == 3) {
            // 60%
            liter.setText("4L");
            baterry.setImageResource(R.drawable.ic_battery_60_black);
        } else if (liters == 4) {
            // 80%
            liter.setText("5L");
            baterry.setImageResource(R.drawable.ic_battery_80_black_24dp);
        } else if (liters == 5) {
            // 90%
            liter.setText("6L");
            baterry.setImageResource(R.drawable.ic_battery_90);
        } else {
            // 100%
            liter.setText("7L");
            baterry.setImageResource(R.drawable.ic_battery_full);
            Toast.makeText(this, "Air Sudah Full", Toast.LENGTH_SHORT).show();
        }
    }
    }

