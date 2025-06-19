package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class gj implements Callable<fj> {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f3543a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ hj f3544b;

    gj(hj hjVar, Context context) {
        this.f3544b = hjVar;
        this.f3543a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ com.google.android.gms.internal.ads.fj call() throws java.lang.Exception {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.hj r0 = r6.f3544b
            java.util.WeakHashMap r0 = com.google.android.gms.internal.ads.hj.a(r0)
            android.content.Context r1 = r6.f3543a
            java.lang.Object r0 = r0.get(r1)
            com.google.android.gms.internal.ads.jj r0 = (com.google.android.gms.internal.ads.jj) r0
            if (r0 == 0) goto L3e
            long r1 = r0.f3971a
            com.google.android.gms.internal.ads.m1<java.lang.Long> r3 = com.google.android.gms.internal.ads.s1.f5214a
            java.lang.Object r3 = r3.a()
            java.lang.Long r3 = (java.lang.Long) r3
            long r3 = r3.longValue()
            long r1 = r1 + r3
            com.google.android.gms.common.util.g r3 = com.google.android.gms.ads.internal.p.j()
            long r3 = r3.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2d
            r1 = 1
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 != 0) goto L3e
            com.google.android.gms.internal.ads.ej r1 = new com.google.android.gms.internal.ads.ej
            android.content.Context r2 = r6.f3543a
            com.google.android.gms.internal.ads.fj r0 = r0.f3972b
            r1.<init>(r2, r0)
            com.google.android.gms.internal.ads.fj r0 = r1.e()
            goto L49
        L3e:
            com.google.android.gms.internal.ads.ej r0 = new com.google.android.gms.internal.ads.ej
            android.content.Context r1 = r6.f3543a
            r0.<init>(r1)
            com.google.android.gms.internal.ads.fj r0 = r0.e()
        L49:
            com.google.android.gms.internal.ads.hj r1 = r6.f3544b
            java.util.WeakHashMap r1 = com.google.android.gms.internal.ads.hj.a(r1)
            android.content.Context r2 = r6.f3543a
            com.google.android.gms.internal.ads.jj r3 = new com.google.android.gms.internal.ads.jj
            com.google.android.gms.internal.ads.hj r4 = r6.f3544b
            r3.<init>(r4, r0)
            r1.put(r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gj.call():java.lang.Object");
    }
}
