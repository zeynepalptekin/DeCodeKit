package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final /* synthetic */ class l71 implements Runnable {
    private final s71 d;

    private l71(s71 s71Var) {
        this.d = s71Var;
    }

    static Runnable a(s71 s71Var) {
        return new l71(s71Var);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.u();
    }
}
