package com.example.a1203week4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1 = (TextView) findViewById(R.id.TextView1);
        TextView t2 = (TextView) findViewById(R.id.TextView2);
        TextView t3 = (TextView) findViewById(R.id.TextView3);
        TextView t4 = (TextView) findViewById(R.id.TextView4);
        TextView t5 = (TextView) findViewById(R.id.TextView5);
        TextView t6 = (TextView) findViewById(R.id.TextView6);
        EditText e1 = (EditText) findViewById(R.id.EditText1);
        EditText e2 = (EditText) findViewById(R.id.EditText2);
        EditText e3 = (EditText) findViewById(R.id.EditText3);
        EditText e4 = (EditText) findViewById(R.id.EditText4);
        EditText e5 = (EditText) findViewById(R.id.EditText5);
        EditText e6 = (EditText) findViewById(R.id.EditText6);
        EditText e7 = (EditText) findViewById(R.id.EditText7);
        Button b1 = (Button) findViewById(R.id.b1);
        Button b2 = (Button) findViewById(R.id.b2);
         //DATA BASE CREATION

        db=openOrCreateDatabase("StudentDB", Context.MODE_PRIVATE,null);
        db.execSQL("CREATE TABLE IF NOT EXISTS student(name VARCHAR,rollno VARCHAR,marks1 VARCHAR)");
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               e1.getText().toString().trim();
            }
        });



    }
}