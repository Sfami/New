package sfami.softwares.k53reliable.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.models.RoadSign;

public class RoadSignsAdapter extends RecyclerView.Adapter<RoadSignsAdapter.ViewHolder> {

    List<RoadSign> roadSigns;
    Context context;

    public RoadSignsAdapter(Activity activity, List<RoadSign> roadSigns) {
        this.context = activity;
        this.roadSigns = roadSigns;
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
        final RoadSign roadSign = this.roadSigns.get(position);
        holder.name.setText(roadSign.getName());
        holder.purpose.setText(roadSign.getPurpose());
        holder.action.setText(roadSign.getAction());
        holder.where.setText(roadSign.getWhere());

        try {
            holder.image.setImageBitmap(roadSign.getImage());
        }
        catch (Exception e){
            holder.image.setImageResource(R.drawable.stop);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    @Override
    public int getItemCount() {
        return roadSigns.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView image;
        TextView name;
        TextView where;
        TextView purpose;
        TextView action;
        TextView description;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            where = itemView.findViewById(R.id.where);
            purpose = itemView.findViewById(R.id.purpose);
            action = itemView.findViewById(R.id.action);
//            description = itemView.findViewById(R.id.desc);

        }
    }




}
