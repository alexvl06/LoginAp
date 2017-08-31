package com.avila.pc.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Usuario, Password;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Usuario = (EditText)findViewById(R.id.etUser);
        Password = (EditText)findViewById(R.id.etPass);
        Login = (Button)findViewById(R.id.btLogin);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String User = Usuario.getText().toString();
                String Pass = Password.getText().toString();

                if(User.equals("alexis.avila")&& Pass.equals("mejeve48")) {
                    Toast.makeText(getBaseContext(), "Usuario Correcto", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(getBaseContext(),"usuario Incorrecto",Toast.LENGTH_SHORT).show();

                }
            }
        });
    }
}
