package edu.wit.myapplication;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static edu.wit.myapplication.Constants.Graphs.*;

/**
 * mapActivity class extending AppCompatActivity class
 */
public class mapActivity extends AppCompatActivity {
    String source, sourceFloor, dest, destFloor, destFloorOriginal;
    String[] builds;
    int sourceRoom, destRoom, destRoomOriginal;
    public int curBuilding = 0, mapInt = 1;
    public boolean finalBldg = false, firstBuilding = true;
    ImageView mapImage, img;
    TextView hallName;

    public void mapButton(View v) {
        mapInt++;
        if (mapInt % 2 == 0) {
            mapImage.setVisibility(View.VISIBLE);
        } else {
            mapImage.setVisibility(View.INVISIBLE);
        }
    }

    /**
     * What happens when button is pressed
     *
     * @param v
     */
    public void buttonCode(View v) {
//        Intent toFin = new Intent(this, mapActivity.class);
//        startActivity(toFin);
        curBuilding++;
        if (source != dest) {
            sourceFloor = "1";
        }
        if (sourceFloor == "1" && curBuilding == 0) {
            source = builds[curBuilding - 1];
        } else if (curBuilding < builds.length) {
            source = builds[curBuilding];
        } else {
            source = builds[curBuilding - 1];
        }
        if (source.equals(dest) && !sourceFloor.equals(destFloor)) {
            destFloor = destFloorOriginal;
            sourceFloor = destFloorOriginal;
        }
        sourceFloor = (finalBldg) ? destFloorOriginal : "1";
        if (source.equals(dest)) {
            finalBldg = true;
        }
        if (finalBldg) {
            destFloor = destFloorOriginal;
            destRoom = destRoomOriginal;
            curBuilding--;
        }
        Log.i("Current Rooms", String.format("%d, %d", sourceRoom, destRoom));

        navLogic(source, dest, sourceFloor, destFloor, sourceRoom, destRoom);

    }

    /**
     * Floor to floor navigation
     *
     * @param dst
     * @param dstF
     * @param dstR
     * @param src
     * @param srcF
     * @param srcR
     */
    public ImageView navLogic(String src, String dst, String srcF, String dstF, int srcR, int dstR) {
        String source = src;
        String dest = dst;
        String sourceFloor = srcF;
        String destFloor = dstF;
        int sourceRoom = srcR;
        int destRoom = dstR;
        Point2D[] floordat = {new Point2D()};
        Log.i("Current Bldg/Floor", String.format("%s,%s", source, sourceFloor));
        Pathfinder p = new Pathfinder();
        Context c = this;
        DrawView d = new DrawView(c);
        int image = R.drawable.evw_0;
        int len = p.run(source, dest).length;
        String[] strArray = p.run(source, dest);
        List<String> list = new ArrayList<String>(Arrays.asList(strArray));
        list.removeAll(Arrays.asList("", null));
        strArray = list.toArray(new String[0]);
        hallName = findViewById(R.id.textView2);
        switch (source) {
            case "evw":
                hallName.setText("Evans Way");
                switch (sourceFloor) {
                    case "0":
                        floordat = EvansWay_0_Items;
                        image = R.drawable.evw_0;
                        break;
                    case "1":
                        floordat = EvansWay_1_Items;
                        image = R.drawable.evw_1;
                        break;
                    case "2":
                        floordat = EvansWay_2_Items;
                        image = R.drawable.evw_2;
                        break;
                    case "3":
                        floordat = EvansWay_3_Items;
                        image = R.drawable.evw_3;
                        break;
                    case "4":
                        floordat = EvansWay_4_Items;
                        image = R.drawable.evw_4;
                        break;
                    case "5":
                        floordat = EvansWay_5_Items;
                        image = R.drawable.evw_5;
                        break;
                }
                break;
            case "wat":
                hallName.setText("Watson");

                switch (sourceFloor) {
                    case "0":
                        floordat = Watson_0_Items;
                        image = R.drawable.evw_0;
                        break;
                    case "1":
                        floordat = Watson_1_Items;
                        image = R.drawable.evw_0;
                        break;
                }
                break;
            case "bty":
                hallName.setText("Beatty");

                switch (sourceFloor) {
                    case "0":
                        floordat = Beatty_0_Items;
                        image = R.drawable.bty_0;
                        break;
                    case "1":
                        floordat = Beatty_1_Items;
                        image = R.drawable.bty_1;
                        break;
                    case "2":
                        floordat = Beatty_2_Items;
                        image = R.drawable.bty_1;
                        break;
                    case "M":
                        floordat = Beatty_m_Items;
                        image = R.drawable.bty_m;
                        break;
                    case "3":
                        floordat = Beatty_3_Items;
                        image = R.drawable.bty_3;
                        break;
                    case "4":
                        floordat = Beatty_4_Items;
                        image = R.drawable.bty_4;
                        break;
                }
                break;
            case "rub":
                hallName.setText("Rubenstein");

                switch (sourceFloor) {
                    case "0":
                        floordat = Rubenstein_0_Items;
                        image = R.drawable.rub_0;
                        break;
                    case "1":
                        floordat = Rubenstein_1_Items;
                        image = R.drawable.rub_1;
                        break;
                    case "2":
                        floordat = Rubenstein_2_Items;
                        image = R.drawable.rub_2;
                        break;
                }
                break;
            case "king":
                hallName.setText("Kingman");

                switch (sourceFloor) {
                    case "1":
                        floordat = Kingman_1_Items;
                        image = R.drawable.evw_0;
                        break;
                    case "2":
                        floordat = Kingman_2_Items;
                        image = R.drawable.evw_0;
                        break;
                }
                break;
            case "dobb":
                hallName.setText("Dobbs");

                switch (sourceFloor) {
                    case "0":
                        floordat = Dobbs_0_Items;
                        image = R.drawable.dob_0;
                        break;
                    case "1":
                        floordat = Dobbs_1_Items;
                        image = R.drawable.dob_1;
                        break;
                    case "2":
                        floordat = Dobbs_2_Items;
                        image = R.drawable.dob_2;
                        break;
                    case "3":
                        floordat = Dobbs_3_Items;
                        image = R.drawable.dob_3;
                        break;
                }
                break;
            case "will":
                hallName.setText("Williston");

                switch (sourceFloor) {
                    case "0":
                        floordat = Williston_0_Items;
                        image = R.drawable.will_0;
                        break;
                    case "1":
                        floordat = Williston_1_Items;
                        image = R.drawable.will_1;
                        break;
                    case "2":
                        floordat = Williston_2_Items;
                        image = R.drawable.will_2;
                        break;
                    case "3":
                        floordat = Williston_3_Items;
                        image = R.drawable.will_3;
                        break;
                }
                break;
            case "wils":
                hallName.setText("Willson");

                switch (sourceFloor) {
                    case "1":
                        floordat = Willson_1_Items;
                        image = R.drawable.wils_1;
                        break;
                    case "2":
                        floordat = Willson_2_Items;
                        image = R.drawable.wils_2;
                        break;
                }
                break;
            case "went":
                hallName.setText("Wentworth");

                switch (sourceFloor) {
                    case "0":
                        floordat = Wentworth_0_Items;
                        image = R.drawable.went_0;
                        break;
                    case "1":
                        floordat = Wentworth_1_Items;
                        image = R.drawable.went_0;
                        break;
                    case "2":
                        floordat = Wentworth_2_Items;
                        image = R.drawable.went_0;
                        break;
                    case "3":
                        floordat = Wentworth_3_Items;
                        image = R.drawable.went_0;
                        break;
                }
                break;
            case "tdby":
                hallName.setText("Tudbury");

                switch (sourceFloor) {
                    case "0":
                        floordat = Tudbury_0_Items;
                        image = R.drawable.evw_0;
                        break;
                    case "1":
                        floordat = Tudbury_1_Items;
                        image = R.drawable.tdby_1;
                        break;
                    case "2":
                        floordat = (sourceRoom < 4) ? Tudbury_2A_Items : Tudbury_2B_Items;
                        sourceRoom = (sourceRoom < 4) ? sourceRoom : sourceRoom - 5;
                        image = R.drawable.tdby_2;
                        break;
                    case "3":
                        floordat = (sourceRoom < 4) ? Tudbury_3A_Items : Tudbury_3B_Items;
                        sourceRoom = (sourceRoom < 4) ? sourceRoom : sourceRoom - 5;
                        image = R.drawable.tdby_2;
                        break;
                    case "4":
                        floordat = (sourceRoom < 4) ? Tudbury_4A_Items : Tudbury_4B_Items;
                        sourceRoom = (sourceRoom < 4) ? sourceRoom : sourceRoom - 5;
                        image = R.drawable.tdby_2;
                        break;
                }
                break;
            case "empty":
                break;
        }
        img = findViewById(R.id.imageView3);
        if (!finalBldg && !firstBuilding) {
            destRoom = floordat.length - 1;
        }
        if (!firstBuilding) {
            sourceRoom = 0;
        }
        if (firstBuilding && !finalBldg) {
            for (int i = 0; i < floordat.length; i++) {
                if (floordat[i].name.contains("tair")) {
                    destRoom = i;
                }
            }
        }
        if (firstBuilding) {
            firstBuilding = false;
        }
        img.setImageBitmap(Bitmap.createBitmap(d.linePath(floordat, sourceRoom, destRoom, image)));
        return img;
    }

    /**
     * Override the onCreate function
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);
        final TextView text = findViewById(R.id.textView2);
        source = getIntent().getExtras().getString("Source");
        sourceFloor = getIntent().getExtras().getString("SourceFloor");
        dest = getIntent().getExtras().getString("Dest");
        destFloor = getIntent().getExtras().getString("DestFloor");
        sourceRoom = getIntent().getExtras().getInt("SourceRoom");
        destRoom = getIntent().getExtras().getInt("DestRoom");
        destFloorOriginal = destFloor;
        destRoomOriginal = destRoom;
        Log.i("Current SourceDest", String.format("%s,%s", source, dest));
        Pathfinder p = new Pathfinder();
        builds = p.run(source, dest);
        mapImage = findViewById(R.id.imageView5);
        final ImageView img = navLogic(source, dest, sourceFloor, destFloor, sourceRoom, destRoom);
        final Button launch = findViewById(R.id.button6);
        final Button map = findViewById(R.id.map_button);
        if (source.equals(dest) && sourceFloor != "1") {
            text.setText("Take stairs (blue) to floor 1 and exit the building.");
        } else if (source.equals(dest)) {
            text.setText("Proceed from the red dot to the green dot.");

        }
        launch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });
        map.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mapButton(v);
            }

        });
    }
}
