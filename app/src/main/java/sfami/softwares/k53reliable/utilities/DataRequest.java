package sfami.softwares.k53reliable.utilities;

import android.app.Activity;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class DataRequest {

    String url;

    public DataRequest(String prefix) {
        url = prefix;
    }

    public void doJSONRequest(final Activity a, String method, final RequestHandler rh) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(url + method).build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }
            @Override
            public void onResponse(Call call, final Response response) throws IOException {
                // ... check for failure using `isSuccessful` before proceeding
                // Read data on the worker thread
//                if (response.isSuccessful())
                final String responseData = response.body().string();
                // Run view-related code back on the main thread
                a.runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            rh.processJSONResponse(responseData);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });

    }


}