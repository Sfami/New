package sfami.softwares.k53reliable.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import androidx.annotation.Nullable;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import sfami.softwares.k53reliable.models.Question;

public class QuestionDataBaseHelper extends SQLiteOpenHelper {

    Context context;
    String dbName;
    String QUESTIONS_TABLE;
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_QUESTION = "QUESTION";
    public static final String COLUMN_ANSWER = "ANSWER";
    public static final String COLUMN_OPTION1 = "OPTION1";
    private static final String COLUMN_OPTION2 = "OPTION2";
    private static final String COLUMN_OPTION3 = "OPTION3";
    private static final String COLUMN_OPTION4 = "OPTION4";
    private static final String COLUMN_IMAGE = "IMAGE";

    public QuestionDataBaseHelper(@Nullable Context context, String dbName, String tableName) {
        /* controlSigns.db, menuSigns.db, regulatorySigns.db e.t.c.*/
        super(context, dbName + ".db", null, 1);
        this.dbName = dbName + ".db";
        this.context = context;
        this.QUESTIONS_TABLE = tableName;
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String dropTableStatement = "DROP TABLE IF EXISTS " + QUESTIONS_TABLE;
        db.execSQL(dropTableStatement);
        String createTableStatement = "CREATE TABLE " + QUESTIONS_TABLE +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_QUESTION + " TEXT, "
                + COLUMN_ANSWER + " TEXT, "
                + COLUMN_OPTION1 + " TEXT, "
                + COLUMN_OPTION2 + " TEXT, "
                + COLUMN_OPTION3 + " TEXT, "
                + COLUMN_OPTION4 + " TEXT, "
                + COLUMN_IMAGE + " BLOB)";
        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String dropTableStatement = "DROP TABLE IF EXISTS " + QUESTIONS_TABLE;
        sqLiteDatabase.execSQL(dropTableStatement);
        Log.i("SingleDBAdapter", "Upgrading database from version " + oldVersion
                + " to "
                + newVersion + ", which will destroy all old data");
        context.deleteDatabase(dbName);
        onCreate(sqLiteDatabase);
        sqLiteDatabase.close();
    }

    public boolean addMany(List<Question> questions){
        for (Question question : questions) {
            boolean success = addOne(question);
            if (!success) return false;
        }
        return true;
    }

    public boolean addOne(Question question){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_QUESTION, question.getQuestion());
        cv.put(COLUMN_ANSWER, question.getCorrectAnsNo());
        cv.put(COLUMN_OPTION1, question.getOption1());
        cv.put(COLUMN_OPTION2, question.getOption2());
        cv.put(COLUMN_OPTION3, question.getOption3());
        cv.put(COLUMN_OPTION4, question.getOption4());
        byte[] bytesImage = null;
        try {
            question.getImage().compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            bytesImage = byteArrayOutputStream.toByteArray();
            cv.put(COLUMN_IMAGE, bytesImage);
        } catch (Exception e) {
            cv.put(COLUMN_IMAGE, bytesImage);
            Log.i("FAILED IMAGE", question.getQuestion());
        }
        // id is auto-increment so we do not need to pass it.
        long insert = db.insert(QUESTIONS_TABLE, null, cv);
        boolean success = insert != -1;
        db.close();
        return success;
    }

    public List<Question> getAllTestsResults(){
        List<Question> returnList = new ArrayList<>();

        /* SQL query for getting all the data. */
        String queryString = "SELECT DISTINCT "
                + COLUMN_QUESTION + ","
                + COLUMN_ANSWER + ","
                + COLUMN_OPTION1 + ","
                + COLUMN_OPTION2 + ","
                + COLUMN_OPTION3 + ","
                + COLUMN_OPTION4 + ","
                + COLUMN_IMAGE +" FROM " + QUESTIONS_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()){
            do {
                String question = cursor.getString(0);
                String correctAnsNo = cursor.getString(1);
                String option1 = cursor.getString(2);
                String option2 = cursor.getString(3);
                String option3 = cursor.getString(4);
                String option4 = cursor.getString(5);
                byte[] bytesImage = cursor.getBlob(6);
                try {
                    Bitmap questionImage = BitmapFactory.decodeByteArray(bytesImage, 0, bytesImage.length);
                    Question q = new Question(question, correctAnsNo, option1, option2, option3, option4, questionImage);
                    returnList.add(q);
                }
                catch (Exception e){
                    Log.i("Fix this", cursor.getString(0));
                    Bitmap questionImage = null;
                    Question q = new Question(question, correctAnsNo, option1, option2, option3, option4, questionImage);
                    returnList.add(q);
//                    e.printStackTrace();
                }
            } while (cursor.moveToNext());
        }
        else ;
        cursor.close();
        db.close();
        return returnList;
    }

    public String getDbName() {
        return dbName;
    }
}
