package com.actiwit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Codekahadi_sales on 5/29/2017.
 */

public class MainActivity3 extends AppCompatActivity {
    Handler h1 = new Handler();
    ListView lv;
    TextView tv;
    String[] s1 = {"Muse Headband 1", "Muse Headband 2"};

    Integer[] i1 = {R.drawable.tick, R.drawable.tickgray};


    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.scrn3);
        lv = (ListView)findViewById(R.id.lv1);
        CustomList adapter = new
                CustomList(MainActivity3.this, s1, i1);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity3.this, " " + s1[position], Toast.LENGTH_SHORT).show();
            }
        });
        tv=(TextView)findViewById(R.id.t3);
        tv.setText(String.valueOf(lv.getAdapter().getCount()));
        h1.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity3.this, MainActivity4.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(intent);
            }
        }, 2000);

    }
}
