package com.vhly.portfolio.app;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View btn = findViewById(R.id.btn_1);

        if (btn != null) {
            btn.setOnClickListener(this);
        }

        btn = findViewById(R.id.btn_2);

        if (btn != null) {
            btn.setOnClickListener(this);
        }
        btn = findViewById(R.id.btn_3);

        if (btn != null) {
            btn.setOnClickListener(this);
        }
        btn = findViewById(R.id.btn_4);

        if (btn != null) {
            btn.setOnClickListener(this);
        }
        btn = findViewById(R.id.btn_5);

        if (btn != null) {
            btn.setOnClickListener(this);
        }
        btn = findViewById(R.id.btn_6);

        if (btn != null) {
            btn.setOnClickListener(this);
        }

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        String appName = "";

        switch (id){

            case R.id.btn_1:
                appName = "SPOTIFY STREAMER";
                break;

            case R.id.btn_2:
                appName = "SCORES APP";
                break;

            case R.id.btn_3:
                appName = "LIBRARY APP";
                break;

            case R.id.btn_4:
                appName = "BUILD IT BIGGER";
                break;

            case R.id.btn_5:
                appName = "XYZ READER";
                break;

            case R.id.btn_6:
                appName = "CAPSTONE";
                break;

        }

        Toast.makeText(this, "This button will launch my " + appName + " app", Toast.LENGTH_SHORT).show();
    }
}
