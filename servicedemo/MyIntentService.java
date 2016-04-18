package com.vinod.servicedemo;

import android.app.IntentService;
import android.content.Intent;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;


public class MyIntentService extends IntentService {


    public MyIntentService(String name) {
        super(name);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("Debug:","Service Started");
        Toast.makeText(MyIntentService.this,"Service Started",Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        for(int i=0;i<=10;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Log.d("Debug:",""+i);
        }
        stopSelf();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("Debug:","Service Stoped");
        Toast.makeText(MyIntentService.this,"Service Destroyed",Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onHandleIntent(Intent intent) {

    }
}
