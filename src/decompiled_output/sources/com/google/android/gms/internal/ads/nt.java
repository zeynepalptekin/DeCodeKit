package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class nt implements Runnable {
    private final /* synthetic */ mt d;

    nt(mt mtVar) {
        this.d = mtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.v("surfaceCreated", new String[0]);
    }
}
