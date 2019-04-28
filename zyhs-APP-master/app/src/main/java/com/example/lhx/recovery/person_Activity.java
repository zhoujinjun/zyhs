package com.example.lhx.recovery;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class person_Activity extends AppCompatActivity {
    private Button address_btn;//地址管理按钮
    private Button back_btn;//返回按钮
    private Button exit_btn;//退出登陆按钮
    private Button change_btn;//切换账户按钮
    private Button yue_btn;//查看余额详情
    private Button edit_btn;//修改个人信息


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_);
        address_btn =(Button) findViewById(R.id.addressman);
        address_btn = (Button) findViewById(R.id.addressman);
        address_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(person_Activity.this, addressmanage.class);
                //显示地址管理界面
                startActivity(intent);

            }
        });


        //返回首页
        back_btn = (Button) findViewById(R.id.img_2);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //Intent intent = new Intent(person_Activity.this, main_interface.class);
                //startActivity(intent);
            }
        });

        //退出登陆，返回登陆界面
        exit_btn = (Button) findViewById(R.id.exitlog);
        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(person_Activity.this, LoadActivity.class);
                startActivity(intent);
            }
        });

        //切换账户，返回登陆界面
        change_btn = (Button) findViewById(R.id.changeaccount);
        change_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(person_Activity.this, LoadActivity.class);
                startActivity(intent);
            }
        });

        //查看余额详情
        yue_btn = (Button) findViewById(R.id.see);
        yue_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(person_Activity.this, seeyue.class);
                startActivity(intent);
            }
        });

        //修改账户信息
        edit_btn = (Button) findViewById(R.id.editaccount);
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(person_Activity.this, changeaccount.class);
                startActivity(intent);
            }
        });
    }





}
