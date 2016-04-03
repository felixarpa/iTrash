package com.hackupcteam.itrash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.firebase.client.Firebase;

import java.util.ArrayList;

public class Cesta extends AppCompatActivity {

    private ListView miListaCesta;
    private Button btnPedido;
    private ArrayList<String> myListCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cesta);

        miListaCesta = (ListView) findViewById(R.id.miListaCesta);
        btnPedido = (Button) findViewById(R.id.btnpedido);
        btnPedido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "HACER PEDIDO", Toast.LENGTH_SHORT).show();
            }
        });
        myListCart = getIntent().getStringArrayListExtra("lista");
        Log.d("TAG",""+myListCart.toString()+"");

        //ArrayList<Product> carrito = new ArrayList<>();
        //ListAdapter adapter = new MyAdapter2(this, R.layout.item_cesta, carrito);
        ListView l1 = (ListView)findViewById(R.id.miListaCesta);


        //FireBase fb = new FireBase(this,carrito);
        //fb.realTimeText(adapter,l1);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                myListCart );

        l1.setAdapter(arrayAdapter);

        for (String inte: myListCart
                ) {
            Log.d("tag", "" + inte.toString() + "");

        }

    }
}
