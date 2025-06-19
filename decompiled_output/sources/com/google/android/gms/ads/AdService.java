package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.gg;
import com.google.android.gms.internal.ads.qx2;
import com.google.android.gms.internal.ads.rc;
import com.google.android.gms.internal.ads.tr;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class AdService extends IntentService {
    private final gg d;

    public AdService() {
        super("AdService");
        this.d = qx2.b().g(this, new rc());
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        try {
            this.d.U5(intent);
        } catch (RemoteException e) {
            String strValueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 50);
            sb.append("RemoteException calling handleNotificationIntent: ");
            sb.append(strValueOf);
            tr.g(sb.toString());
        }
    }
}
