package com.example.onetwoactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void doit(View view) {
        switch (view.getId()){
            case R.id.aaaa:
                Intent intent =new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(intent);
                break;
        }
    }
}