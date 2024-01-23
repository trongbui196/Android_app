package com.example.myapplication;

import android.view.View;
import android.widget.BaseAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.ImageView;
public class adapterquocte extends BaseAdapter {
    ArrayList<diadiemquocte> dsqte;
    public adapterquocte(ArrayList<diadiemquocte> dsqte){this.dsqte=dsqte;}
    @Override
    public int getCount(){
        return dsqte.size();
    }
    @Override
    public diadiemquocte getItem(int position){
        return dsqte.get(position);
    }
    @Override

    public long getItemId(int position){
        return position;
    }
    @Override

    public View getView(int position, View cv, ViewGroup par){
        View vt = null;
        if(vt==null){
                vt=View.inflate(par.getContext(),R.layout.listdiadiemquocte,null);
        }
        else vt=cv;
        diadiemquocte tc=getItem(position);
        ((TextView)vt.findViewById(R.id.tieude)).setText(tc.tenqte);
        ((ImageView)vt.findViewById(R.id.hinh)).setImageResource(tc.idimgqte);
        return vt;
    }
}