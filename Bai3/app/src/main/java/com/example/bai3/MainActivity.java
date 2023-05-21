package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioGroup;
import java.util.ArrayList;

import model.Employee;
import model.EmployeeFulltime;
import model.EmployeeParttime;


public class MainActivity extends AppCompatActivity {

    private EditText etId, etName;
    private Button btnSubmit;
    private RadioGroup rgType;
    private ListView lvEmployee;
    private ArrayList<Employee> employees = new ArrayList<Employee>();
    private ArrayAdapter<Employee> adapter = null;
    private Employee employee = null;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etId = (EditText) findViewById(R.id.et_ma_nv);
        etName = (EditText) findViewById(R.id.et_ten_nv);
        btnSubmit = (Button) findViewById(R.id.btn_nhap);
        rgType = (RadioGroup) findViewById(R.id.rg_loai_nv);
        lvEmployee = (ListView) findViewById(R.id.lv_nv);
        adapter = new ArrayAdapter<Employee>(this,
                android.R.layout.simple_list_item_1,
                employees);
        lvEmployee.setAdapter(adapter);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                addNewEmployee();
            }
        });
    }
    public void addNewEmployee() {
        int radId = rgType.getCheckedRadioButtonId();
        String id = etId.getText().toString();
        String name = etName.getText().toString();
        if (radId == R.id.rd_chinhthuc) {
            employee = new EmployeeFulltime();
        } else {
            employee = new EmployeeParttime();
        }
        employee.setId(id);
        employee.setName(name);
        employees.add(employee);
        adapter.notifyDataSetChanged();
    }
}