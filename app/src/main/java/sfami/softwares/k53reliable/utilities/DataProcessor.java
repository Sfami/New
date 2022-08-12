package sfami.softwares.k53reliable.utilities;

import android.app.Activity;
import android.graphics.Bitmap;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import sfami.softwares.k53reliable.global.GlobalElements;
import sfami.softwares.k53reliable.database.QuestionDataBaseHelper;
import sfami.softwares.k53reliable.models.Question;
import sfami.softwares.k53reliable.models.RoadSign;

public class DataProcessor {

    private Activity activity;

    public DataProcessor(Activity activity){
        this.activity = activity;
    }

    public void processRoadRulesJSON(String json, String jsonFile) throws JSONException {
        JSONArray ja = new JSONArray(json);
        ArrayList<Question> questions = new ArrayList<>();

        for (int i = 0; i < ja.length(); i++) {
            String q = ja.getJSONObject(i).get("question").toString();
            String correctAnsNo = ja.getJSONObject(i).get("correctAnsNo").toString();
            String option1 = ja.getJSONObject(i).get("option1").toString();
            String option2 = ja.getJSONObject(i).get("option2").toString();
            String option3 = ja.getJSONObject(i).get("option3").toString();
            String option4 = ja.getJSONObject(i).get("option4").toString();
            String imageUrl = ja.getJSONObject(i).get("imageUrl").toString();
            Question question = new Question(q, correctAnsNo, option1, option2, option3, option4, imageUrl);
            String dbName = "";
            String tableName = "";
            if (jsonFile.contains("road-rules-qs")) {
                dbName = "rulesQs";
                tableName = "RULES_QS";
            }
            if (jsonFile.contains("road-signs-qs")){
                dbName = "signsQs";
                tableName = "SIGNS_QS";
            }
            if (jsonFile.contains("vehicle-controls-qs")) {
                dbName = "controlsQs";
                tableName = "CONTROLS_QS";
            }

            QuestionDataBaseHelper dataBaseHelper = new QuestionDataBaseHelper(activity, dbName, tableName);
            boolean success = dataBaseHelper.addOne(question);
            questions.add(question);
        }
    }

    public String saveK53QuestionsInDatabase(){
        QuestionDataBaseHelper dataBaseHelper = new QuestionDataBaseHelper(activity, "roadSignsTest", GlobalElements.getDatabasesMap().get("roadSignsTest"));
        QuestionDataBaseHelper dataBaseHelper2 = new QuestionDataBaseHelper(activity, "roadRulesTest", GlobalElements.getDatabasesMap().get("roadRulesTest"));
        QuestionDataBaseHelper dataBaseHelper1 = new QuestionDataBaseHelper(activity, "controlsTest", GlobalElements.getDatabasesMap().get("controlsTest"));
        QuestionDataBaseHelper dataBaseHelperK53 = new QuestionDataBaseHelper(activity, "k53Test", GlobalElements.getDatabasesMap().get("k53Test"));

        boolean success = dataBaseHelperK53.addMany(dataBaseHelper.getAllTestsResults());
        boolean success1 = dataBaseHelperK53.addMany(dataBaseHelper1.getAllTestsResults());
        boolean success2 = dataBaseHelperK53.addMany(dataBaseHelper2.getAllTestsResults());
        return dataBaseHelperK53.getDbName().replace(".db", "");
    }

    public void processVehicleControlsJSON(String json, String jsonFile) throws JSONException, IOException {

        JSONArray ja = new JSONArray(json);
        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i < ja.length(); i++) {
            String q = ja.getJSONObject(i).get("question").toString();
            String correctAnsNo = ja.getJSONObject(i).get("correctAnsNo").toString();
            String option1 = ja.getJSONObject(i).get("option1").toString();
            String option2 = ja.getJSONObject(i).get("option2").toString();
            String option3 = ja.getJSONObject(i).get("option3").toString();
            String option4 = ja.getJSONObject(i).get("option4").toString();
            String imageUrl = ja.getJSONObject(i).get("imageUrl").toString();

            Question question = new Question(q, correctAnsNo, option1, option2, option3, option4, imageUrl);
            String dbName = "";
            String tableName = "";
            if (jsonFile.contains("road-rules-qs")) {
                dbName = "rulesQs";
                tableName = "RULES_QS";
            }
            if (jsonFile.contains("road-signs-qs")){
                dbName = "signsQs";
                tableName = "SIGNS_QS";
            }
            if (jsonFile.contains("vehicle-controls-qs")) {
                dbName = "controlsQs";
                tableName = "CONTROLS_QS";
            }
            QuestionDataBaseHelper dataBaseHelper = new QuestionDataBaseHelper(activity, dbName, tableName);
            boolean success = dataBaseHelper.addOne(question);
            questions.add(question);
        }
    }


    public void processQuestionsJSON(String json, String jsonFile) throws JSONException, IOException {

        JSONArray ja = new JSONArray(json);
        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i < ja.length(); i++) {
            String q = ja.getJSONObject(i).get("question").toString();
            String correctAnsNo = ja.getJSONObject(i).get("correctAnsNo").toString();
            String option1 = ja.getJSONObject(i).get("option1").toString();
            String option2 = ja.getJSONObject(i).get("option2").toString();
            String option3 = ja.getJSONObject(i).get("option3").toString();
            String option4 = ja.getJSONObject(i).get("option4").toString();
            String imageUrl = ja.getJSONObject(i).get("image").toString();
            Question question = new Question(q, correctAnsNo, option1, option2, option3, option4, imageUrl);
            String dbName = "";
            String tableName = "";
            if (jsonFile.contains("road-rules-qs")) {
                dbName = "roadRulesTest";
                tableName = "ROAD_RULES_TEST";
            }
            if (jsonFile.contains("road-signs-qs")){
                dbName = "roadSignsTest";
                tableName = "ROAD_SIGNS_TEST";
            }
            if (jsonFile.contains("vehicle-controls-qs")) {
                dbName = "controlsTest";
                tableName = "CONTROLS_TEST";
            }
            if (jsonFile.contains("vehicle-controls-qs")) {
                dbName = "controlsTest";
                tableName = "CONTROLS_TEST";
            }
            QuestionDataBaseHelper dataBaseHelper = new QuestionDataBaseHelper(activity, dbName, tableName);
            boolean success = dataBaseHelper.addOne(question);
            questions.add(question);
        }
    }

    public void processRoadSignsJSON(String response, String[] info) throws JSONException {
        JSONArray ja = new JSONArray(response);

        String[] imagesUrls = new String[ja.length()];
        List<RoadSign> roadSigns = new ArrayList<>();

        for (int i = 0; i < ja.length(); i++) {
            int id = Integer.parseInt((ja.getJSONObject(i).get("id").toString()));
            String name = ja.getJSONObject(i).get("name").toString();
            Log.i("", name);
            String where = ja.getJSONObject(i).get("where").toString();
            String purpose = ja.getJSONObject(i).get("purpose").toString();
            String action = ja.getJSONObject(i).get("action").toString();
            String description = ja.getJSONObject(i).get("description").toString();
            String imageUrl = ja.getJSONObject(i).get("image").toString();
            imagesUrls[i] = imageUrl;
            Bitmap image = null;
            RoadSign category = new RoadSign(id, name, where, purpose, action, description, image);
            roadSigns.add(category);
        }
        DownloadThread thread = new DownloadThread(activity.getApplicationContext(), imagesUrls, roadSigns, info);
        thread.start();
    }


}
