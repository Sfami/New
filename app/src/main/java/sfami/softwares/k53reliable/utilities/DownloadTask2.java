package sfami.softwares.k53reliable.utilities;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import sfami.softwares.k53reliable.database.QuestionDataBaseHelper;
import sfami.softwares.k53reliable.models.Question;


public class DownloadTask2 extends AsyncTask<String, Void, Bitmap[]> {

    Context context;
    List<Question> questions;
    String[] info;


    public DownloadTask2(Context context, List<Question> questions, String[] info){
        this.context = context;
        this.questions = questions;
        this.info = info;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Bitmap[] doInBackground(String... strings) {

        Bitmap[] images = new Bitmap[strings.length];
        synchronized (this){
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
        }

        return images;
    }

    @Override
    protected void onPostExecute(Bitmap[] images) {
        super.onPostExecute(images);
        for (int i = 0; i < images.length; i++) {
            questions.get(i).setImage(images[i]);
        }
        saveRoadSignsInDatabase(info[0], info[1]);
    }

    private void saveRoadSignsInDatabase(String dbName, String tableName){
        QuestionDataBaseHelper dataBaseHelper = new QuestionDataBaseHelper(context.getApplicationContext(), dbName, tableName);
        boolean success = dataBaseHelper.addMany(questions);
        String ans = "";
        if (success) ans = "SUCCESSFUL";
        else ans = "FAILED";
        Log.i("Saving to DB", ans + " " + dbName + " " + tableName);
    }
}
