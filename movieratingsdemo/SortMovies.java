package com.vinod.movieratingsdemo;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.io.Serializable;
import java.util.List;

public class SortMovies extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton sortType,cg70,cg80,cg90,ag70,ag80,ag90;
    Button sort;
    int j=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort_movies);


        sort=(Button)findViewById(R.id.buttonSort);
        radioGroup=(RadioGroup)findViewById(R.id.radioGroup);
        cg70=(RadioButton)findViewById(R.id.radioButton1);
        cg80=(RadioButton)findViewById(R.id.radioButton2);
        cg90=(RadioButton)findViewById(R.id.radioButton3);
        ag70=(RadioButton)findViewById(R.id.radioButton4);
        ag80=(RadioButton)findViewById(R.id.radioButton5);
        ag90=(RadioButton)findViewById(R.id.radioButton6);
        sortType= (RadioButton) findViewById(radioGroup.getCheckedRadioButtonId());
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i)
            {
                if(i==0)
                    Toast.makeText(SortMovies.this,"OPtion 1 selected",Toast.LENGTH_SHORT).show();
            }
        });

        sort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(SortMovies.this,MainActivity.class);
                startActivity(intent1);
            }
        });





    }
}
