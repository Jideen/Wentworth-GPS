package edu.wit.leapordnav;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class Map_Screen extends AppCompatActivity {
    double userLat, userLong;
    private final LocationListener locListen = new LocationListener() {
        @Override
        public void onLocationChanged(Location location) {
            userLong = location.getLongitude();
            userLat = location.getLatitude();

        }

        @Override
        public void onStatusChanged(String s, int i, Bundle bundle) {

        }

        @Override
        public void onProviderEnabled(String s) {

        }

        @Override
        public void onProviderDisabled(String s) {

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_screen);
        Point2D userLoc = new Point2D(userLong, userLat);
        double dist = 10000;
        for (int i = 0; i < 6; i++) {
            double tempDist = userLoc.distanceTo(Constants.Buildings.BUILDINGS[i].coords);
            if (dist > tempDist) {
                dist = tempDist;
                int place = i;
            }
        }


    }
}
