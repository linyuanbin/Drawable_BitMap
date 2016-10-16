package com.lin.drawable;


import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Activity_Level extends AppCompatActivity {

    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);

        iv= (ImageView) findViewById(R.id.iv);

        iv.setImageLevel(16);
    }

    public void lampOn(View v){
        iv.setImageLevel(15);  //通过设置Level的值调用对应level里面的item的资源
    }

    public void lampOff(View v){
        iv.setImageLevel(8);
    }
}
