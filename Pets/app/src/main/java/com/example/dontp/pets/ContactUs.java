package com.example.dontp.pets;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ContactUs extends AppCompatActivity {

    private TextInputEditText nombreEditText;
    private TextInputEditText mailEditText;

    private EditText editText;

    private Button enviar;

    private String gettedEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_us);

        nombreEditText = (TextInputEditText)findViewById(R.id.nombreInput);
        mailEditText = (TextInputEditText)findViewById(R.id.mailInput);
        editText = (EditText)findViewById(R.id.editText);
        enviar = (Button)findViewById(R.id.enviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gettedEmail = mailEditText.getText().toString();
                Intent intent = new Intent((Intent.ACTION_SEND));
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra(Intent.EXTRA_EMAIL, gettedEmail);
                intent.setType("message/rfc822");
                startActivity(intent);
            }
        });
    }
}
