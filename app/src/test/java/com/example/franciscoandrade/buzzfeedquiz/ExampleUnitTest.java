package com.example.franciscoandrade.buzzfeedquiz;

import com.example.franciscoandrade.buzzfeedquiz.view.QuestionViewHolder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    QuestionViewHolder quizz= new QuestionViewHolder();


    public void checkClicks(){

        int clicks= quizz.getIsCheked();
        assertThat(quizz,instanceOf(Integer.class));
    }

    @Test
    public void count() throws Exception {
        int a=5;
        quizz.setIsCheked(a);
        assertEquals(a, 5);
    }


}