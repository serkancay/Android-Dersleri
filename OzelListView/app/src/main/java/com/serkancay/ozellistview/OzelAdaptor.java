package com.serkancay.ozellistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.NumberFormat;
import java.util.List;

/**
 * Created by Serkan on 05.04.2015.
 */
public class OzelAdaptor extends BaseAdapter {
    LayoutInflater layoutInflater;
    List<Icecek> list;
    Activity activity;
    public OzelAdaptor(Activity activity, List<Icecek> mList){
        layoutInflater=(LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        list=mList;
        this.activity=activity;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView=layoutInflater.inflate(R.layout.satir, null);

        ImageView iv=(ImageView)satirView.findViewById(R.id.imageView);
        TextView tv=(TextView)satirView.findViewById(R.id.textViewIsim);
        TextView tv2=(TextView)satirView.findViewById(R.id.textViewFiyat);
        Button button=(Button)satirView.findViewById(R.id.button);

        final Icecek icecek=list.get(position);

        tv.setText(icecek.getIsim().toString());

       // NumberFormat.getCurrencyInstance().format(0.5); --> 0.5 TL

        tv2.setText(NumberFormat.getCurrencyInstance().format(icecek.getFiyat()));
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, icecek.getIsim().toString() + " aldınız", Toast.LENGTH_SHORT).show();
            }
        });
        String icecekIsim=icecek.getIsim().toString();
        if(icecekIsim.equals("Kahve")){
            iv.setImageResource(R.drawable.kahve);
        }else if(icecekIsim.equals("Çay")){
            iv.setImageResource(R.drawable.cay);
        }else if(icecekIsim.equals("Oralet")){
            iv.setImageResource(R.drawable.oralet);
        }else if(icecekIsim.equals("Su")){
            iv.setImageResource(R.drawable.su);
        }else if(icecekIsim.equals("Kola")){
            iv.setImageResource(R.drawable.kola);
        }

        return satirView;
    }
}
