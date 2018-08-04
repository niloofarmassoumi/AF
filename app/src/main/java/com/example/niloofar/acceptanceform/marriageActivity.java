package com.example.niloofar.acceptanceform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class marriageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marriage);
    }
    public void btnNext(View view){

        RadioButton marriedObj=findViewById(R.id.rb_married);
        RadioButton singleObj=findViewById(R.id.rb_single);

        String marriage="";
        if(singleObj.isChecked()){
           marriage="single";
        }else{
            marriage="married";
        }

        SharedPreferences shpObj=getSharedPreferences("D1",MODE_PRIVATE);
        shpObj.edit().putString("kisSingle", String.valueOf(marriage)).apply();

        Intent intent=new Intent(this,resultActivity.class);
        startActivity(intent);

        Toast.makeText(this, "save!!!", Toast.LENGTH_SHORT).show();
    }
}
