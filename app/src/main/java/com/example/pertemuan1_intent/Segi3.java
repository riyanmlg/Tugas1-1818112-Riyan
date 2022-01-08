package com.example.pertemuan1_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Segi3 extends AppCompatActivity {
    double a,t;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segi3);

        final EditText edtAlas = (EditText) findViewById(R.id.input_alas);
        final EditText edtTinggi = (EditText) findViewById(R.id.input_tinggi);
        final TextView tvHasil = (TextView) findViewById(R.id.out_hasil);

        final Button hitung = (Button)findViewById(R.id.hitung);
        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View b) {
                if ((edtAlas.getText().length() > 0) && (edtTinggi.getText().length() > 0)) {
                    a = Integer.parseInt(edtAlas.getText().toString().trim());
                    t = Integer.parseInt(edtTinggi.getText().toString().trim());
                    double Kalk = 0.5*a*t;
                    tvHasil.setText(Double.toString(Kalk));
                } else {
                    Toast.makeText(getApplicationContext() , "Alas / Tinggi tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                }

            }
        });


    }


}