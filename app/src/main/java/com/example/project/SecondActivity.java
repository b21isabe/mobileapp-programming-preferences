package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SecondActivity extends AppCompatActivity {

    SharedPreferences myPreferenceRef;
    SharedPreferences.Editor myPreferenceEditor;
    Button EnterButton;
    EditText EditTextName;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        myPreferenceRef = getSharedPreferences("MyPreferencesName", MODE_PRIVATE);
        EnterButton = findViewById(R.id.EnterButton);
        EditTextName = findViewById(R.id.EditTextName);
        EnterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = EditTextName.getText().toString();

                myPreferenceEditor = myPreferenceRef.edit();
                myPreferenceEditor.putString("MyAppPreferenceString",name);
                myPreferenceEditor.apply();
            }
        });

    }

}