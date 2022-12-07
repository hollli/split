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
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button mButton = findViewById(R.id.button);
        mText = findViewById(R.id.editText2);
        next_text = findViewById(R.id.next_string);

        mButton.setOnClickListener(v -> {
            String myLine = mText.getText().toString();
            int size = myLine.length();
            int halfSize = size/2+1;
            String result = myLine.substring(0,halfSize) +"\n༼ つ ◕_◕ ༽つ\n"+ myLine.substring(halfSize,size);
            next_text.setText(result);
        });
    }
}