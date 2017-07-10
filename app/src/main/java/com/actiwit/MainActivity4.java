package com.actiwit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import static com.actiwit.R.color.lg;

/**
 * Created by Codekahadi_sales on 5/30/2017.
 */

public class MainActivity4 extends AppCompatActivity {

    Toolbar tv;
    EditText ev,ev1;
    ImageView ib;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.scrn4);
    tv=(Toolbar)findViewById(R.id.tb1);
    tv.setNavigationIcon(R.drawable.ic_backarrow);
    tv.setNavigationOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            onBackPressed();
        }
    });

    ev=(EditText)findViewById(R.id.e1);
    ev.setHint("First name");
    ev.setHintTextColor(R.color.lg);
    ev1=(EditText)findViewById(R.id.e2);
    ev1.setHint("Last name");
    ev1.setHintTextColor(R.color.lg);

    ib=(ImageView) findViewById(R.id.ib);
    ib.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(MainActivity4.this,MainActivity5.class);
            startActivity(intent);
        }
    });

}

}
