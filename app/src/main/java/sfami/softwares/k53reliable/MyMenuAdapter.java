package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyMenuAdapter extends RecyclerView.Adapter<MyMenuAdapter.ViewHolder> {

    MyRoadSignData[] myRoadSignData;
    Context context;

    public MyMenuAdapter(MyRoadSignData[] myRoadSignData, Activity activity) {
        this.myRoadSignData = myRoadSignData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.road_sign_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyRoadSignData myRoadSignDataList = myRoadSignData[position];
        holder.textViewTitle.setText(myRoadSignDataList.getName());
        holder.textViewDescription.setText(myRoadSignDataList.getDescription());
        holder.movieImage.setImageResource(myRoadSignDataList.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (myRoadSignDataList.getName().equals("Road Signs")){
                    Intent intent = new Intent(context, RoadSignsMainActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.stopFrontSignalSign),
                            new MyRoadSignData(RoadSigns.stopRearSignalSign),
                            new MyRoadSignData(RoadSigns.stopFrontAndRearSignalSign),
                            new MyRoadSignData(RoadSigns.proceedSignalSign),
                            new MyRoadSignData(RoadSigns.stopFlagSignalSign),
                            new MyRoadSignData(RoadSigns.proceedFlagSignalSign),
                            new MyRoadSignData(RoadSigns.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals("Road Rules")){
                    Intent intent = new Intent(context, RoadRulesMainActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.stopFrontSignalSign),
                            new MyRoadSignData(RoadSigns.stopRearSignalSign),
                            new MyRoadSignData(RoadSigns.stopFrontAndRearSignalSign),
                            new MyRoadSignData(RoadSigns.proceedSignalSign),
                            new MyRoadSignData(RoadSigns.stopFlagSignalSign),
                            new MyRoadSignData(RoadSigns.proceedFlagSignalSign),
                            new MyRoadSignData(RoadSigns.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals("Controls")){
                    Intent intent = new Intent(context, ControlsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(RoadSigns.stopFrontSignalSign),
                            new MyRoadSignData(RoadSigns.stopRearSignalSign),
                            new MyRoadSignData(RoadSigns.stopFrontAndRearSignalSign),
                            new MyRoadSignData(RoadSigns.proceedSignalSign),
                            new MyRoadSignData(RoadSigns.stopFlagSignalSign),
                            new MyRoadSignData(RoadSigns.proceedFlagSignalSign),
                            new MyRoadSignData(RoadSigns.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals("K53 Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    QuestionModel[] d = GlobalElements.K53TestQuestions;
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals("Book Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    QuestionModel[] d = Questions.roadRulesQuestions;
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals("Controls Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    QuestionModel[] d = Questions.vehicleControlsQuestions;
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals("Road Signs Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    QuestionModel[] d = Questions.roadSignsQuestions;
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getName().equals("Road Rules Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getName());
                    QuestionModel[] d = Questions.roadRulesQuestions;
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return myRoadSignData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView movieImage;
        TextView textViewTitle;
        TextView textViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.imageview);
            textViewTitle = itemView.findViewById(R.id.title);
            textViewDescription = itemView.findViewById(R.id.description);

        }
    }


}
