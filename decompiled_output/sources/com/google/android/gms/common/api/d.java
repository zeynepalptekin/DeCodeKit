package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class d extends a {
    public d(@RecentlyNonNull Status status) {
        super(status);
    }

    @RecentlyNonNull
    public PendingIntent d() {
        return a().i();
    }

    public void e(@RecentlyNonNull Activity activity, @RecentlyNonNull int r3) throws IntentSender.SendIntentException {
        a().C(activity, r3);
    }
}
