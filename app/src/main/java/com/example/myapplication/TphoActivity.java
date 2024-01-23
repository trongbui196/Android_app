package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TphoActivity extends AppCompatActivity {
    ActionBar a1;
    ArrayList<diadiemtpho> dstruyen;
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

        dstruyen=new ArrayList<diadiemtpho>();
        dstruyen.add(new diadiemtpho("Bún bò",R.drawable.bunbo,R.raw.t01));
        dstruyen.add(new diadiemtpho("Phở",R.drawable.pho,R.raw.t02));
        dstruyen.add(new diadiemtpho("Bánh mì",R.drawable.banhmi,R.raw.t03));
        dstruyen.add(new diadiemtpho("Trà sữa",R.drawable.trasua,R.raw.t04));
        dstruyen.add(new diadiemtpho("Cà phê",R.drawable.cafe,R.raw.t05));
        dstruyen.add(new diadiemtpho("Khách sạn",R.drawable.hotel,R.raw.t06));
        adaptertpho a2=new adaptertpho(dstruyen);
        lv=findViewById(R.id.lsv1);
        lv.setAdapter(a2);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {   @Override
        public void onItemClick(AdapterView<?> par,View v,int pos,long id){
            diadiemtpho tr=a2.getItem(pos);
            Intent m1=new Intent(TphoActivity.this, xemddtpho.class);
            Bundle bd=new Bundle();
            bd.putString("tieude1",tr.tentp);
            bd.putInt("truyen",tr.idstorytp);
            bd.putInt("hinh",tr.idimgtp);
            m1.putExtra("MyPackage",bd);
            startActivity(m1);
        }


        });
    }

}