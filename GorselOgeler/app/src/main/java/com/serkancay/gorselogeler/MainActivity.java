package com.serkancay.gorselogeler;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    TextView tv;
    ImageView iv;
    Button button;
    EditText et1,et2;
    String kullaniciAdi, sifre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= (TextView) findViewById(R.id.textView);
        iv=(ImageView) findViewById(R.id.imageView);

        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);


        button=(Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                iv.setImageResource(R.drawable.resim);

                kullaniciAdi=et1.getText().toString().trim();
                sifre=et2.getText().toString().trim();

                tv.setText("Resim Değiştirildi" + "\n" + kullaniciAdi + "\n" + sifre);
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
