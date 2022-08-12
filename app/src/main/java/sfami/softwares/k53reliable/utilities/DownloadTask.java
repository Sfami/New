package sfami.softwares.k53reliable.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import sfami.softwares.k53reliable.database.RoadSignDataBaseHelper;
import sfami.softwares.k53reliable.models.RoadSign;

public class DownloadTask extends AsyncTask<String, Void, Bitmap[]> {

    Context context;
    List<RoadSign> roadSigns;
    String[] info;

    public DownloadTask(Context context, List<RoadSign> roadSigns, String[] info){
        this.context = context;
        this.roadSigns = roadSigns;
        this.info = info;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Bitmap[] doInBackground(String... strings) {

        Bitmap[] images = new Bitmap[strings.length];
        for (int i = 0; i < strings.length; i++) {
            String link = strings[i];
            try {
                URL url = new URL(link);
                InputStream inputStream = url.openStream();
                Bitmap bitmap = BitmapFactory.decodeStream(inputStream);
                images[i] = bitmap;
            } catch (Exception e) {
                Log.i("Background", link);
            }
        }
        return images;
    }

    @Override
    protected void onPostExecute(Bitmap[] images) {
        super.onPostExecute(images);
        for (int i = 0; i < images.length; i++) {
            roadSigns.get(i).setImage(images[i]);
        }
        saveRoadSignsInDatabase(info[0], info[1]);
    }

    private void saveRoadSignsInDatabase(String dbName, String tableName){
        RoadSignDataBaseHelper dataBaseHelper = new RoadSignDataBaseHelper(context.getApplicationContext(), dbName, tableName);
        dataBaseHelper.setTableName(tableName);
        boolean success = dataBaseHelper.addMany(roadSigns);
        String ans = "";
        if (success) ans = "SUCCESSFUL";
        else ans = "FAILED";
        Log.i("Saving to DB", ans + " " + dbName + " " + tableName);
    }
}
