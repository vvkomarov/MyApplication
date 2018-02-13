package com.example.admin.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mHelloTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHelloTextView = (TextView) findViewById(R.id.textView);
    }

    public void OnClick(View view) {
        mHelloTextView.setText("shake dat white ass");
        mHelloTextView.setText("let's trash this place");
    }
}