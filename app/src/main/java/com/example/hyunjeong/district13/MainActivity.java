package com.example.hyunjeong.district13;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.View;
import android.content.Intent;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signInButton = (Button) findViewById(R.id.SignIn);
        Button searchButton = (Button) findViewById(R.id.Search);
        signInButton.setOnClickListener(this);
        searchButton.setOnClickListener(this);

        Spinner location = (Spinner) findViewById(R.id.Location);
        Spinner hseType = (Spinner) findViewById(R.id.Type);
        Spinner saleLease = (Spinner) findViewById(R.id.SaleLease);

        String loc = location.getSelectedItem().toString();
        String hse = hseType.getSelectedItem().toString();
        String slease = saleLease.getSelectedItem().toString();

    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.SignIn: {
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.Search: {
                Intent intent = new Intent(getApplicationContext(), SearchResultActivity.class);
                startActivity(intent);
                break;
            }
        }
    }

    public void sendMessage (View view){
        Intent intent = new Intent(this, SearchResultActivity.class);

    }
}
