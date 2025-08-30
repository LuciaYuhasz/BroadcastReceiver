package com.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class ModoAvion extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {


        boolean modoAvion = intent.getBooleanExtra("state",false);

        if (modoAvion) {
            Toast.makeText(context, "El modo avión se activó", Toast.LENGTH_LONG).show();

            Intent intent1 = new Intent(Intent.ACTION_DIAL);
            intent1.setData(Uri.parse("tel:2664553747"));
            intent1.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            context.startActivity(intent1);
        } else {
            Toast.makeText(context, "El modo avión se desactivó", Toast.LENGTH_LONG).show();
        }
    }
}

