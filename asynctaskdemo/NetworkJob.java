package com.vinod.asynctaskdemo;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by VINOD on 16-04-2016.
 */
public class NetworkJob extends AsyncTask {

    TextView statusTextView;
    String url="https://www.google.co.in";
    String response;

    NetworkJob(TextView statusTextView)
    {
        this.statusTextView=statusTextView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        statusTextView.setText("Download Started...");
    }

    @Override
    protected Object doInBackground(Object[] objects) {
        try {
            URL connectionUrl=new URL(url);
            HttpURLConnection connection= (HttpURLConnection)connectionUrl.openConnection();
            InputStream inputStream= connection.getInputStream();
            InputStreamReader inputStreamReader=new InputStreamReader(inputStream);
            BufferedReader bufferedReader=new BufferedReader(inputStreamReader);

            StringBuffer stringBuffer=new StringBuffer();
            String line="";

            while((line=bufferedReader.readLine())!=null)
            {
                stringBuffer.append(line+"/n"+"/r");
            }
            response=stringBuffer.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /*for(int i=0;i<=100;i++)
        {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            publishProgress(i);
            Log.d("DEBUG","value of i:"+i);
        }*/
        return null;
    }

    @Override
    protected void onProgressUpdate(Object[] values) {
        super.onProgressUpdate(values);
        //statusTextView.setText(values[0].toString()+"%");
    }

    @Override
    protected void onPostExecute(Object o) {
        super.onPostExecute(o);
        //statusTextView.setText("Download Completed...");
        statusTextView.setText(response);
    }
}
