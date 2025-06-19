package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import c.a.b.b.g.c.h;

@com.google.android.gms.common.annotation.a
@Deprecated
/* loaded from: classes.dex */
public final class b extends BroadcastReceiver {
    @i0
    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void b(@i0 Context context, @i0 Intent intent) {
    }

    @Override // android.content.BroadcastReceiver
    @e0
    public final void onReceive(@h0 Context context, @i0 Intent intent) {
        h.b(context).j(5, "Install Referrer Broadcast deprecated", null, null, null);
    }
}
