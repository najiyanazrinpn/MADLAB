package com.practice.intentformvaluedisplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText name, username, password;
    RadioButton male, female, other;
    CheckBox sing, dance, trek;
    Button register;
    int age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner)findViewById(R.id.age);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.age_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        name = (EditText) findViewById(R.id.name);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);

        male = (RadioButton) findViewById(R.id.male);
        female = (RadioButton) findViewById(R.id.female);
        other = (RadioButton) findViewById(R.id.other);

        sing = (CheckBox) findViewById(R.id.sing);
        dance = (CheckBox) findViewById(R.id.dance);
        trek = (CheckBox) findViewById(R.id.trek);

        register = (Button) findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nm, gender = "", unm, pwd, s="";

                nm = name.getText().toString();
                unm = username.getText().toString();
                pwd = password.getText().toString();

                if (male.isChecked())
                    gender = "Male";
                if (female.isChecked())
                    gender = "Female";
                if (other.isChecked())
                    gender = "Others";

                if (sing.isChecked())
                    s+=" Singing";
                if (dance.isChecked())
                    s+=" Dancing";
                if (trek.isChecked())
                    s+=" Trekking";

                String values = "\nName: "+nm+"\nAge: "+age+"\nGender "+gender+"\nHobbies: "+" "+s+"\nUsername: "+unm+"\nPassword: "+pwd;

                Toast.makeText(MainActivity.this, values, Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainActivity.this, ViewValues.class);
                intent.putExtra("values", values);
                startActivity(intent);

            }
        });
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        age = Integer.parseInt(""+adapterView.getItemAtPosition(i)+"");
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
