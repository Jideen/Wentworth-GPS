package edu.wit.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Button;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;


public class Main2Activity extends AppCompatActivity {
    Spinner building, floor, room, building2, floor2, room2;
    String selBuilding, selBuilding2, selFloor, selFloor2, b1str, b2str;
    int bldgGlobal,bldg2Global,floorGlobal,floorGlobal2,selRoom, selRoom2;
    String[] buildingArray, buildingArray2, floorArray, floor2Array;
    Context c;
    ArrayList<String> floors, floors2, rooms, rooms2;


    public void buttonCode(View v) {
        Button b = (Button) v;
        //send selected location data to map activity
        Intent toFin = new Intent(this, mapActivity.class);
        toFin.putExtra("Source",b1str);
        toFin.putExtra("Dest",b2str);
        toFin.putExtra("SourceFloor",selFloor);
        toFin.putExtra("DestFloor",selFloor2);
        toFin.putExtra("SourceRoom",selRoom);
        toFin.putExtra("DestRoom",selRoom2);
        startActivity(toFin);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c = this;
        buildingArray = getResources().getStringArray(R.array.building_ids);
        buildingArray2 = getResources().getStringArray(R.array.building_ids);
        building = findViewById(R.id.buildings_spinner);
        floor = findViewById(R.id.floor_spinner);
        room = findViewById(R.id.room_spinner);
        building2 = findViewById(R.id.buildings_spinner2);
        floor2 = findViewById(R.id.floor_spinner2);
        room2 = findViewById(R.id.room_spinner2);
        //switch case series to determine what to populate spinners with
        building.setAdapter(SpinnerPopulate.Populate(this, R.array.building_names));
        building.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                bldgGlobal = i;
                floors = new ArrayList<>();
                switch (buildingArray[i]) {
                    case "evw":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_Floors)));
                        selBuilding = "Evans Way";
                        break;
                    case "wat":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_Floors)));
                        selBuilding = "Watson";
                        break;
                    case "bty":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        selBuilding = "Beatty";
                        break;
                    case "rub":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_Floors)));
                        selBuilding = "Rubenstein";
                        break;
                    case "king":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.king_Floors)));
                        selBuilding = "Kingman";
                        break;
                    case "dobb":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_Floors)));
                        selBuilding = "Dobbs";
                        break;
                    case "will":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.will_Floors)));
                        selBuilding = "Williston";
                        break;
                    case "wils":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.wils_Floors)));
                        selBuilding = "Wilson";
                        break;
                    case "went":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.went_Floors)));
                        selBuilding = "Wentworth";
                        break;
                    case "tdby":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_Floors)));
                        selBuilding = "Tudbury";
                        break;
                    case "empty":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_Floors)));
                        break;
                }
                floor.setAdapter(SpinnerPopulate.updateData(c, floors));
                Log.i("1st Floor Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        building2.setAdapter(SpinnerPopulate.Populate(this, R.array.building_names));
        building2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int j, long l) {
                bldg2Global = j;
                floors2 = new ArrayList<>();
                switch (buildingArray2[j]) {
                    case "evw":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_Floors)));
                        selBuilding2 = "evw";
                        break;
                    case "wat":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_Floors)));
                        selBuilding2 = "wat";
                        break;
                    case "bty":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        selBuilding2 = "bty";
                        break;
                    case "rub":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_Floors)));
                        selBuilding2 = "rub";
                        break;
                    case "king":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.king_Floors)));
                        selBuilding2 = "king";
                        break;
                    case "dobb":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_Floors)));
                        selBuilding2 = "dobb";
                        break;
                    case "will":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.will_Floors)));
                        selBuilding2 = "will";
                        break;
                    case "wils":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.wils_Floors)));
                        selBuilding2 = "wils";
                        break;
                    case "went":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.went_Floors)));
                        selBuilding2 = "went";
                        break;
                    case "tdby":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_Floors)));
                        selBuilding2 = "tdby";
                        break;
                    case "empty":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_Floors)));
                        break;
                }
                floor2.setAdapter(SpinnerPopulate.updateData(c, floors2));
                Log.i("2nd Floor Array", buildingArray2[j]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        floor.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int l, long lo) {
                floorGlobal = l;
                b1str = buildingArray[bldgGlobal];
                switch (buildingArray[bldgGlobal]) {
                    case "evw":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.evw_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
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
                    case "wat":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.wat_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_1_Rooms)));
                                break;
                        }
                        break;
                    case "bty":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.bty_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
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
                    case "rub":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.rub_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_2_Rooms)));
                                break;
                        }
                        break;
                    case "king":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.king_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.king_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.king_2_Rooms)));
                                break;
                        }
                        break;
                    case "dobb":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.dobb_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_3_Rooms)));
                                break;
                        }
                        break;
                    case "will":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.will_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.will_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.will_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.will_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.will_3_Rooms)));
                                break;
                        }
                        break;
                    case "wils":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.wils_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.wils_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.wils_2_Rooms)));
                                break;
                        }
                        break;
                    case "went":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.went_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.went_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.went_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.went_2_Rooms)));
                                break;
                            case "3":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.went_3_Rooms)));
                                break;
                        }
                        break;
                    case "tdby":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.tdby_Floors);
                        Log.i("Room Array 1:",floorArray[l]);
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
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
                        selFloor = floorArray[l];
                        switch (floorArray[l]) {
                            case "Select a Building":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_0_Rooms)));
                                break;
                        }
                        break;
                }
                room.setAdapter(SpinnerPopulate.updateData(c, rooms));
                Log.i("1st Room Array", buildingArray[bldgGlobal]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        floor2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int k, long l) {
                floorGlobal2 = k;
                b2str=buildingArray[bldg2Global];
                switch (buildingArray[bldg2Global]) {
                    case "evw":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.evw_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
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
                    case "wat":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.wat_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_1_Rooms)));
                                break;
                        }
                        break;
                    case "bty":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.bty_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
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
                    case "rub":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.rub_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_2_Rooms)));
                                break;
                        }
                        break;
                    case "king":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.king_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.king_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.king_2_Rooms)));
                                break;
                        }
                        break;
                    case "dobb":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.dobb_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_3_Rooms)));
                                break;
                        }
                        break;
                    case "will":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.will_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.will_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.will_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.will_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.will_3_Rooms)));
                                break;
                        }
                        break;
                    case "wils":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.wils_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.wils_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.wils_2_Rooms)));
                                break;
                        }
                        break;
                    case "went":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.went_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.went_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.went_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.went_2_Rooms)));
                                break;
                            case "3":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.went_3_Rooms)));
                                break;
                        }
                        break;
                    case "tdby":
                        rooms2 = new ArrayList<>();
                        floor2Array = getResources().getStringArray(R.array.tdby_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
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
                        floor2Array = getResources().getStringArray(R.array.empty_Floors);
                        selFloor2 = floor2Array[k];
                        switch (floor2Array[k]) {
                            case "Select a Building":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.empty_0_Rooms)));
                                break;
                        }
                        break;
                }
                room2.setAdapter(SpinnerPopulate.updateData(c, rooms2));
                Log.i("2nd Room Array", buildingArray[bldg2Global]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        room.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int l, long lo) {
                Log.i("room",String.format("%d",l));
                selRoom = l;
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        room2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int k, long l) {
                selRoom2 = k;

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        //initialize button and assign it a task
        final Button launch = findViewById(R.id.button5);
        launch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });

    }

}