package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public abstract class ni2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ni2 f4547a = new ri2();

    public final boolean a() {
        return g() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(int r3, com.google.android.gms.internal.ads.qi2 r4, com.google.android.gms.internal.ads.ti2 r5, int r6) {
        /*
            r2 = this;
            r0 = 0
            r2.c(r3, r4, r0)
            r2.d(r0, r5, r0)
            r4 = 1
            if (r3 != 0) goto L31
            r3 = -1
            if (r6 == 0) goto L22
            if (r6 == r4) goto L20
            r1 = 2
            if (r6 != r1) goto L1a
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            goto L20
        L1a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            r3.<init>()
            throw r3
        L20:
            r4 = 0
            goto L2a
        L22:
            int r6 = r2.g()
            int r6 = r6 - r4
            if (r6 != 0) goto L2a
            r4 = -1
        L2a:
            if (r4 != r3) goto L2d
            return r3
        L2d:
            r2.d(r4, r5, r0)
            return r0
        L31:
            int r3 = r3 + r4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ni2.b(int, com.google.android.gms.internal.ads.qi2, com.google.android.gms.internal.ads.ti2, int):int");
    }

    public abstract qi2 c(int r1, qi2 qi2Var, boolean z);

    public final ti2 d(int r7, ti2 ti2Var, boolean z) {
        return e(r7, ti2Var, false, 0L);
    }

    public abstract ti2 e(int r1, ti2 ti2Var, boolean z, long j);

    public abstract int f(Object obj);

    public abstract int g();

    public abstract int h();
}
