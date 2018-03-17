package com.kingja.rangebarsir;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/**
 * Description:TODO
 * Create Time:2018/3/17 17:00
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class RangeBar extends View {

    private static final String TAG = "RangeBar";
    private float lineWidth;
    private float sliderSzie;
    private Paint linePaint;
    private Paint sliderPaint;
    private int height;
    private int width;
    private int sliderColor;

    public RangeBar(Context context) {
        this(context, null);
    }

    public RangeBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RangeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initRangeBar(attrs);
        initPaint();
    }

    private void initPaint() {
        linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        linePaint.setStrokeWidth(lineWidth);
        sliderPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        sliderPaint.setColor(sliderColor);
    }

    private void initRangeBar(AttributeSet attrs) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RangeBar);
        lineWidth = a.getDimension(R.styleable.RangeBar_lineWidth, 4);
        sliderSzie = a.getDimension(R.styleable.RangeBar_sliderSzie, dp2px(20));
        sliderColor = a.getColor(R.styleable.RangeBar_sliderColor, 0x453ddc);
        Log.e(TAG, "lineWidth: " + lineWidth);
        Log.e(TAG, "sliderSzie: " + sliderSzie);
        a.recycle();
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
//        宽度如果是wrap_content，就取sliderSize的值

    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        height = getMeasuredHeight();
        width = getMeasuredWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawLine(0, height / 2, width, height / 2, linePaint);
        canvas.drawCircle(sliderSzie/2,height/2,sliderSzie/2,sliderPaint);

    }

    private int dp2px(float dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, getContext().getResources()
                .getDisplayMetrics());
    }
}
