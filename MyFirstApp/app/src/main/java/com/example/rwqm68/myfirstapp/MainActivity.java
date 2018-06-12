package com.example.rwqm68.myfirstapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // getting the edit text by using its resource id
                EditText firstNumEditText = findViewById(R.id.firstNumEditText);
                // getting the edit text by using its resource id
                EditText secondNumEditText =findViewById(R.id.secondNumEditText);
                // getting the result text by using its resource id
                TextView resultTextView = findViewById(R.id.resultTextView);

                // getting the value from the edit text which is string and converting to int
                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;

                resultTextView.setText(result + "");
            }
        });
    }
}
