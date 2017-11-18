package com.example.franciscoandrade.buzzfeedquiz;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by franciscoandrade on 11/17/17.
 */

public class Question2 {


    String question;
    HashMap<String, Integer > list;

    public Question2(String question, HashMap<String, Integer> list) {
        this.question = question;
        this.list = list;
    }

    public String getQuestion() {
        return question;
    }

    public HashMap<String, Integer> getList() {
        return list;
    }
}
