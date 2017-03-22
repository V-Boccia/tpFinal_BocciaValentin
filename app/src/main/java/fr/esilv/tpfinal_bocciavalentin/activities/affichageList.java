package fr.esilv.tpfinal_bocciavalentin.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;


import fr.esilv.tpfinal_bocciavalentin.Constants;
import fr.esilv.tpfinal_bocciavalentin.R;

public class affichageList extends AppCompatActivity{

    private static final String CONTRACT = "CONTRACT";
    private static final String STATIONS_URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=adriana%20grande&type=video&key=";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recherchelist);

        WebView webView = (WebView) findViewById(R.id.webView);
        webView.loadUrl("https://www.googleapis.com/youtube/v3/search?part=snippet&q=adriana%20grande&type=video&key=AIzaSyAK7TNO8ZMix7VwsyKr8BzGwOdR6wcK72w");



    }


}

