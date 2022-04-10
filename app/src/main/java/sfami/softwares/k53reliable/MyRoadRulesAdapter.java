package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MyRoadRulesAdapter extends RecyclerView.Adapter<MyRoadRulesAdapter.ViewHolder> {

    MyRoadRuleData[] myRoadRuleData;
    Context context;

//    MyRoadSignData[] d = new MyRoadSignData[]{
//            new MyRoadSignData("General Duties of a Driver/Rider", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Pedestrians Right of Way", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Duties Relating to Motorcycles", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Crossing/Entering Public Road", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Roundabout and Mini-Traffic Circle", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//    };

//    MyRoadSignData[] d = new MyRoadSignData[]{
//            new MyRoadSignData("General Rules", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Overtaking, Lanes, Freeway", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Direction Indicators, Road Lanes", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Speed", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Parking and Stopping Areas", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Reflectors", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("View and Visibility", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Lights, Number Plates", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Steering", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Brake, Tyres", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Fuel Tank, Engine", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Vehicle Length, Height, and Width", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Transporting Goods", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Towing, Vehicle Combinations", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Destruction Vehicles", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Recklessness and Negligence On the Road", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Noise On The Road", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//    };

    public MyRoadRulesAdapter(MyRoadRuleData[] myRoadRuleData, Activity activity) {
        this.myRoadRuleData = myRoadRuleData;
        this.context = activity;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.road_rule_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyRoadRuleData myRoadSignDataList = myRoadRuleData[position];
        holder.textViewName.setText(myRoadSignDataList.getRuleTitle());
        holder.textViewDate.setText(myRoadSignDataList.getRuleInstruction());
//        holder.movieImage.setImageResource(myRoadSignDataList.getRuleImage());

//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(context, myRoadSignDataList.getRuleTitle(), Toast.LENGTH_SHORT).show();
//                if (myRoadSignDataList.getRuleTitle().equals("Control Signs")){
//                    Intent intent = new Intent(context, RoadSignsActivity.class);
//                    intent.putExtra("title", myRoadSignDataList.getRuleTitle());
//                    MyRoadRuleData[] d = new MyRoadRuleData[]{
//                            new MyRoadRuleData(GlobalElements.overTakingLanesFreewayRules),
//                            new MyRoadRuleData(GlobalElements.parkingAndStoppingAreasRules),
//                            new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
//                            new MyRoadRuleData(GlobalElements.generalRoadRules),
//                            new MyRoadRuleData(GlobalElements.speedRules)
//                    };
//                    intent.putExtra("data", d);
//                    context.startActivity(intent);
//                }
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return myRoadRuleData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
//        ImageView movieImage;
        TextView textViewName;
        TextView textViewDate;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            movieImage = itemView.findViewById(R.id.imageview);
            textViewName = itemView.findViewById(R.id.textName);
            textViewDate = itemView.findViewById(R.id.textdate);

        }
    }


}
