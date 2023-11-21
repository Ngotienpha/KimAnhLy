package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;
    Button next, previous;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = findViewById(R.id.viewFlipper);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);
        next.setOnClickListener(this);
        previous.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view == next){
            viewFlipper.showNext();
        } else if (view == previous) {
            viewFlipper.showPrevious();
        }
    }
}