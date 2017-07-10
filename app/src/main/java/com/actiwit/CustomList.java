package com.actiwit;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Codekahadi_sales on 5/29/2017.
 */

class CustomList extends ArrayAdapter<String> {
    private final Activity context;
    private final String[]s1;
    private final Integer[] i1;
    public CustomList(Activity context, String[] s1, Integer[] i1) {
        super(context, R.layout.lv, s1);
        this.context = context;
        this.s1 = s1;
        this.i1 = i1;

    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView= inflater.inflate(R.layout.lv, null, true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.te);

        ImageView imageView = (ImageView) rowView.findViewById(R.id.im);
        txtTitle.setText(s1[position]);

        imageView.setImageResource(i1[position]);
        return rowView;
    }
}
