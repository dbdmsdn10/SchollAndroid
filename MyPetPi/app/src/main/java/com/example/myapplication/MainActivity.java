package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Switch checkBox;
    TextView text1, text2;
    RadioGroup radioGroup1;
    RadioButton bdog, bcat, brabbit;
    Button end,reset;
    ImageView imageView;
    LinearLayout linearLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진 돌보기");
        checkBox = findViewById(R.id.checkagree);
        radioGroup1 = findViewById(R.id.radiogroup);
//        text1=(TextView)findViewById(R.id.Text1);
//        text2=(TextView)findViewById(R.id.Text2);
        bdog = findViewById(R.id.bdog);
        bcat = findViewById(R.id.bcat);
        brabbit = findViewById(R.id.brabbit);
        imageView = findViewById(R.id.imageView);
        linearLayout = findViewById(R.id.linear);
        end=findViewById(R.id.end);
        reset=findViewById(R.id.reset);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (checkBox.isChecked()) {
                    linearLayout.setVisibility(View.VISIBLE);
                    imageView.setImageResource(0);
                } else {
                    linearLayout.setVisibility(View.INVISIBLE);
                    imageView.setImageResource(0);
                }
            }
        });
        radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (radioGroup1.getCheckedRadioButtonId()) {
                    case R.id.bdog:
                        imageView.setImageResource(R.drawable.dog);
                        break;
                    case R.id.bcat:
                        imageView.setImageResource(R.drawable.cat);
                        break;
                    case R.id.brabbit:
                        imageView.setImageResource(R.drawable.rabbit);
                        break;
                }
            }
        });

        end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bdog.setChecked(false);
                bcat.setChecked(false);
                brabbit.setChecked(false);
                checkBox.setChecked(false);
                linearLayout.setVisibility(View.INVISIBLE);
                imageView.setImageResource(0);
            }
        });
    }
}
