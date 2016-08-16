package com.ts.placement.layoutapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup radiogroup;
    RadioButton radiobutton;
    CheckBox  c1, c2, c3, c4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void startLinearActivity(View v) {
        Intent i1 = new Intent(this, LinearActivity.class);
        startActivity(i1);


    }

    public void startTableActivity(View v) {
        Intent i2 = new Intent(this, TableActivity.class);
        startActivity(i2);


    }
    public void displayChoice(View v)
    {

    }

    public void selectedCourse(View v)
    {
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        c4 = (CheckBox) findViewById(R.id.c4);
        StringBuilder orderlist = new StringBuilder();
            orderlist.append("you have orderded:  ");
        if (c1.isChecked()) {
            orderlist.append(c1.getText() + " ");
        }
        if (c2.isChecked()) {
            orderlist.append(c2.getText() + " ");
        }
        if (c3.isChecked()) {
            orderlist.append(c3.getText() + " ");
        }
        if (c4.isChecked()) {
            orderlist.append(c4.getText() + " ");
        }
        Toast.makeText(this, orderlist, Toast.LENGTH_LONG);
        c1.setChecked(false);
        c2.setChecked(false);
        c3.setChecked(false);
        c4.setChecked(false);
    }
}


