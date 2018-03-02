package com.example.rodrigo.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import static android.provider.AlarmClock.EXTRA_MESSAGE;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        Intent intent = getIntent();
        String message = intent.getStringExtra(Screen1.EXTRA_MESSAGE);

        TextView textView = (TextView) findViewById(R.id.tv);
        textView.setText(message);
    }
}
