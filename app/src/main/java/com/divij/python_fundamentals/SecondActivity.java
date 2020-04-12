package com.divij.python_fundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView mHeading;
    TextView mDetails;
    String data1,data2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mHeading=findViewById(R.id.heading);
        mDetails=findViewById(R.id.Details);
        getData();
        setData();
    }
    private void getData(){
        data1=getIntent().getStringExtra("data1");
        data2=getIntent().getStringExtra("data2");

    }
    private void setData(){
        mHeading.setText(data1);
        mDetails.setText(data2);

    }
}
