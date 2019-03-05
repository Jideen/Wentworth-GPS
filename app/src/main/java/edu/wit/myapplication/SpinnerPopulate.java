package edu.wit.myapplication;

import android.content.Context;
import android.widget.ArrayAdapter;

public class SpinnerPopulate {

    static public ArrayAdapter<CharSequence> spinnerPopulate(Context c, int arrayName) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(c,
                arrayName, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return adapter;
    }
}
