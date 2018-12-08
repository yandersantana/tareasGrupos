package com.example.yander.tareasgrupos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class Gr3 extends AppCompatActivity {
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gr3);

        initToolBar();

    }



    public void initToolBar() {

        toolbar = (Toolbar) findViewById(R.id.toolbar2);

        toolbar.setTitle("Menu Principal");

        setSupportActionBar(toolbar);


        toolbar.setNavigationOnClickListener(

        new View.OnClickListener() {

            @Override

            public void onClick(View v) {

                Toast.makeText(Gr3.this, "clicking the toolbar!", Toast.LENGTH_SHORT).show();

            }

        }
        );


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;

    }
}
