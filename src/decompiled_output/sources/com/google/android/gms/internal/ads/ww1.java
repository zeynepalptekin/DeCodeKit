package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ww1 implements Runnable {
    private final /* synthetic */ dy1 d;
    private final /* synthetic */ int e;
    private final /* synthetic */ tw1 f;

    ww1(tw1 tw1Var, dy1 dy1Var, int r3) {
        this.f = tw1Var;
        this.d = dy1Var;
        this.e = r3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.d.isCancelled()) {
                tw1.J(this.f, null);
                this.f.cancel(false);
            } else {
                this.f.K(this.e, this.d);
            }
        } finally {
            this.f.L(null);
        }
    }
}
