package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    ListView lvPerson;
    TextView tvSelection;
    String arr[] = {"Teo", "Ty", "Bin", "Bo"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final String arr[] = {"Teo", "Ty", "Bin", "Bo"};
        ListView lvPerson = (ListView) findViewById(R.id.lv_person);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, arr);
        lvPerson.setAdapter(adapter);
        final TextView tvSelection = (TextView) findViewById(R.id.tv_selection);
        lvPerson.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
                                            long arg3) {
                        tvSelection.setText("position :" + arg2 + " ; value =" +

                                arr[arg2]);
                    }
                });









    }





}