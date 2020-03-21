package com.carryonde;

import android.os.Bundle;

import com.carryonde.model.HelpRequest;
import com.carryonde.model.HelpRequests;
import com.carryonde.model.Location;
import com.carryonde.network.CarryOnApi;
import com.carryonde.network.CarryOnInstance;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.util.Log;
import android.view.View;

import androidx.core.view.GravityCompat;
import androidx.appcompat.app.ActionBarDrawerToggle;

import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);


        ArrayList<HelpRequest> helpRequests = new ArrayList<>();
        ArrayAdapter groupListAdapter = new HelRequestAdapter(this, helpRequests);
        ListView listView = findViewById(R.id.lv);
        listView.setAdapter(groupListAdapter);

        Location location = new Location(
                "Caritas Konstanz",
                "4234234",
                "Elm Streetz",
                12,
                "a"
        );

        HelpRequest example = new HelpRequest(
            "1",
                "In der Konstanz Kita aushelfen",
                "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem",
                "19.07, Dienstag",
                "3 Stunden",
                "Auf der Weide"

        );
        helpRequests.add(example);
        helpRequests.add(example);
        helpRequests.add(example);
        helpRequests.add(example);
        helpRequests.add(example);

        groupListAdapter.addAll(helpRequests);

        getHelpRequests();

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_tools) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void getHelpRequests(){
        try {
            CarryOnApi service = CarryOnInstance.getRetrofitInstance().create(CarryOnApi.class);
            Call<HelpRequests> call = service.getHelpRequestsByRadius("12345", 12);
            call.enqueue(new Callback<HelpRequests>() {
                @Override
                public void onResponse(Call<HelpRequests> call, Response<HelpRequests> response) {
                    updateBlog(response.body().getHelpRequests());
                }

                @Override
                public void onFailure(Call<HelpRequests> call, Throwable t) {
                    Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
                }
            });
        }catch (Exception e){
            Log.d("NETWORK", e.toString());
        }
    }

    public void updateBlog(List<HelpRequest> helpRequests){
        Toast.makeText(MainActivity.this, "It works mthrfckr", Toast.LENGTH_SHORT).show();
    }
}
