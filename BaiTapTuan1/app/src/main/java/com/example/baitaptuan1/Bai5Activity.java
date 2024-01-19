package com.example.baitaptuan1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bai5Activity extends AppCompatActivity {
    TextView txtSoN;
    Button btnRnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai5);

        // Initialize views after setContentView
        txtSoN = findViewById(R.id.textViewSo);
        btnRnd = findViewById(R.id.buttonRnd);

        btnRnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Assuming you have imported java.util.Random
                java.util.Random random = new java.util.Random();
                int number = random.nextInt(10);
                txtSoN.setText(String.valueOf(number));
            }
        });
    }
}
