package sfami.softwares.k53reliable.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

import sfami.softwares.k53reliable.models.RoadRule;
import sfami.softwares.k53reliable.models.TestResult;

public class RoadRuleDataBaseHelper extends SQLiteOpenHelper {


    String TESTS_TABLE = "TESTS_TABLE";
    Context context;
    String dbName;
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_TEST_NAME = "TEST_NAME";
    public static final String COLUMN_TEST_SCORE = "TEST_SCORE";


    public RoadRuleDataBaseHelper(@Nullable Context context, String dbName, String tableName) {
        super(context, dbName + ".db", null, 1);
        this.dbName = dbName + ".db";
        this.context = context;
        this.TESTS_TABLE = tableName;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + TESTS_TABLE +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_TEST_NAME + " TEXT, "
                + COLUMN_TEST_SCORE + " TEXT)";
        db.execSQL(createTableStatement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        String dropTableStatement = "DROP TABLE IF EXISTS " + TESTS_TABLE;
        sqLiteDatabase.execSQL(dropTableStatement);
        Log.i("SingleDBAdapter", "Upgrading database from version " + i
                + " to "
                + i1 + ", which will destroy all old data");
        context.deleteDatabase("roadRules.db");
        onCreate(sqLiteDatabase);
        sqLiteDatabase.close();
    }

    public boolean addOne(RoadRule roadRule){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_TEST_NAME, roadRule.getName());
        cv.put(COLUMN_TEST_SCORE, roadRule.getInstruction());

        // id is auto-increment so we do not need to pass it.
        long insert = db.insert(TESTS_TABLE, null, cv);
        boolean success = insert != -1;
        return success;
    }

    public boolean addMany(List<RoadRule> roadRules){
        for (RoadRule roadRule : roadRules) {
            boolean success = addOne(roadRule);
            if (!success) return false;
        }
        return true;
    }

    public List<RoadRule> getAllTestsResults(){
        List<RoadRule> returnList = new ArrayList<>();

        String queryString = "SELECT * FROM " + TESTS_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()){
            do {
                int testId = cursor.getInt(0);
                String name = cursor.getString(1);
                String instruction = cursor.getString(2);
                RoadRule roadRule = new RoadRule(name, instruction);
                returnList.add(roadRule);
            } while (cursor.moveToNext());
        }
        else ;
        cursor.close();
        db.close();
        return returnList;
    }
}
