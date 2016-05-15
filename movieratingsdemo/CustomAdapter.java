package com.vinod.movieratingsdemo;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VINOD on 06-05-2016.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    String [] names;
    String str;
    LayoutInflater inflater;
    List<MoviesList.Movies> movies;


    CustomAdapter(Context context,List<MoviesList.Movies> movies)
    {
        this.context = context;
        this.movies = movies;

        inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View view =  inflater.inflate(R.layout.movies_row,null);
        holder.title =(TextView) view.findViewById(R.id.tvTitle);
        holder.ratings =(TextView) view.findViewById(R.id.tvCriticsScore);
        holder.releaseDate =(TextView) view.findViewById(R.id.tvReleaseDate);
        holder.poster = (ImageView) view.findViewById(R.id.ivPosterImage);
        holder.cast=(TextView)view.findViewById(R.id.tvCast);

        holder.title.setText(movies.get(position).getTitle());
        holder.ratings.setText("Critics Score: "+movies.get(position).getRatings().getCritics_score()+"%");
        holder.releaseDate.setText("Release Year: "+movies.get(position).getYear());

        names=new String[movies.get(position).getAbridged_cast().size()];
        for (int i=0;i<movies.get(position).getAbridged_cast().size();i++)
            names[i]=movies.get(position).getAbridged_cast().get(i).getName();

        holder.cast.setText("Cast: "+names[0]);
        for(int i=1;i<names.length;i++)
        {    str=holder.cast.getText().toString();
            holder.cast.setText(str+","+names[i]);}

        Picasso.with(context).load(movies.get(position).getPosters().getProfile()).into(holder.poster);

//        view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v)
//            {
//                Intent intent1=new Intent();
//                Intent intent = new Intent(context,MovieDetails.class);
//                context.startActivity(intent);
//            }
//        });
        return view;
    }

    class Holder
    {
        TextView title,ratings,releaseDate,cast;
        ImageView poster;
    }
}
