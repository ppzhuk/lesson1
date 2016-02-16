package com.csc.lesson1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String url =
                "https://compscicenter.ru/media/cache/04/af/04af00c38359378a149700f9f9786f27.jpg";
        ImageView photo = (ImageView)findViewById(R.id.photo);

        // Picasso library atomatically caches loaded image.
        // So image isn't downloaded again after orientational changes, but used from cache.
        Picasso.with(this)
                .load(url)
                .into(photo);
    }
}
