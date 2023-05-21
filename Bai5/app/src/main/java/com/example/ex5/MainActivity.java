package com.example.ex5;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ex5.adapter.DishAdapter;
import com.example.ex5.adapter.SpinnerAdapter;
import com.example.ex5.model.Dish;
import com.example.ex5.model.Thumbnail;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spinnerMonAn;
    SpinnerAdapter spinnerAdapter;
    Dish res_dish;
    Button btnAdd;
    GridView gvDish;
    EditText edtName;
    ArrayList<Dish> arrayDish;
    ArrayList<Dish> dishgv;
   DishAdapter adapter;
    CheckBox chbxPromotion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        arrayDish = new ArrayList<Dish>();
        arrayDish.add(new Dish("Thumbnail 1", R.drawable.first_thumbnail));
        arrayDish.add(new Dish("Thumbnail 2", R.drawable.second_thumbnail));
        arrayDish.add(new Dish("Thumbnail 3", R.drawable.third_thumbnail));
        arrayDish.add(new Dish("Thumbnail 4", R.drawable.fourth_thumbnail));


        //final List<String> thumbnails = Arrays.asList("cake", "candy", "chocolate", "icecream", "omelette");
        spinnerMonAn = (Spinner) findViewById(R.id.spinner);

        spinnerAdapter = new SpinnerAdapter(getApplicationContext(), R.layout.my_dropdown_item, arrayDish);
        spinnerMonAn.setAdapter(spinnerAdapter);


        spinnerMonAn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, "Added successfully", Toast.LENGTH_SHORT).show();
                res_dish = arrayDish.get(i);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
        chbxPromotion = (CheckBox) findViewById(R.id.checkBox) ;
        btnAdd  = (Button) findViewById(R.id.btnAdd) ;
        gvDish = (GridView) findViewById(R.id.gvDish);

        edtName = (EditText) findViewById(R.id.edtName);
        dishgv = new ArrayList<Dish>();
        adapter = new DishAdapter(this, R.layout.item_dish,dishgv);
        gvDish.setAdapter(


        );


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = edtName.getText().toString();
                dish dish = new Dish();
                dish.setName(name);

               dish.setThumbnail(res_dish.getThumbnail());

                if (chbxPromotion.isChecked())
                {
                    monan.setPromotion(true);
                }
                else
                {
                    monan.setPromotion(false);
                }

                monanGv.add(monan);
                edtName.setText("");
                spinnerMonAn.setSelection(0);
                chbxPromotion.setChecked(false);
                adapter.notifyDataSetChanged();
            }
        });
    }
}