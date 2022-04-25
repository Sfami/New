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

import java.util.List;

public class MyProgressFragmentAdapter extends RecyclerView.Adapter<MyProgressFragmentAdapter.ViewHolder> {

    List<TestResultModel> myRoadSignData;
    Context context;

    public MyProgressFragmentAdapter(List<TestResultModel> myRoadSignData, Activity activity) {
        this.myRoadSignData = myRoadSignData;
        this.context = activity;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.test_score_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final TestResultModel myRoadSignDataList = myRoadSignData.get(position);
        holder.test.setText(myRoadSignDataList.getTestName().toString());
        holder.score.setText(myRoadSignDataList.getScore().toString());
        // TO-DO: Create image for this card.
        int img = 0;
        if (myRoadSignDataList.getScore() > 4) img = R.drawable.gold;
        else if (myRoadSignDataList.getScore() > 2 && myRoadSignDataList.getScore() < 5 ) img = R.drawable.silver;
        else img = R.drawable.bronze;
        holder.image.setImageResource(img);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return myRoadSignData.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView test;
        TextView score;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            test = itemView.findViewById(R.id.test);
            score = itemView.findViewById(R.id.score);
            image = itemView.findViewById(R.id.image);

        }
    }


}
