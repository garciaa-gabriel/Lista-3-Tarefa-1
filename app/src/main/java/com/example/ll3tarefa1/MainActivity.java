package com.example.ll3tarefa1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity implements View.OnClickListener {
    private TextView tv1, tv2;
    private EditText ed1, ed2;
    private Button bt;
    private String user;
    private String password;
    private static final String usr = "Admin";
    private static final String psw = "Admin1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = (TextView) findViewById(R.id.tv1);
        ed1 = (EditText) findViewById(R.id.ed1);
        tv2 = (TextView) findViewById(R.id.tv2);
        ed2 = (EditText) findViewById(R.id.ed2);
        bt = (Button) findViewById(R.id.btsend);

        if(savedInstanceState!=null){
            user = savedInstanceState.getString("user");
            password = savedInstanceState.getString("password");
        }
        else{
            user = "Sem user";
            password = "Sem password";
        }

        bt.setOnClickListener(this);
    }

    protected void onSaveInstanceState(Bundle dados){
        super.onSaveInstanceState(dados);
        dados.putString("user", user);
        dados.putString("password", password);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btsend){
            String user = ed1.getText().toString();
            String password = ed2.getText().toString();

            if(user.equals(usr) && password.equals(psw)) {
                Intent intent = new Intent(this, WelcomeActivity.class);
                Bundle params = new Bundle();
                params.putString("user", user);
                intent.putExtras(params);
                startActivity(intent);
            }
            else if(user!=usr){
                Toast.makeText(getApplicationContext(), "User Incorreto", Toast.LENGTH_LONG).show();
            }
            else if(password!=psw){
                Toast.makeText(getApplicationContext(), "Senha Incorreta", Toast.LENGTH_LONG).show();
            }
            else if(user!=usr && password!=psw){
                Toast.makeText(getApplicationContext(), "User e Senha Incorretos", Toast.LENGTH_LONG).show();
            }
        }
    }
}