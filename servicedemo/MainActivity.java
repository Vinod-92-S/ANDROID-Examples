package com.vinod.servicedemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;

public class MainActivity extends Activity {

    Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start=(Button)findViewById(R.id.startbutton);
        stop=(Button)findViewById(R.id.stopbutton);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startintent=new Intent(MainActivity.this,MyIntentService.class);
                startService(startintent);

            }
        });

        stop.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent stopintent=new Intent(MainActivity.this,MyIntentService.class);
                stopService(stopintent);

            }
        });
    }
}
