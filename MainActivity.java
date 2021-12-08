package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String[] characters = {"Мона", "Дилюк", "Син Цю", "Ци Ци", "Барбара"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView characterList = findViewById(R.id.characters);
        ArrayAdapter<String> adapter = new ArrayAdapter(this,
                android.R.layout.simple_list_item_1, characters);
        characterList.setAdapter(adapter);

        characterList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Intent intent = new Intent(this, SecondActivity.class);
                    startActivity(intent);
                }
                if (i == 1){
                    Intent intent = new Intent(this, SecondActivity.class);
                    startActivity(intent);
                }
                if (i == 2){
                    Intent intent = new Intent(this, SecondActivity.class);
                    startActivity(intent);
                }
                if (i == 3){
                    Intent intent = new Intent(this, SecondActivity.class);
                    startActivity(intent);
                }
                if (i == 4){
                    Intent intent = new Intent(this, SecondActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}