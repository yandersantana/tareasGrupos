package com.example.yander.tareasgrupos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class temasGrupo4 extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas_grupo4);
        b1=(Button)findViewById(R.id.tema1);
        b2=(Button)findViewById(R.id.tema2);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);

    }

    //implement the onClick method here
    public void onClick(View v) {
        // Perform action on click
        switch(v.getId()) {
            case R.id.tema1:
                Intent intent = new Intent (v.getContext(), Gr4.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.tema2:
                Intent intent2 = new Intent (v.getContext(), ProgressB.class);
                startActivityForResult(intent2, 0);
                break;

        }
    }





}