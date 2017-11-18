package com.example.franciscoandrade.buzzfeedquiz.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import com.example.franciscoandrade.buzzfeedquiz.MainActivity;
import com.example.franciscoandrade.buzzfeedquiz.R;

import java.util.ArrayList;

public class ResultActivity extends AppCompatActivity {

    TextView answe1, answe2, answe3, answe4, total;
    int totalnum;

    ArrayList<Boolean>list= new ArrayList<>();
    Bundle extras;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);


        MainActivity main=new MainActivity();
        extras= getIntent().getExtras();

        if(extras.getBoolean("quizz")){

            firstTest();
        }

        if(extras.getBoolean("quizz2")){
            secondTest();
        }




        Button homebtn= (Button)findViewById(R.id.idhomebtn);

        homebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }

    private void firstTest() {
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
        answe1.setText("Response 1was: "+ ((valu1)? "Correct" : "Wrong"));
        answe2.setText("Response 2 was: "+ ((valu2)? "Correct" : "Wrong"));
        answe3.setText("Response 3 was: "+ ((valu3)? "Correct" : "Wrong"));
        answe4.setText("Response 4 was: "+ ((valu4)? "Correct" : "Wrong"));
        total.setText("Total is: " + totalnum);

    }

    private void secondTest() {
        Bundle extras= getIntent().getExtras();
        Boolean valu1= extras.getBoolean("ans5");
        Boolean valu2= extras.getBoolean("ans6");
        Boolean valu3= extras.getBoolean("ans7");
        Boolean valu4= extras.getBoolean("ans8");

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
                totalnum=totalnum+10;
            }
            else{
                totalnum=totalnum;
            }

        }


        String response1="'Your ideal mate has a sense of humor and is lively.'";
        String response2="'Most of your plan would be successful. When you wish, you make a reasonable wish.'";
        String response3="'Success depends on someone's faith in their ability. That's your attitudes towards success.'";
        String response4="'You are a person of principle. You respect social rules and regulations.'";
        String response5="'You are emotional, sincere and optimistic.'";


//        Your ideal mate has a sense of humor and is lively.
//        Most of your plan would be successful. When you wish, you make a reasonable wish.
//        Success depends on someone's faith in their ability. That's your attitudes towards success.
//        You are a person of principle. You respect social rules and regulations.
//        You are emotional, sincere and optimistic.

//        answe1.setText("Response was: "+ valu1);
//        answe2.setText("Response was: "+ valu2);
//        answe3.setText("Response was: "+ valu3);
//        answe4.setText("Response was: "+ valu4);


        answe1.setVisibility(View.GONE);
        answe2.setVisibility(View.GONE);
        answe3.setVisibility(View.GONE);
        answe4.setVisibility(View.GONE);

        if(extras.getInt("score") >= 45){
            total.setText(response1);
        }
        else if(extras.getInt("score") >= 30){
            total.setText(response2);
        }
        else if(extras.getInt("score") >= 20){
            total.setText(response3);
        }
        else if(extras.getInt("score") >= 10){
            total.setText(response4);
        }

        else if(extras.getInt("score") >= 0){
            total.setText(response5);
        }

    }
}
