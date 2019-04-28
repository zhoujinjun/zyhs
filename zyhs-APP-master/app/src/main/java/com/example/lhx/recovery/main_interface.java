package com.example.lhx.recovery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class main_interface extends AppCompatActivity {

    private Button t_btn;//测试按钮
    private Button book_btn;//预约按钮
    private Button main_btn;//首页按钮
    private Button orderbelow_btn;//底部订单按钮
    private Button price_btn;//价格按钮
    private Button personal_btn;//个人中心按钮


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_interface);

        //测试按钮点击事件
        t_btn = (Button)findViewById(R.id.testbtn);
        t_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this,person_Activity.class);
                startActivity(intent);
            }
        });
        //上面的预约订单按钮点击事件
        book_btn=(Button)findViewById(R.id.yyan);
        book_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this,bookingorder.class);
                startActivity(intent);
            }
        });
        //显示首页
        main_btn=(Button)findViewById(R.id.mainbtn);
        main_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this,main_interface.class);
                startActivity(intent);
            }
        });
        //底部订单显示订单界面
        orderbelow_btn=(Button)findViewById(R.id.orderbtn);
        orderbelow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this,lookorder.class);
                startActivity(intent);
            }
        });
        //显示价格界面
        price_btn=(Button)findViewById(R.id.pricebtn);
        price_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this,showprice.class);
                startActivity(intent);
            }
        });

        //显示个人中心界面
        personal_btn=(Button)findViewById(R.id.personalbtn);
        personal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(main_interface.this,person_Activity.class);
                startActivity(intent);
            }
        });







    }
}
