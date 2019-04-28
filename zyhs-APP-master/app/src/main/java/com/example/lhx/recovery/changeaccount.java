package com.example.lhx.recovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class changeaccount extends AppCompatActivity {
    private Button back_btn;//返回按钮
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changeaccount);//显示账户信息修改界面
        //返回个人中心界面
        back_btn= (Button)findViewById(R.id.img_2);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //Intent intent = new Intent(changeaccount.this,person_Activity.class);
                //startActivity(intent);
            }
        });


    }


}
