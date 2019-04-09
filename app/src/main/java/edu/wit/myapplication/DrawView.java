package edu.wit.myapplication;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.*;
import android.view.View;

public class DrawView extends View {
    private Bitmap b;

    public void linePath(Point2D[] points,int dest, Canvas canvas){
        canvas.drawLine(points[0].getX(),points[0].getY(),points[0].getX(),points[0].getY(),new Paint());
        for(int i = 1; i<dest;i++){
            canvas.drawLine(points[i-1].getX(),points[i-1].getY(),points[i].getX(),points[i].getY(),new Paint());
            canvas.drawCircle(points[i].getX(),points[i].getY(),5,new Paint());
        }
    }
    public DrawView(Context context){
        super(context);
        b = BitmapFactory.decodeResource(getResources(),R.drawable.top_bar);
    }
    @Override
    protected void onDraw(Canvas canvas){
        Pathfinder p = new Pathfinder();
        //p.run("evw","tdby");
        super.onDraw(canvas);
        canvas.drawColor(Color.BLUE);
        linePath(Constants.testPoints.Wentworth_1_Items,8,canvas);
        //canvas.drawBitmap(b,10,10,new Paint());
        //canvas.drawPath(linePath(Constants.testPoints.pts,3),new Paint());
    }


}
