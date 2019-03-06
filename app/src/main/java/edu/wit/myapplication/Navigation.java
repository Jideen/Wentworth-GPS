package edu.wit.myapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;


public class Navigation extends AppCompatActivity {
    Spinner building;
    Spinner floor;
    Spinner room;
    Spinner building2;
    Spinner floor2;
    Spinner room2;
    String[] buildingArray;
    Context c;
    ArrayList<String> floors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        c = this;
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
                buildingArray = getResources().getStringArray(R.array.building_ids);
                floors = new ArrayList<>();
                switch (buildingArray[i]) {
                    case "anx":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_Floors)));
                        break;
                    case "bty":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        break;

                    case "main":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.main_Floors)));
                        break;
                    case "evw":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_Floors)));
                        break;
                    case "iral":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_Floors)));
                        break;
                    case "tdby":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_Floors)));
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
        floor.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                buildingArray = getResources().getStringArray(R.array.building_ids);
                floors = new ArrayList<>();
                switch (buildingArray[i]) {
                    case "anx":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.anx_Floors)));
                        break;
                    case "bty":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.bty_Floors)));
                        break;

                    case "main":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.main_Floors)));
                        break;
                    case "evw":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.evw_Floors)));
                        break;
                    case "iral":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.iral_Floors)));
                        break;
                    case "tdby":
                        floors.addAll(Arrays.asList(getResources().getStringArray(R.array.tdby_Floors)));
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
        int startPos = 0;
        if (!getIntent().getExtras().isEmpty()) {
            startPos = getIntent().getExtras().getInt("Location");
            building.setSelection(startPos);

        }

    }

}
