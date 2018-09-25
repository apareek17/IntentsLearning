package com.example.per2.intentslearning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMainActivity extends AppCompatActivity {
    private TextView textviewDisplayMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_main);

        textviewDisplayMessage = findViewById(R.id.textView_receivemessage_displaymessage);
        textviewDisplayMessage.setText(getIntent().getStringExtra(SendMessageActivity.EXTRA_SENT_MESSAGE));

    }
}
