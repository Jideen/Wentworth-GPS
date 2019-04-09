package edu.wit.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map2);
        final TextView text = findViewById(R.id.textView2);

        String source = getIntent().getExtras().getString("Source");
        String dest = getIntent().getExtras().getString("Target");
        Pathfinder p = new Pathfinder();
        text.setText(p.run(source,dest));
    }

}
