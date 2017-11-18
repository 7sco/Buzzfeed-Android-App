package com.example.franciscoandrade.buzzfeedquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
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

public class QuizzTwo extends AppCompatActivity {


    RecyclerView questionsRecyclerView;

    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<Question2> questions2 = new ArrayList<>();

    ArrayList<String> multipleanswer=new ArrayList<>();
    ArrayList<String> multipleanswer2=new ArrayList<>();
    ArrayList<String> multipleanswer3=new ArrayList<>();
    ArrayList<String> multipleanswer4=new ArrayList<>();
    ArrayList<String> multipleanswer5=new ArrayList<>();


    HashMap<Integer, String > list;


    HashMap<String, Integer> answers1=new HashMap<>();
    HashMap<String, Integer> answers2=new HashMap<>();
    HashMap<String, Integer> answers3=new HashMap<>();
    HashMap<String, Integer> answers4=new HashMap<>();
    HashMap<String, Integer> answers5=new HashMap<>();

    private QuestionViewHolder questionAdapter;
    private Questions2ViewHolder questionAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz_two);



        MainActivity main =new MainActivity();



        questionsRecyclerView = (RecyclerView) findViewById(R.id.idrecycler);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        questionsRecyclerView.setLayoutManager(linearLayoutManager);


        SnapHelper snapHelper = new GravitySnapHelper(Gravity.BOTTOM);
        snapHelper.attachToRecyclerView(questionsRecyclerView);

        test2();


        questionAdapter2= new Questions2ViewHolder(questions2);
//
        questionsRecyclerView.setAdapter(questionAdapter2);

        Button btn= (Button) findViewById(R.id.idDone_btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (questionAdapter2.getIsCheked()>= 5){

                    Intent intent=new Intent(QuizzTwo.this, ResultActivity.class);

                    intent.putExtra("quizz2", true);
                    intent.putExtra("score", questionAdapter2.getScore());
                    intent.putExtra("ans5",questionAdapter2.isPregunta1());
                    intent.putExtra("ans6",questionAdapter2.isPregunta2());
                    intent.putExtra("ans7",questionAdapter2.isPregunta3());
                    intent.putExtra("ans8",questionAdapter2.isPregunta4());
                    startActivity(intent);
                }else{
                    Toast.makeText(QuizzTwo.this, "Please Make A choice for all Questions", Toast.LENGTH_SHORT).show();
                }

            }
        });


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


        answers1.put("Near the sea", 10 );
        answers1.put("On the Hill", 7 );
        answers1.put("In a big city", 4 );
        answers1.put("In a farm", 1 );

        answers2.put("One day before leaving", 10 );
        answers2.put("When everybody has fun togueter", 7 );
        answers2.put("When talking", 4 );
        answers2.put("When leaving and when coming back home", 1 );

        answers3.put("I will achieve it in reality", 10 );
        answers3.put("My effort will be paid off", 7 );
        answers3.put("I will fail", 4 );
        answers3.put("Only success in a dream, so what?", 1 );

        answers4.put("Soup or curry", 10 );
        answers4.put("Rice or bread", 7 );
        answers4.put("Salad", 4 );
        answers4.put("Vegetables", 1 );

        answers5.put("Wow! how beautiful", 10 );
        answers5.put("Oh! How sad", 7 );
        answers5.put("Nice Weather", 4 );
        answers5.put("I want to shout as loud as I can", 1 );



        questions2.add(new Question2("Where would you choose to live?", answers1));
        questions2.add(new Question2("If you are going on holidays, when do you feel most happy?", answers2));
        questions2.add(new Question2("What do you think when you have dreamed about achieving something?", answers3));
        questions2.add(new Question2("There are lots of different dishes on the dinning table. What do you want to eat first?", answers4));
        questions2.add(new Question2("Where would you choose to live?", answers5));


        //3 different personalities
        //First == >20
        //Second== >10
        //Third ==>0

        //How much each answer should be to meet that personality


    }
}
