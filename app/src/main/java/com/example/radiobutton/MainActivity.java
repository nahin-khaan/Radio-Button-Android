package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioG;    //RadioGroup variable
    RadioButton gender; //RadioButton variable
    Button sendBtn;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioG = findViewById(R.id.radioGroup);
        sendBtn = findViewById(R.id.sendButton);
        resultText = findViewById(R.id.gendertext);
        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String selectID = String.valueOf(radioG.getCheckedRadioButtonId());// get radiogroup  checked id
                gender = findViewById(Integer.parseInt(selectID));
                String value = gender.getText().toString();
                resultText.setText("Your Gender is : " + value);
            }
        });

    }
}