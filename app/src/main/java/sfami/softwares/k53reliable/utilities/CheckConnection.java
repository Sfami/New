package sfami.softwares.k53reliable.utilities;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;

public class CheckConnection implements ConnectionReceiver.ReceiverListener {
    private Context context;
    private Button button;

    public CheckConnection(Context context, Button button) {
        this.context = context;
        this.button = button;
    }

    public boolean checkConnection() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.new.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new ConnectionReceiver(), intentFilter);
        ConnectionReceiver.Listener = this;
        ConnectivityManager manager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = manager.getActiveNetworkInfo();
        boolean isConnected = networkInfo != null && networkInfo.isConnectedOrConnecting();
        showSnackBar(isConnected);
        return isConnected;
    }

    private void showSnackBar(boolean isConnected) {
        String message;
        int color;

        if (isConnected) {
            message = "Connected to Internet";
            color = Color.GREEN;
        } else {
            message = "Not Connected to Internet";
            color = Color.RED;
        }

        Snackbar snackbar = Snackbar.make(button, message, Snackbar.LENGTH_LONG);
        snackbar.setTextColor(color);
        snackbar.show();
    }

    @Override
    public void onNetworkChange(boolean isConnected) {
        showSnackBar(isConnected);
    }

    @Override
    public void onResume() {
        checkConnection();
    }

    @Override
    public void onPause() {
        checkConnection();
    }
}
