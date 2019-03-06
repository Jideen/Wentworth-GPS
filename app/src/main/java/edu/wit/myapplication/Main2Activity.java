package edu.wit.myapplication;

import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;


public class Main2Activity extends AppCompatActivity {
    double userLat, userLong;
    int place = 0;
    TextView textElement;

    public void rightButton(View v) {
        Intent toNav = new Intent(this, Navigation.class);
        toNav.putExtra("Location", place);
        startActivity(toNav);
    }

    public void wrongButton(View v) {
        Intent toNav = new Intent(this, Navigation.class);
        toNav.putExtra("Location", 6);
        startActivity(toNav);
    }


    public void getBuilding(Point2D p) {
        double dist = 10000;
        for (int i = 0; i < 6; i++) {
            double tempDist = p.distanceTo(Constants.Buildings.BUILDINGS[i].coords);
            if (dist > tempDist) {
                dist = tempDist;
                place = i;
            }
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
                            if (location != null) {
                                userLong = location.getLongitude();
                                userLat = location.getLatitude();
                                Point2D userLoc = new Point2D(userLong, userLat);
                                getBuilding(userLoc);
                                Log.i(Constants.Buildings.BUILDINGS[place].name, Constants.Buildings.BUILDINGS[place].name);
                                textElement.setText("Our system shows that you're in: " + Constants.Buildings.BUILDINGS[place].name);

                            }
                        }
                    });
        } catch (SecurityException e) {
            System.exit(0);
        }
        final Button right = findViewById(R.id.button6);
        right.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rightButton(v);
            }
        });
        final Button wrong = findViewById(R.id.button5);
        wrong.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                wrongButton(v);
            }
        });
    }

}

