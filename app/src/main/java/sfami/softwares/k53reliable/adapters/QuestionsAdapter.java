package sfami.softwares.k53reliable.adapters;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.Question;

public class QuestionsAdapter extends RecyclerView.Adapter<QuestionsAdapter.ViewHolder> {

    List<Question> questions;
    Context context;

    public QuestionsAdapter(Activity activity, List<Question> questions) {
        this.context = activity;
        this.questions = questions;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.quiz_question_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Question question = this.questions.get(position);

        String answer = question.getCorrectAnsNo();
        Log.i(""+position, "correct answer  = " + question.getCorrectAnsNo());

        holder.rb1.setChecked(false);
        holder.rb2.setChecked(false);
        holder.rb3.setChecked(false);

        if (answer.equals("1")){
            holder.rb1.setChecked(true);
            holder.rb2.setChecked(false);
            holder.rb3.setChecked(false);
            Log.i(""+position, "" + 1);
        }
        else if (answer.equals("2")){
            holder.rb1.setChecked(false);
            holder.rb2.setChecked(true);
            holder.rb3.setChecked(false);
            Log.i(""+position, "" + 2);
        }
        else if (answer.equals("3")){
            holder.rb1.setChecked(false);
            holder.rb2.setChecked(false);
            holder.rb3.setChecked(true);
            Log.i(""+position, "" + 3);
        }


        holder.ans1.setText(question.getOption1());
        holder.ans2.setText(question.getOption2());
        holder.ans3.setText(question.getOption3());

        holder.question.setText(question.getQuestion());
        holder.question_number.setText(String.format("Question %s", position + 1));

        try {
            holder.image.setImageBitmap(question.getImage());
        }
        catch (Exception e){
            holder.image.setImageResource(R.drawable.stop);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return questions.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        RadioButton rb1, rb2, rb3;
        TextView ans1, ans2, ans3;
        TextView question, question_number;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            rb1 = itemView.findViewById(R.id.rb1);
            rb2 = itemView.findViewById(R.id.rb2);
            rb3 = itemView.findViewById(R.id.rb3);

            ans1 = itemView.findViewById(R.id.ans1);
            ans2 = itemView.findViewById(R.id.ans2);
            ans3 = itemView.findViewById(R.id.ans3);

            question_number = itemView.findViewById(R.id.question_number);
            question = itemView.findViewById(R.id.question);

        }
    }




}
