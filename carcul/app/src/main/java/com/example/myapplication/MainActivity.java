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
    Button[] numBtns = new Button[10];
    Integer[] numBtmIDs = {R.id.no0, R.id.no1, R.id.no2, R.id.no3, R.id.no4, R.id.no5, R.id.no6, R.id.no7, R.id.no8, R.id.no9};
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("계산기(테이블 레이 아웃)");
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
        //----------------------------------------------------
//        for (i = 0; i < 10; i++) {
//            numBtns[i] = findViewById(numBtmIDs[i]);
//        }
//        for (i = 0; i < 10; i++) {
//            final int index;
//            index = i;
//            numBtns[index].setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (edit1.isFocused()) {
//                        edit1.setText(edit1.getText().toString() + "" + index);
//                    } else if (edit2.isFocused()) {
//                        edit2.setText(edit2.getText().toString() + "" + index);
//                    } else {
//                        Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
//                    }
//                }
//            });
//        }
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

    public void NO(View view) {
        switch (view.getId()) {
            case R.id.no0:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "0");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "0");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no1:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "1");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "1");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no2:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "2");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "2");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no3:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "3");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "3");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no4:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "4");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "4");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no5:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "5");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "5");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no6:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "6");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "6");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no7:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "7");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "7");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no8:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "8");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "8");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.no9:
                if (edit1.isFocused()) {
                    edit1.setText(edit1.getText().toString() + "9");
                } else if (edit2.isFocused()) {
                    edit2.setText(edit2.getText().toString() + "9");
                } else {
                    Toast.makeText(getApplicationContext(), "어느창에 입력할지 클릭해주세요", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
