package edu.wit.myapplication;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.location.Location;
import android.location.LocationListener;
import android.util.Log;
import android.widget.TextView;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;


public class Main2Activity extends AppCompatActivity {
    double userLat, userLong;
    int place = 0;
    TextView textElement;
    public void getBuilding(Point2D p){
        double dist = 10000;
        for (int i = 0; i < 6; i++) {
            double tempDist = p.distanceTo(Constants.Buildings.BUILDINGS[i].coords);
            if (dist > tempDist) {
                dist = tempDist;
                place = i;
            }
// 1. Instantiate an <code><a href="/reference/android/app/AlertDialog.Builder.html">AlertDialog.Builder</a></code> with its constructor
            AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());

// 2. Chain together various setter methods to set the dialog characteristics
            builder.setMessage(Constants.Buildings.BUILDINGS[place].name)
                    .setTitle(Constants.Buildings.BUILDINGS[place].name);
// 3. Get the <code><a href="/reference/android/app/AlertDialog.html">AlertDialog</a></code> from <code><a href="/reference/android/app/AlertDialog.Builder.html#create()">create()</a></code>
            AlertDialog dialog = builder.create();
        }


    }
    private FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textElement = (TextView) findViewById(R.id.textView4);
        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);
        try {
            fusedLocationClient.getLastLocation()
                    .addOnSuccessListener(this, new OnSuccessListener<Location>() {
                        @Override
                        public void onSuccess(Location location) {
                            // Got last known location. In some rare situations this can be null.
                            if (location != null) {
                                // Logic to handle location object
                                userLong = location.getLongitude();
                                userLat = location.getLatitude();
                                Point2D userLoc = new Point2D(userLong, userLat);
                                getBuilding(userLoc);
                                Log.i(Constants.Buildings.BUILDINGS[place].name,Constants.Buildings.BUILDINGS[place].name);
                                textElement.setText(Constants.Buildings.BUILDINGS[place].name);

                            }
                        }
                    });
        } catch (SecurityException e){
            System.exit(0);
        }
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        final LocationListener locListen = new LocationListener() {

            @Override
            public void onLocationChanged(Location location) {
                userLong = location.getLongitude();
                userLat = location.getLatitude();
                Point2D userLoc = new Point2D(userLong, userLat);
                getBuilding(userLoc);
                String yonk = String.format("%s, %d, %d",Constants.Buildings.BUILDINGS[place].name,userLong,userLat);
                Log.i(yonk,yonk);
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




    }

}
