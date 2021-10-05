package com.example.mylistview;

import static android.widget.Toast.makeText;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.text.DateFormatSymbols;


public class MainActivity extends AppCompatActivity {

    ListView listViewMonth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewMonth = findViewById(R.id.listViewMonth);
        String[] month = new DateFormatSymbols().getMonths(); //data array nama bulan

        // fungsi untuk menampilkan data list ke listView melalui adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, month);
        listViewMonth.setAdapter(adapter);

        //action klik
        listViewMonth.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                makeText(getApplicationContext(),"Anda klik bulan: "+ parent.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}