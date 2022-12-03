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
        Button mButton = (Button) findViewById(R.id.button);
        mText = findViewById(R.id.editText2);
        next_text = findViewById(R.id.next_string);

        mButton.setOnClickListener(v -> {
//        String.valueOf(mText.getText())
            String myLine = mText.getText().toString();

            int size = myLine.length();
            int help = size/2+1;
            String finalMyLine = myLine;
            String result = finalMyLine.substring(0,help) +"\n༼ つ ◕_◕ ༽つ\n"+ finalMyLine.substring(help,size);

            next_text.setText(result);
//                myLine.substring(1,help) +" "+ myLine.substring(size)
        });
    }
}