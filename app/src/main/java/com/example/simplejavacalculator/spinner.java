package com.example.simplejavacalculator;

import static com.example.simplejavacalculator.R.id.action_bar_spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class spinner extends AppCompatActivity {
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        spinner=findViewById(action_bar_spinner);
        ConstraintLayout layoutt= findViewById(R.id.layout);
        String[] colors={"red","white"};
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,colors);

        spinner.setAdapter(arrayAdapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:

                        layoutt.setBackgroundColor(Color.RED);
                        break;
                    case 1:
                    layoutt.setBackgroundColor(Color.WHITE);
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
               layoutt.setBackgroundColor(Color.TRANSPARENT);
            }
        });



    }
}