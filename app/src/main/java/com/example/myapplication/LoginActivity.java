package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnCreateContextMenuListener {
    private TextView tv_welcome;
    private ImageView btn_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        tv_welcome = findViewById(R.id.welcome);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            String name = bundle.getString("qua");
            tv_welcome.setText(name + "同学，欢迎来到您的空间！");

//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_login);

            btn_login = findViewById(R.id.img1);

            btn_login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(LoginActivity.this, list.class);
                    startActivity(intent);
                }
            });

        }


    }
}