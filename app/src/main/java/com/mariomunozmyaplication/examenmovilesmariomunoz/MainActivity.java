package com.mariomunozmyaplication.examenmovilesmariomunoz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //HACEMOS LAS DECLARACIONES
    private MiAdaptadorSimple adapter;
    private TextView tv1, tv2, tv3, tv4;
    private EditText tile;

    //ALMACENO EL VALOR DE LAS DIVISAS
    double USD = 1.1293946;
    double GBP = 0.85447758;
    double CAD = 1.4339265;
    double AUD = 1.5788175;
    double JPY = 128.17384;
    double INR = 85.36992;
    double NZD = 1.6631981;
    double CHF = 1.0441295;
    double ZAR = 18.030472;
    double RUB = 83.219626;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INICIALIZAMOS LOS CONTROLES
        //textView
        tv1= findViewById(R.id.tv1);
        tv2= findViewById(R.id.tv2);
        tv3= findViewById(R.id.tv3);
        tv4= findViewById(R.id.tv4);
        //editText


        //ALMACENO EL NOMBRE DE LAS DIVISAS EN UN ARRAYLIST
        ArrayList<String> divisas= new ArrayList<>();
        divisas.add("USD");     //1,1293946 USD - Dolares estadounidenses
        divisas.add("GBP");     //0,85447758 GBP - Libras esterlinas
        divisas.add("CAD");     //1,4339265 CAD - Dolares canadienses
        divisas.add("AUD");     //1,5788175 AUD - Dolares australianos
        divisas.add("JPY");     //128,17384 JPY - Yenes japoneses
        divisas.add("INR");     //85,36992 INR - Rupias indias
        divisas.add("NZD");     //1,6631981 NZD - Dolares neozelandeses
        divisas.add("CHF");     //1,0441295 CHF - Francos suizos
        divisas.add("ZAR");     //18,030472 ZAR - Rands sudafricanos
        divisas.add("RUB");     //83,219626 RUB - Rublos rusos



        RecyclerView recyclerView= findViewById(R.id.rvmd);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager mLayout= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayout);

        //REFERENCIAMOS CON MiAdaptadorSimple
        adapter= new MiAdaptadorSimple(this, divisas);
        recyclerView.setAdapter(adapter);

        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(recyclerView.getContext(), mLayout.getOrientation());
        recyclerView.addItemDecoration(dividerItemDecoration);
    }

    public void hacerCalculo(View view){
        switch(view.getId()){
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                break;

            case 5:
                break;

            case 6:
                break;
            case 7:
                break;

            case 8:
                break;

            case 9:
                break;

            case 10:
                break;
        }
    }

}


