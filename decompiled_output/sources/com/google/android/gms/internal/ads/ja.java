package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class ja implements Runnable {
    private final u9 d;

    private ja(u9 u9Var) {
        this.d = u9Var;
    }

    static Runnable a(u9 u9Var) {
        return new ja(u9Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.destroy();
    }
}
