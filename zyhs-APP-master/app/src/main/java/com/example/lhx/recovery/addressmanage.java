package com.example.lhx.recovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class addressmanage  extends AppCompatActivity {
    private Button back_btn;
    private Button add_btn;
    /*还少查看默认地址，查看已有地址，修改*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_manage);//地址管理界面
        //返回个人中心界面
        back_btn= (Button)findViewById(R.id.img_2);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
               // Intent intent = new Intent(addressmanage.this,person_Activity.class);
                //startActivity(intent);
            }
        });
        //点击添加地址到添加地址界面
        add_btn= (Button)findViewById(R.id.addaddress);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(addressmanage.this,addaddress.class);
                startActivity(intent);
            }
        });


    }
}
