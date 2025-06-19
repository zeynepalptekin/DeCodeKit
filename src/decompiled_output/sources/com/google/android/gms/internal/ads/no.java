package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class no extends lu1 {
    public no(Looper looper) {
        super(looper);
    }

    @Override // com.google.android.gms.internal.ads.lu1
    protected final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.c();
            to.n(com.google.android.gms.ads.internal.p.g().a(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.p.g().e(e, "AdMobHandler.handleMessage");
        }
    }
}
