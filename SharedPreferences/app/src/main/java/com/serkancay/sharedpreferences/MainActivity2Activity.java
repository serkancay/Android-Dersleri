package com.serkancay.sharedpreferences;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {
    // SharedPreferences'tan veri alıp bu değişkenlere atayacağız.
    String isimVerisi, soyadVerisi;
    int yasVerisi;

    // Verilere ulaşmak için anahtarlarımız...
    private String ISIM_KEY="com.serkancay.sharedpreferences.ISIM";
    private String SOYAD_KEY="com.serkancay.sharedpreferences.SOYAD";
    private String YAS_KEY="com.serkancay.sharedpreferences.YAS";
    private String MAIN_KEY="com.serkancay.sharedpreferences.MAIN_DATA";

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity2);

        tv=(TextView)findViewById(R.id.textView);

        // MAIN_KEY anahtarıyla SharedPreferences'i açtık ve değerlerimizi aldık.
        // en sondaki get metodlarında 2.parametre varsayılan değerler için. O anahtar değere ait
        // veri bulunamazsa varsayılan değer döndürülür.
        isimVerisi=getSharedPreferences(MAIN_KEY, MODE_PRIVATE).getString(ISIM_KEY, "isim bulunamadı");
        soyadVerisi=getSharedPreferences(MAIN_KEY, MODE_PRIVATE).getString(SOYAD_KEY,"soyad bulunamadı");
        yasVerisi=getSharedPreferences(MAIN_KEY, MODE_PRIVATE).getInt(YAS_KEY, -1);

        tv.setText("Adınız: " + isimVerisi + "\n" + "Soyadınız: " + soyadVerisi + "\n" + "Yaşınız: " + yasVerisi);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
