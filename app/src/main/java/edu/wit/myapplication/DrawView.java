package edu.wit.myapplication;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.*;
import android.view.View;

public class DrawView extends View {
    public Bitmap b;

    public Bitmap linePath(Point2D[] points, int source, int dest, int image) {
        Paint green = new Paint();
        green.setColor(Color.GREEN);
        Paint red = new Paint();
        red.setColor(Color.RED);
        Paint blue = new Paint();
        blue.setColor(Color.BLUE);
        b = BitmapFactory.decodeResource(getResources(), image);
        Bitmap mutableBitmap = b.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(mutableBitmap);
        canvas.drawBitmap(b, 0, 0, new Paint());

        canvas.drawLine(points[source].getX(), points[source].getY(),
                points[source].getX(), points[source].getY(), new Paint());
        canvas.drawCircle((points[source].getX()), (points[source].getY()), 5, new Paint());
        for (int i = source; i < dest; i++) {
            canvas.drawLine(points[i].getX(), points[i].getY(), points[i + 1].getX(), points[i + 1].getY(), new Paint());
            canvas.drawCircle(points[i + 1].getX(), points[i + 1].getY(), 5, new Paint());
            if(points[i].name.equals("Stairs")){
                canvas.drawCircle(points[i].getX(), points[i].getY(), 5, blue);
            }
        }

        canvas.drawCircle(points[source].getX(), points[source].getY(), 5, red);
        canvas.drawCircle(points[dest].getX(), points[dest].getY(), 5, green);
        canvas.save();
        return mutableBitmap;

    }

    public DrawView(Context context) { //,String source, String dest
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
       // canvas.drawColor(Color.TRANSPARENT);
        //linePath(Constants.Graphs.EvansWay_0_Items, 0, 11, canvas,R.drawable.evw_0);
    }

}
