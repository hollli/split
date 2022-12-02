package com.example.bipartition;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText mText;
    TextView next_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = (Button) findViewById(R.id.button);
        mText = findViewById(R.id.editText2);
        String myLine = String.valueOf(mText.getText());
        int size = myLine.length();
        int help = size/2;
        mButton.setOnClickListener( new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                next_text.setText(myLine.substring(1,help) +" "+ myLine.substring(size));
            }
        });
    }
}