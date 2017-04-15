package espss.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.graphics.BitmapCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;




public class MainActivity extends Activity {

    private LinearLayout mLl;
    private TextView mTextView;
    private ImageView mIv,mIv2;
    private VeryView very;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        very = (VeryView) findViewById(R.id.vi);
        very.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                very.update();
            }
        });
//        mIv2 = (ImageView) findViewById(R.id.iv2);
//                Bitmap	bmpBuffer	=	Bitmap.createBitmap(800,800,
//                Bitmap.Config.ARGB_8888);
//        Canvas	canvas	=	new	Canvas(bmpBuffer);
//        Paint paint = new Paint();
//        paint.setColor(Color.BLACK);
//        paint.setAntiAlias(true);
//        paint.setStrokeWidth(3);
//        paint.setStyle(Paint.Style.STROKE);

        /**
         * 这个是画椭圆和扇形 弧形的
         */
//        RectF rectF = new RectF(10, 10, 500, 400);
//        canvas.drawOval(rectF,paint);
//        float v = rectF.centerY();
//        canvas.drawLine(0,v,rectF.width()+20,v,paint);
//        canvas.drawLine(rectF.centerX(),0,rectF.centerX(),rectF.height()+20,paint);
//        paint.setStyle(Paint.Style.FILL_AND_STROKE);
//        paint.setColor(Color.RED);
//        canvas.drawArc(rectF,0,30,true,paint);
//        paint.setStyle(Paint.Style.STROKE);
//        paint.setColor(Color.RED);
//        canvas.drawArc(rectF,0,-30,true,paint);
//        mIv2.setImageBitmap(bmpBuffer);
        /**
         * 这个是 path学习的 rmoveto之后的点 不能喝前面的点连起来 pdf输的很清楚按那个来就行了
         *
         */
//        Path path = new Path();
//        RectF rect = new RectF(100, 100, 200, 300);
//        path.addRect(rect, Path.Direction.CCW);
//        path.addRoundRect(new	RectF(10,	120,	300,	220),
//                new	float[]{10,	20,	20,	10,	30,	40,	40,	30},	Path.Direction.CCW);
//        path.moveTo(400,400);
//        path.rMoveTo(50,50);
//        path.rLineTo(100,100);
//
//        path.rLineTo(50,50);
//        path.close();
//        canvas.drawPath(path,paint);
        /**
         * 贝塞尔曲线 必须指定起点
         *
         */
//        Path path = new Path();
//        path.moveTo(30,50);//中间是控制点 后面的是终点
//        path.quadTo(300,20,350,400);
//        canvas.drawPath(path,paint);
//        path.moveTo(30,	30);
//        RectF rectF = new RectF(11, 11, 300, 300);
//        canvas.drawRect(rectF,paint);
//        path.arcTo(rectF,0,120,	false);
//        canvas.drawPath(path,paint);
//        mIv2.setImageBitmap(bmpBuffer);
    }

}
