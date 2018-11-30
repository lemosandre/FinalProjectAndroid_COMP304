package com.example.andrelemos.finalproject_comp304_003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AdminActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);

        String [] employee= {"Daniel","Ronaldo", "Jeferson", "Felipe"};

        ListView listEmployee = (ListView) findViewById(R.id.list_employee);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, employee);
        listEmployee.setAdapter(adapter);
    }
}
