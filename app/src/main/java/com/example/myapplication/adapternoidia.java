package com.example.myapplication;

import android.view.View;
import android.widget.BaseAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.ImageView;
public class adapternoidia extends BaseAdapter {
    ArrayList<diadiemnoidia> dsnoidia;
    public adapternoidia(ArrayList<diadiemnoidia> dsnoidia){this.dsnoidia=dsnoidia;}
    @Override
    public int getCount(){
        return dsnoidia.size();
    }
    @Override
    public diadiemnoidia getItem(int position){
        return dsnoidia.get(position);
    }
    @Override

    public long getItemId(int position){
        return position;
    }
    @Override

    public View getView(int position, View cv, ViewGroup par){
        View vt = null;
        if(vt==null){
            vt=View.inflate(par.getContext(),R.layout.listddnoidia,null);
        }
        else vt=cv;
        diadiemnoidia tc=getItem(position);
        ((TextView)vt.findViewById(R.id.tieude)).setText(tc.tenndia);
        ((ImageView)vt.findViewById(R.id.hinh)).setImageResource(tc.idimgndia);
        return vt;
    }
}