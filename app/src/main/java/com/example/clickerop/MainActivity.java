package com.example.clickerop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button ez;
    Button ez1;
    Switch bambol;
    TextView xd;
    Integer bruh = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ez1=findViewById(R.id.button3);
        ez = findViewById(R.id.button);
        xd = findViewById(R.id.textView);
        bambol = findViewById(R.id.switch1);

        xd.setText("Wynik: " + bruh);
        ez1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bruh=0;
                xd.setText("Wynik: " + bruh);
                bambol.setChecked(false);
            }
        });
        bambol.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(bambol.isChecked()) {
                    ez.setText("-1");
                }
                else
                    ez.setText("+1");

            }
        });
        ez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(bambol.isChecked()) {
                    bruh--;
                }
                else
                    bruh++;


                xd.setText("Wynik: " + bruh);

            }
        });

    }
}