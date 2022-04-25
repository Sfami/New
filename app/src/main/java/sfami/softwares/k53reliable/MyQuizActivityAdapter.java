package sfami.softwares.k53reliable;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class MyQuizActivityAdapter extends RecyclerView.Adapter<MyQuizActivityAdapter.ViewHolder> {

    MyRoadSignData[] myRoadSignData;
    Context context;
    final Button submit;

    public MyQuizActivityAdapter(Button submit, MyRoadSignData[] myRoadSignData, Activity activity) {
        this.myRoadSignData = myRoadSignData;
        this.context = activity;
        this.submit = submit;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.quiz_question_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final MyRoadSignData myRoadSignDataList = myRoadSignData[position];
        holder.question.setText(myRoadSignDataList.getSignPurpose());
        holder.ans1.setText(myRoadSignDataList.getSignAction());
        holder.ans2.setText(myRoadSignDataList.getSignAction());
        holder.ans3.setText(myRoadSignDataList.getSignAction());
        holder.image.setImageResource(myRoadSignDataList.getSignImage());

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.makeToast();
            }
        });
//        holder.itemView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                holder.makeToast();
//            }
//        });
    }

    @Override
    public int getItemCount() {
        return myRoadSignData.length;
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView question;
        TextView ans1, ans2, ans3;
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            question = itemView.findViewById(R.id.question);
            ans1 = itemView.findViewById(R.id.ans1);
            ans2 = itemView.findViewById(R.id.ans2);
            ans3 = itemView.findViewById(R.id.ans3);
            image = itemView.findViewById(R.id.image);

        }

        public void makeToast(){
            Toast.makeText(itemView.getContext(), "Testing",Toast.LENGTH_SHORT).show();
        }
    }


}
