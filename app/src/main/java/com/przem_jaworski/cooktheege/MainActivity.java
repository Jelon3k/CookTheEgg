package com.przem_jaworski.cooktheege;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { //<- implementuje interfejs dodaje nam to metode "onClick" i nie generujemy anonimowych klas
    private static final String TAG = MainActivity.class.getSimpleName();//zwraca nazwe klasy w ktorej jestesmy
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton softEgg = findViewById(R.id.softEggBtn);
        softEgg.setOnClickListener(this);
        ImageButton halfSoftEgg = findViewById(R.id.halfSoftEggBtn);
        halfSoftEgg.setOnClickListener(this);
        ImageButton hardEgg = findViewById(R.id.hardEggBtn);
        hardEgg.setOnClickListener(this);
        ImageButton tShirtEgg = findViewById(R.id.tShirtEggBtn);
        tShirtEgg.setOnClickListener(this);
        Log.d(TAG,"onCreate" + this.toString() );

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.softEggBtn: {
                Intent intent = new Intent(getApplicationContext(), SoftEggActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.halfSoftEggBtn: {
                Intent intent = new Intent(getApplicationContext(),HalfSoftEggActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.hardEggBtn:{
                Intent intent = new Intent(getApplicationContext(),HardEggActivity.class);
                startActivity(intent);
                break;
            }
            case R.id.tShirtEggBtn:{
                Intent intent = new Intent(getApplicationContext(),TshirtEggActivity.class);
                startActivity(intent);
            }
        }
    }
}
