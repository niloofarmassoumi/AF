package com.example.niloofar.acceptanceform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView nameObj=findViewById(R.id.txv_name);
        TextView familyObj=findViewById(R.id.txv_family);
        TextView genderObj=findViewById(R.id.txv_gender);
        TextView maritalObj=findViewById(R.id.txv_marital);
        TextView titleObj=findViewById(R.id.txv_title);


       SharedPreferences shpreaderObj=getSharedPreferences("D1",MODE_PRIVATE);

       String name=shpreaderObj.getString("kname","not found");
       String family=shpreaderObj.getString("kfamily","not found");
       String gender=shpreaderObj.getString("kisMale","not found");
       String marriage=shpreaderObj.getString("kisSingle","not found");
       String tempName = "";
        if (gender.equals("male")) tempName = " MR. " + name;
        if (marriage.equals("single")) tempName = " MISS. " + name ;
        if (marriage.equals("married")) tempName = "MS." + name;
        nameObj.setText(tempName);
        familyObj.setText(family);
        genderObj.setText(gender);
        maritalObj.setText(marriage);
    }
    public void btnsave(View view){

        CheckBox confirmObj=findViewById(R.id.cb_confirm);
        if(confirmObj.isChecked()){
            Toast.makeText(this, "confirm check!", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Data saved", Toast.LENGTH_SHORT).show();
            
        }else{
            Toast.makeText(this, "confirm not check!", Toast.LENGTH_SHORT).show();
        }



    }

}
