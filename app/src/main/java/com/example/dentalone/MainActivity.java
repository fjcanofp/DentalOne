package com.example.dentalone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.view.Menu;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

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
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_SUBJECT,"Consultador");
                intent.putExtra(Intent.EXTRA_TEXT,"Me gustaría contactar con ustedes acerca de...");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"DentalOne@protesisdental.com"});

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.nav_tarifas, R.id.nav_somos,R.id.nav_plano,R.id.nav_folleto,R.id.nav_especialidades,R.id.nav_cadcam)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

    public void abrirPDFOrtodonciafija(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/148W2lZKXl86YJzMs8oEYSj0eap3lcIwB/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirPDFEsqueléticos(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/1RIuKWX9umajeKxOt9W5udOQKcRSL_YAU/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirPDFProtesisFija(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/1KGndcgBWfcJ5194zM7mbPSHOVQ0qIhDW/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirPDFProtesisRemovible(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/16j9mAzwPS5gsWLab7ReEvxECQbK9--ZT/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirPDFOrtodonciaREmovible(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/16_h3hqwirjhhnl-lyHO7JWZS0rgTz6Ue/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirPDFImplantes(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/1c8FbpjH4ZcVuLfzM0Luo1p9jjUrQ_xUo/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirTriptico(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/1r0kWXt6jBgxyxJ0XDDcignTKbsMbq6xV/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirPDFPlano(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/1_ohyLm90xsh8jLb2fLorTSZmc-e7-KZt/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirPDFCADCAM(View view)
    {
        Uri webpage = Uri.parse("https://drive.google.com/file/d/1pYTpY_twO4X21zzAXPxjjix67ad28LqD/view?usp=sharing");
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);
        if (webIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(webIntent);
        }
    }

    public void abrirMapa(View view)
    {
        Uri gmmIntentUri = Uri.parse("geo:40.447271338091745, -3.7098705441486652");

// Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
// Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");

// Attempt to start an activity that can handle the Intent
        if (mapIntent.resolveActivity(getPackageManager()) != null)
            startActivity(mapIntent);
    }
}