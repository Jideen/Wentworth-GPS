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
        //set a start point for the line on the map from the data read from the source int
        canvas.drawBitmap(b, 0, 0, new Paint());
        float srcX = points[source].getX();
        float srcY = points[source].getY();
        float destX = points[dest].getX();
        float destY = points[dest].getY();
        canvas.drawLine(srcX, srcY, srcX, srcY, new Paint());
        canvas.drawCircle(srcX, srcY, 5, new Paint());
        //draw line from current pos to nxt pos based on coordinates read from constants
        for (int i = source; i < dest; i++) {
            float curX = points[i].getX();
            float curY = points[i].getY();
            float nextX = points[i+1].getX();
            float nextY = points[i+1].getY();
            canvas.drawLine(curX, curY, nextX, nextY, new Paint());
            if(points[i].name.equals("Stairs")){
                canvas.drawCircle(curX, curY, 5, blue);
            }
        }
        canvas.drawCircle(srcX, srcY, 5, red);
        canvas.drawCircle(destX, destY, 5, green);
        canvas.save();
        return mutableBitmap;

    }

    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

}
