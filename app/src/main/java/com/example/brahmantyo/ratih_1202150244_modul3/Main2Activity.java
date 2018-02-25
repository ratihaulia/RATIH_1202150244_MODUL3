package com.example.brahmantyo.ratih_1202150244_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    EditText Username, Password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Username = findViewById(R.id.username);
        Password = findViewById(R.id.password);
        login = findViewById(R.id.btnlogin);

        //membuat aksi saat button login ditekan
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String uname = Username.getText().toString();
                String pass = Password.getText().toString();

                if(uname.equals("EAD") && pass.equals("MOBILE")){

                    Toast.makeText(getApplicationContext(),"Login Success !!!",Toast.LENGTH_LONG).show();
                    Intent login = new Intent(Main2Activity.this,Recyclerview.class);
                    startActivity(login);

                }else {
                    Toast.makeText(getApplicationContext(),"Login Failed !!!",Toast.LENGTH_LONG).show();
                }


            }
        });

    }


}
