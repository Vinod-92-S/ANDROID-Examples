package com.vinod.movieratingsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.squareup.picasso.Picasso;

import java.util.List;

import cz.msebera.android.httpclient.Header;

public class MovieDetails extends AppCompatActivity {

    String url = "api.rottentomatoes.com/api/public/v1.0/lists/movies/box_office.json?apikey=9htuhtcb4ymusd73d4z6jxcj";
    String titl,cs,as,cas,sy,img;
    TextView title,synopsis,cast,audienceScore,criticsScore;
    ImageView largePoster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);

        title=(TextView)findViewById(R.id.tvTitle);
        criticsScore =(TextView)findViewById(R.id.tvCriticsScore);
        audienceScore =(TextView)findViewById(R.id.tvAudienceScore);
        cast =(TextView)findViewById(R.id.tvCast);
        synopsis =(TextView)findViewById(R.id.tvSynopsis);
        largePoster = (ImageView)findViewById(R.id.ivPosterImage);

        titl=getIntent().getStringExtra("title");
        title.setText(titl);
        cs= String.valueOf(getIntent().getIntExtra("cs",0));
        criticsScore.setText(criticsScore.getText().toString()+cs+"%");

        as= String.valueOf(getIntent().getIntExtra("as",0));
        audienceScore.setText(audienceScore.getText().toString()+as+"%");
        sy=getIntent().getStringExtra("sy");
        synopsis.setText(synopsis.getText().toString()+ sy);
        cas=getIntent().getStringExtra("cast");
        cast.setText(cast.getText().toString()+" "+cas);
        img=getIntent().getStringExtra("img");
        Picasso.with(MovieDetails.this).load(img).into(largePoster);

    }
}
