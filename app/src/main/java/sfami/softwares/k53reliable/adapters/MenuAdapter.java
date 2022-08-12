package sfami.softwares.k53reliable.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.R;
import sfami.softwares.k53reliable.activities.ControlsActivity;
import sfami.softwares.k53reliable.activities.QuizActivity;
import sfami.softwares.k53reliable.activities.RoadRulesActivity;
import sfami.softwares.k53reliable.activities.RoadSignsActivity;
import sfami.softwares.k53reliable.activities.RoadSignsMainActivity;
import sfami.softwares.k53reliable.models.RoadSign;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

    List<RoadSign> categories;
    Context context;

    public MenuAdapter(Activity activity, List<RoadSign> categories) {
        this.context = activity;
        this.categories = categories;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.menu_item_list,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final RoadSign roadSign = this.categories.get(position);
        holder.textViewTitle.setText(roadSign.getName());
        holder.textViewDescription.setText(roadSign.getDescription());

        try {
            holder.movieImage.setImageBitmap(roadSign.getImage());
        }
        catch (Exception e){
            holder.movieImage.setImageResource(R.drawable.stop);
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (GlobalElements.getAllRoadSignsMenusNames().contains(roadSign.getName())) {
                    Toast.makeText(context, roadSign.getName(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, RoadSignsActivity.class);
                    String dbName = createNameForDB(roadSign.getName());
                    Log.w("", dbName);
                    if (roadSign.getName().equals("Control hand signals for use by traffic officer.")){
                        dbName = "handSignals";
                        roadSign.setName("Control Hand Signals");

                    }
                    if (roadSign.getName().equals("Examples Of Temporary Signs")){
                        dbName = "temporarySigns";
                        roadSign.setName("Temporary Signs");

                    }
                    if (roadSign.getName().equals("Information Signs")){
                        dbName = "informationSigns";
                    }
                    intent.putExtra("dbName", dbName);
                    intent.putExtra("title", roadSign.getName());
                    context.startActivity(intent);
                }
                if (GlobalElements.getAllQuizMenuNames().contains(roadSign.getName())) {
                    Toast.makeText(context, roadSign.getName(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, QuizActivity.class);
                    String dbName = createNameForDB(roadSign.getName());
                    Log.w("", dbName);
                    if (roadSign.getName().equals("K53 Test")){
                        dbName = "k53Test";
                    }
                    intent.putExtra("dbName", dbName);
                    intent.putExtra("title", roadSign.getName());
                    context.startActivity(intent);
                }
                if (roadSign.getName().equals("Road Signs")) {
                    Toast.makeText(context, roadSign.getName(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, RoadSignsMainActivity.class);
                    intent.putExtra("title", roadSign.getName());
                    context.startActivity(intent);
                }
                if (roadSign.getName().equals("Road Rules")) {
                    Toast.makeText(context, roadSign.getName(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, RoadRulesActivity.class);
                    intent.putExtra("title", roadSign.getName());
                    context.startActivity(intent);
                }
                if (roadSign.getName().equals("Controls")) {
                    Toast.makeText(context, roadSign.getName(), Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(context, ControlsActivity.class);
                    intent.putExtra("title", roadSign.getName());
                    context.startActivity(intent);
                }
            }
        });
    }


    private String createNameForDB(String roadSignName){
        String[] names = roadSignName.split(" ");
        String lowerChar = ""+ Character.toLowerCase(names[0].charAt(0));
        String dbName = lowerChar + names[0].substring(1);
        Log.i("", roadSignName);
        Log.i("", names[0]);
        for (int i = 1; i < names.length; i++) {
            Log.i("", names[i]);
            dbName += names[i];
        }
        return dbName;
    }



    @Override
    public int getItemCount() {
        return this.categories.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView movieImage;
        TextView textViewTitle;
        TextView textViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage = itemView.findViewById(R.id.imageview);
            textViewTitle = itemView.findViewById(R.id.title);
            textViewDescription = itemView.findViewById(R.id.description);

        }
    }


}
