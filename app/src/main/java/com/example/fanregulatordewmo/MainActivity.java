package com.example.fanregulatordewmo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1;
    Button button2;
    TextView textView;
    int number = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);

    }

    public void button1(View view) {
        if(number<5) {
            number++;
            textView.setText(String.valueOf(number));
            String str = textView.getText().toString();
        }
    }

    public void button2(View view) {
        if (number>0 && number<=5) {
            number--;
            textView.setText(String.valueOf(number));
        }
    }
}