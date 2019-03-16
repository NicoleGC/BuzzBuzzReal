package com.example.buzzbuzz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RealMenu extends AppCompatActivity {
    public Button but2;
    public Button but3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_real_menu);

        but2 = (Button) findViewById(R.id.button2);

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });

        but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
    }




    public void openActivity3(){
        Intent intent2 = new Intent(RealMenu.this, maps.class);
        startActivity(intent2);
    }
    public void openActivity4(){
        Intent intent2 = new Intent(RealMenu.this, MessageSent.class);
        startActivity(intent2);
    }
}
