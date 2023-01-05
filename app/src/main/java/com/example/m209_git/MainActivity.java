package com.example.m209_git;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn= findViewById (R.id.button3);
        btn.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager ().beginTransaction ().replace (R.id.fn,new MapsFragment()).commit ();
            }
        });
    }
}