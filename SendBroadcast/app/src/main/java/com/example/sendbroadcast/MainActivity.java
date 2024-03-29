package com.example.sendbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button sendBroadcast = (Button) findViewById(R.id.send_broadcast_btn);
        sendBroadcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.example.sendbroadcast");
                intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES);
                sendBroadcast(intent);
            }
        });

    }
}
