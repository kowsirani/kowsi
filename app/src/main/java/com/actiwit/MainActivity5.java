package com.actiwit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Codekahadi_sales on 5/30/2017.
 */

public class MainActivity5 extends AppCompatActivity {

    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrn5);

        iv=(ImageView)findViewById(R.id.i3);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity5.this,MainActivity6.class);
                startActivity(intent);
            }
        });


    }
}
