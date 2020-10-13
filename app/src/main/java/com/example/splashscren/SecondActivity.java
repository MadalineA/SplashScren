package com.example.splashscren;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class SecondActivity extends Activity {
       private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
            }
        });



    }


    public void onClick(View view) {
    }
}