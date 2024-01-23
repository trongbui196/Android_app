package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class QteActivity extends AppCompatActivity {
    ActionBar a1;
    ArrayList<diadiemquocte> dstruyen;
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

        dstruyen=new ArrayList<diadiemquocte>();
        dstruyen.add(new diadiemquocte("Hàn Quốc",R.drawable.korea,R.raw.t01));
        dstruyen.add(new diadiemquocte("Canada",R.drawable.caannda,R.raw.t02));
        dstruyen.add(new diadiemquocte("Thái Lan",R.drawable.thaialn,R.raw.t03));
        dstruyen.add(new diadiemquocte("Nga",R.drawable.russia,R.raw.t04));
        dstruyen.add(new diadiemquocte("Singapore",R.drawable.singapo,R.raw.t05));
        dstruyen.add(new diadiemquocte("Thụy Điển",R.drawable.sweden,R.raw.t06));
        adapterquocte a2=new adapterquocte(dstruyen);
        lv=findViewById(R.id.lsv1);
        lv.setAdapter(a2);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {   @Override
        public void onItemClick(AdapterView<?> par,View v,int pos,long id){
            diadiemquocte tr=a2.getItem(pos);
            Intent m1=new Intent(QteActivity.this, xemddqocte.class);
            Bundle bd=new Bundle();
            bd.putString("tieude1",tr.tenqte);
            bd.putInt("truyen",tr.idstoryqte);
            bd.putInt("hinh",tr.idimgqte);
            m1.putExtra("MyPackage",bd);
            startActivity(m1);
        }


        });
    }

}