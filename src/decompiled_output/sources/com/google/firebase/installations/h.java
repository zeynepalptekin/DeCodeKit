package com.google.firebase.installations;

/* loaded from: classes.dex */
final /* synthetic */ class h implements Runnable {
    private final i d;
    private final boolean e;

    private h(i iVar, boolean z) {
        this.d = iVar;
        this.e = z;
    }

    public static Runnable a(i iVar, boolean z) {
        return new h(iVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.d.h(this.e);
    }
}
