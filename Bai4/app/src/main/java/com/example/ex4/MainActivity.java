package com.example.ex4;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;

import com.example.ex4.R;
import com.example.ex4.Employee;
import com.example.ex4.EmployeeAdapter;

public class MainActivity extends AppCompatActivity {

    private List<Employee> employees;
    private EmployeeAdapter employeeAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText etID=(EditText) findViewById(R.id.et_id);
        final EditText etFullname=(EditText) findViewById(R.id.et_fullname);
        final CheckBox cbManager=(CheckBox) findViewById(R.id.cb_manager);
        Button btnAdd=(Button) findViewById(R.id.btn_add);
        ListView lvEmployee=(ListView) findViewById(R.id.lv_employee);
        employees=new ArrayList<>();
        employeeAdapter=new EmployeeAdapter(MainActivity.this, 1, employees);
        lvEmployee.setAdapter(employeeAdapter);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Employee employee=new Employee();
                employee.setId(etID.getText().toString());
                employee.setFullName(etFullname.getText().toString());
                employee.setManager(cbManager.isChecked());
                employees.add(employee);
                employeeAdapter.notifyDataSetChanged();
                etFullname.setText("");
                etID.setText("");
                cbManager.setChecked(false);
                etID.requestFocus();
            }
        });
    }
}
