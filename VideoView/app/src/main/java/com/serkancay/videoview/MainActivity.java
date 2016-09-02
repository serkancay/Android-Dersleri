package com.serkancay.videoview;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;


public class MainActivity extends ActionBarActivity {
    VideoView videoView;
    Button baslat, duraklat, durdur;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView=(VideoView)findViewById(R.id.videoView);
        baslat=(Button)findViewById(R.id.baslat);
        duraklat=(Button)findViewById(R.id.duraklat);
        durdur=(Button)findViewById(R.id.durdur);

        Uri uri=Uri.parse("android.resource://" + getPackageName()+ "/" + R.raw.androidfriends);
        videoView.setVideoURI(uri);
        baslat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.start();
            }
        });

        duraklat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.pause();
            }
        });

        durdur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
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
