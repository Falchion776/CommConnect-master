package com.example.aro4154.commconnect;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JoeySecondPage extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userid_2);

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMainActivity();
            }


        });
    }

    public void openMainActivity() {

        Intent intent = new Intent(this, JoeyMainPage.class);
        startActivity(intent);
    }
}
