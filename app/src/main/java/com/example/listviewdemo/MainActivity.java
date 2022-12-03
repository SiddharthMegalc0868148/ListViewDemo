package com.example.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText editText = findViewById(R.id.ET1);
        Button button = findViewById(R.id.BTN1);

        ArrayList<String> listData = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                listData
        );

        ListView list = findViewById(R.id.LV);
        list.setAdapter(adapter);

        button.setOnClickListener(
                v->{
                    String textValue = editText.getText().toString();
                    if(textValue.isEmpty()){
                        Toast.makeText(this, "Please enter the Name!", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        listData.add(textValue);
                        adapter.notifyDataSetChanged();
                        Toast.makeText(this, "New Name is added!", Toast.LENGTH_SHORT).show();
                        editText.setText("");
                    }

                }
        );

    }
}



