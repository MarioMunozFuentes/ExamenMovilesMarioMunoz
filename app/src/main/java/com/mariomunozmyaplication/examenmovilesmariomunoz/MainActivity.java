package com.mariomunozmyaplication.examenmovilesmariomunoz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //HACEMOS LAS DECLARACIONES
    private MiAdaptadorSimple adapter;
    private EditText View;
    private EditText view;

    //INICIALIZAMOS LOS CONTROLES
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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





    }
}


/*










 */