package sfami.softwares.k53reliable.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadRule;

public class RoadRulesAdapter extends RecyclerView.Adapter<RoadRulesAdapter.ViewHolder> {

    List<RoadRule> myRoadRuleData;
    Context context;

    public RoadRulesAdapter(List<RoadRule> myRoadRuleData, Activity activity) {
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
        final RoadRule roadRule = myRoadRuleData.get(position);
        holder.textViewName.setText(roadRule.getName());
        holder.textViewInstruction.setText(roadRule.getInstruction());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return myRoadRuleData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewName;
        TextView textViewInstruction;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textName);
            textViewInstruction = itemView.findViewById(R.id.textdate);
        }
    }


}
