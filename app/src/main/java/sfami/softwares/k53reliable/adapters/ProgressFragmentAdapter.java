package sfami.softwares.k53reliable.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.activities.ViewResultsActivity;
import sfami.softwares.k53reliable.database.QuestionDataBaseHelper;
import sfami.softwares.k53reliable.models.Question;
import sfami.softwares.k53reliable.models.TestResult;

public class ProgressFragmentAdapter extends RecyclerView.Adapter<ProgressFragmentAdapter.ViewHolder> {

    List<TestResult> myTestResultsData;
    Context context;
    ArrayList<Integer> roadSignsTestsScores = new ArrayList<>();
    ArrayList<Integer> roadRulesTestsScores = new ArrayList<>();
    ArrayList<Integer> controlsTestsScores = new ArrayList<>();
    ArrayList<Integer> K53TestsScores = new ArrayList<>();
    ArrayList<String> averageScores = new ArrayList<>();

    public ProgressFragmentAdapter(List<TestResult> myTestResultsData, Activity activity) {
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
        final TestResult myTestResultsDataList = myTestResultsData.get(position);

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
        //  TODO Create average score functionality (Done).
        // TODO Create imageUrl for this card (Done).
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

                String dbName = createNameForDB(myTestResultsDataList.getTestName());
                Log.w("", dbName);
                HashMap<String, String> databasesMap = GlobalElements.getDatabasesMap();
                List<Question> d = new QuestionDataBaseHelper(view.getContext(), dbName, databasesMap.get(dbName)).getAllTestsResults();

                intent.putExtra("data", (Serializable) d);
                intent.putExtra("number", holder.getAdapterPosition());

                view.getContext().startActivity(intent);
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
