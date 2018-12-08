package com.example.yander.tareasgrupos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class LinearLayout extends AppCompatActivity {

    private android.widget.LinearLayout Lcambio;
    private android.widget.LinearLayout.LayoutParams lpListView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);
    }

    public void cambiarOrientacion(View view){
        Lcambio = (android.widget.LinearLayout) findViewById(R.id.Lcambio);
        if(Lcambio.getOrientation()== android.widget.LinearLayout.VERTICAL){
            Lcambio.setOrientation(android.widget.LinearLayout.HORIZONTAL);
        }else{
            Lcambio.setOrientation(android.widget.LinearLayout.VERTICAL);
        }
    }
}
