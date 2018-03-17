package com.kingja.rangebarsir;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Description:TODO
 * Create Time:2018/3/17 17:00
 * Author:KingJA
 * Email:kingjavip@gmail.com
 */
public class RangeBar extends View {
    public RangeBar(Context context) {
        this(context,null);
    }

    public RangeBar(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public RangeBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initRangeBar(attrs);
    }

    private void initRangeBar(AttributeSet attrs) {
        TypedArray a = getContext().obtainStyledAttributes(attrs, R.styleable.RangeBar);

    }
}
