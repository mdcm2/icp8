package com.example.icp8assign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText Name;
    private EditText Password;
    private Button lgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name=(EditText)findViewById(R.id.Name);
        Password=(EditText)findViewById(R.id.password);
        lgBtn=(Button) findViewById(R.id.lgButton);
        lgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginCheck(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private void loginCheck(String personName,String Password){
        boolean validationFlag =false;

        if((personName.equals("admin"))&&(Password.equals("admin"))) {
            validationFlag = true;
        }
        if(validationFlag){
            Intent intent =new Intent(MainActivity.this,welcomeAct.class);
            startActivity(intent);
        }else{
            Toast.makeText(getApplicationContext(),"username and password doesn't match",Toast.LENGTH_SHORT).show();
        }
    }
}
