package com.example.yander.tareasgrupos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;

public class temasGrupo5 extends AppCompatActivity implements View.OnClickListener {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temas_grupo5);
        b1=(Button)findViewById(R.id.tema1);
        b2=(Button)findViewById(R.id.tema2);
        b3=(Button)findViewById(R.id.tema3);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
    }

    //implement the onClick method here
    public void onClick(View v) {
        // Perform action on click
        switch(v.getId()) {
            case R.id.tema1:
                Intent intent = new Intent (v.getContext(), Gr5.class);
                startActivityForResult(intent, 0);
                break;
            case R.id.tema2:
                Intent intent2 = new Intent (v.getContext(), LinearLayout.class);
                startActivityForResult(intent2, 0);
                break;
            case R.id.tema3:
                Intent intent3 = new Intent (v.getContext(), GrLayout.class);
                startActivityForResult(intent3, 0);
                break;
        }
    }





}
