package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class NdiaActivity extends AppCompatActivity {
    ActionBar a1;
    ArrayList<diadiemnoidia> dstruyen;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qte);
        a1=getSupportActionBar();
        a1.setDisplayShowHomeEnabled(true);
        a1.setDisplayHomeAsUpEnabled(true);
        a1.setHomeButtonEnabled(true);
        a1.setDisplayUseLogoEnabled(true);
        a1.setTitle(R.string.app_name);
        a1.setLogo(R.drawable.apple_logo_logo_png_hd_11659045639in0mv42cpz);
        a1.show();

        dstruyen=new ArrayList<diadiemnoidia>();
        dstruyen.add(new diadiemnoidia("Sài Gòn",R.drawable.saigon,R.raw.t01));
        dstruyen.add(new diadiemnoidia("Hà Nội",R.drawable.hanoi,R.raw.t02));
        dstruyen.add(new diadiemnoidia("Phú Quốc",R.drawable.phu_quoc,R.raw.t03));
        dstruyen.add(new diadiemnoidia("Hội An",R.drawable.hoian,R.raw.t04));
        dstruyen.add(new diadiemnoidia("Đà Nẵng",R.drawable.danngna,R.raw.t05));
        dstruyen.add(new diadiemnoidia("Hải Phòng",R.drawable.haiphong,R.raw.t06));
        adapternoidia a2=new adapternoidia(dstruyen);
        lv=findViewById(R.id.lsv1);
        lv.setAdapter(a2);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {   @Override
        public void onItemClick(AdapterView<?> par,View v,int pos,long id){
            diadiemnoidia tr=a2.getItem(pos);
            Intent m1=new Intent(NdiaActivity.this, xemddnoidia.class);
            Bundle bd=new Bundle();
            bd.putString("tieude1",tr.tenndia);
            bd.putInt("truyen",tr.idstoryndia);
            bd.putInt("hinh",tr.idimgndia);
            m1.putExtra("MyPackage",bd);
            startActivity(m1);
        }


        });
    }

}