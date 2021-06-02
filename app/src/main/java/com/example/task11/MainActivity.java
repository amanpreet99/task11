package com.example.task11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2;
    TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = findViewById(R.id.t1);
        e2 = findViewById(R.id.editText);
        t = findViewById(R.id.re);


    }
    public void add(View view){
        Log.i("Mainactivity","Executed 1");
        int a1 = Integer.parseInt(e1.getText().toString());
        Log.i("Mainactivity","Executed 2");
        int a2 = Integer.parseInt(e2.getText().toString());
        Log.i("Mainactivity","Executed 3");
        int res = a1 + a2;
        Log.i("Mainactivity","Executed 4");
        t.setText(""+res);
        Log.i("Mainactivity","Executed 5");
    }
}