package com.example.franciscoandrade.buzzfeedquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.franciscoandrade.buzzfeedquiz.view.QuestionViewHolder;

import java.util.ArrayList;
import java.util.List;

public class Quizz extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        //setContentView(R.layout.item_list_questions);

         ArrayList<String> multipleanswer=new ArrayList<>();
         ArrayList<String> multipleanswer2=new ArrayList<>();
         ArrayList<String> multipleanswer3=new ArrayList<>();
         ArrayList<String> multipleanswer4=new ArrayList<>();
         ArrayList<String> multipleanswer5=new ArrayList<>();

        final RecyclerView questionsRecyclerView = (RecyclerView) findViewById(R.id.idrecycler);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        questionsRecyclerView.setLayoutManager(linearLayoutManager);

        final ArrayList<Question> questions = new ArrayList<>();

        questions.add(new Question("Who discovered America?", "Christopher Columbus", multipleanswer));
        questions.add(new Question("What is 2 x 4?", "8", multipleanswer2));
        questions.add(new Question("How many tires do you have to buy if you have 2 cars in the family?", "8", multipleanswer3));
        questions.add(new Question("If a jar of marmelade costs $3 how much do 12 jars of marmelade cost?", "$36", multipleanswer4));
        questions.add(new Question("Which planet is nearest the sun?", "Mercury", multipleanswer5));


        multipleanswer.add("Christopher Columbus");
        multipleanswer.add("Other");
        multipleanswer.add("Other");
        multipleanswer.add("Other");

        multipleanswer2.add("8");
        multipleanswer2.add("Other");
        multipleanswer2.add("Other");
        multipleanswer2.add("Other");

        multipleanswer3.add("8");
        multipleanswer3.add("Other");
        multipleanswer3.add("Other");
        multipleanswer3.add("Other");

        multipleanswer4.add("$36");
        multipleanswer4.add("Other");
        multipleanswer4.add("Other");
        multipleanswer4.add("Other");

        multipleanswer5.add("Mercury");
        multipleanswer5.add("Other");
        multipleanswer5.add("Other");
        multipleanswer5.add("Other");


        QuestionViewHolder questionAdapter= new QuestionViewHolder(questions);

//        questionAdapter.setOnCLickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "checked :"+questions.get(questionsRecyclerView.getChildAdapterPosition(view)).getQuestion(), Toast.LENGTH_SHORT).show();
//
//            }
//        });
        questionsRecyclerView.setAdapter(questionAdapter);
    }





}
