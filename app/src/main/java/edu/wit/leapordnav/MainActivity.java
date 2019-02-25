package edu.wit.leapordnav;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    public void buttonCode(View v) {
        Button b = (Button) v;
        String buttonText = b.getText().toString();
        Intent toMap = new Intent(v.getContext(), Map_Screen.class);
        toMap.putExtra("Destination", buttonText);
        startActivity(toMap);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button toClass = findViewById(R.id.button2);
        toClass.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });
        final Button toFood = findViewById(R.id.button3);
        toFood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });
        final Button toOffice = findViewById(R.id.button);
        toOffice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });
        final Button toServices = findViewById(R.id.button4);
        toServices.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                buttonCode(v);
            }
        });
    }
}
