package com.solanav.vscoderemote;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class ServerConnect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server_connect);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText ip = findViewById(R.id.textInputIP);
                EditText port = findViewById(R.id.textInputPort);

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("IP", ip.getText().toString());
                intent.putExtra("PORT", port.getText().toString());

                startActivity(intent);
            }
        });
    }

}
