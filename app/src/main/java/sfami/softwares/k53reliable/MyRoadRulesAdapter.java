package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;

public class MyRoadRulesAdapter extends RecyclerView.Adapter<MyRoadRulesAdapter.ViewHolder> {

    MyRoadRuleData[] myRoadRuleData;
    Context context;

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

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myRoadSignDataList.getRuleTitle(), Toast.LENGTH_SHORT).show();
                if (myRoadSignDataList.getRuleTitle().equals("General road rules.")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getRuleTitle());
                    MyRoadRuleData[] d = new MyRoadRuleData[]{
                            new MyRoadRuleData(GlobalElements.overTakingLanesFreewayRules),
                            new MyRoadRuleData(GlobalElements.parkingAndStoppingAreasRules),
                            new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
                            new MyRoadRuleData(GlobalElements.generalRoadRules),
                            new MyRoadRuleData(GlobalElements.speedRules)
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }

                if (myRoadSignDataList.getRuleTitle().equals("General road rules.")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getRuleTitle());
                    MyRoadRuleData[] d = new MyRoadRuleData[]{
                            new MyRoadRuleData(GlobalElements.overTakingLanesFreewayRules),
                            new MyRoadRuleData(GlobalElements.parkingAndStoppingAreasRules),
                            new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
                            new MyRoadRuleData(GlobalElements.generalRoadRules),
                            new MyRoadRuleData(GlobalElements.speedRules)
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getRuleTitle().equals("General road rules.")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getRuleTitle());
                    MyRoadRuleData[] d = new MyRoadRuleData[]{
                            new MyRoadRuleData(GlobalElements.overTakingLanesFreewayRules),
                            new MyRoadRuleData(GlobalElements.parkingAndStoppingAreasRules),
                            new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
                            new MyRoadRuleData(GlobalElements.generalRoadRules),
                            new MyRoadRuleData(GlobalElements.speedRules)
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getRuleTitle().equals("General road rules.")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getRuleTitle());
                    MyRoadRuleData[] d = new MyRoadRuleData[]{
                            new MyRoadRuleData(GlobalElements.overTakingLanesFreewayRules),
                            new MyRoadRuleData(GlobalElements.parkingAndStoppingAreasRules),
                            new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
                            new MyRoadRuleData(GlobalElements.generalRoadRules),
                            new MyRoadRuleData(GlobalElements.speedRules)
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
                if (myRoadSignDataList.getRuleTitle().equals("General road rules.")){
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    intent.putExtra("title", myRoadSignDataList.getRuleTitle());
                    MyRoadRuleData[] d = new MyRoadRuleData[]{
                            new MyRoadRuleData(GlobalElements.overTakingLanesFreewayRules),
                            new MyRoadRuleData(GlobalElements.parkingAndStoppingAreasRules),
                            new MyRoadRuleData(GlobalElements.directionIndicatorsRoadLanesRules),
                            new MyRoadRuleData(GlobalElements.generalRoadRules),
                            new MyRoadRuleData(GlobalElements.speedRules)
                    };
                    intent.putExtra("data", d);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    context.startActivity(intent);
                }
            }
        });
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
