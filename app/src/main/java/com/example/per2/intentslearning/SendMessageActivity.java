package com.example.per2.intentslearning;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SendMessageActivity extends AppCompatActivity {
    private Button buttonSendmessage;
    private EditText editTextMessage;

    public static final String EXTRA_SENT_MESSAGE = "the message";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);
        wireWidgets();

        buttonSendmessage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String message = editTextMessage.getText().toString();
                Intent intentSendMessage = new Intent(SendMessageActivity.this, ReceiveMainActivity.class);
                intentSendMessage.putExtra("themessage",message);
                startActivity(intentSendMessage);
            }
        });
    }
    private void wireWidgets(){
        buttonSendmessage = findViewById(R.id.button_sendmessage_send);
        editTextMessage = findViewById(R.id.editText_sendmessage_message);
    }
}
