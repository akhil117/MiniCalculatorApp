package com.example.akhilbatchu.goodtry;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    Button sum;
    EditText edit1,edit2;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        sum = (Button)findViewById(R.id.button);
        edit1 = (EditText)findViewById(R.id.editText);
        edit2 = (EditText)findViewById(R.id.editText2);
        sum.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                String value1 = edit1.getText().toString();
                String value2 = edit2.getText().toString();
                long a = Integer.parseInt(value1);
                long b = Integer.parseInt(value2);
                long result = a+b;
                String ans = Long.toString(result);
                Toast.makeText(getApplicationContext(),ans, Toast.LENGTH_LONG).show();

            }
        });
    }
}
