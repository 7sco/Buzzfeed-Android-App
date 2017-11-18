package com.example.franciscoandrade.buzzfeedquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSnapHelper;
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

public class Quizz extends AppCompatActivity {


     RecyclerView questionsRecyclerView;

private ArrayList<Question> questions = new ArrayList<>();
//private ArrayList<Question2> questions2 = new ArrayList<>();

    ArrayList<String> multipleanswer=new ArrayList<>();
    ArrayList<String> multipleanswer2=new ArrayList<>();
    ArrayList<String> multipleanswer3=new ArrayList<>();
    ArrayList<String> multipleanswer4=new ArrayList<>();
    ArrayList<String> multipleanswer5=new ArrayList<>();


//    HashMap<Integer, String > list;


//    HashMap<String, Integer> answers1=new HashMap<>();
//    HashMap<String, Integer> answers2=new HashMap<>();
//    HashMap<String, Integer> answers3=new HashMap<>();
//    HashMap<String, Integer> answers4=new HashMap<>();
//    HashMap<String, Integer> answers5=new HashMap<>();

    private QuestionViewHolder questionAdapter;
    private Questions2ViewHolder questionAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizz);
        //setContentView(R.layout.item_list_questions);

        MainActivity main =new MainActivity();


//
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

//        if(main.selection=="quiz1"){
//
//
//
//            test1();
//
//
//
//        }
//
//        else if(main.selection=="quiz2"){
//
//            test2();
//
//        }




        questionsRecyclerView = (RecyclerView) findViewById(R.id.idrecycler);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        SnapHelper snapHelper = new GravitySnapHelper(Gravity.BOTTOM);
        snapHelper.attachToRecyclerView(questionsRecyclerView);

        questionsRecyclerView.setLayoutManager(linearLayoutManager);


        questionAdapter= new QuestionViewHolder(questions);

        questionsRecyclerView.setAdapter(questionAdapter);

        Button btn= (Button) findViewById(R.id.idDone_btn);

        test1();





        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (questionAdapter.getIsCheked()>= 5){

                    Intent intent=new Intent(Quizz.this, ResultActivity.class);
                    intent.putExtra("quizz", true);
                    intent.putExtra("ans1",questionAdapter.isPregunta1());
                    intent.putExtra("ans2",questionAdapter.isPregunta2());
                    intent.putExtra("ans3",questionAdapter.isPregunta3());
                    intent.putExtra("ans4",questionAdapter.isPregunta4());
                    startActivity(intent);
                }else{
                    Toast.makeText(Quizz.this, "Please Make A choice for all Questions", Toast.LENGTH_SHORT).show();
                }

            }
        });






//        questionAdapter.setOnCLickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getApplicationContext(), "checked :"+questions.get(questionsRecyclerView.getChildAdapterPosition(view)).getQuestion(), Toast.LENGTH_SHORT).show();
//
//            }
//        });

    }

    private void test1() {

//        questionsRecyclerView = (RecyclerView) findViewById(R.id.idrecycler);
//        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
//        LinearLayoutManager llm = new LinearLayoutManager(this);
//        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
//
//
//        questionsRecyclerView.setLayoutManager(linearLayoutManager);
//
//
//        questionAdapter= new QuestionViewHolder(questions);
//
//        questionsRecyclerView.setAdapter(questionAdapter);
//
//        Button btn= (Button) findViewById(R.id.idDone_btn);
//
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                if (questionAdapter.getIsCheked()>= 5){
//
//                    Intent intent=new Intent(Quizz.this, ResultActivity.class);
//                    intent.putExtra("ans1",questionAdapter.isPregunta1());
//                    intent.putExtra("ans2",questionAdapter.isPregunta2());
//                    intent.putExtra("ans3",questionAdapter.isPregunta3());
//                    intent.putExtra("ans4",questionAdapter.isPregunta4());
//                    startActivity(intent);
//                }else{
//                    Toast.makeText(Quizz.this, "Please Make A choice for all Questions", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });

        questions.add(new Question(
                "Which one of these lists contains only Java programming language keywords?",
                "class, if, void, long, Int, continue", multipleanswer));

        questions.add(new Question(
                "Which will legally declare, construct, and initialize an array?",
                "8", multipleanswer2));

        questions.add(new Question("How many tires do you have to buy if you have 2 cars in the family?",
                "8", multipleanswer3));

        questions.add(new Question("If a jar of marmelade costs $3 how much do 12 jars of marmelade cost?",
                "$36", multipleanswer4));

        questions.add(new Question("Which planet is nearest the sun?"
                , "Mercury", multipleanswer5));


        multipleanswer.add("class, if, void, long, Int, continue");
        multipleanswer.add("goto, instanceof, native, finally, default, throws\n");
        multipleanswer.add("try, virtual, throw, final, volatile, transient\n");
        multipleanswer.add("strictfp, constant, super, implements, do\n");

        multipleanswer2.add("Other");
        multipleanswer2.add("8");
        multipleanswer2.add("Other");
        multipleanswer2.add("Other");


        multipleanswer3.add("Other");
        multipleanswer3.add("Other");
        multipleanswer3.add("8");
        multipleanswer3.add("Other");


        multipleanswer4.add("Other");
        multipleanswer4.add("Other");
        multipleanswer4.add("Other");
        multipleanswer4.add("$36");

        multipleanswer5.add("Other");
        multipleanswer5.add("Other");
        multipleanswer5.add("Other");
        multipleanswer5.add("Mercury");
    }


//    private void test2() {
//
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
//
//
//        answers1.put("Near the sea", 1 );
//        answers1.put("On the Hill", 1 );
//        answers1.put("In a big city", 1 );
//        answers1.put("In a farm", 1 );
//
//        answers2.put("One day before leaving", 1 );
//        answers2.put("When everybody has fun togueter", 1 );
//        answers2.put("When talking", 1 );
//        answers2.put("When leaving and when coming back home", 1 );
//
//        answers3.put("I will achieve it in reality", 1 );
//        answers3.put("My effort will be paid off", 1 );
//        answers3.put("I will fail", 1 );
//        answers3.put("Only success in a dream, so what?", 1 );
//
//        answers4.put("Soup or curry", 1 );
//        answers4.put("Rice or bread", 1 );
//        answers4.put("Salad", 1 );
//        answers4.put("Vegetables", 1 );
//
//        answers5.put("Wow! how beautiful", 1 );
//        answers5.put("Oh! How sad", 1 );
//        answers5.put("Nice Weather", 1 );
//        answers5.put("I want to shout as loud as I can", 1 );
//
//
//
//        questions2.add(new Question2("Where would you choose to live?", answers1));
//        questions2.add(new Question2("If you are going on holidays, when do you feel most happy?", answers2));
//        questions2.add(new Question2("What do you think when you have dreamed about achieving something?", answers3));
//        questions2.add(new Question2("There are lots of different dishes on the dinning table. What do you want to eat first?", answers4));
//        questions2.add(new Question2("Where would you choose to live?", answers5));
//
//
//
//    }

}
