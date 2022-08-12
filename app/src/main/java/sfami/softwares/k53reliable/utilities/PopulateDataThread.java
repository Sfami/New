package sfami.softwares.k53reliable.utilities;


import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;


import sfami.softwares.k53reliable.models.RoadSign;

public class PopulateDataThread extends Thread {

    private Activity activity;


    public PopulateDataThread(Activity activity) {
        this.activity = activity;

    }

    @Override
    public void run() {
        PopulateDataTask task = new PopulateDataTask(activity);
        task.execute();
    }
}
