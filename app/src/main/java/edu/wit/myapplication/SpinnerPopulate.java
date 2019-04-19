package edu.wit.myapplication;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class SpinnerPopulate {

    /**
     * Populates the dropdown menus of app
     *
     * @param c object c
     * @param arrayName arraylist of names for dropdown menu
     */
    static public ArrayAdapter<CharSequence> Populate(Context c, int arrayName) {
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(c,
                arrayName, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        return adapter;

    }

    /**
     * Updates the dropdown menus of app
     *
     * @param c object c
     * @param data arraylist of names for dropdown menu
     */
    static public ArrayAdapter<String> updateData(Context c, ArrayList<String> data) {
        ArrayAdapter<String> adapter = new ArrayAdapter<>(c, android.R.layout.simple_spinner_item, data);
        return adapter;
    }

}
