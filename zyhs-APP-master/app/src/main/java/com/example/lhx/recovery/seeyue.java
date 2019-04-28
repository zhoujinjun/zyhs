package com.example.lhx.recovery;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class seeyue extends AppCompatActivity {
    private Button back_btn;//返回按钮
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seeyue);
        //查看余额界面显示
        back_btn= (Button)findViewById(R.id.img_2);
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                //Intent intent = new Intent(seeyue.this,changeaccount.class);
                //startActivity(intent);
            }
        });


    }


}
