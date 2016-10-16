package com.lin.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/**
 * Created by lin on 2016/10/14.
 */
public class CircleDrawable extends Drawable {

    private Paint mPaint;//绘画
    private int mWidth;//圆的直径
    private Bitmap mBitmap;

    public CircleDrawable(Bitmap bitmap){ //构造
        this.mBitmap=bitmap;
        BitmapShader bitmapshader=new BitmapShader(mBitmap, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);// TileMode用于设置平铺方式。两个 Shader.TileMode.CLAMP表示横向纵向按原图填满平铺
        mPaint=new Paint();
        mPaint.setAntiAlias(true);//平滑
        mPaint.setShader(bitmapshader);//设置画笔的着色器
        mWidth=Math.min(mBitmap.getWidth(),mBitmap.getHeight());//将直径设置为图片小的一条边

    }
    @Override
    public void draw(Canvas canvas) {  //画图像方法
        canvas.drawCircle(mWidth/2,mWidth/2,mWidth/2,mPaint); //圆心坐标在图片的中间
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
        return mWidth;
    }

    @Override
    public int getIntrinsicWidth() { //得到Drawable实际的宽
        return mWidth;
    }
}
