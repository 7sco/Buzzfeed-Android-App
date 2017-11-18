package com.example.franciscoandrade.buzzfeedquiz;

import java.util.ArrayList;

/**
 * Created by franciscoandrade on 11/16/17.
 */

public class Question {

     String question;
     String answer;
     ArrayList<String> list;
//    private String selection;


    public Question(String question, String answer, ArrayList<String> list) {
        this.question = question;
        this.answer = answer;
        this.list = list;

       // this.selection = selection;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }

    public ArrayList<String> getList() {
        return list;
    }


//    public String getSelection() {
//        return selection;
//    }
}
