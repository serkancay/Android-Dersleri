package com.serkancay.ozellistview;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    ListView listView;
    List<Icecek> icecekler=new ArrayList<Icecek>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        icecekler.add(new Icecek("Kahve", 2.0));
        icecekler.add(new Icecek("Çay", 1.0));
        icecekler.add(new Icecek("Oralet", 0.5));
        icecekler.add(new Icecek("Su", 0.5));
        icecekler.add(new Icecek("Kola", 1.0));

        listView=(ListView)findViewById(R.id.listView);

        OzelAdaptor adaptor=new OzelAdaptor(this, icecekler);
        listView.setAdapter(adaptor);
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
