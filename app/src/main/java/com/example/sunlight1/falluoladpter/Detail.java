package com.example.sunlight1.falluoladpter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Detail extends AppCompatActivity {
    TextView txt,txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        txt=(TextView)findViewById(R.id.textView);
        txt1=(TextView)findViewById(R.id.textView2);


    }
}

