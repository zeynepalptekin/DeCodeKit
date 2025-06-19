package com.google.firebase.installations;

/* loaded from: classes.dex */
final /* synthetic */ class e implements Runnable {
    private final i d;
    private final boolean e;

    private e(i iVar, boolean z) {
        this.d = iVar;
        this.e = z;
    }

    public static Runnable a(i iVar, boolean z) {
        return new e(iVar, z);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.d.f(this.e);
    }
}
