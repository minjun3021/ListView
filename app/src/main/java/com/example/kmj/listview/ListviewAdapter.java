package com.example.kmj.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class ListviewAdapter extends BaseAdapter {
    ArrayList<Item> data;
    Context context;
    int layout;
    public ListviewAdapter(Context context, int layout, ArrayList<Item> data){
        this.data=data;
        this.layout=layout;
        this.context = context;
    }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,parent,false);
        }

        TextView name = convertView.findViewById(R.id.textview);
        String text = data.get(position).getText1();
        name.setText(text);

        return convertView;
    }
}
