package com.example.bai_tap_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class ImageButtonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_button);
        ImageButton img2 = (ImageButton) findViewById(R.id.imageButton1);
        ImageView img1 = (ImageView) findViewById(R.id.imageView1);
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img1.setImageResource(R.drawable.dart);
                img1.getLayoutParams().width=550;
                img1.getLayoutParams().height=550;
            }
        });
    }
}