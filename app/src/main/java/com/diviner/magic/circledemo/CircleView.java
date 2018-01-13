package com.diviner.magic.circledemo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author Diviner
 */
public class CircleView extends View {

    /**
     * 屏幕的宽度
     */
    private int width;
    private int height;

    /**
     *  画笔
     */
    private Paint thumbPaint;
    private int thumbWidth = 50 ;
    private int thumbColor = Color.parseColor("#3370CC");



    public CircleView(Context context) {
        super(context,null);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        this(context , attrs , 0);
    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        thumbPaint = new Paint();
        thumbPaint.setAntiAlias(true);
        thumbPaint.setStrokeWidth(1);
    }

    public void setThumbWidth(int thumbWidth) {
        this.thumbWidth = thumbWidth;
        // 重绘
        invalidate();
    }

    public void setThumbColor(String color) {
        this.thumbColor = Color.parseColor("#"+color);
        invalidate();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        width = MeasureSpec.getSize(widthMeasureSpec);
        height = MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(width, height);
    }

    @Override
    protected void onLayout(boolean changed, int left, int top, int right,
                            int bottom) {
        super.onLayout(changed, left, top, right, bottom);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 绘制圆
        thumbPaint.setColor(thumbColor);
        canvas.drawCircle(width/2, height/2, thumbWidth, thumbPaint);
    }
}
