package com.example.yander.tareasgrupos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity implements OnClickListener{
    Button b1,b2,b3,b4,b5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.grupo1);
        b2=(Button)findViewById(R.id.grupo2);
        b3=(Button)findViewById(R.id.grupo3);
        b4=(Button)findViewById(R.id.grupo4);
        b5=(Button)findViewById(R.id.grupo5);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
    }

        //implement the onClick method here
        public void onClick(View v) {
            // Perform action on click
            switch(v.getId()) {
                case R.id.grupo1:
                    Intent intent = new Intent (v.getContext(), Gr1.class);
                    startActivityForResult(intent, 0);
                    break;
                case R.id.grupo2:
                    Intent intent2 = new Intent (v.getContext(), TemasGrupo2.class);
                    startActivityForResult(intent2, 0);
                    break;
                case R.id.grupo3:
                    Intent intent3 = new Intent (v.getContext(), TemasGrupo3.class);
                    startActivityForResult(intent3, 0);
                    break;
                case R.id.grupo4:
                    Intent intent4 = new Intent (v.getContext(), temasGrupo4.class);
                    startActivityForResult(intent4, 0);
                    break;
                case R.id.grupo5:
                    Intent intent5 = new Intent (v.getContext(), temasGrupo5.class);
                    startActivityForResult(intent5, 0);
                    break;
            }
        }





    }




