package com.example.egzpralkamobilna;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnZatwierdz;
    Button btnWlacz;
    boolean wlaczonyOdkurzacz = false;
    EditText editTextPobranaLiczba;
    TextView textViewPranie;
    int jakiProgram;
    TextView textViewOdkurzaczWlaczony;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        editTextPobranaLiczba = findViewById(R.id.editTextNumber);
        btnZatwierdz = findViewById(R.id.button);
        textViewPranie = findViewById(R.id.textView3);
        btnWlacz = findViewById(R.id.button2);
        textViewOdkurzaczWlaczony = findViewById(R.id.textView5);

        btnZatwierdz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        jakiProgram = Integer.parseInt(editTextPobranaLiczba.getText().toString());
                        if(jakiProgram >= 1 && jakiProgram <= 12) {
                            textViewPranie.setText("Numer prania: " + jakiProgram);
                        }
                    }
                }
        );
        btnWlacz.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        if(wlaczonyOdkurzacz == false) {
                            wlaczonyOdkurzacz = true;
                        } else if(wlaczonyOdkurzacz == true) {
                            wlaczonyOdkurzacz = false;
                        }

                        if(wlaczonyOdkurzacz == false){
                            textViewOdkurzaczWlaczony.setText("Odkurzacz wyłączony");
                            btnWlacz.setText("Włącz");
                        } else if(wlaczonyOdkurzacz == true){
                            textViewOdkurzaczWlaczony.setText("Odkurzacz włączony");
                            btnWlacz.setText("Wyłacz");
                        }
                    }
                }
        );

    }










}