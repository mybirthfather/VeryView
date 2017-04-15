package espss.myapplication;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import java.util.Random;

/**
 * Created by ${刘瑞亮} on 2017/4/14.
 */

public class VeryView extends View {
    private int mHeight;
    private int mWidth;
    private Paint mPaint;
    private Random mRandom;
    private int mLeft;
    private int mTop;
    private int mRight;
    private int mBottom;
    private int linenum=0;
    private int[] mRandNum;

    public VeryView(Context context) {
        super(context);
        init();
    }
    public VeryView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public VeryView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private int[] intYStart,intYEnd;
    private void init() {
        linenum=80;
        //随机生成数字
        mRandom = new Random();
//        int i = mRandom.nextInt(10);//随机生成0-9的数字
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(3);
        //起点的Y坐标
        intYStart = new int[linenum];
        //终点的Y坐标
        intYEnd = new int[linenum];
        mRandNum = new int[4];
//        mPaint.setTextSkewX();//设置text倾斜
    }

    @Override
    protected void onDraw(Canvas canvas) {//充满当前画布 从0 0 位置 左上角开始画
        super.onDraw(canvas);
        mHeight = getHeight();
        mWidth = getWidth();
        mLeft = getLeft();
        mTop = getTop();
        mRight = getRight();
        mBottom = getBottom();
        for (int i = 0; i <4 ; i++) {
            int i1 = mRandom.nextInt(10);
            mRandNum[i]=i1;
        }
        Log.i("=============","mHeight="+mHeight);
        Log.i("=============","mWidth="+mWidth);
        Log.i("=============","mLeft="+mLeft);
        Log.i("=============","mTop="+mTop);
        Log.i("=============","mRight="+mRight);
        Log.i("=============","mBottom="+mBottom);
        //画线 的宽度
       int mPerlineHeight= mHeight/200;
        Rect rect = new Rect(0,0,mRight-mLeft,mBottom-mTop);//应该是 当前xml中的view是画出来的这个矩形父view 所以要原版大小 必须这么设置
        canvas.drawRect(rect,mPaint);
        mPaint.setStrokeWidth(mPerlineHeight);
        mPaint.setStyle(Paint.Style.STROKE);
        //起点的Y坐标
        for (int i = 0; i <linenum ; i++) {
            int mStartYpoint=mRandom.nextInt(mBottom-mTop);//如果上面成立的话这样的话 相对view 那么 y坐标就是0到 矩形高度
            intYStart[i]=mStartYpoint;
        }
        for (int i = 0; i <linenum ; i++) {
            int EndYpoint=mRandom.nextInt(mBottom-mTop);
            intYEnd[i]=EndYpoint;
        }
        for (int i = 0; i <linenum ; i++) {
            canvas.drawLine(0,intYStart[i],mRight,intYEnd[i],mPaint);
        }
       int allSpace=mRight-mLeft;
        mPaint.reset();
        mPaint.setTextSize(45);
        mPaint.setStyle(Paint.Style.STROKE);
        for (int i = 0; i <4 ; i++) {
            float v = mRandom.nextFloat();
            mPaint.setTextSkewX(v);
            canvas.drawText(String.valueOf(mRandNum[i]),allSpace*(2*i+1)/8,(mBottom-mTop)/2,mPaint);
        }
    }
    public void update(){
        invalidate();
    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        // TODO Auto-generated method stub
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int width = measureDimension(200, widthMeasureSpec);//这个地方给的是px、、、
        int height = measureDimension(100, heightMeasureSpec);
        setMeasuredDimension(width, height);
    }

    public int measureDimension(int defaultSize, int measureSpec){
        int result;

        int specMode = MeasureSpec.getMode(measureSpec);
        int specSize = MeasureSpec.getSize(measureSpec);

        if(specMode == MeasureSpec.EXACTLY){
            result = specSize;
        }else{
            result = defaultSize;   //UNSPECIFIED
            if(specMode == MeasureSpec.AT_MOST){
                result = Math.min(result, specSize);
            }
        }
        return result;
    }
}
