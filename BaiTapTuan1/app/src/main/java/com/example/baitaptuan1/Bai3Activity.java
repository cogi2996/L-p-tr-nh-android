package com.example.baitaptuan1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class Bai3Activity extends AppCompatActivity {
    ArrayList<Integer> numbers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);

        // Thêm các số vào ArrayList từ EditText
        EditText editTextNumbers = findViewById(R.id.editTextName);
        Button btnRnd = findViewById(R.id.button);
        btnRnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editTextNumbers.getText().toString();
                String[] numbersArray = input.split(",");
                for (String numStr : numbersArray) {
                    try {
                        int num = Integer.parseInt(numStr.trim());
                        numbers.add(num);
                    } catch (NumberFormatException e) {
                        // Handle invalid input if needed
                        Log.e("PrimeNumbers", "Invalid input: " + numStr);
                    }
                }

                // Gọi phương thức in ra Log các số nguyên tố
                printPrimeNumbers(numbers);
            }
        });

    }


    private void printPrimeNumbers(ArrayList<Integer> numbers) {
        for (Integer number : numbers) {
            if (isPrime(number)) {
                // Nếu số là số nguyên tố, in ra Log
                Log.d("PrimeNumbers", number + " là số nguyên tố");
            }
        }
    }

    private boolean isPrime(int number) {
        // Kiểm tra xem một số có phải là số nguyên tố không
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Nếu có thể chia hết cho một số nào đó, không phải số nguyên tố
            }
        }

        return true; // Nếu không thể chia hết cho bất kỳ số nào, đó là số nguyên tố
    }
}
