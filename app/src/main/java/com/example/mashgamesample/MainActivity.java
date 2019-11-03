package com.example.mashgamesample;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txt ;
    int value=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button bt= findViewById(R.id.button);
        txt =findViewById(R.id.coins);




        final AlertDialog.Builder checkin_dialog =new AlertDialog.Builder(MainActivity.this);
        View v = getLayoutInflater().inflate(R.layout.activity_customdialogclass,null);
        checkin_dialog.setView(v);
        final AlertDialog alertDialog = checkin_dialog.create();
        final AlertDialog.Builder checkin_dialog1 =new AlertDialog.Builder(MainActivity.this);
        final  View v1 = getLayoutInflater().inflate(R.layout.secondcheck,null);
        checkin_dialog1.setView(v1);
        final AlertDialog alertDialog1 = checkin_dialog1.create();
        final Button checkin = v.findViewById(R.id.Checkin);
        Button collect = v1.findViewById(R.id.collect);
        Button double_coins = v.findViewById(R.id.x2);




        ImageView im =v.findViewById(R.id.imageView2);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();

            }
        });

        checkin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                alertDialog.dismiss();
                alertDialog1.show();

            }
        });

        collect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total =Integer.parseInt(txt.getText().toString()) + value;
                value =value +10;
                if(value==80)value=10;
                txt.setText(""+total);
                alertDialog.dismiss();
                alertDialog1.dismiss();

            }
        });

        double_coins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.dismiss();

                alertDialog1.show();


            }
        });

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog.show();
            }


        });

    }


}
