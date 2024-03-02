package com.example.bai_tap_03;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;

public class BaiTap2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai_tap2);

        // Ánh xạ Switch và ConstraintLayout chứa hình nền
        Switch switchControl = findViewById(R.id.switch1);
        ConstraintLayout bg = findViewById(R.id.constraintLayout1);

        // Đặt sự kiện lắng nghe cho Switch
        switchControl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // Kiểm tra trạng thái của Switch
                if (isChecked) {
                    // Nếu Switch được bật, đặt hình nền là hình ảnh từ drawable bg3
                    bg.setBackgroundResource(R.drawable.bg3);
                } else {
                    // Nếu Switch được tắt, đặt hình nền là hình ảnh từ drawable bg3
                    bg.setBackgroundResource(R.drawable.bg3);
                }
            }
        });
    }
}
