package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MySpecificRoadSignAdapter extends RecyclerView.Adapter<MySpecificRoadSignAdapter.ViewHolder> {

    MyRoadSignData[] myRoadSignData;
    Context context;

    public MySpecificRoadSignAdapter(MyRoadSignData[] myRoadSignData, Activity activity) {
        this.myRoadSignData = myRoadSignData;
        this.context = activity;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.specific_road_sign_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyRoadSignData myRoadSignDataList = myRoadSignData[position];
        holder.title.setText(myRoadSignDataList.getName());
        holder.description.setText(myRoadSignDataList.getDescription());
//        holder.purpose.setText(myRoadSignDataList.getPurpose());
//        holder.action.setText(myRoadSignDataList.getAction());
//        holder.where.setText(myRoadSignDataList.getWhere());
        holder.image.setImageResource(myRoadSignDataList.getImage());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return myRoadSignData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView title;
        TextView description;
        TextView action;
        TextView purpose;
        TextView where;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.desc);
//            purpose = itemView.findViewById(R.id.purpose);
//            action = itemView.findViewById(R.id.action);
//            where = itemView.findViewById(R.id.where);

        }
    }


}
