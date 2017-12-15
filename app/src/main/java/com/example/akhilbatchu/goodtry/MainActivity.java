package com.example.akhilbatchu.goodtry;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4;
    EditText edit1,edit2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button)findViewById(R.id.button2);
        b2 = (Button)findViewById(R.id.button3);
        b3 = (Button)findViewById(R.id.button4);
        b4 = (Button)findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        }
        );

        b2.setOnClickListener(new View.OnClickListener()
                              {

                                  @Override
                                  public void onClick(View view) {
                                      Intent intent = new Intent(MainActivity.this,thirdActivity.class);
                                      startActivity(intent);
                                  }
                              }
        );

        b3.setOnClickListener(new View.OnClickListener()
                              {

                                  @Override
                                  public void onClick(View view) {
                                      Intent intent = new Intent(MainActivity.this,fourthActivity.class);
                                      startActivity(intent);
                                  }
                              }
        );

        b4.setOnClickListener(new View.OnClickListener()
                              {

                                  @Override
                                  public void onClick(View view) {
                                      Intent intent = new Intent(MainActivity.this,fiftActivity.class);
                                      startActivity(intent);
                                  }
                              }
        );








    }
}
