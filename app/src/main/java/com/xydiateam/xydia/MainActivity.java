package com.xydiateam.xydia;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        App app = new App(this,"a", "9.9.9", "test", 666);
        Log l = new Log(Log.NONE);
        l.i(app.getAppAuthor());
        l.i(app.getAppDescription());
        l.i(app.getAppDownloadLink());
        l.i(app.getAppName());
        l.i(app.getAppVersion());
        app.setAppGenre(appGenre.ENTERTAINMENT);
        l.i(app.getAppGenre());
    }
}
