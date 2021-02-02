package com.xydiateam.xydia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App app = new App(this,"a", "9.9.9", "test", 666, "/sdcard/test", true, new String[]{}, 25, 25, appGenre.UTILITIES);
        Log l = new Log(Log.NONE);
        Gson g = new Gson();
        l.i(g.toJson(app));
    }
}
