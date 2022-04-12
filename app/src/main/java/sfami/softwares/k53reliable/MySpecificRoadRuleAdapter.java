package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MySpecificRoadRuleAdapter extends RecyclerView.Adapter<MySpecificRoadRuleAdapter.ViewHolder> {

    MyRoadSignData[] myRoadSignData;
    Context context;

    public MySpecificRoadRuleAdapter(MyRoadSignData[] myRoadSignData, Activity activity) {
        this.myRoadSignData = myRoadSignData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.specific_road_rule_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyRoadSignData myRoadSignDataList = myRoadSignData[position];
        holder.name.setText(myRoadSignDataList.getSignName());
        holder.instructions.setText(myRoadSignDataList.getSignDescriptions());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, myRoadSignDataList.getSignName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return myRoadSignData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        TextView instructions;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            instructions = itemView.findViewById(R.id.instructions);

        }
    }


}
