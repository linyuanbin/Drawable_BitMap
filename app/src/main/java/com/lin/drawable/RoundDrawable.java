package com.lin.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * Created by lin on 2016/10/14.
 */
public class RoundDrawable extends Drawable {
//设置矩形圆角的drawable

    private Paint mPaint;//绘画
    private RectF rectF; //矩形区域
    private Bitmap mBitmap;

    public RoundDrawable(Bitmap bitmap){ //构造
        this.mBitmap=bitmap;
        BitmapShader bitmapshader=new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);// TileMode用于设置平铺方式。两个 Shader.TileMode.CLAMP表示横向纵向按原图填满平铺
        mPaint=new Paint();
        mPaint.setAntiAlias(true);//平滑
        mPaint.setShader(bitmapshader);//设置画笔的着色器

    }
    @Override
    public void draw(Canvas canvas) {  //画图像方法
        canvas.drawRoundRect(rectF,30,30,mPaint); //矩形位置
    }

    //矩形多一个方法  设置矩形区域
    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        rectF=new RectF(left, top, right, bottom);  //创建出对象 对其四周绘制
    }

    @Override
    public void setAlpha(int i) {  //设置画笔透明度
        mPaint.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {  
        mPaint.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return PixelFormat.TRANSLUCENT; //设置Drawable支持和窗口一样的透明度
    }

    @Override
    public int getIntrinsicHeight() { //得到Drawable实际的高
        return mBitmap.getHeight();
    }

    @Override
    public int getIntrinsicWidth() { //得到Drawable实际的宽
        return mBitmap.getWidth();
    }
}
