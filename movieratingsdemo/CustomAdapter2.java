package com.vinod.movieratingsdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by VINOD on 06-05-2016.
 */
public class CustomAdapter2 extends BaseAdapter {

    Context context;
    //String[] names;
    LayoutInflater inflater;
    List<MoviesList.Movies> movieDetails;

    CustomAdapter2(Context context,List<MoviesList.Movies> movieDetails)
    {
        this.context = context;
        this.movieDetails = movieDetails;

        inflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }
    @Override
    public int getCount() {
        return movieDetails.size();
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
        View view =  inflater.inflate(R.layout.activity_movie_details,null);
        holder.title =(TextView) view.findViewById(R.id.tvTitle);
        holder.criticsScore =(TextView) view.findViewById(R.id.tvCriticsScore);
        holder.audienceScore =(TextView) view.findViewById(R.id.tvAudienceScore);
        holder.cast =(TextView) view.findViewById(R.id.tvCast);
        holder.synopsis =(TextView) view.findViewById(R.id.tvSynopsis);
        //holder.criticsConsensus =(TextView) view.findViewById(R.id.tvCriticsConsensus);


        holder.largePoster = (ImageView) view.findViewById(R.id.ivPosterImage);

        holder.title.setText(movieDetails.get(position).getTitle());
        holder.criticsScore.setText("<b>Critics Score:</b> "+movieDetails.get(position).getRatings().getCritics_score()+"%");
        holder.audienceScore.setText("<b>AudienceScore:</b> "+movieDetails.get(position).getRatings().getAudience_score()+"%");
        holder.cast.setText("<b>Cast:</b> "+movieDetails.get(position).getAbridged_cast());
        holder.criticsConsensus.setText("<b>Critics Consensus:</b> "+movieDetails.get(position).getCritics_consensus());
        holder.synopsis.setText("<b>Synopsis</b> "+movieDetails.get(position).getSynopsis());

        Picasso.with(context).load(movieDetails.get(position).getPosters().getDetailed()).into(holder.largePoster);

        return view;
    }

    class Holder
    {
        TextView title,criticsConsensus,criticsScore,audienceScore,cast,synopsis;
        ImageView largePoster;
    }
}
