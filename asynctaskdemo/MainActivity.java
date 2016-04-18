package com.vinod.asynctaskdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView statusTextView;
    Button downloadButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        statusTextView=(TextView)findViewById(R.id.textView);
        downloadButton=(Button)findViewById(R.id.buttonDownload);

        downloadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NetworkJob nj=new NetworkJob(statusTextView);
                nj.execute();
            }
        });


    }
}
