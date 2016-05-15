package com.vinod.movieratingsdemo;

import android.app.Fragment;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class AboutFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return inflater.inflate(R.layout.fragment_layout,container,true);//to add the fragment statically by adding fragment in main ativity
        return inflater.inflate(R.layout.activity_about_fragment,container,false);//to add the fragment dynamically by adding fragment in main ativity

    }


}
