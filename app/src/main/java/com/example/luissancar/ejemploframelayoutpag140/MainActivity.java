package com.example.luissancar.ejemploframelayoutpag140;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button bt;
    ImageView im;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt=(Button)findViewById(R.id.button);
        im=(ImageView)findViewById(R.id.imageView);
    }

    public void pulsaImagen(View view){
        im.setVisibility(View.INVISIBLE);
        bt.setVisibility(View.VISIBLE);
    }


    public void pulsaBoton(View view){
        bt.setVisibility(View.INVISIBLE);
        im.setVisibility(View.VISIBLE);
    }

}
