package edu.wit.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.Arrays;

public class mapActivity extends AppCompatActivity {
    public String curBuilding;
    int buildingTracker = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);
        setContentView(new DrawView(this));
        final TextView text = findViewById(R.id.textView2);
        String source = getIntent().getExtras().getString("Source");
        String sourceFloor = getIntent().getExtras().getString("SourceFloor");
        String dest = getIntent().getExtras().getString("Dest");
        String destFloor = getIntent().getExtras().getString("DestFloor");
        switch (source) {
            case "evw":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                }
                break;
            case "wat":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "bty":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "M":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                }
                break;
            case "rub":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "king":
                switch (sourceFloor) {
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "dobb":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "will":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "wils":
                switch (sourceFloor) {
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "went":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "tdby":
                switch (sourceFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                }
                break;
            case "empty":
                break;
        }
        switch (dest) {
            case "evw":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                    case "5":
                        break;
                }
                break;
            case "wat":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "bty":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "M":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                }
                break;
            case "rub":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "king":
                switch (destFloor) {
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "dobb":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "will":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "wils":
                switch (destFloor) {
                    case "1":
                        break;
                    case "2":
                        break;
                }
                break;
            case "went":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                }
                break;
            case "tdby":
                switch (destFloor) {
                    case "0":
                        break;
                    case "1":
                        break;
                    case "2":
                        break;
                    case "3":
                        break;
                    case "4":
                        break;
                }
                break;
            case "empty":
                break;
        }

        Pathfinder p = new Pathfinder();
        Context c = this;
        DrawView d = new DrawView(c);

        int len = p.run(source,dest).length;
        String[] strArray = p.run(source,dest);
    }

}
