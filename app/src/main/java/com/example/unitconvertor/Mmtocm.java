package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Mmtocm extends AppCompatActivity {

    EditText e1;
    TextView t1,t2,t3;
    ImageView i1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mmtocm);
        e1=findViewById(R.id.e4);
        t1=findViewById(R.id.t7);
        i1=findViewById(R.id.back4);
        t2=findViewById(R.id.t8);
        t3=findViewById(R.id.tr4);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=e1.getText().toString();
                Double i=Double.parseDouble(s);
                i=i*0.1;
                String s1=i.toString();
                t3.setText(s1+"cm");
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Mmtocm.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}