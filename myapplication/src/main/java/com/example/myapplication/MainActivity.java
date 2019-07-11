package com.example.myapplication;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

import me.everything.webp.WebPDecoder;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView imageView = findViewById(R.id.image);
        InputStream is = null;
        try {
            is = getAssets().open("frame3.webp");
            byte[] fileBytes=new byte[is.available()];
            is.read( fileBytes);
            is.close();
            Bitmap bitmap = WebPDecoder.getInstance().decodeWebP(fileBytes);
            imageView.setImageBitmap(bitmap);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
