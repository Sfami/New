package sfami.softwares.k53reliable;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class DataBaseHelper extends SQLiteOpenHelper {


    public static final String TESTS_TABLE = "TESTS_TABLE";
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_TEST_NAME = "TEST_NAME";
    public static final String COLUMN_TEST_SCORE = "TEST_SCORE";
    public static final String COLUMN_TEST_TOTAL = "TEST_TOTAL";
    private static final String COLUMN_TEST_ANSWERS = "TEST_ANSWERS";

    public DataBaseHelper(@Nullable Context context) {
        super(context, "testsResults.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + TESTS_TABLE +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_TEST_NAME + " TEXT, "
                + COLUMN_TEST_SCORE + " INT, "
                + COLUMN_TEST_TOTAL + " INT, "
                + COLUMN_TEST_ANSWERS + " TEXT)";
        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addOne(TestResultModel testResultModel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_TEST_NAME, testResultModel.getTestName());
        cv.put(COLUMN_TEST_SCORE, testResultModel.getScore());
        cv.put(COLUMN_TEST_TOTAL, testResultModel.getTotal());
        cv.put(COLUMN_TEST_ANSWERS, testResultModel.getAnswers().toString());
        // id is auto-increment so we do not need to pass it.
        long insert = db.insert(TESTS_TABLE, null, cv);
        boolean success = insert != -1;
        return success;
    }

    public List<TestResultModel> getAllTestsResults(){
        List<TestResultModel> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + TESTS_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()){
            do {
                int testId = cursor.getInt(0);
                String testName = cursor.getString(1);
                int testScore = cursor.getInt(2);
                int testTotal = cursor.getInt(3);
                String testAnswers = cursor.getString(4);
                TestResultModel resultModel = new TestResultModel(testId, testName, testScore, testTotal, testAnswers);
                returnList.add(resultModel);
            } while (cursor.moveToNext());
        }
        else ;
        cursor.close();
        db.close();
        return returnList;
    }
}
