package com.lin.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class CircleDrawableActivity extends AppCompatActivity {
    //圆形的drawable。经常用于头像

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle_drawable);

        imageView= (ImageView) findViewById(R.id.mimageview);
        Bitmap bitmap= BitmapFactory.decodeResource(getResources(),R.drawable.android1);
        //imageView.setImageDrawable(new CircleDrawable(bitmap)); //设置图片
        imageView.setImageDrawable(new RoundDrawable(bitmap)); //设置图片



    }
}
