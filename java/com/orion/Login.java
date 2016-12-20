package com.orion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_login);

        ((Button)findViewById(R.id.button)).setOnClickListener((v)->{
            Toast.makeText(this,"Hello word!!",Toast.LENGTH_LONG).show();
        });
    }
}
