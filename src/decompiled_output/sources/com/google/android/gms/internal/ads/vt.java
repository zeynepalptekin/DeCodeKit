package com.google.android.gms.internal.ads;

import android.os.Looper;

/* loaded from: classes.dex */
final class vt implements Runnable {
    vt(wt wtVar) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Looper.myLooper().quit();
    }
}
