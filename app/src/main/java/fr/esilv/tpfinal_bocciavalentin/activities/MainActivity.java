package fr.esilv.tpfinal_bocciavalentin.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

import fr.esilv.tpfinal_bocciavalentin.Constants;
import fr.esilv.tpfinal_bocciavalentin.R;
import fr.esilv.tpfinal_bocciavalentin.adapters.myAdapter;
import fr.esilv.tpfinal_bocciavalentin.interfaces.OnVideoytSelectedListener;
import fr.esilv.tpfinal_bocciavalentin.models.Videoyt;
import fr.esilv.tpfinal_bocciavalentin.models.Videoybs;


public class MainActivity extends AppCompatActivity implements OnVideoytSelectedListener {

    private static final String VIDEOYT = "CONTRACT";
    private static final String VIDEO_URL = "https://www.googleapis.com/youtube/v3/search?part=snippet&q=adriana%20grande&type=video&key=";
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RecyclerView rv = (RecyclerView) findViewById(R.id.list);

        Button myButton = (Button) findViewById(R.id.button);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("OC_RSS", "ça marche");

                Intent myIntent = new Intent(MainActivity.this, affichageList.class );
                startActivity(myIntent);
            }

        });

        rv.setLayoutManager(new LinearLayoutManager(this));

        rv.setAdapter(new myAdapter());



    }


   /* private void getContracts() {
        StringRequest contractsRequest = new StringRequest(VIDEO_URL + "?apiKey=" + Constants.API_KEY, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                //parse data from webservice to get Contracts as Java object
                Videoybs videoyts = new Gson().fromJson(response, Videoybs.class);

                setAdapter(videoyts);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("Videoyts", "Error");
            }
        });

        Volley.newRequestQueue(this).add(contractsRequest);
    }*/

    //private void setAdapter(Videoybs videoyts) {
    //    myAdapter adapter = new myAdapter(videoyts, videoyts);
        //adapter.(this);
    //    recyclerView.setAdapter(adapter);
    //}



    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_search:
            /* DO EDIT */
                return true;
            case R.id.action_add:
            /* DO ADD */
                return true;
            case R.id.action_delete:
            /* DO DELETE */
                return true;
            case R.id.action_page1:

              return true;

        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onContractSelected(Videoyt videoyb) {

    }
}
