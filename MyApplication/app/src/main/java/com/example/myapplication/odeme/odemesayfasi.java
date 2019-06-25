package com.example.myapplication.odeme;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;


public class odemesayfasi extends AppCompatActivity {
Button odemebtn;
EditText fiyatedt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odemesayfasi);
        odemebtn=findViewById(R.id.button2);
        fiyatedt=(EditText)findViewById(R.id.fiyatedt);
        odemebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fiyat= fiyatedt.getText().toString();
                if(fiyat.length()!=0){
                    Intent returnIntent=new Intent();


                    returnIntent.putExtra("result",fiyat);

                    setResult(999,returnIntent);
                    finish();
                }
                else {

                finish();
                }



            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
       finish();

    }
}
