package com.example.franciscoandrade.buzzfeedquiz.view;

import android.app.Application;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.franciscoandrade.buzzfeedquiz.Question;
import com.example.franciscoandrade.buzzfeedquiz.R;

import java.util.ArrayList;

/**
 * Created by franciscoandrade on 11/16/17.
 */

public class QuestionViewHolder extends RecyclerView.Adapter<QuestionViewHolder.ViewHolderQuestion> {



    ArrayList<Question> listQuestions;

    public QuestionViewHolder(ArrayList<Question> listQuestions) {
        this.listQuestions=listQuestions;
    }


    @Override
    public ViewHolderQuestion onCreateViewHolder(ViewGroup parent, int viewType) {

        //View view= LayoutInflater.from(parent.getContext()).inflate(layout, null, false);


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_questions,parent, false);
        return new ViewHolderQuestion(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolderQuestion holder, int position) {

        Question question= listQuestions.get(position);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int pos) {
                RadioButton rdBtn=(RadioButton) view;

                //CHeck if checed
                if(rdBtn.isChecked()){
                    holder.ques.setText(rdBtn.getText());
                }
                else if(!rdBtn.isChecked()){
                    holder.ques.setText("error");

                }

            }
        });

        holder.onBind(question);


    }

    @Override
    public int getItemCount() {
        return listQuestions.size();
    }



    public class ViewHolderQuestion extends RecyclerView.ViewHolder implements View.OnClickListener {
       TextView ques;
       RadioButton ans1, ans2, ans3, ans4;
       int choice=0;


        ItemClickListener itemClickListener;

        public ViewHolderQuestion(View itemView) {
            super(itemView);

            ques= itemView.findViewById(R.id.idquestion);
            ans1 = itemView.findViewById(R.id.idRadio1);
            ans2 = itemView.findViewById(R.id.idRadio2);
            ans3 = itemView.findViewById(R.id.idRadio3);
            ans4 = itemView.findViewById(R.id.idRadio4);

            ans1.setOnClickListener(this);
            ans2.setOnClickListener(this);
            ans3.setOnClickListener(this);
            ans4.setOnClickListener(this);

        }

        public void setItemClickListener(ItemClickListener ic){
            this.itemClickListener=ic;
        }

        public void onBind(Question question){
            ArrayList<String> lista=question.getList();


            ques.setText(question.getQuestion());
            ans1.setText(lista.get(0));
            ans2.setText(lista.get(1));
            ans3.setText(lista.get(2));
            ans4.setText(lista.get(3));

        }

        @Override
        public void onClick(View view) {
            this.itemClickListener.onItemClick(view, getLayoutPosition());

        }
    }
}
