package com.xydiateam.xydia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class RepoItemGrabber {
    public static String grabTextFromUrl(String Url){
        String line = "";
            try {
                URL url = new URL(Url);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setConnectTimeout(60 * 1000);
                conn.setReadTimeout(60 * 1000);
                InputStream input = conn.getInputStream();
                BufferedReader in = new BufferedReader(new InputStreamReader(input));
                StringBuilder _sb = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    _sb.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        return line;
    }

    public static String[] decodeTextToArray(){
        return null;
    }
}
