package com.example.myautocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private static final String[] KOTA = new String[]{
      "Ambon", "Aceh", "Bandung", "Bogor", "Bengkulu", "Banyuwangi", "Bangkalan", "Banjarmasin", "Bondowoso", "Bojonegoro"
    };

    AutoCompleteTextView autocompletekota;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autocompletekota = findViewById(R.id.autocompletekota);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, KOTA);
        autocompletekota.setAdapter(adapter);
    }
}