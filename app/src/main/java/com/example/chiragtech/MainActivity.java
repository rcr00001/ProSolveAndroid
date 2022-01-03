package com.example.chiragtech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Storing data into SharedPreferences
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences sharedPreferences = getSharedPreferences("MySharedPref",MODE_PRIVATE);

        String StringUsername = sharedPreferences.getString("sharepreUserName", "");
        TextView Username_tv = (TextView) findViewById(R.id.Username_tv);
        Username_tv.setText(StringUsername);


    }
}