package com.example.project6_1;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    Chronometer chrono;
    Button btnstart,btnend;
    RadioButton rdocal,rdotime;
    CalendarView calview;
    TimePicker tpicker;
    TextView tvyear,tvmonth,tvday,tvhour,tvmin;
    int selectyear,selectmonth,selectday;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("시간 예약 앱");
        //버튼변수 위젯대입
        btnstart=findViewById(R.id.btnstart);
        btnend=findViewById(R.id.btnend);


        chrono=findViewById(R.id.chronometer1);

        rdocal=findViewById(R.id.rdocal);
        rdotime=findViewById(R.id.rdotime);

        tpicker=findViewById(R.id.timepicker);
        calview=findViewById(R.id.calendarview1);

        tvyear=findViewById(R.id.tvyear);
        tvmonth=findViewById(R.id.tvmonth);
        tvday=findViewById(R.id.tvday);
        tvhour=findViewById(R.id.tvhour);
        tvmin=findViewById(R.id.tvmmin);

        tpicker.setVisibility(View.INVISIBLE);
        calview.setVisibility(View.INVISIBLE);

        rdocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calview.setVisibility(View.VISIBLE);
                tpicker.setVisibility(View.INVISIBLE);
            }
        });
        rdotime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calview.setVisibility(View.INVISIBLE);
                tpicker.setVisibility(View.VISIBLE);
            }
        });

        btnstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);
            }
        });

        btnend.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);

                tvyear.setText(selectyear+"");
                tvmonth.setText(selectmonth+"");
                tvday.setText(selectday+"");

                tvhour.setText(tpicker.getHour()+"");
                tvmin.setText(tpicker.getMinute()+"");

            }
        });

        calview.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                selectyear=year;
                selectmonth=month;
                selectday=day;
            }
        });
    }
}
