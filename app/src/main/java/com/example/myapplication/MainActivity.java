package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //用户名,密码,按钮
    private EditText etUsername;
    private EditText etPassword;
    private Button btLogin;

    //获取用户名、密码的值
    //当登录按钮点击时，处理登录的逻辑
    //根据登录成功与否给出提示信息
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //用户名,密码,按钮
        etUsername = findViewById(R.id.ev_userName);
        etPassword = findViewById(R.id.ev_password);
        btLogin = findViewById(R.id.btn_login);

        //点击事件
        btLogin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // 处理按钮的点击事件
                // 获取用户名和密码的值
                String username = etUsername.getText().toString().trim();
                String password = etPassword.getText().toString();
                // 比较用户名和密码是否正确，然后给出提示
                if (username.equals("1")&&password.equals("1")){
                    Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(MainActivity.this,LoginActivity.class);
                    intent.putExtra("username", username);
                    startActivity(intent);
                    welcome();

                }else {
                    Toast.makeText(MainActivity.this,"用户名或者密码不正确",Toast.LENGTH_LONG).show();;
                }

            }
        } );




    }

    private void welcome() {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        String text = etUsername.getText().toString();
        Bundle bundle = new Bundle();
        bundle.putString("qua",text);
        intent.putExtras(bundle);
        startActivityForResult(intent,100);

    }
}