package com.example.niloofar.acceptanceform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class genderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);
    }
    public void btnNext(View view){

        RadioButton maleObj=findViewById(R.id.rb_male);
        RadioButton femaleObj=findViewById(R.id.rb_female);
        RadioGroup genderObj=findViewById(R.id.rg_gender);

        String gender="";
        if(maleObj.isChecked()){
            gender="male";
        }else{
            gender="female";
        }
        SharedPreferences shpObj=getSharedPreferences("D1",MODE_PRIVATE);
        shpObj.edit().putString("kisMale", String.valueOf(gender)).apply();

        Toast.makeText(this, "save!!!", Toast.LENGTH_SHORT).show();


        Intent intent=new Intent(this,marriageActivity.class);
        startActivity(intent);
    }
}
