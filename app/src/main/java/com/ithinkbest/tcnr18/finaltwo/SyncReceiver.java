package com.ithinkbest.tcnr18.finaltwo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;


public class SyncReceiver extends BroadcastReceiver {
//    public SyncReceiver() {
//    }

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent sendIntent = new Intent(context, SyncService.class);
        sendIntent.putExtra("something-to-deliver", "Hello, Android Service");
        context.startService(sendIntent);
    }
}