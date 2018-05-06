package com.example.william.hw9_services;

import android.app.IntentService;
import android.content.Intent;
import android.media.MediaPlayer;
import android.util.Log;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class Servisimo extends IntentService {

    public Servisimo() {
        super("Servisimo");
    }

    public void onCreate(){
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        Log.e(MainActivity.TAG, intent.getStringExtra(MainActivity.TAG));
        MediaPlayer player = MediaPlayer.create(Servisimo.this, R.raw.doforlove);
        player.start();

    }


}
