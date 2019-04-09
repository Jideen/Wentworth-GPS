package edu.wit.myapplication;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.*;
import android.view.View;

public class DrawView extends View {
    private Bitmap b;

    public Bitmap linePath(Point2D[] points,int source, int dest, Canvas canvas){
        int offsetx = 13;
        int offsety = 0;
        double scaleConstx = 0.8;
        double scaleConsty = 0.8;
        Paint green = new Paint();
        green.setColor(Color.GREEN);
        Paint red = new Paint();
        red.setColor(Color.RED);
        b = BitmapFactory.decodeResource(getResources(),R.drawable.went_0);
        canvas.drawBitmap(b,0,0,new Paint());

        canvas.drawLine((float)((points[source].getX()*scaleConstx)+ offsetx)
                ,(float)((points[source].getY()*scaleConsty)+ offsety),(float)((points[source].getX()*scaleConstx)+ offsetx),(float)((points[source].getY()*scaleConsty)+ offsety),new Paint());
        canvas.drawCircle((float)((points[source].getX()*scaleConstx)+ offsetx),(float)((points[source].getY()*scaleConsty)+ offsety),5,new Paint());
        for(int i = source; i<dest;i++){
            canvas.drawLine((float)((points[i].getX()*scaleConstx)+ offsetx),(float)((points[i].getY()*scaleConsty)+ offsety),(float)((points[i+1].getX()*scaleConstx)+ offsetx),(float)((points[i+1].getY()*scaleConsty)+ offsety),new Paint());
            canvas.drawCircle((float)((points[i+1].getX()*scaleConstx)+ offsetx),(float)((points[i+1].getY()*scaleConsty)+ offsety),5,new Paint());
        }

        canvas.drawCircle((float)((points[source].getX()*scaleConstx)+ offsetx),(float)((points[source].getY()*scaleConsty)+ offsety),5,red);
        canvas.drawCircle((float)((points[dest].getX()*scaleConstx)+ offsetx),(float)((points[dest].getY()*scaleConsty)+ offsety),5,green);
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
        linePath(Constants.Graphs.Wentworth_0_Items,0,6,canvas);
        //canvas.drawBitmap(b,10,10,new Paint());
        //canvas.drawPath(linePath(Constants.testPoints.pts,3),new Paint());
    }


}
