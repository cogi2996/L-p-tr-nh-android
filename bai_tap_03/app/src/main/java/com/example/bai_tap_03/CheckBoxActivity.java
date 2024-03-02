package com.example.bai_tap_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class CheckBoxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_box);
        CheckBox ck1 = (CheckBox) findViewById(R.id.checkBox);
        ConstraintLayout bg = (ConstraintLayout) findViewById(R.id.constraintLayout1); // Ánh xạ bg từ layout XML
        ck1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    bg.setBackgroundResource(R.drawable.bg3);
                } else {
                    bg.setBackgroundResource(R.drawable.bg4);
                }
            }
        });

    }
}