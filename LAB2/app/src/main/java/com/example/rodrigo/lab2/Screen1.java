package com.example.rodrigo.lab2;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.app.AlertDialog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class Screen1 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen1);

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "Frutas").build();

        Fruit WaterMelon = new Fruit("Watermelon");
        db.fruitsDao().insert(WaterMelon);
        Fruit StrawBerry = new Fruit("Strawberry");
        db.fruitsDao().insert(StrawBerry);
        Fruit Orange = new Fruit("Orange");
        db.fruitsDao().insert(Orange);
        List<Fruit> frutas = db.fruitsDao().getAll();
        final ListView lv = (ListView) findViewById(R.id.lv);



        String[] fruits = new String[] {};

        for (int x=0; x<frutas.size();x++){
            Fruit temp = frutas.get(x);
            fruits[x]=temp.name;
        }

        // Create a List from String Array elements
        final List<String> fruits_list = new ArrayList<String>(Arrays.asList(fruits));

        // Create an ArrayAdapter from List
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_list_item_1, fruits_list);
        lv.setAdapter(arrayAdapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Screen1.this, Screen2.class);
                String message = parent.getAdapter().getItem(position).toString();
                intent.putExtra(EXTRA_MESSAGE, message);
                startActivity(intent);
                //Toast.makeText(Screen1.this, parent.getAdapter().getItem(position).toString(), Toast.LENGTH_LONG).show();
                Log.v("MESSAGE",parent.getAdapter().getItem(position).toString());
                //Log.v("M Toast.makeText(getActivity(), arg2+"", Toast.LENGTH_LONG).show();essage", Toast.);
            }
        });

    }
}

