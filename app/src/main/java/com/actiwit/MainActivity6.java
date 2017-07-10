package com.actiwit;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/**
 * Created by Codekahadi_sales on 5/30/2017.
 */

public class MainActivity6 extends AppCompatActivity {
    Handler handler=new Handler();
    int progressCount;
    ImageView iv1;
    ProgressBar pb;
    TextView tv1;
    int startTime=40000;
    int interval=1000;
    public boolean demo = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrn6);

        iv1 = (ImageView) findViewById(R.id.i2);
        pb = (ProgressBar) findViewById(R.id.pb1);
        tv1 = (TextView) findViewById(R.id.t2);

        final myclass mn = new myclass(startTime, interval);

        iv1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if (demo) {
                    iv1.setImageResource(R.drawable.play);
                    demo = false;
                    mn.cancel();

                } else {
                    iv1.setImageResource(R.drawable.pause);
                    demo = true;
                    mn.start();
                }
            }
        });
    }

    public class myclass extends CountDownTimer {
        /**
         * @param millisInFuture    The number of millis in the future from the call
         *                          to {@link #start()} until the countdown is done and {@link #onFinish()}
         *                          is called.
         * @param countDownInterval The interval along the way to receive
         *                          {@link #onTick(long)} callbacks.
         */
        public myclass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            pb.setProgress((int)((40000-millisUntilFinished)/1000));
            tv1.setText(String.format("0 : "+(40000-millisUntilFinished)/1000));
        }

        @Override
        public void onFinish() {
            iv1.setImageResource(R.drawable.play);
            pb.setProgress(0);
            demo=false;

        }
    }


}