package com.example.niloofar.acceptanceform;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
    }
    public void btnNext(View view){

        EditText familyObj=findViewById(R.id.txt_family);
        String family=familyObj.getText().toString();

        SharedPreferences shpObj=getSharedPreferences("D1",MODE_PRIVATE);
        shpObj.edit().putString("kfamily",family).apply();

        Toast.makeText(this,"save!!!",Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,genderActivity.class);
        startActivity(intent);
    }
}
