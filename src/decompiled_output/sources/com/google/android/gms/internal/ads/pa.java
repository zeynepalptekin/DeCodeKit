package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class pa implements Runnable {
    private final /* synthetic */ za d;
    private final /* synthetic */ u9 e;
    private final /* synthetic */ da f;

    pa(da daVar, za zaVar, u9 u9Var) {
        this.f = daVar;
        this.d = zaVar;
        this.e = u9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f.f3097a) {
            if (this.d.a() != -1 && this.d.a() != 1) {
                this.d.b();
                cy1 cy1Var = cs.e;
                u9 u9Var = this.e;
                u9Var.getClass();
                cy1Var.execute(oa.a(u9Var));
                oo.m("Could not receive loaded message in a timely manner. Rejecting.");
            }
        }
    }
}
