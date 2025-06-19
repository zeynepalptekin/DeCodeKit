package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.e0;
import com.google.android.gms.measurement.internal.s4;
import com.google.android.gms.measurement.internal.t4;

/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends b.p.b.a implements s4 {
    private t4 d;

    @Override // com.google.android.gms.measurement.internal.s4
    @e0
    public final void a(Context context, Intent intent) {
        b.p.b.a.c(context, intent);
    }

    public final BroadcastReceiver.PendingResult d() {
        return goAsync();
    }

    @Override // android.content.BroadcastReceiver
    @e0
    public final void onReceive(Context context, Intent intent) {
        if (this.d == null) {
            this.d = new t4(this);
        }
        this.d.a(context, intent);
    }
}
