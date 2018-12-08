package com.example.yander.tareasgrupos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
public class Gr2 extends AppCompatActivity {
    private TextView textView;
    private Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gr2);
        TimePicker tp = (TimePicker) this.findViewById(R.id.timePicker);
        tp.setIs24HourView(true);

        textView=(TextView)findViewById(R.id.textViewHora);
        final TimePicker timePicker= (TimePicker)findViewById(R.id.timePicker);
        boton=(Button)findViewById(R.id.buttonActHora);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int hora= timePicker.getCurrentHour();
                int min=timePicker.getCurrentMinute();
                textView.setText(String.valueOf(hora)+": "+String.valueOf(min));

            }
        });


    }


}
