package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class sp1 implements Runnable {
    private final /* synthetic */ qn1 d;

    sp1(qn1 qn1Var) {
        this.d = qn1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        synchronized (this.d.n) {
            if (this.d.o) {
                return;
            }
            this.d.o = true;
            try {
                this.d.p();
            } catch (Exception e) {
                this.d.i.b(2023, -1L, e);
            }
            synchronized (this.d.n) {
                this.d.o = false;
            }
        }
    }
}
