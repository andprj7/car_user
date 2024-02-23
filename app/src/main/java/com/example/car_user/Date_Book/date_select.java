package com.example.car_user.Date_Book;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.car_user.R;

import java.util.List;

public class date_select extends AppCompatActivity {

    EditText edt_start_date,edt_end_date,edt_TO;
    Spinner spin_seat,spin_From;
    TextView txt_total_day;
    Button btn_find;
    RecyclerView cat_price;
    String start_date,end_date,passenger,price_range;

    List<String> items;
    String item;
    List<String> items1;
    String item1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_select);

        edt_start_date = findViewById(R.id.edt_start_date);
        edt_end_date = findViewById(R.id.edt_end_date);
        edt_TO = findViewById(R.id.edt_TO);
        spin_seat = findViewById(R.id.spin_seat);
        spin_From = findViewById(R.id.spin_From);
        txt_total_day = findViewById(R.id.txt_total_day);
        btn_find = findViewById(R.id.btn_find);
        cat_price = findViewById(R.id.cat_price);


        start_date = edt_start_date.getText().toString();
        end_date = edt_end_date.getText().toString();









    }
}