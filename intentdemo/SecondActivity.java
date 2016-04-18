package com.vinod.intentdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;


public class SecondActivity extends Activity {

    EditText inputedittext;
    Button sendbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        sendbutton = (Button) findViewById(R.id.buttonsendmsg);
        inputedittext = (EditText) findViewById(R.id.editTextinput);

        sendbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0)
            {
                String s1 = inputedittext.getText().toString();
                Intent intent = new Intent();
                intent.putExtra("Key1",s1);
                setResult(RESULT_OK, intent);
                finish();
            }
        });
    }
}
