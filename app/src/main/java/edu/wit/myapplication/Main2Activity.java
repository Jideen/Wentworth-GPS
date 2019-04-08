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
    String selBuilding, selBuilding2, selFloor;
    int bldgGlobal;
    String[] buildingArray, floorArray, roomsArray;
    Context c;
    ArrayList<String> floors, floors2, rooms, rooms2;

    public void buttonCode(View v) {
        Button b = (Button) v;
        Intent toMap = new Intent(this, Map.class);
        startActivity(toMap);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
// TODO: move
//        Pathfinder p = new Pathfinder();
//        p.run();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        c = this;
        buildingArray = getResources().getStringArray(R.array.building_ids);
        building = (Spinner) findViewById(R.id.buildings_spinner);
        floor = (Spinner) findViewById(R.id.floor_spinner);
        room = (Spinner) findViewById(R.id.room_spinner);
        building2 = (Spinner) findViewById(R.id.buildings_spinner2);
        floor2 = (Spinner) findViewById(R.id.floor_spinner2);
        room2 = (Spinner) findViewById(R.id.room_spinner2);
        building.setAdapter(SpinnerPopulate.Populate(this, R.array.building_names));
        building.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                bldgGlobal = i;
                floors = new ArrayList<>();
                switch (buildingArray[i]) {
                    case "anx":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_Floors)));
                        selBuilding = "anx";
                        break;
                    case "evw":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_Floors)));
                        selBuilding = "evw";
                        break;
                    case "wat":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_Floors)));
                        selBuilding = "wat";
                        break;
                    case "bty":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        selBuilding = "bty";
                        break;
                    case "rub":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.rub_Floors)));
                        selBuilding = "rub";
                        break;
                    case "king":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.king_Floors)));
                        selBuilding = "king";
                        break;
                    case "dobb":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.dobb_Floors)));
                        selBuilding = "dobb";
                        break;
                    case "will":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.will_Floors)));
                        selBuilding = "will";
                        break;
                    case "wils":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.wils_Floors)));
                        selBuilding = "wils";
                        break;
                    case "went":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.went_Floors)));
                        selBuilding = "went";
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
                Log.i("1st Floor Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        building2.setAdapter(SpinnerPopulate.Populate(this, R.array.building_names));
        building2.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                floors2 = new ArrayList<>();
                switch (buildingArray[i]) {
                    case "anx":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_Floors)));
                        selBuilding2 = "anx";
                        break;
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
                    case "iral":
                        floors2.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_Floors)));
                        selBuilding2 = "iral";
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
                Log.i("2nd Floor Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        floor2.setOnItemSelectedListener(new OnItemSelectedListener() {
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
                    case "wat":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.wat_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_0_Rooms)));
                                break;
                            case "1":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_1_Rooms)));
                                break;
                            case "2":
                                rooms2.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_2_Rooms)));
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
                    case "rub":
                        rooms2 = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.rub_Floors);
                        switch (floorArray[i]) {
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
                        floorArray = getResources().getStringArray(R.array.king_Floors);
                        switch (floorArray[i]) {
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
                        floorArray = getResources().getStringArray(R.array.dobb_Floors);
                        switch (floorArray[i]) {
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
                        floorArray = getResources().getStringArray(R.array.will_Floors);
                        switch (floorArray[i]) {
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
                        floorArray = getResources().getStringArray(R.array.wils_Floors);
                        switch (floorArray[i]) {
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
                        floorArray = getResources().getStringArray(R.array.went_Floors);
                        switch (floorArray[i]) {
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
                Log.i("1st Room Array", buildingArray[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        floor.setOnItemSelectedListener(new OnItemSelectedListener() {
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
                    case "wat":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.wat_Floors);
                        switch (floorArray[i]) {
                            case "0":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_0_Rooms)));
                                break;
                            case "1":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_1_Rooms)));
                                break;
                            case "2":
                                rooms.addAll(Arrays.asList(getResources().getStringArray(R.array.wat_2_Rooms)));
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
                    case "rub":
                        rooms = new ArrayList<>();
                        floorArray = getResources().getStringArray(R.array.rub_Floors);
                        switch (floorArray[i]) {
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
                        switch (floorArray[i]) {
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
                        switch (floorArray[i]) {
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
                        switch (floorArray[i]) {
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
                        switch (floorArray[i]) {
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
                        switch (floorArray[i]) {
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
                Log.i("2nd Room Array", buildingArray[i]);

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
        final Button launch = findViewById(R.id.button5);
        launch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });

    }

}