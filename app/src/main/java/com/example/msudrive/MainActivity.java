package com.example.msudrive;

// this will initialize the xml file and navigate to google maps to provide a route to MSU

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button navigateBtn;

    // initializing the appropriate views
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navigateBtn = findViewById(R.id.navigateBtn);
        navigateBtn.setOnClickListener(this);
    }

    // retrieves location and starts the app to navigate
    @Override
    public void onClick(View v) {
        Uri gmmIntentUri = Uri.parse("google.navigation:q=Montclair+State+University,+Montclair+New+Jersey");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }
}
