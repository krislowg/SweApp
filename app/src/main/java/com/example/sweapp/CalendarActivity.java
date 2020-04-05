package com.example.sweapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);

        configureStoreButton();
    }

    private void configureStoreButton(){
        Button btn_store = (Button) findViewById(R.id.btn_store1);
        btn_store.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(CalendarActivity.this, store.class));
            }

        });
    }

}
