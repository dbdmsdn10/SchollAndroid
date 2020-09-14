package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("타이틀");
        getSupportActionBar().setDisplayShowHomeEnabled(true);//바탕화면에 뭔가 보여줄것인지 확인
        getSupportActionBar().setIcon(R.drawable.icon);//이미지삽입


    }

    public void doit(View view) {
        switch (view.getId()){
            case R.id.button:
                Toast.makeText(this,"버튼1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"버튼2",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
