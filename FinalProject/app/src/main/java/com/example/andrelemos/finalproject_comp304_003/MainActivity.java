package com.example.andrelemos.finalproject_comp304_003;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnTask1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnTask1 = (Button) findViewById(R.id.button2);

        btnTask1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                Intent intent=new Intent(MainActivity.this, AdminActivity.class);

                startActivity(intent);

            }
        });

    }
}
