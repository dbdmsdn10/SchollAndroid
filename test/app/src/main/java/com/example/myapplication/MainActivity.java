package com.example.myapplication;

import android.Manifest;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by 15U560 on 2016-10-25.
 */

public class MainActivity extends AppCompatActivity {

//    private static String CLIENT_ID = "부여받은 Client Id";
//    private static String CLIENT_PASSWORD = "부여받은 pwd";
//    String bookName, bookPrice, bookPubDate, authorName, publisherName;
Intent mainac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainac=getIntent();//main2로 값전달을 위한것
        new IntentIntegrator(MainActivity.this).initiateScan();
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // QR코드/바코드를 스캔한 결과 값을 가져옵니다.
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        // 결과값 출력
        Toast.makeText(this, "출력 ISBN:" + result.getContents(), Toast.LENGTH_SHORT).show();
        mainac=new Intent();
        mainac.putExtra("serial",result.getContents());
        setResult(RESULT_OK,mainac);
        finish();
        super.onActivityResult(requestCode, resultCode, data);

    }
}


