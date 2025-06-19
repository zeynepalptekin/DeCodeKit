package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
final class xf2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ vf2 f5974a;

    xf2(vf2 vf2Var) {
        this.f5974a = vf2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f5974a.f();
    }
}
