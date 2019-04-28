package com.example.lhx.recovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.view.View;

public class lookorder extends AppCompatActivity {
    private Button btn_finished;//显示已完成订单按钮
    private Button btn_unfinished;//显示未完成订单按钮
    private Button btn_creat;//创建订单
//两个按钮功能尚未实现
    private Button back_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_look_order);//查看订单界面
        //返回首页
        back_btn = (Button) findViewById(R.id.img_2);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btn_finished = (Button) findViewById(R.id.finished);
        btn_finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示已完成订单
            }
        });
        btn_unfinished = (Button) findViewById(R.id.unfinished);
        btn_unfinished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //显示未完成订单
            }
        });
        btn_creat = (Button) findViewById(R.id.creatorder);
        btn_creat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(lookorder.this, bookingorder.class);
                startActivity(intent);
            }
        });
    }
}
