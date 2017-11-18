package com.example.franciscoandrade.buzzfeedquiz.view;

import android.app.Application;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.franciscoandrade.buzzfeedquiz.Question;
import com.example.franciscoandrade.buzzfeedquiz.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by franciscoandrade on 11/16/17.
 */

public class QuestionViewHolder extends RecyclerView.Adapter<QuestionViewHolder.ViewHolderQuestion> {



    ArrayList<Question> listQuestions;
    boolean pregunta1, pregunta2, pregunta3, pregunta4, pregunta5;
    int isCheked;

    public QuestionViewHolder() {

    }

    public int getIsCheked() {
        return isCheked;
    }

    public void setIsCheked(int isCheked) {
        this.isCheked = isCheked;
    }

    public void setPregunta1(boolean pregunta1) {
        this.pregunta1 = pregunta1;
    }

    public void setPregunta2(boolean pregunta2) {
        this.pregunta2 = pregunta2;
    }

    public void setPregunta3(boolean pregunta3) {
        this.pregunta3 = pregunta3;
    }

    public void setPregunta4(boolean pregunta4) {
        this.pregunta4 = pregunta4;
    }

    public void setPregunta5(boolean pregunta5) {
        this.pregunta5 = pregunta5;
    }

    @Override
    public ViewHolderQuestion onCreateViewHolder(ViewGroup parent, int viewType) {

        //View view= LayoutInflater.from(parent.getContext()).inflate(layout, null, false);


        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_questions,parent, false);
        return new ViewHolderQuestion(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolderQuestion holder, final int position) {



        Question question= listQuestions.get(position);
        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int pos) {
                RadioButton rdBtn=(RadioButton) view;

                switch (position){

                    case 0:
                        if (rdBtn.getId() == R.id.idRadio1){
                            setPregunta1(true);
                            //pregunta1=true;
                            holder.ques.setText("Right");

                        }else{
                           //pregunta1=false;
                            setPregunta1(true);
                            holder.ques.setText("Wrong");
                        }
                        break;

                    case 1:
                        if (rdBtn.getId()== R.id.idRadio2){
                            //pregunta2=true;
                            setPregunta2(true);
                            holder.ques.setText("Right");
                        }else{
                            setPregunta2(false);
                            holder.ques.setText("Wrong");
                        }
                        break;

                    case 2:
                        if (rdBtn.getId()== R.id.idRadio3){
                            //pregunta3=true;
                            setPregunta3(true);
                            holder.ques.setText("Right");
                        }else{
                            setPregunta3(false);
                            holder.ques.setText("Wrong");
                        }
                        break;

                    case 3:
                        if (rdBtn.getId()== R.id.idRadio4){
                            //pregunta4=true;
                            setPregunta4(true);
                            holder.ques.setText("Right");
                        }else{
                            setPregunta4(false);
                            holder.ques.setText("Wrong");
                        }

                        break;
                    case 4:
                        if (rdBtn.getId()== R.id.idRadio4){
                            //pregunta4=true;
                            setPregunta4(true);
                            holder.ques.setText("Right");
                        }else{
                            setPregunta4(false);
                            holder.ques.setText("Wrong");
                        }

                        break;

                }

                if(rdBtn.isChecked()){
                    isCheked++;
                    setIsCheked(isCheked);

                }
                else {

                    setIsCheked(isCheked);

                }


//                switch (rdBtn.getId()){
//                    case R.id.idRadio1:
//                        holder.ques.setText("Button: "+rdBtn.getText()+" pressed.");
//                        break;
//
//                    case R.id.idRadio2:
//                        holder.ques.setText("Button: "+rdBtn.getText()+" pressed.");
//                        break;
//
//                    case R.id.idRadio3:
//                        holder.ques.setText("Button: "+rdBtn.getText()+" pressed.");
//                        break;
//                    case R.id.idRadio4:
//                        holder.ques.setText("Button: "+rdBtn.getText()+" pressed.");
//                        break;
//
//                }

            }
        });

        holder.onBind(question);
        //Picasso.with().load("http://i.imgur.com/DvpvklR.png").into(imageView);


    }

    @Override
    public int getItemCount() {
        return listQuestions.size();
    }



    public boolean isPregunta1() {
        return pregunta1;
    }

    public boolean isPregunta2() {
        return pregunta2;
    }

    public boolean isPregunta3() {
        return pregunta3;
    }

    public boolean isPregunta4() {
        return pregunta4;
    }

    public boolean isPregunta5() {
        return pregunta5;
    }

    public QuestionViewHolder(ArrayList<Question> listQuestions) {
        this.listQuestions=listQuestions;
    }


    public class ViewHolderQuestion extends RecyclerView.ViewHolder implements View.OnClickListener {
       TextView ques;
       RadioButton ans1, ans2, ans3, ans4;
       Button checkBtn;

       int choice=0;


        ItemClickListener itemClickListener;

        public ViewHolderQuestion(View itemView) {
            super(itemView);

            ques= itemView.findViewById(R.id.idquestion);
            ans1 = itemView.findViewById(R.id.idRadio1);
            ans2 = itemView.findViewById(R.id.idRadio2);
            ans3 = itemView.findViewById(R.id.idRadio3);
            ans4 = itemView.findViewById(R.id.idRadio4);
            checkBtn=(Button)itemView.findViewById(R.id.idDone_btn);

            ans1.setChecked(false);
            ans2.setChecked(false);
            ans3.setChecked(false);
            ans4.setChecked(false);

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
