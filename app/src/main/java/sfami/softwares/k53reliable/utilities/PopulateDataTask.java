package sfami.softwares.k53reliable.utilities;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import sfami.softwares.k53reliable.activities.FAQsActivity;
import sfami.softwares.k53reliable.activities.MainActivity;
import sfami.softwares.k53reliable.global.GlobalElements;

public class PopulateDataTask extends AsyncTask<String, Void, String> {

    Activity activity;
    List<String[]> roadSignsInformation;
    List<String[]> testsInformation;
    ProgressDialog progressDialog;
    int progress = 0;


    public PopulateDataTask(Activity activity){
        this.activity = activity;
        progressDialog = new ProgressDialog(this.activity);

    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();

//        progressDialog.setMax(roadSignsInformation.size() + testsInformation.size());
        progressDialog.setMessage("Download in progress...\nPlease wait...");
        progressDialog.show();
    }

    @Override
    protected String doInBackground(String... strings) {
        roadSignsInformation = GlobalElements.getRoadSignsInformation();
        testsInformation = GlobalElements.getTestsInformation();
        for (String[] info : roadSignsInformation) {
            getDataFromJsonFile(info);
        }
        for (String[] info : testsInformation) {
            getDataFromJsonFile(info);
        }
        return "Done loading data";
    }

    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(result);

        if (progressDialog.isShowing()) {
            progressDialog.dismiss();
        }
        startFAQsActivity();
    }

    public void startFAQsActivity(){
        Intent main = new Intent(activity, FAQsActivity.class);
        activity.startActivity(main);
    }

    public void getDataFromJsonFile(String[] info) {
        String jsonFile = info[2];
        DataRequest req = new DataRequest("https://sfamisoftwares.com/api-js/");
        req.doJSONRequest(activity, jsonFile,
                new RequestHandler() {
                    @Override
                    public void processJSONResponse(String response) throws Exception {
                        Log.i("processing....", jsonFile);
                        DataProcessor processor = new DataProcessor(activity);
                        if (jsonFile.contains("signs/") || jsonFile.contains("menu/")) processor.processRoadSignsJSON(response, info);
                        if (jsonFile.contains("rules/")) processor.processRoadRulesJSON(response, jsonFile);
                        if (jsonFile.contains("vehicle-controls/")) processor.processVehicleControlsJSON(response, jsonFile);
                        if (jsonFile.contains("questions/")) {
                            processor.processQuestionsJSON(response, jsonFile);
                            processor.saveK53QuestionsInDatabase();
                        }
                    }
                });
    }


}
