package com.google.firebase.installations;

/* loaded from: classes.dex */
final /* synthetic */ class g implements Runnable {
    private final i d;

    private g(i iVar) {
        this.d = iVar;
    }

    public static Runnable a(i iVar) {
        return new g(iVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.d.h(false);
    }
}
