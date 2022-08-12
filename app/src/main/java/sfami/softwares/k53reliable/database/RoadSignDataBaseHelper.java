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

import sfami.softwares.k53reliable.models.RoadSign;

public class RoadSignDataBaseHelper extends SQLiteOpenHelper {

    Context context;
    String dbName;
    String ROAD_SIGNS_TABLE;
    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_ROAD_SIGN_NAME = "ROAD_SIGN_NAME";
    public static final String COLUMN_ROAD_SIGN_WHERE = "ROAD_SIGN_WHERE";
    public static final String COLUMN_ROAD_SIGN_PURPOSE = "ROAD_SIGN_PURPOSE";
    private static final String COLUMN_ROAD_SIGN_ACTION = "ROAD_SIGN_ACTION";
    private static final String COLUMN_ROAD_SIGN_DESCRIPTION = "ROAD_SIGN_DESCRIPTION";
    private static final String COLUMN_ROAD_SIGN_IMAGE = "ROAD_SIGN_IMAGE";

    public RoadSignDataBaseHelper(@Nullable Context context, String dbName, String tableName) {
        /* controlSigns.db, menuSigns.db, regulatorySigns.db e.t.c.*/
        super(context, dbName + ".db", null, 1);
        this.dbName = dbName + ".db";
        this.context = context;
        this.ROAD_SIGNS_TABLE = tableName;
    }

    public void setTableName(String tableName){
        ROAD_SIGNS_TABLE = tableName;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String dropTableStatement = "DROP TABLE IF EXISTS " + ROAD_SIGNS_TABLE;
        db.execSQL(dropTableStatement);
        String createTableStatement = "CREATE TABLE " + ROAD_SIGNS_TABLE +
                "(" + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + COLUMN_ROAD_SIGN_NAME + " TEXT, "
                + COLUMN_ROAD_SIGN_WHERE + " TEXT, "
                + COLUMN_ROAD_SIGN_PURPOSE + " TEXT, "
                + COLUMN_ROAD_SIGN_ACTION + " TEXT, "
                + COLUMN_ROAD_SIGN_DESCRIPTION + " TEXT, "
                + COLUMN_ROAD_SIGN_IMAGE + " BLOB)";
        db.execSQL(createTableStatement);
//        sqLiteDatabase.execSQL("CREATE TABLE ImageTable(Name TEXT, Image BLOB)");
//        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        String dropTableStatement = "DROP TABLE IF EXISTS " + ROAD_SIGNS_TABLE;
        sqLiteDatabase.execSQL(dropTableStatement);
        Log.i("SingleDBAdapter", "Upgrading database from version " + oldVersion
                + " to "
                + newVersion + ", which will destroy all old data");
//        sqLiteDatabase.close();
        context.deleteDatabase(dbName);
        onCreate(sqLiteDatabase);

    }

    public boolean addOne(RoadSign roadSign){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(COLUMN_ROAD_SIGN_NAME, roadSign.getName());
        cv.put(COLUMN_ROAD_SIGN_WHERE, roadSign.getWhere());
        cv.put(COLUMN_ROAD_SIGN_PURPOSE, roadSign.getPurpose());
        cv.put(COLUMN_ROAD_SIGN_ACTION, roadSign.getAction());
        cv.put(COLUMN_ROAD_SIGN_DESCRIPTION, roadSign.getDescription());
        try {
            roadSign.getImage().compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
            byte[] bytesImage = byteArrayOutputStream.toByteArray();
            cv.put(COLUMN_ROAD_SIGN_IMAGE, bytesImage);
        }
        catch (Exception e){
            e.printStackTrace();
            roadSign.getImage().compress(Bitmap.CompressFormat.PNG, 0, null);
            byte[] bytesImage = byteArrayOutputStream.toByteArray();
            cv.put(COLUMN_ROAD_SIGN_IMAGE, bytesImage);
        }
        // id is auto-increment so we do not need to pass it.
        long insert = db.insert(ROAD_SIGNS_TABLE, null, cv);
        boolean success = insert != -1;
        db.close();
        return success;
    }

    public boolean addMany(List<RoadSign> roadSigns){
        boolean success = false;
        for (RoadSign roadSign : roadSigns) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues cv = new ContentValues();
            cv.put(COLUMN_ROAD_SIGN_NAME, roadSign.getName());
            cv.put(COLUMN_ROAD_SIGN_WHERE, roadSign.getWhere());
            cv.put(COLUMN_ROAD_SIGN_PURPOSE, roadSign.getPurpose());
            cv.put(COLUMN_ROAD_SIGN_ACTION, roadSign.getAction());
            cv.put(COLUMN_ROAD_SIGN_DESCRIPTION, roadSign.getDescription());
            try {
                roadSign.getImage().compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream);
                byte[] bytesImage = byteArrayOutputStream.toByteArray();
                cv.put(COLUMN_ROAD_SIGN_IMAGE, bytesImage);
            } catch (Exception e) {
                Log.i("FAILED IMAGE", roadSign.getName());
            }
            // id is auto-increment so we do not need to pass it.
            long insert = db.insert(ROAD_SIGNS_TABLE, null, cv);
            success = insert != -1;
            db.close();
        }

        return success;
    }

    public List<RoadSign> getAllTestsResults(){
        List<RoadSign> returnList = new ArrayList<>();

        /* SQL query for getting all the data. */
        String queryString = "SELECT DISTINCT "
                + COLUMN_ROAD_SIGN_NAME + ","
                + COLUMN_ROAD_SIGN_WHERE + ","
                + COLUMN_ROAD_SIGN_PURPOSE + ","
                + COLUMN_ROAD_SIGN_ACTION + ","
                + COLUMN_ROAD_SIGN_DESCRIPTION + ","
                + COLUMN_ROAD_SIGN_IMAGE +" FROM " + ROAD_SIGNS_TABLE;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(queryString, null);
        if (cursor.moveToFirst()){
            do {
                try {
                    String roadSignName = cursor.getString(0);
                    String roadSignWhere = cursor.getString(1);
                    String roadSignPurpose = cursor.getString(2);
                    String roadSignAction = cursor.getString(3);
                    String roadSignDescription = cursor.getString(4);
                    byte[] bytesImage = cursor.getBlob(5);
                    Bitmap roadSignImage = BitmapFactory.decodeByteArray(bytesImage, 0, bytesImage.length);
                    RoadSign roadSign = new RoadSign(1, roadSignName, roadSignWhere, roadSignPurpose, roadSignAction, roadSignDescription, roadSignImage);
                    returnList.add(roadSign);
                }
                catch (Exception e){
                    Log.i("Fix this", cursor.getString(0));
                    e.printStackTrace();
                }
            } while (cursor.moveToNext());
        }
        else ;
        cursor.close();
        db.close();
        return returnList;
    }

}
