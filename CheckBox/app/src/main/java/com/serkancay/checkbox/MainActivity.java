package com.serkancay.checkbox;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    CheckBox tuz, biber, karabiber, sarimsak, ketcap, mayonez, nar, barbeku;
    TextView tv;
    Button sec;
    String text="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tuz=(CheckBox)findViewById(R.id.tuz);
        biber=(CheckBox)findViewById(R.id.biber);
        karabiber=(CheckBox)findViewById(R.id.karabiber);
        sarimsak=(CheckBox)findViewById(R.id.sarimsak);
        ketcap=(CheckBox)findViewById(R.id.ketcap);
        mayonez=(CheckBox)findViewById(R.id.mayonez);
        nar=(CheckBox)findViewById(R.id.nareksisi);
        barbeku=(CheckBox)findViewById(R.id.barbeku);

        tv=(TextView)findViewById(R.id.secilenler);

        sec=(Button)findViewById(R.id.sec);

        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tuz.isChecked()){
                    text+=tuz.getText() + "-";
                }
                if(biber.isChecked()){
                    text+=biber.getText() + "-";
                }
                if(karabiber.isChecked()){
                    text+=karabiber.getText()+ "-";
                }
                if(sarimsak.isChecked()){
                    text+=sarimsak.getText()+"-";
                }
                if(ketcap.isChecked()){
                    text+=ketcap.getText()+"-";
                }
                if(mayonez.isChecked()){
                    text+=mayonez.getText()+"-";
                }
                if(nar.isChecked()){
                    text+=nar.getText()+"-";
                }
                if(barbeku.isChecked()){
                    text+=barbeku.getText()+"-";
                }

                tv.setText("Seçilenler: " + text);
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
