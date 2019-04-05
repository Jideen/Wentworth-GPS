package edu.wit.myapplication;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

import java.util.ArrayList;
import java.util.Arrays;


public class Main2Activity extends AppCompatActivity {
    double userLat, userLong;
    int place = 0;
    TextView textElement;

    Spinner building, floor, room, building2, floor2, room2;
    String selBuilding, selFloor;
    int bldgGlobal;
    String[] buildingArray, floorArray, roomsArray;
    Context c;
    ArrayList<String> floors, floors2, rooms, rooms2;

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
        textElement = findViewById(R.id.textView4);
        c = this;
        buildingArray = getResources().getStringArray(R.array.building_ids);
        building = findViewById(R.id.buildings_spinner);
        floor = findViewById(R.id.floor_spinner);
        room = findViewById(R.id.room_spinner);
        building2 = findViewById(R.id.buildings_spinner2);
        floor2 = findViewById(R.id.floor_spinner2);
        room2 = findViewById(R.id.room_spinner2);
        building.setAdapter(SpinnerPopulate.Populate(this, R.array.building_names));
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
        building.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                bldgGlobal = i;
                floors = new ArrayList<>();
                Log.i("2nd Array", String.format("%d", i));
                switch (buildingArray[i]) {
                    case "anx":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        selBuilding = "anx";
                        break;
                    case "bty":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        selBuilding = "bty";
                        break;
                    case "main":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.main_Floors)));
                        selBuilding = "main";
                        break;
                    case "evw":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_Floors)));
                        selBuilding = "evw";
                        break;
                    case "iral":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_Floors)));
                        selBuilding = "iral";
                        break;
                    case "tdby":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_Floors)));
                        selBuilding = "tdby";
                        break;
                    case "empty":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_Floors)));
                        break;
                }
                floor.setAdapter(SpinnerPopulate.updateData(c, floors));
                Log.i("2nd Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        building2.setAdapter(SpinnerPopulate.Populate(this, R.array.building_names));
        building2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                floors2 = new ArrayList<>();
                switch (buildingArray[i]) {
                    case "anx":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_Floors)));
                        break;
                    case "bty":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        break;

                    case "main":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.main_Floors)));
                        break;
                    case "evw":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_Floors)));
                        break;
                    case "iral":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_Floors)));
                        break;
                    case "tdby":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_Floors)));
                        break;
                    case "empty":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_Floors)));
                        break;
                }
                floor2.setAdapter(SpinnerPopulate.updateData(c, floors2));
                Log.i("2nd Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        floor2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (buildingArray[bldgGlobal]) {
                    case "anx":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.anx_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_3_Rooms)));
                                break;
                        }
                        break;
                    case "bty":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.bty_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_2_Rooms)));
                                break;
                            case "M":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_M_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_3_Rooms)));
                                break;
                            case "4":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_4_Rooms)));
                                break;
                        }
                        break;

                    case "main":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.main_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.main_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.main_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.main_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.main_3_Rooms)));
                                break;
                        }
                        break;
                    case "evw":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.evw_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_3_Rooms)));
                                break;
                            case "4":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_4_Rooms)));
                                break;
                            case "5":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_5_Rooms)));
                                break;
                        }
                        break;
                    case "iral":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.iral_Floors);
                        switch (floorArray[i]) {
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_3_Rooms)));
                                break;
                        }
                        break;

                    case "tdby":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.tdby_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_3_Rooms)));
                                break;
                            case "4":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_4_Rooms)));
                                break;
                        }
                        break;
                    case "empty":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.empty_Floors);
                        switch (floorArray[i]) {
                            case "Select a Building":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_0_Rooms)));
                                break;
                        }
                        break;
                }
                room2.setAdapter(SpinnerPopulate.updateData(c, rooms2));
                Log.i("2nd Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        floor.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                switch (buildingArray[bldgGlobal]) {
                    case "anx":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.anx_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_3_Rooms)));
                                break;
                        }
                        break;
                    case "bty":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.bty_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_2_Rooms)));
                                break;
                            case "M":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_M_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_3_Rooms)));
                                break;
                            case "4":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_4_Rooms)));
                                break;
                        }
                        break;

                    case "main":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.main_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.main_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.main_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.main_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.main_3_Rooms)));
                                break;
                        }
                        break;
                    case "evw":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.evw_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_3_Rooms)));
                                break;
                            case "4":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_4_Rooms)));
                                break;
                            case "5":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_5_Rooms)));
                                break;
                        }
                        break;
                    case "iral":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.iral_Floors);
                        switch (floorArray[i]) {
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_3_Rooms)));
                                break;
                        }
                        break;

                    case "tdby":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.tdby_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_3_Rooms)));
                                break;
                            case "4":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_4_Rooms)));
                                break;
                        }
                        break;
                    case "empty":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.empty_Floors);
                        switch (floorArray[i]) {
                            case "Select a Building":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_0_Rooms)));
                                break;
                        }
                        break;
                }
                room.setAdapter(SpinnerPopulate.updateData(c, rooms));
                Log.i("2nd Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        int startPos = 0;
        if (!getIntent().getExtras().isEmpty()) {
            startPos = getIntent().getExtras().getInt("Location");
            building.setSelection(startPos);

        }

    }

}

