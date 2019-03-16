package com.example.buzzbuzz;

import android.app.KeyguardManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MoreActivity extends AppCompatActivity {


    public Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        but1 = (Button) findViewById(R.id.button5);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        }

    public void openActivity2(){
        Intent intent = new Intent(this, RealMenu.class);
        startActivity(intent);
    }
    }

