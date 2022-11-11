package com.example.chattingonic3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.chattingonic3.halaman2;
import com.example.chattingonic3.R;

public class halaman3 extends AppCompatActivity {
    private TextView textView;
    private EditText editTextReply;
    public static final String EXTRA_REPLY = "REPLY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penerima);
        textView = findViewById(R.id.text_message);
        editTextReply = findViewById(R.id.editTextReply);

        Intent intent = getIntent();
        String message = intent.getStringExtra(halaman2.EXTRA_MESSAGE);
        textView.setText(message);
    }

    public void returnReply(View view) {
        String sreply = editTextReply.getText().toString();
        Intent replyIntent= new Intent();
        replyIntent.putExtra(EXTRA_REPLY,sreply);
        setResult(RESULT_OK, replyIntent);
        finish();
    }

}
