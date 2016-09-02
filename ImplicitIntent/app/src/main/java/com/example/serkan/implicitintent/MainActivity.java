package com.example.serkan.implicitintent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {
    // Button nesnelerimizi oluşturduk.
    Button btnArama,btnWeb,btnHarita;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Butonlarımızı XML tarafından çağırdık.
        btnArama=(Button)findViewById(R.id.btnArama);
        btnWeb=(Button)findViewById(R.id.btnWeb);
        btnHarita=(Button)findViewById(R.id.btnHarita);

       // btnArama tıklama özelliği getirdik.
        btnArama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ImplicitIntent için bir veri oluşturduk.
                Uri uri=Uri.parse("tel:5493298329");
                // Burada ImplicitIntent oluşturduk. ACTION_DIAL arama olaylarını yönetir.
                Intent intent=new Intent(Intent.ACTION_DIAL, uri);
                startActivity(intent);
            }
        });

        // btnWeb tıklama özelliği getirdik.
        btnWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ImplicitIntent için bir veri oluşturduk.
                Uri uri=Uri.parse("http://serkancay.blogspot.com");
                // Burada ImplicitIntent oluşturduk. ACTION_VIEW görüntüleme olaylarını yönetir.
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        // btnWeb tıklama özelliği getirdik.
        btnHarita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ImplicitIntent için bir veri oluşturduk.
                Uri uri=Uri.parse("geo:39.480188, 29.899289?z=15");
                // Burada ImplicitIntent oluşturduk. ACTION_VIEW görüntüleme olaylarını yönetir.
                Intent intent=new Intent(Intent.ACTION_VIEW, uri);
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
