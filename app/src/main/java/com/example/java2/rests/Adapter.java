package com.example.java2.rests;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.java2.rests.Model.Comment;

import java.util.ArrayList;

/**
 * Created by java2 on 11/10/2016.
 */

public class Adapter extends BaseAdapter {
    Context context;
    ArrayList<Comment> users;

    public Adapter(Context context, ArrayList<Comment> users) {
        this.context = context;
        this.users = users;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return users.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            // inflate the layout

            LayoutInflater inflater = ((Activity) context).getLayoutInflater();

            convertView = inflater.inflate(R.layout.row_resource, parent, false);

        }

        Comment objectItem = (Comment) getItem(position);

        TextView textViewItem = (TextView) convertView.findViewById(R.id.tv_text);
        TextView textView = (TextView) convertView.findViewById(R.id.score);
        textViewItem.setText(position + "  " + users.get(position).getOwner().getDisplay_name());
        textView.setText(Integer.toString(users.get(position).getScore()));


        return convertView;
    }
}
