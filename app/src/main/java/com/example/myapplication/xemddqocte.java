package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class xemddqocte extends AppCompatActivity {
    ActionBar a1;
    TextView t1,t2;
    ImageView t3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dsquocte);
        a1=getSupportActionBar();
        a1.setDisplayShowHomeEnabled(true);
        a1.setDisplayHomeAsUpEnabled(true);
        a1.setHomeButtonEnabled(true);
        a1.setDisplayUseLogoEnabled(true);

        a1.setLogo(R.drawable.apple_logo_logo_png_hd_11659045639in0mv42cpz);
        a1.setTitle(R.string.app_name);
        a1.show();

        t1=findViewById(R.id.tieude1);
        t2=findViewById(R.id.truyen);
        t3=findViewById(R.id.hinh);
        Intent a3=getIntent();
        Bundle packageFromCaller=a3.getBundleExtra("MyPackage");
        String t11=packageFromCaller.getString("tieude1");
        Integer i12=packageFromCaller.getInt("truyen");
        Integer i13=packageFromCaller.getInt("hinh");
        t1.setText(t11);

        t3.setImageResource(i13);
        doctaptin(i12);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        return  super.onOptionsItemSelected(item);
    }
    private void doctaptin(int id){
        String dada;
        InputStream in=getResources().openRawResource(id);
        InputStreamReader in1=new InputStreamReader(in);
        BufferedReader bf=new BufferedReader(in1);
        StringBuilder b=new StringBuilder();
        if (in!=null){
            try{
                while ((dada=bf.readLine())!=null){
                    b.append(dada);
                    b.append("\n");
                }
                in.close();
                t2.setText(b.toString());            }catch (IOException e){

                Log.e("error",e.getMessage());
            }

        }
    }
}