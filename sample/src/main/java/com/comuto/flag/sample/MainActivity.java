package com.comuto.flag.sample;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import com.comuto.flag.Flaggr;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Flaggr.with(this).loadConfig("https://us-central1-rg-rnd-projects.cloudfunctions.net/feature-flag?userSerial=31717171", "flags.json");

    }
}
