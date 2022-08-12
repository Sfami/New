package sfami.softwares.k53reliable.utilities;


import android.content.Context;

import java.util.List;

import sfami.softwares.k53reliable.models.RoadSign;

public class DownloadThread extends Thread {

    private Context context;
    String[] imagesUrls;
    List<RoadSign> roadSigns;
    private String[] info;

    public DownloadThread(Context context, String[] imagesUrls, List<RoadSign> roadSigns, String[] info) {
        this.context = context;
        this.imagesUrls = imagesUrls;
        this.roadSigns = roadSigns;
        this.info = info;
    }

    @Override
    public void run() {
        DownloadTask downloadTask = new DownloadTask(context.getApplicationContext(), roadSigns, info);
        downloadTask.execute(imagesUrls);
    }
}
