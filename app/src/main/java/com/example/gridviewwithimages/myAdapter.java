package com.example.gridviewwithimages;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class myAdapter extends BaseAdapter {

    String data[];
    int images[];
    Context context;

    public myAdapter(String[] data, int[] images, Context context) {
        this.data = data;
        this.images = images;
        this.context = context;
    }

    @Override
    public int getCount() {
        return data.length;
    }

    @Override
    public Object getItem(int i) {
        return 0;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater inflater=(LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View vw=inflater.inflate(R.layout.singleitem,null);

        ImageView imgView=(ImageView) vw.findViewById(R.id.img1);
        TextView textView=(TextView) vw.findViewById(R.id.txt1);



        imgView.setImageResource(images[i]);
        textView.setText(data[i]);

        return vw;


    }
}
