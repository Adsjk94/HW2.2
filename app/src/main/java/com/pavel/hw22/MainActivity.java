package com.pavel.hw22;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Back();
        Forward();
    }

    private void Forward() {
        Button bf = findViewById(R.id.bf);

        bf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent);

                TextView tt = findViewById(R.id.tt);

                int a = 1 + (int) (Math.random() * 100);

                tt.setText("http://myfile.org/" + a);



            }
        });
    }

    private void Back() {
        Button bb = findViewById(R.id.bb);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
                finish();
            }

            
        });
    }


}