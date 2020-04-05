package com.example.sweapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);

        configureCartButton();
    }

    private void configureCartButton(){
        Button btn_cart = (Button) findViewById(R.id.btn_GoCart);
        btn_cart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                startActivity(new Intent(store.this, Cart.class));
            }

        });
    }
}
