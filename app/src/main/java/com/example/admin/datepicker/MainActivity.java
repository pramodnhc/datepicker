package com.example.admin.datepicker;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    public TextView display;
    public Button datebtn;
    int d,y,m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findcontrol();

        datebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar = Calendar.getInstance();
                d=calendar.get(calendar.DAY_OF_MONTH);
                m=calendar.get(calendar.MONTH);
                y=calendar.get(calendar.YEAR);

                DatePickerDialog pickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {


                        display.setText("Selected Date is : Date =" +i2 +" Month ="+i1 +"Year ="+i);

                    }
                }, d, m, y);
                pickerDialog.show();
            }
        });
    }

    public void findcontrol(){

        datebtn =(Button)findViewById(R.id.btndatepicker);
        display =(TextView)findViewById(R.id.displayvalue);

    }
}
