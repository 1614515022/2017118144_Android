package com.example.a33;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.a33.MainActivity;
import com.example.a33.R;

public class Main2Activity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Main2Activity", this.toString());
        setContentView(R.layout.activity_main);
        Button button2 = (Button) findViewById(R.id.button_2);
        button2.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub/
                Intent intent = new Intent( Main2Activity.this, MainActivity.class);

                startActivity(intent);
            }
        });
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Main2Activity","onDestroy");
    }
}