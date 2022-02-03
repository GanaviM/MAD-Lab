package com.example.dropdownmenu;

import android.graphics.Color;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEventSource;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String[]language ={"C","C++","Java",".NET","iPhone","Android","ASP.NET","PHP"};
    private AccessibilityEventSource AutoCompleteTextViewactv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Creating the instance of ArrayAdapter containing list of language names
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this,android.R.layout.select_dialog_item,language);
        //Getting the instance of AutoCompleteTextView
        AutoCompleteTextViewactv=  (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        AutoCompleteTextView actv = null;
        actv.setThreshold(1);//will start working from first character
        actv.setAdapter(adapter);//setting the adapter data into the AutoCompleteTextView
        actv.setTextColor(Color.RED);
    }
}
