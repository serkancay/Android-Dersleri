package com.serkancay.radiobutton;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    RadioButton mavi,yesil,kirmizi;
    TextView tv;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mavi=(RadioButton)findViewById(R.id.mavi);
        yesil=(RadioButton)findViewById(R.id.yesil);
        kirmizi=(RadioButton)findViewById(R.id.kirmizi);

        button=(Button)findViewById(R.id.button);
        tv=(TextView)findViewById(R.id.textView2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mavi.isChecked()){
                    tv.setText("Seçtiğiniz renk: MAVİ");
                }else if(yesil.isChecked()){
                    tv.setText("Seçtiğiniz renk: YEŞİL");
                }else if(kirmizi.isChecked()){
                    tv.setText("Seçtiğiniz renk: KIRMIZI");
                }else{
                    Log.i("RADIOHATA", "Seçim belirlenemedi!");
                }
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
