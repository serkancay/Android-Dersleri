package com.serkancay.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    EditText editText, editText2, editText3;
    Button button, button2;
    private String ISIM_KEY="com.serkancay.sharedpreferences.ISIM";
    private String SOYAD_KEY="com.serkancay.sharedpreferences.SOYAD";
    private String YAS_KEY="com.serkancay.sharedpreferences.YAS";
    private String MAIN_KEY="com.serkancay.sharedpreferences.MAIN_DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=(EditText)findViewById(R.id.editText); // İsim değeri almak için EditText
        editText2=(EditText)findViewById(R.id.editText2); // Soyad değeri almak için EditText
        editText3=(EditText)findViewById(R.id.editText3); // Yaş değeri almak için EditText

        button=(Button)findViewById(R.id.button); // Verileri kaydetmek için button
        button2=(Button)findViewById(R.id.button2); // İkinci aktiviteyi açmak için button


        // SharedPreferences oluşturuldu. ANAHTAR değeri MAIN_KEY değişkeni
        // Eğer sadece bir tane SharedPreferences kullanacaksak getPreferences(MODE_PRIVATE) yeterli.
        // Biz burada başka bir aktiviteden değer almak istediğimiz için mecburen Preferences'ımıza KEY değeri verdik.
        sharedPreferences=getSharedPreferences(MAIN_KEY, MODE_PRIVATE);

        // sharedPreferences'a değer yazmak için editör
        editor=sharedPreferences.edit();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ISIM_KEY anahtarıyla, kullanıcıdan isim değerini alıp yazdık.
                editor.putString(ISIM_KEY, editText.getText().toString());

                // SOYAD_KEY anahtarıyla, kullanıcıdan soyad değerini alıp yazdık.
                editor.putString(SOYAD_KEY, editText2.getText().toString());

                // YAS_KEY anahtarıyla, kullanıcıdan yaş değerini alıp yazdık.
                editor.putInt(YAS_KEY, Integer.parseInt(editText3.getText().toString()));

                // Bunu unutmamak gerekiyor. commit() etmezsek veriler yazılmıyor. Akışı kapatmak şart!
                editor.commit();

                // Kullanıcıyı bilgilendirdik.
                Toast.makeText(MainActivity.this, "Veriler kaydedildi", Toast.LENGTH_SHORT).show();
            }
        });

        // 2.Aktivitemizi açmak için buton.
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, MainActivity2Activity.class);
                startActivity(intent);
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
