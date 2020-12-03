package com.example.demo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignIn extends AppCompatActivity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView Signup = (TextView) findViewById(R.id.create);
        Signup.setOnClickListener(this);
    }
    public void onClick(View view) {
        Intent i;
        i = new Intent(this, Signup.class);
        startActivity(i);
    }
    @Override
    public void onPointerCaptureChanged(boolean hasCapture){

    }
}
