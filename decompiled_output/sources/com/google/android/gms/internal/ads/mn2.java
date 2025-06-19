package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class mn2 implements Runnable {
    private final /* synthetic */ nn2 d;
    private final /* synthetic */ hn2 e;

    mn2(hn2 hn2Var, nn2 nn2Var) {
        this.e = hn2Var;
        this.d = nn2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a();
        int size = this.e.s.size();
        for (int r1 = 0; r1 < size; r1++) {
            ((co2) this.e.s.valueAt(r1)).e();
        }
    }
}
