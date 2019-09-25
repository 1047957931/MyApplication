package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class list extends AppCompatActivity {
    private String[] data = { "Android应用程序开发", "移动应用程序测试", "高等数学", "高职英语",
            "Java程序设计语言", "Android游戏开发", "心理健康","体育"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                list.this, android.R.layout.simple_list_item_1, data);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }



}
