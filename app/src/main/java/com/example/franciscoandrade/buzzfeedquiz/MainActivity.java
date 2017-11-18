package com.example.franciscoandrade.buzzfeedquiz;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.franciscoandrade.buzzfeedquiz.view.QuestionViewHolder;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    ImageView image2;
//    Boolean active1, active2;



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

        image1 = (ImageView) findViewById(R.id.idimage_q1);
        image2 = (ImageView) findViewById(R.id.idimage_q2);
//
        Picasso.with(this).load("https://images.unsplash.com/photo-1494707924465-e1426acb48cb?auto=format&fit=crop&w=1050&q=60&ixid=dW5zcGxhc2guY29tOzs7Ozs%3D").into(image1);
        Picasso.with(getApplicationContext()).load("https://www.greatschools.org/gk/wp-content/uploads/2016/12/Teens-taking-personality-tests.jpg").into(image2);


    }

    public void onClickMain(View view) {

        Intent intent = new Intent(MainActivity.this, Quizz.class);
        Intent intent2 = new Intent(MainActivity.this, QuizzTwo.class);

        if (view.getId() == R.id.quizzbtn1) {
            startActivity(intent);

//            setActive1(true);
//            setActive2(false);

        } else if (view.getId() == R.id.quizzbtn2) {
            startActivity(intent2);
//            setActive1(false);
//            setActive2(true);
        }


    }
//    public Boolean getActive1() {
//        return active1;
//    }
//
//    public void setActive1(Boolean active1) {
//        this.active1 = active1;
//    }
//
//    public Boolean getActive2() {
//        return active2;
//    }
//
//    public void setActive2(Boolean active2) {
//        this.active2 = active2;
//    }


}
