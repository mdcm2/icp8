package com.example.icp8assign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class welcomeAct extends AppCompatActivity {

    private Button loutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        loutBtn=(Button) findViewById(R.id.logoutBtn);
        loutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(welcomeAct.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
}