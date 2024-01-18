package com.example.tuan01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtNoiDung1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtNoiDung1 = (TextView) findViewById(R.id.textView);
        txtNoiDung1.setText("Đặng Công Tuấn");
        txtNoiDung1.setTextColor(getResources().getColor(R.color.red));


    }
}