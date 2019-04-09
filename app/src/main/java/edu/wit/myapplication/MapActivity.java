package edu.wit.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class mapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);
        setContentView(new DrawView(this));
        final TextView text = findViewById(R.id.textView2);

        String source = getIntent().getExtras().getString("Source");
        String dest = getIntent().getExtras().getString("Dest");
        Pathfinder p = new Pathfinder();
        StringBuilder s = new StringBuilder();
        int len = p.run(source,dest).length;
        String[] strArray = p.run(source,dest);
        for(int i=0;i<len; i++){
            s.append(strArray[i]);
            //s.append(", ");
        }
//        text.setText(s.toString());
    }

}
