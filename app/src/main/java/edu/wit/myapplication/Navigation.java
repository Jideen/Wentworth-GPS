package edu.wit.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Spinner;


public class Navigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation);
        Spinner building = (Spinner) findViewById(R.id.buildings_spinner);
        building.setAdapter(SpinnerPopulate.spinnerPopulate(this, R.array.building_names));
        int startPos = 0;
        if (!getIntent().getExtras().isEmpty()) {
            startPos = getIntent().getExtras().getInt("Location");
            building.setSelection(startPos);

        }

    }


}
