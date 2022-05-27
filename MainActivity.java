package com.example.demo1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.icu.text.CaseMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Button button;


    private Object v;
    private Context context;
    Resources resources;
    TextView t1;
    TextView t2;
    Button b1;
    CaseMap.Title title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.b1);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);




        //get the spinner from the xml.
        Spinner dropdown = findViewById(R.id.spinner1);
//create a list of items for the spinner.
        String[] items = new String[]{"English", "हिन्दी","ગુજરાતી"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.


        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(MainActivity.this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View v, int position, long id) {

        switch (position) {
            case 0:
                context = LocaleHelper.setLocale(MainActivity.this, "en");
                resources = context.getResources();
                t1.setText(resources.getString(R.string.user));
                t2.setText(resources.getString(R.string.user1));
               b1.setText(resources.getString(R.string.button));
                this.setTitle(resources.getString(R.string.app_name));
                // Whatever you want to happen when the first item gets selected
                break;
            case 1:
                context = LocaleHelper.setLocale(MainActivity.this, "hi");
                resources = context.getResources();
                t1.setText(resources.getString(R.string.user));
                t2.setText(resources.getString(R.string.user1));
               b1.setText(resources.getString(R.string.button));
                this.setTitle(resources.getString(R.string.app_name));
                // Whatever you want to happen when the second item gets selected
                break;
                case 2:
                context = LocaleHelper.setLocale(MainActivity.this, "gu");
                resources = context.getResources();
                t1.setText(resources.getString(R.string.user));
                t2.setText(resources.getString(R.string.user1));
               b1.setText(resources.getString(R.string.button));
                    this.setTitle(resources.getString(R.string.app_name));
                // Whatever you want to happen when the second item gets selected
                break;

        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // TODO Auto-generated method stub
    }



    }

