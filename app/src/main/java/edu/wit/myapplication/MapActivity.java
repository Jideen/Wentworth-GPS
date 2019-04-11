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

public class mapActivity extends AppCompatActivity {
    String source, sourceFloor, dest, destFloor,destFloorOriginal;
    String[] builds;
    int sourceRoom,destRoom,destRoomOriginal;
    public int curBuilding = 0;
    public boolean finalBldg = false;
    int buildingTracker = 0;
    public void buttonCode(View v) {
//        Intent toFin = new Intent(this, mapActivity.class);
//        startActivity(toFin);
        curBuilding++;
        if(source!=dest){
            sourceFloor = "1";
        }
        if(sourceFloor == "1" && curBuilding == 0){
            source = builds[curBuilding - 1];
        } else if(curBuilding < builds.length){
            source = builds[curBuilding];
        } else{
            source = builds[curBuilding-1];
        }
        if(source.equals(dest) && !sourceFloor.equals(destFloor)){
            destFloor = destFloorOriginal;
            sourceFloor = destFloorOriginal;
        }
        sourceFloor = (finalBldg)?destFloorOriginal:"1";
        if(source.equals(dest)){
            finalBldg = true;
        }
        Log.i("Current Rooms",String.format("%d, %d",sourceRoom,destRoom));

            navLogic(source,dest, sourceFloor, destFloor, sourceRoom, destRoom);

    }
    public ImageView navLogic(String src, String dst, String srcF, String dstF, int srcR, int dstR){
        String source = src;
        String dest = dst;
        String sourceFloor = srcF;
        String destFloor = dstF;
        int sourceRoom = srcR;
        int destRoom = dstR;
        Point2D[] floordat = {new Point2D()};
        Log.i("Current Bldg/Floor",String.format("%s,%s",source,sourceFloor));
        Pathfinder p = new Pathfinder();
        Context c = this;
        DrawView d = new DrawView(c);
        int image = R.drawable.evw_0;
        int len = p.run(source,dest).length;
        String[] strArray = p.run(source,dest);
        List<String> list = new ArrayList<String>(Arrays.asList(strArray));
        list.removeAll(Arrays.asList("", null));
        strArray = list.toArray(new String[0]);
        switch (source) {
            case "evw":
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
                switch (sourceFloor) {
                    case "0":
                        floordat = Watson_0_Items;
                        image = R.drawable.wat_0;
                        break;
                    case "1":
                        floordat = Watson_1_Items;
                        image = R.drawable.wat_1;
                        break;
                }
                break;
            case "bty":
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
                switch (sourceFloor) {
                    case "1":
                        floordat = Kingman_1_Items;
                        break;
                    case "2":
                        floordat = Kingman_2_Items;
                        break;
                }
                break;
            case "dobb":
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
                switch (sourceFloor) {
                    case "0":
                        floordat = Williston_0_Items;
                        break;
                    case "1":
                        floordat = Williston_1_Items;
                        break;
                    case "2":
                        floordat = Williston_2_Items;
                        break;
                    case "3":
                        floordat = Williston_3_Items;
                        break;
                }
                break;
            case "wils":
                switch (sourceFloor) {
                    case "1":
                        floordat = Willson_1_Items;
                        break;
                    case "2":
                        floordat = Willson_2_Items;
                        break;
                }
                break;
            case "went":
                switch (sourceFloor) {
                    case "0":
                        floordat = Wentworth_0_Items;
                        image = R.drawable.went_0;
                        break;
                    case "1":
                        floordat = Wentworth_1_Items;
                        break;
                    case "2":
                        floordat = Wentworth_2_Items;
                        break;
                    case "3":
                        floordat = Wentworth_3_Items;
                        break;
                }
                break;
            case "tdby":
                switch (sourceFloor) {
                    case "0":
                        floordat = Tudbury_0_Items;
                        image = R.drawable.tdby_1;
                        break;
                    case "1":
                        floordat = Tudbury_1_Items;
                        image = R.drawable.tdby_1;
                        break;
                    case "2":
                        floordat = (sourceRoom<4)?Tudbury_2A_Items:Tudbury_2B_Items;
                        break;
                    case "3":
                        floordat = (sourceRoom<4)?Tudbury_3A_Items:Tudbury_3B_Items;
                        break;
                    case "4":
                        floordat = (sourceRoom<4)?Tudbury_4A_Items:Tudbury_4B_Items;
                        break;
                }
                break;
            case "empty":
                break;
        }
        if(source != dest || sourceFloor != destFloor){
            destRoom = (sourceRoom>(floordat.length/2))?0:floordat.length-1;
        }
        final ImageView img = findViewById(R.id.imageView3);
        img.setImageBitmap(Bitmap.createBitmap(d.linePath(floordat, sourceRoom, destRoom, image)));
        return img;
    }

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
        Log.i("Current SourceDest",String.format("%s,%s",source,dest));
        Pathfinder p = new Pathfinder();
        builds = p.run(source,dest);
        final ImageView img = navLogic(source,dest,sourceFloor,destFloor,sourceRoom,destRoom);
        final Button launch = findViewById(R.id.button6);
        if(source.equals(dest) && sourceFloor != "1"){
            text.setText("Take stairs (blue) to floor 1 and exit the building.");
        }else if(source.equals(dest)){
            text.setText("Proceed from the red dot to the green dot.");
        }
        launch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });

    }

}
