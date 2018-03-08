package com.example.ny.sqllite;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;

import java.util.List;

public class MainActivity extends ListActivity {
     veriKaynagi vk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
vk=new veriKaynagi(this);


        vk.ac();
        List<kullanici> kullanicilar=vk.listele();
        final ArrayAdapter<kullanici> adaptor=new ArrayAdapter<kullanici>(this,android.R.layout.simple_list_item_1,kullanicilar);
        setListAdapter(adaptor);
        Button ekle=(Button)findViewById(R.id.add);
        Button sil=(Button)findViewById(R.id.delete);

        ekle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            kullanici k=new kullanici("Ali Demir" ,1);
            vk.kullaniciOlustur(k);
            adaptor.add(k);
            }
        });


        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kullanici k =(kullanici) getListAdapter().getItem(0);
                vk.kullaniciSil(k);
            }
        });

    }
    protected  void onResume(){
        vk.ac();
        super.onResume();
    }
    protected void onPause(){
        vk.kapa();
        super.onPause();
    }


}
