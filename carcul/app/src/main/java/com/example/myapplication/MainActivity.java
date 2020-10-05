package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView txtresult;
    EditText edit1, edit2;
    Button a;
    CheckBox b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("계산기");
        setContentView(R.layout.activity_main);
        txtresult = findViewById(R.id.txtretult);
        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
//        a=findViewById(R.id.btnadd);
//        a.setOnTouchListener(new View.OnTouchListener(){
//            public boolean onTouch(View arg0,MotionEvent arg1){
//                int num1=Integer.parseInt(edit1.getText().toString());
//                int num2=Integer.parseInt(edit2.getText().toString());
//                txtresult.setText((num1+num2)+"");
//                return false;
//            }
//        });
        b.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

            }
        });
    }

    public void doit(View view) {
        try {
            double num1 = Double.parseDouble(edit1.getText().toString());
            double num2 = Double.parseDouble(edit2.getText().toString());
            switch (view.getId()) {
                case R.id.btnadd:
                    txtresult.setText((num1 + num2) + "");
                    break;
                case R.id.btnsub:
                    txtresult.setText((num1 - num2) + "");
                    break;

                case R.id.btnmul:
                    txtresult.setText((num1 * num2) + "");
                    break;
                case R.id.btndiv:
                    txtresult.setText((num1 / num2) + "");
                    break;
            }
        } catch (Exception e) {
            //edit1.getText().toString().trim().equals("")
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }

    }
}