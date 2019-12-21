package com.example.testmodel;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView txt1 = findViewById(R.id.txt1);
//        txt1.setText("VER:" + Build.VERSION.BASE_OS);

        TextView txt2 = findViewById(R.id.txt2);
        txt2.setText("SDK:" + Build.VERSION.SDK_INT);

        TextView txt3 = findViewById(R.id.txt3);
        txt3.setText("CODENAME:" + Build.VERSION.CODENAME);

        TextView txt4 = findViewById(R.id.txt4);
        txt4.setText("INCREMENTAL:" + Build.VERSION.INCREMENTAL);

        TextView txt5 = findViewById(R.id.txt5);
        txt5.setText("RELEASE:" + Build.VERSION.RELEASE);

        TextView txt6 = findViewById(R.id.txt6);
        txt6.setText("DISPLAY:" + Build.DISPLAY);

        TextView txt7 = findViewById(R.id.txt7);
        txt7.setText("TYPE:" + Build.TYPE);

        TextView txt8 = findViewById(R.id.txt8);
        txt8.setText("TAGS:" + Build.TAGS);


        TextView txt9 = findViewById(R.id.txt9);
        txt9.setText("MODEL:" + Build.MODEL);

        TextView txt10 = findViewById(R.id.txt10);
        txt10.setText("DEVICE:" + Build.DEVICE);

        TextView txt11 = findViewById(R.id.txt11);
        txt11.setText("MANUFACTURER:" + Build.MANUFACTURER);

        TextView txt12 = findViewById(R.id.txt12);
        txt12.setText("PRODUCT:" + Build.PRODUCT);

        Button exit = findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }
}
