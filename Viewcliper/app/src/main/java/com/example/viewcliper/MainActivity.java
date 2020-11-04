package com.example.viewcliper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    ViewFlipper viewflipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button prev,nextl;

        prev=findViewById(R.id.btnPrev);
        nextl=findViewById(R.id.btnNext);
        viewflipper=findViewById(R.id.viewFlipper1);

        viewflipper.startFlipping();//자동넘기기
        viewflipper.setFlipInterval(1000);//시간설정
        //viewflipper.stopFlipping();//종료


    }

    public void doit(View view) {
        switch (view.getId()){
            case R.id.btnPrev:
                viewflipper.showPrevious();
                break;
            case R.id.btnNext:
                viewflipper.showNext();
                break;
        }
    }
}
