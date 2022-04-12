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
import androidx.recyclerview.widget.RecyclerView;

public class MyControlsAdapter extends RecyclerView.Adapter<MyControlsAdapter.ViewHolder> {

    MyRoadRuleData[] myRoadRuleData;
    Context context;

    public MyControlsAdapter(MyRoadRuleData[] myRoadRuleData, Activity activity) {
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
