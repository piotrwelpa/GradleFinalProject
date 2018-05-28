package com.example.showjoke;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShowJokeActivity extends AppCompatActivity {

    public static final String JOKE = "com.example.showjoke.joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_joke);
        TextView textView = (TextView) findViewById(R.id.textView);
        if (getIntent().hasExtra(JOKE)){
            textView.setText(getIntent().getStringExtra(JOKE));
        }

    }
}
