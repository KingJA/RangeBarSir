* 绘制进度条
* 绘制滑动块
* 进行滑动块

event.getX():表示的是触摸的点距离自身左边界的距离
event.getY():表示的是触摸的点距离自身上边界的距离
event.getRawX:表示的是触摸点距离屏幕左边界的距离
event.getRawY:表示的是触摸点距离屏幕上边界的距离

  @Override
    public boolean onTouchEvent(MotionEvent event) {
...
        return true;//return true才能传递给move和up
    }



* minSlider的滑动范围：(slideSize/2，maxSlider.left)
* maxSlider的滑动范围：(minSlider.right，width-slideSize/2)
*