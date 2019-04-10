package edu.wit.myapplication;



import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.*;
import android.view.View;

public class DrawView extends View {
    private Bitmap b;

    public Bitmap linePath(Point2D[] points, int source, int dest, Canvas canvas) {

        Paint green = new Paint();
        green.setColor(Color.GREEN);
        Paint red = new Paint();
        red.setColor(Color.RED);
        b = BitmapFactory.decodeResource(getResources(), R.drawable.evw_0);
        canvas.drawBitmap(b, 0, 0, new Paint());

        canvas.drawLine(points[source].getX(), points[source].getY(),
                points[source].getX(), points[source].getY(), new Paint());
        canvas.drawCircle((points[source].getX()), (points[source].getY()), 5, new Paint());
        for (int i = source; i < dest; i++) {
            canvas.drawLine(points[i].getX(), points[i].getY(), points[i + 1].getX(), points[i + 1].getY(), new Paint());
            canvas.drawCircle(points[i + 1].getX(), points[i + 1].getY(), 5, new Paint());
        }

        canvas.drawCircle(points[source].getX(), points[source].getY(), 5, red);
        canvas.drawCircle(points[dest].getX(), points[dest].getY(), 5, green);
        return b;

    }

    public DrawView(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.TRANSPARENT);
        linePath(Constants.Graphs.EvansWay_0_Items, 0, 11, canvas);
    }

}
