package sfami.softwares.k53reliable.adapters;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
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
import sfami.softwares.k53reliable.database.TestResultDataBaseHelper;
import sfami.softwares.k53reliable.models.Question;
import sfami.softwares.k53reliable.models.TestResult;

public class TestResultsAdapter extends RecyclerView.Adapter<TestResultsAdapter.ViewHolder> {

    List<Question> questions;
    private Integer number;
    Context context;

    public TestResultsAdapter(Activity activity, List<Question> questions, int number) {
        this.context = activity;
        this.questions = questions;
        this.number = number;
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

        List<TestResult> results = new TestResultDataBaseHelper(context).getAllTestsResults();
        TestResult result = results.get(number);
        String answers = result.getAnswers();
        Log.i(""+position, "answers " + answers);
        answers = answers.replace("[","");
        answers = answers.replace("]","");

        String[] ans = answers.split(",");
        String currentAns = ans[position];
        Log.i(""+position, "currentAns " + currentAns);

        String answer = question.getCorrectAnsNo();
        Log.i(""+position, "correct answer  = " + question.getCorrectAnsNo());

        holder.ans1.setText(question.getOption1());
        holder.ans2.setText(question.getOption2());
        holder.ans3.setText(question.getOption3());

        holder.rb1.setVisibility(View.VISIBLE);
        holder.rb2.setVisibility(View.VISIBLE);
        holder.rb3.setVisibility(View.VISIBLE);


        holder.rb1.setChecked(false);
        holder.rb2.setChecked(false);
        holder.rb3.setChecked(false);

        if (currentAns.contains("1")){
            Log.i(""+position, "" + 1);
            holder.rb1.setChecked(true);
            holder.rb2.setChecked(false);
            holder.rb3.setChecked(false);
            holder.rb2.setVisibility(View.INVISIBLE);
            holder.rb3.setVisibility(View.INVISIBLE);

        }
        else if (currentAns.contains("2")){
            holder.rb1.setChecked(false);
            holder.rb2.setChecked(true);
            holder.rb3.setChecked(false);
            Log.i(""+position, "" + 2);
            holder.rb1.setVisibility(View.INVISIBLE);
            holder.rb3.setVisibility(View.INVISIBLE);

        }
        else if (currentAns.contains("3")){
            holder.rb1.setChecked(false);
            holder.rb2.setChecked(false);
            holder.rb3.setChecked(true);
            Log.i(""+position, "" + 3);
            holder.rb1.setVisibility(View.INVISIBLE);
            holder.rb2.setVisibility(View.INVISIBLE);

        }


        if (answer.equals("1")){
            holder.ans1.setTextColor(Color.parseColor("#347E37"));
            holder.ans2.setTextColor(Color.RED);
            holder.ans3.setTextColor(Color.RED);
            Log.i(""+position, "" + 1);
        }
        else if (answer.equals("2")){
            holder.ans1.setTextColor(Color.RED);
            holder.ans2.setTextColor(Color.parseColor("#347E37"));
            holder.ans3.setTextColor(Color.RED);
            Log.i(""+position, "" + 2);
        }
        else if (answer.equals("3")){
            holder.ans1.setTextColor(Color.RED);
            holder.ans2.setTextColor(Color.RED);
            holder.ans3.setTextColor(Color.parseColor("#347E37"));
            Log.i(""+position, "" + 3);
        }

        holder.question.setText(question.getQuestion());
        holder.question_number.setText(String.format("Question %s", position + 1));

        try {
            if (result.getTestName().contains("Controls")) holder.image.setImageResource(R.drawable.light_motor_manual_controls);
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

    private String createNameForDB(String roadSignName){
        String[] names = roadSignName.split(" ");
        String lowerChar = ""+ Character.toLowerCase(names[0].charAt(0));
        String dbName = lowerChar + names[0].substring(1);
        Log.i("", roadSignName);
        Log.i("", names[0]);
        for (int i = 1; i < names.length; i++) {
            Log.i("", names[i]);
            dbName += names[i];
        }
        return dbName;
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
