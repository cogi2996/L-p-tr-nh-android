package com.example.bai_tap_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ImageViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view_acitivity);
        ImageView img1 = (ImageView) findViewById(R.id.imageView1);
        img1.setImageResource(R.drawable.kotlin);

    }
}