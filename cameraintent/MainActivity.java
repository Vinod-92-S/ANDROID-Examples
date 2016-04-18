package com.vinod.cameraintent;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.DrawableRes;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends Activity {

    Button camera;
    ImageView opimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opimg=(ImageView)findViewById(R.id.outputImageView);
        camera= (Button) findViewById(R.id.camerabutton);
        camera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,1);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==RESULT_OK)
        {
            Bitmap bitmap= (Bitmap) data.getExtras().get("data");
            opimg.setImageBitmap(bitmap);

        }
        else
        {
            opimg.setVisibility(View.INVISIBLE);
            Toast.makeText(MainActivity.this,"Camera Error",Toast.LENGTH_SHORT).show();
        }
    }
}
