package com.example.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void clo(View view) {
        Intent i = new Intent(this,MainActivity11.class);
        i.putExtra("user",((TextView)findViewById(R.id.user)).getText().toString());
        i.putExtra("peer",((TextView)findViewById(R.id.peer)).getText().toString());
        startActivity(i);
    }
}
