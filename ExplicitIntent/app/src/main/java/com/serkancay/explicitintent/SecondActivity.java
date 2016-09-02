package com.serkancay.explicitintent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class SecondActivity extends ActionBarActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tv=(TextView)findViewById(R.id.secondTextView);

        Intent intent=getIntent();
        String gelenVeri=intent.getStringExtra("veri");
        int gelenNumaraVerisi=intent.getIntExtra("numara", -1);
        int bulunamayanDeger=intent.getIntExtra("serkan", 7);

        tv.setText(gelenVeri + "\n" + "GelenNumaraVerisi: " + gelenNumaraVerisi + "\n" + "BulunamayanDeger: " + bulunamayanDeger);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_second, menu);
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
