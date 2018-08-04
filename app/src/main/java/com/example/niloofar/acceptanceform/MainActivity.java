package com.example.niloofar.acceptanceform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnNext(View view){

        EditText nameObj=findViewById(R.id.txt_name);
        String name=nameObj.getText().toString();

        SharedPreferences shpObj=getSharedPreferences("D1",MODE_PRIVATE);
        shpObj.edit().putString("kname",name).apply();

        Toast.makeText(this, "save!!!", Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,FamilyActivity.class);
        startActivity(intent);
    }
}
