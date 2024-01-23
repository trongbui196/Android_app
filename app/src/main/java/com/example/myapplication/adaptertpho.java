package com.example.myapplication;

import android.view.View;
import android.widget.BaseAdapter;
import android.view.ViewGroup;
import java.util.ArrayList;
import android.widget.TextView;
import android.widget.ImageView;
public class adaptertpho extends BaseAdapter {
    ArrayList<diadiemtpho> dsqte;
    public adaptertpho(ArrayList<diadiemtpho> dsqte){this.dsqte=dsqte;}
    @Override
    public int getCount(){
        return dsqte.size();
    }
    @Override
    public diadiemtpho getItem(int position){
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
            vt=View.inflate(par.getContext(),R.layout.listddtpho,null);
        }
        else vt=cv;
        diadiemtpho tc=getItem(position);
        ((TextView)vt.findViewById(R.id.tieude)).setText(tc.tentp);
        ((ImageView)vt.findViewById(R.id.hinh)).setImageResource(tc.idimgtp);
        return vt;
    }
}