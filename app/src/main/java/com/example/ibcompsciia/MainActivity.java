package com.example.ibcompsciia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toast toast = Toast.makeText(this /* MyActivity */, "Yayyy first code", Toast.LENGTH_SHORT);
        toast.show();
        //Button button = (Button) findViewById(R.)

    }
}