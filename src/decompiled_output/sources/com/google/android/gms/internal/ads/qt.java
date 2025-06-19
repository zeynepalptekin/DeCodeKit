package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class qt implements Runnable {
    private final /* synthetic */ mt d;

    qt(mt mtVar) {
        this.d = mtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.v("surfaceDestroyed", new String[0]);
    }
}
