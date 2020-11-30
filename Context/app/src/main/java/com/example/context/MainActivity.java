package com.example.context;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout baseLayout;
    Button one, two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        baseLayout=findViewById(R.id.baselayout);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        registerForContextMenu(one);
        registerForContextMenu(two);

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater=getMenuInflater();
        if(v==one){
            menu.setHeaderTitle("배경색 변경");
            menuInflater.inflate(R.menu.menu1,menu);
        }
        else if(v==two){
            menu.setHeaderTitle("버튼 변경");
            menuInflater.inflate(R.menu.menu2,menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.red:
                baseLayout.setBackgroundColor((Color.RED));
                return true;
            case R.id.blue:
                baseLayout.setBackgroundColor((Color.GREEN));
                return true;
            case R.id.yellow:
                baseLayout.setBackgroundColor((Color.YELLOW));
                return true;
            case R.id.rotation:
                one.setRotation(45);
                return true;
            case R.id.zoom:
                two.setScaleX(2);
                return true;
        }
        return false;
    }

}