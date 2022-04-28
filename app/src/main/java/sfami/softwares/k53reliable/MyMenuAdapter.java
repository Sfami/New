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
        holder.textViewTitle.setText(myRoadSignDataList.getSignName());
        holder.textViewDescription.setText(myRoadSignDataList.getSignDescriptions());
        holder.movieImage.setImageResource(myRoadSignDataList.getSignImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (myRoadSignDataList.getSignName().equals("Road Signs")){
                    Intent intent = new Intent(context, RoadSignsMainActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.stopFrontSignalSign),
                            new MyRoadSignData(GlobalElements.stopRearSignalSign),
                            new MyRoadSignData(GlobalElements.stopFrontAndRearSignalSign),
                            new MyRoadSignData(GlobalElements.proceedSignalSign),
                            new MyRoadSignData(GlobalElements.stopFlagSignalSign),
                            new MyRoadSignData(GlobalElements.proceedFlagSignalSign),
                            new MyRoadSignData(GlobalElements.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals("Road Rules")){
                    Intent intent = new Intent(context, RoadRulesMainActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.stopFrontSignalSign),
                            new MyRoadSignData(GlobalElements.stopRearSignalSign),
                            new MyRoadSignData(GlobalElements.stopFrontAndRearSignalSign),
                            new MyRoadSignData(GlobalElements.proceedSignalSign),
                            new MyRoadSignData(GlobalElements.stopFlagSignalSign),
                            new MyRoadSignData(GlobalElements.proceedFlagSignalSign),
                            new MyRoadSignData(GlobalElements.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals("Controls")){
                    Intent intent = new Intent(context, ControlsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    MyRoadSignData[] d = new MyRoadSignData[]{
                            new MyRoadSignData(GlobalElements.stopFrontSignalSign),
                            new MyRoadSignData(GlobalElements.stopRearSignalSign),
                            new MyRoadSignData(GlobalElements.stopFrontAndRearSignalSign),
                            new MyRoadSignData(GlobalElements.proceedSignalSign),
                            new MyRoadSignData(GlobalElements.stopFlagSignalSign),
                            new MyRoadSignData(GlobalElements.proceedFlagSignalSign),
                            new MyRoadSignData(GlobalElements.warningFlagSignalSign),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals("K53 Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    QuestionModel[] d = new QuestionModel[]{
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals("Book Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    QuestionModel[] d = new QuestionModel[]{
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals("Controls Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    QuestionModel[] d = new QuestionModel[]{
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals("Road Signs Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    QuestionModel[] d = new QuestionModel[]{
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                            new QuestionModel("What is the speed limit here.", "50 km/h","20 km/h","100 km/h","60 km/h",2),
                    };
                    intent.putExtra("data", d);
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getSignName().equals("Road Rules Test")){
                    Intent intent = new Intent(context, QuizActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getSignName());
                    QuestionModel[] d = new QuestionModel[]{
                            // Driver
                            new QuestionModel("You may not get a learner's licence if you:", "Are over 17 years old.","You already have a licence for the same class of vehicle","Wear glasses.","60 km/h",2),
                            new QuestionModel("When you only have a learner's licence you are not allowed to:", "Carry passengers in your car.","Drive faster than 100 km/h.","Drive without having your licence with you.","60 km/h",1),

                            // Speed-limit
                            new QuestionModel("If there are no speed limit signs, the general speed limit in urban areas (towns and cities) is:", "80 km/h","60 km/h","100 km/h","20 km/h",2),
                            new QuestionModel("The general speed limit on national roads in 100 km/h for the following vehicles:\n(1) Light motor vehicles.\n(2)Bakkies.\n(3)Passenger buses.", "(1), (2), and (3) are all true.","Only (1) and (2) are true.","Only (1) is true.","60 km/h",2),
                            new QuestionModel("If you do not know what the speed limit on a national is, you should:", "Pull off the road immediately.","Drive at 80 km/h","Drive at 100 km/h","60 km/h",2),
                            new QuestionModel("Which of the following is false?", "The maximum speed limit for tractors on public roads is 80 km/h.","Minibuses carrying passengers may never travel faster than 100 km/h"," If a road sign gives a different speed limit than 60 km/h in an urban area it must be obeyed.","60 km/h",2),
                            new QuestionModel("The general speed limit on freeways roads in 120 km/h for the following vehicles:\n(1) Light motor vehicles.\n(2)Bakkies.\n(3)Passenger buses.", "(1), (2), and (3) are all true.","Only (1) and (2) are true.","Only (1) is true.","60 km/h",2),

                            new QuestionModel("You may not:", "Overtake on the left where there is only one lane but the road is wide enough for two cars outside and urban area.","Overtake when directed to do so by an officer.","Indicate to the left when you are overtaking on the left.","",2),
                            new QuestionModel("Your vehicle's clearance certificate (licence disc) is valid for:", "6 months","12 months","18 months","",2),
                            new QuestionModel("On a public road, you are allowed to:", "Pass other vehicles on the left-hand side if they are turning right.","Pass other vehicles on the left-hand side if they are turning right as long as you don't o onto the road shoulder.","You may not pass vehicles on the left-hand side.","",2),
                            new QuestionModel("You may drive on the right hand side of a two-way road if:", "There is a sign prohibiting overtaking.","You did not cross any barriers or solid road markings to get there.","The closest oncoming car is 2 seconds away.","",2),
                            new QuestionModel("Adjustable spotlights may be used by the following people on a public road:", "Vets","Farmers","Four-wheel drive vehicles.","",2),
                            new QuestionModel("You may not have any ... showing on your tyre:", "Tread pattern","Steel belts","Cuts of less than 10% of the tyre width.","",2),
                            new QuestionModel("Your tyre tread must be deeper than:", "25mm all over","1mm all over","10mm all over","",2),
//                            new QuestionModel("", "","","","",2),
                            new QuestionModel("Which one is not correct?", "You may not stop facing oncoming traffic.","If you are in a traffic circle you must yield to people entering the circle in front of you.","The maximum amount of time that a vehicle can be parked in one place without moving outside an urban area is 24 hours.","",2),
                            new QuestionModel("The service brake of a light motor vehicle is also known as the:", "Parking brake","Emergency brake","Foot brake","",2),
//                            new QuestionModel("", "","","","",2),
                    };
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
