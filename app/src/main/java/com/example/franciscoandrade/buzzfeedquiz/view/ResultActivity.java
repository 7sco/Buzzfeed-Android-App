package com.example.franciscoandrade.buzzfeedquiz.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.franciscoandrade.buzzfeedquiz.R;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    TextView answe1, answe2, answe3, answe4, total;
    int totalnum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        ArrayList<Boolean>list= new ArrayList<>();

        Bundle extras= getIntent().getExtras();
        Boolean valu1= extras.getBoolean("ans1");
        Boolean valu2= extras.getBoolean("ans2");
        Boolean valu3= extras.getBoolean("ans3");
        Boolean valu4= extras.getBoolean("ans4");

        list.add(valu1);
        list.add(valu2);
        list.add(valu3);
        list.add(valu4);

        answe1=(TextView)findViewById(R.id.idresult1);
        answe2=(TextView)findViewById(R.id.idresult2);
        answe3=(TextView)findViewById(R.id.idresult3);
        answe4=(TextView)findViewById(R.id.idresult4);

        total=(TextView)findViewById(R.id.idtotal);

        totalnum=0;
        for (Boolean r: list) {
            if(r){
                totalnum+=10;
            }
            else{
                totalnum=totalnum;
            }
        }

        answe1.setText("Response was: "+ valu1);
        answe2.setText("Response was: "+ valu2);
        answe3.setText("Response was: "+ valu3);
        answe4.setText("Response was: "+ valu4);
        total.setText("Toatal is: " + totalnum);




    }
}
