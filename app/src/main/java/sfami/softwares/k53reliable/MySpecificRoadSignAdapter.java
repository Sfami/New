package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MySpecificRoadSignAdapter extends RecyclerView.Adapter<MySpecificRoadSignAdapter.ViewHolder> {

    MyRoadSignData[] myRoadSignData;
    Context context;
//    MyRoadSignData[] d = new MyRoadSignData[]{
//            new MyRoadSignData("General Duties of a Driver/Rider", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Pedestrians Right of Way", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Duties Relating to Motorcycles", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Crossing/Entering Public Road", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//            new MyRoadSignData("Roundabout and Mini-Traffic Circle", signName, signDescriptions, signPurpose, signAction, signWhere, signImage),
//    };

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
        holder.title.setText(myRoadSignDataList.getSignName());
        holder.description.setText(myRoadSignDataList.getSignDescriptions());
//        holder.purpose.setText(myRoadSignDataList.getSignPurpose());
//        holder.action.setText(myRoadSignDataList.getSignAction());
//        holder.where.setText(myRoadSignDataList.getSignWhere());
        holder.image.setImageResource(myRoadSignDataList.getSignImage());

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
