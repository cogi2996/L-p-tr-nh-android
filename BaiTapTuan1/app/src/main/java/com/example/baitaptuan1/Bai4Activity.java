package com.example.baitaptuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

public class Bai4Activity extends AppCompatActivity {
    private EditText elementCountEditText;
    private TextView resultTextView;
    private Button generateButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai4);
        elementCountEditText = findViewById(R.id.elementCountEditText);
        resultTextView = findViewById(R.id.resultTextView);
        generateButton = findViewById(R.id.generateButton);
        generateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                generateAndDisplayNumbers();

            }
        });

    }

    private void generateAndDisplayNumbers() {
        // Lấy số phần tử từ EditText
        String elementCountString = elementCountEditText.getText().toString();
        int elementCount = Integer.parseInt(elementCountString);

        // Sinh ngẫu nhiên mảng và hiển thị
        ArrayList<Integer> randomNumbers = generateRandomNumbers(elementCount);
        displayNumbers(randomNumbers);

        // Hiển thị thông báo toast về số chính phương
        displaySquareNumbersToast(randomNumbers);
    }

    private ArrayList<Integer> generateRandomNumbers(int count) {
        // Sinh ngẫu nhiên mảng
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            numbers.add(random.nextInt(100)); // Số ngẫu nhiên từ 0 đến 99
        }

        return numbers;
    }

    private void displayNumbers(ArrayList<Integer> numbers) {
        // Hiển thị mảng trong TextView
        resultTextView.setText(numbers.toString());
    }

    private void displaySquareNumbersToast(ArrayList<Integer> numbers) {
        // Hiển thị thông báo toast về số chính phương
        StringBuilder squareNumbersMessage = new StringBuilder("Số chính phương: ");
        for (Integer number : numbers) {
            if (isSquareNumber(number)) {
                squareNumbersMessage.append(number).append(", ");
            }
        }

        // Loại bỏ dấu phảy cuối cùng
        if (squareNumbersMessage.length() > 0) {
            squareNumbersMessage.delete(squareNumbersMessage.length() - 2, squareNumbersMessage.length());
        }

        // Hiển thị thông báo toast
        Toast.makeText(this, squareNumbersMessage.toString(), Toast.LENGTH_SHORT).show();
    }

    private boolean isSquareNumber(int number) {
        // Kiểm tra xem một số có phải số chính phương không
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }


}