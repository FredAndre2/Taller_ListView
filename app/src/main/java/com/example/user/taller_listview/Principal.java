package com.example.user.taller_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private ListView lv;
    private String [] opc;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = findViewById(R.id.Lst_Opciones);
        opc = getResources().getStringArray(R.array.opciones_principal);



        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, opc);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                switch (i){
                    case 0:
                        in = new Intent(Principal.this, Areas.class);
                        startActivity(in);
                        break;
                    case 1:
                        in = new Intent(Principal.this, Volumenes.class);
                        startActivity(in);
                        break;
                    case 2:
                        in = new Intent(Principal.this, Operaciones.class);
                        startActivity(in);
                        break;
                }
            }
        });
    }
}
