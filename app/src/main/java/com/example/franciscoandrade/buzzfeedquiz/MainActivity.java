package com.example.franciscoandrade.buzzfeedquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.franciscoandrade.buzzfeedquiz.view.QuestionViewHolder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        ArrayList<String> multipleanswer=new ArrayList<>();
//
//
//
//        RecyclerView questionsRecyclerView = (RecyclerView) findViewById(R.id.idrecycler);
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
//        questionsRecyclerView.setLayoutManager(linearLayoutManager);
//
//        ArrayList<Question> questions = new ArrayList<>();
//
//        questions.add(new Question("Who discovered America?", "Christopher Columbus", multipleanswer));
//        questions.add(new Question("Who discovered America?", "Christopher Columbus", multipleanswer));
//        questions.add(new Question("Who discovered America?", "Christopher Columbus", multipleanswer));
//
//        multipleanswer.add("Christopher Columbus");
//        multipleanswer.add("Other");
//        multipleanswer.add("Other");
//        multipleanswer.add("Other");
//
//        QuestionViewHolder questionAdapter= new QuestionViewHolder(questions);
//
//        questionsRecyclerView.setAdapter(questionAdapter);
//


    }

    public void onClick(View view) {

        switch (view.getId()){
            case R.id.quizzbtn1:
                Intent intent=new Intent(MainActivity.this, Quizz.class);
                startActivity(intent);

                break;

            case R.id.quizzbtn2:

                break;


        }

    }
}
