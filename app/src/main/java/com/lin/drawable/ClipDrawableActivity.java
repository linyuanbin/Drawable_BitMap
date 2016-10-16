package com.lin.drawable;

import android.graphics.drawable.ClipDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ClipDrawableActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clip_drawable);

        imageView= (ImageView) findViewById(R.id.imagev);
        //设置level值  import android.graphics.drawable.ClipDrawable;
        ClipDrawable drawable= (ClipDrawable) imageView.getDrawable();
        drawable.setLevel(5000); //这里设置level=5000 表示显示图片的左边一半
        //level值从1-10000 1表示完全隐藏 10000表示显示全部

    }
}
