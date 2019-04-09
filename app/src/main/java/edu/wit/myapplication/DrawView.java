package edu.wit.myapplication;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.*;
import android.view.View;

public class DrawView extends View {
    private Bitmap b;

    public Bitmap linePath(Point2D[] points,int dest, Canvas canvas){
        int offsetx = 12;
        int offsety = 10;
        double scaleConstx = 1.36;
        double scaleConsty = 1.25;
        Paint green = new Paint();
        green.setColor(Color.GREEN);
        b = BitmapFactory.decodeResource(getResources(),R.drawable.went_0);
        canvas.drawBitmap(b,0,0,new Paint());
        canvas.drawLine((float)((points[0].getX()+ offsetx)*scaleConstx)
                ,(float)((points[0].getY()+ offsety)*scaleConsty),(float)((points[0].getX()+ offsetx)*scaleConstx),(float)((points[0].getY()+ offsety)*scaleConsty),new Paint());
        canvas.drawCircle((float)((points[0].getX()+ offsetx)*scaleConstx),(float)((points[0].getY()+ offsety)*scaleConsty),5,new Paint());
        for(int i = 1; i<points.length;i++){
            canvas.drawLine((float)((points[i-1].getX()+ offsetx)*scaleConstx),(float)((points[i-1].getY()+ offsety)*scaleConsty),(float)((points[i].getX()+ offsetx)*scaleConstx),(float)((points[i].getY()+ offsety)*scaleConsty),new Paint());
            canvas.drawCircle((float)((points[i].getX()+ offsetx)*scaleConstx),(float)((points[i].getY()+ offsety)*scaleConsty),5,new Paint());
        }
        canvas.drawCircle((float)((points[dest].getX()+ offsetx)*scaleConstx),(float)((points[dest].getY()+ offsety)*scaleConsty),5,green);
        return b;
    }
    public DrawView(Context context){
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        //canvas.drawColor(Color.BLUE);
        canvas.drawColor(Color.TRANSPARENT);
        linePath(Constants.Graphs.Wentworth_1_Items,3,canvas);
        //canvas.drawBitmap(b,10,10,new Paint());
        //canvas.drawPath(linePath(Constants.testPoints.pts,3),new Paint());
    }


}
