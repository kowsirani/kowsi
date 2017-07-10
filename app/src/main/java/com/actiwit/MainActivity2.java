package com.actiwit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
     // Handler h1=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrn2);

        Toast.makeText(MainActivity2.this,"Welcome",Toast.LENGTH_LONG).show();


        final Button bu1 = (Button) findViewById(R.id.b1);
        final TextView tv = (TextView) findViewById(R.id.t1);

        bu1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                bu1.setVisibility(View.INVISIBLE);
                tv.setText("Sacnning your device...");
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                Toast.makeText(MainActivity2.this,"Welcome",Toast.LENGTH_LONG).show();
            }
        });
    }
}

