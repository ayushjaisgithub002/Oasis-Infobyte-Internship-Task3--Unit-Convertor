package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Mmtom extends AppCompatActivity {

    EditText e1;
    TextView t1,t2,t3;
    ImageView i1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmtom);
        e1=findViewById(R.id.e5);
        t1=findViewById(R.id.t9);
        t2=findViewById(R.id.t10);
        t3=findViewById(R.id.tr5);
        i1=findViewById(R.id.back2);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                Double i=Double.parseDouble(s);
                i=i*0.001;
                String s1=i.toString();
                t3.setText(s1+"m");
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Mmtom.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }

}