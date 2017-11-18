package com.example.franciscoandrade.buzzfeedquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SnapHelper;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.franciscoandrade.buzzfeedquiz.view.QuestionViewHolder;
import com.example.franciscoandrade.buzzfeedquiz.view.Questions2ViewHolder;
import com.example.franciscoandrade.buzzfeedquiz.view.ResultActivity;
import com.github.rubensousa.gravitysnaphelper.GravitySnapHelper;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Quizz2 extends AppCompatActivity {


    RecyclerView questionsRecyclerView;

    private ArrayList<Question2> questions2 = new ArrayList<>();

    HashMap<Integer, String > list;

    HashMap<String, Integer> answers1=new HashMap<>();
    HashMap<String, Integer> answers2=new HashMap<>();
    HashMap<String, Integer> answers3=new HashMap<>();
    HashMap<String, Integer> answers4=new HashMap<>();
    HashMap<String, Integer> answers5=new HashMap<>();

    private Questions2ViewHolder questionAdapter2;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        //setContentView(R.layout.item_list_questions);






        //===========
        MainActivity main =new MainActivity();

        questionsRecyclerView = (RecyclerView) findViewById(R.id.idrecycler);


//        SnapHelper snapHelper = new PagerSnapHelper();
//        snapHelper.attachToRecyclerView(questionsRecyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        SnapHelper snapHelper = new GravitySnapHelper(Gravity.TOP);
        snapHelper.attachToRecyclerView(questionsRecyclerView);


//        SnapHelper snapHelper2 = new LinearSnapHelper();
//        snapHelper2.attachToRecyclerView(questionsRecyclerView);


        questionsRecyclerView.setLayoutManager(linearLayoutManager);

//        SnapHelper snap = new LinearSnapHelper();
//        snap.attachToRecyclerView(questionsRecyclerView);

//        SnapHelper snapHelper = new GravitySnapHelper(Gravity.TOP);
//        snapHelper.attachToRecyclerView(questionsRecyclerView);
        test2();


        questionAdapter2= new Questions2ViewHolder(questions2);

        questionsRecyclerView.setAdapter(questionAdapter2);

    }




    private void test2() {

//        questionsRecyclerView = (RecyclerView) findViewById(R.id.idrecycler);
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
//        questionsRecyclerView.setLayoutManager(linearLayoutManager);
//
//        test2();
//
//
//        questionAdapter2= new Questions2ViewHolder(questions2);
////
//        questionsRecyclerView.setAdapter(questionAdapter2);

        answers1.put("Near the sea", 1 );
        answers1.put("On the Hill", 1 );
        answers1.put("In a big city", 1 );
        answers1.put("In a farm", 1 );

        answers2.put("One day before leaving", 1 );
        answers2.put("When everybody has fun togueter", 1 );
        answers2.put("When talking", 1 );
        answers2.put("When leaving and when coming back home", 1 );

        answers3.put("I will achieve it in reality", 1 );
        answers3.put("My effort will be paid off", 1 );
        answers3.put("I will fail", 1 );
        answers3.put("Only success in a dream, so what?", 1 );

        answers4.put("Soup or curry", 1 );
        answers4.put("Rice or bread", 1 );
        answers4.put("Salad", 1 );
        answers4.put("Vegetables", 1 );

        answers5.put("Wow! how beautiful", 1 );
        answers5.put("Oh! How sad", 1 );
        answers5.put("Nice Weather", 1 );
        answers5.put("I want to shout as loud as I can", 1 );

        questions2.add(new Question2("Where would you choose to live?", answers1));
        questions2.add(new Question2("If you are going on holidays, when do you feel most happy?", answers2));
        questions2.add(new Question2("What do you think when you have dreamed about achieving something?", answers3));
        questions2.add(new Question2("There are lots of different dishes on the dinning table. What do you want to eat first?", answers4));
        questions2.add(new Question2("Where would you choose to live?", answers5));



    }

}
