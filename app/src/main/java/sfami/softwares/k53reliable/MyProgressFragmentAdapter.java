package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyProgressFragmentAdapter extends RecyclerView.Adapter<MyProgressFragmentAdapter.ViewHolder> {

    List<TestResultModel> myTestResultsData;
    Context context;
    ArrayList<Integer> roadSignsTestsScores = new ArrayList<>();
    ArrayList<Integer> roadRulesTestsScores = new ArrayList<>();
    ArrayList<Integer> controlsTestsScores = new ArrayList<>();
    ArrayList<Integer> K53TestsScores = new ArrayList<>();
    ArrayList<String> averageScores = new ArrayList<>();

    public MyProgressFragmentAdapter(List<TestResultModel> myTestResultsData, Activity activity) {
        this.myTestResultsData = myTestResultsData;
        this.context = activity;
        setScores();
    }

    public void setScores(){
        for (int i = 0; i < myTestResultsData.size(); i++) {
            if (myTestResultsData.get(i).getTestName().equals("Controls Test")){
                controlsTestsScores.add(myTestResultsData.get(i).getScore());
            }
            if (myTestResultsData.get(i).getTestName().equals("Road Signs Test")){
                roadSignsTestsScores.add(myTestResultsData.get(i).getScore());
            }
            if (myTestResultsData.get(i).getTestName().equals("Road Rules Test")){
                roadRulesTestsScores.add(myTestResultsData.get(i).getScore());
            }
            if (myTestResultsData.get(i).getTestName().equals("K53 Test")){
                K53TestsScores.add(myTestResultsData.get(i).getScore());
            }
        }
    }

    private String getAverageScore(ArrayList<Integer> scores){
        String avgScore = "";
        int totalScore = 0;
        for (int i = 0; i < scores.size(); i++) {
            totalScore += scores.get(i);
        }
        avgScore = String.valueOf(totalScore / Double.parseDouble(Integer.toString(scores.size())));
        return avgScore;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.test_score_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TestResultModel myTestResultsDataList = myTestResultsData.get(position);

        if (myTestResultsDataList.getTestName().equals("Controls Test")){
            holder.averageScore.setText(getAverageScore(controlsTestsScores) + " / " +myTestResultsDataList.getTotal().toString());
        }
        if (myTestResultsDataList.getTestName().equals("Road Signs Test")){
            holder.averageScore.setText(getAverageScore(roadSignsTestsScores) + " / " +myTestResultsDataList.getTotal().toString());
        }
        if (myTestResultsDataList.getTestName().equals("Road Rules Test")){
            holder.averageScore.setText(getAverageScore(roadRulesTestsScores) + " / " +myTestResultsDataList.getTotal().toString());
        }
        if (myTestResultsDataList.getTestName().equals("K53 Test")){
            holder.averageScore.setText(getAverageScore(K53TestsScores) + " / " +myTestResultsDataList.getTotal().toString());
        }

        holder.test.setText(myTestResultsDataList.getTestName().toString());
        holder.score.setText(myTestResultsDataList.getScore().toString() + " / " +myTestResultsDataList.getTotal().toString());
        // TO-DO: Create average score functionality.
//        holder.averageScore.setText(myTestResultsDataList.getScore().toString());
        // TO-DO: Create image for this card.
        int img = 0;
        if (myTestResultsDataList.getScore() > 4) img = R.drawable.gold;
        else if (myTestResultsDataList.getScore() > 2 && myTestResultsDataList.getScore() < 5 ) img = R.drawable.silver;
        else img = R.drawable.bronze;
        holder.image.setImageResource(img);

        holder.viewResults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), myTestResultsDataList.getAnswers(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(view.getContext(), ViewResultsActivity.class);
                intent.putExtra("title", myTestResultsDataList.getTestName());
                intent.putExtra("answers", myTestResultsDataList.getAnswers());
                intent.putExtra("score", myTestResultsDataList.getScore());
                QuestionModel[] d = null;
                if (myTestResultsDataList.getTestName().equals("Controls Test")){
                    d = Questions.vehicleControlsQuestions;
                }
                if (myTestResultsDataList.getTestName().equals("Road Signs Test")){
                    d = Questions.roadSignsQuestions;
                }
                if (myTestResultsDataList.getTestName().equals("Road Rules Test")){
                    d = Questions.roadRulesQuestions;
                }
                if (myTestResultsDataList.getTestName().equals("K53 Test")){
                    d = Questions.roadRulesQuestions;
                }
                
                intent.putExtra("data", d);
                view.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return myTestResultsData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView test;
        TextView score, averageScore;
        TextView viewResults;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            test = itemView.findViewById(R.id.test);
            score = itemView.findViewById(R.id.score);
            averageScore = itemView.findViewById(R.id.average_score);
            image = itemView.findViewById(R.id.image);
            viewResults = itemView.findViewById(R.id.results);
        }
    }


}
