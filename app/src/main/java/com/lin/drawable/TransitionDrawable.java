package com.lin.drawable;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class TransitionDrawable extends AppCompatActivity {

    private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);

        iv= (ImageView) findViewById(R.id.imageview);
    }

    public void lampOn(View v){
        android.graphics.drawable.TransitionDrawable drawable= (android.graphics.drawable.TransitionDrawable) iv.getDrawable();
        drawable.startTransition(3000);//设置渐变时间为3秒

    }

    public void lampOff(View v){
        android.graphics.drawable.TransitionDrawable drawable= (android.graphics.drawable.TransitionDrawable) iv.getDrawable();
        drawable.reverseTransition(3000);
    }
}
