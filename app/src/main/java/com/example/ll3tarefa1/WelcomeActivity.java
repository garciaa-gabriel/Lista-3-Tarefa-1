package com.example.ll3tarefa1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {
    private TextView tt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        getSupportActionBar().setTitle("Home");

        tt = (TextView) findViewById(R.id.txt1);

        Bundle args = getIntent().getExtras();
        String user = args.getString("user");

        tt.setText("Seja bem-vindo " + user);
    }
}