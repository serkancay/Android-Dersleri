package com.serkancay.actionbar;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Menü dosyamız burada sisteme tanıtıldı.(Benim tabirimle...)
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Seçilen öğenin ID'si alındı.
        int id = item.getItemId();

        //Burada if kontrolüyle hangi öğeyi seçtiğimizi kontrol ettik.
        if (id == R.id.action_settings) {
            Toast.makeText(this, "Ayarları seçtiniz...", Toast.LENGTH_SHORT).show();
        }

        if(id == R.id.action_refresh){
            Toast.makeText(this, "Yenileniyor...", Toast.LENGTH_SHORT).show();
        }

        if(id == R.id.action_help){
            Toast.makeText(this, "Yardım...", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
