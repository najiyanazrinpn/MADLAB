package com.example.radiobutton;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        // Check which radiobutton was clicked
        switch (view.getId()) {
            case R.id.rb1:
                if (checked) {
                    displaymessage("selected BCA");
                }

                break;
            case R.id.rb2:
                if (checked) {
                    displaymessage("selected MCA");
                }
                break;

        }



    }
    public void displaymessage (String s)
    {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }


}
