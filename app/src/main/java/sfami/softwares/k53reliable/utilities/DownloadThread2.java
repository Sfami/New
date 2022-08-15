package sfami.softwares.k53reliable.utilities;


import android.content.Context;

import java.util.List;

import sfami.softwares.k53reliable.models.Question;

public class DownloadThread2 extends Thread {

    private Context context;
    String[] imagesUrls;
    List<Question> questions;
    private String[] info;

    public DownloadThread2(Context context, String[] imagesUrls, List<Question> questions, String[] info) {
        this.context = context;
        this.imagesUrls = imagesUrls;
        this.questions = questions;
        this.info = info;
    }

    @Override
    public void run() {
        synchronized (context){
            DownloadTask2 downloadTask = new DownloadTask2(context.getApplicationContext(), questions, info);
            downloadTask.execute(imagesUrls);
        }
    }
}
