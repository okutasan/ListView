package com.example.tuturu.listview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter {

    private ArrayList list;
    private Activity act;

    public ListAdapter(Activity context, ArrayList objects){
        super(context, R.layout.item,objects);
        this.list=objects;
        this.act=context;
    }

    static class ViewHolder {
        protected ImageView icon;
        protected TextView nama;
        protected TextView keteranga;
    }

    public View getView(int position, View convertView, ViewGroup parebt){
        View view = convertView;
        if(view==null){
            LayoutInflater inflater = act.getLayoutInflater();
            view = inflater.inflate(R.layout.item,null);

            ViewHolder holder=new ViewHolder();
            holder.icon = (ImageView) view.findViewById(R.id.item_icon);
            holder.nama = view.findViewById(R.id.item_nama);
            holder.keteranga = (TextView)view.findViewById(R.id.item_keterangan);
            view.setTag(holder);
        }

        ViewHolder holder = (ViewHolder) view.getTag();
        Phone phone = (Phone) list.get(position);

        holder.icon.setImageResource(R.drawable.icon);
        holder.nama.setText(phone.getName());
        holder.keteranga.setText(phone.getBrand());
        return view;
    }
}
