package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class iq {

    /* renamed from: a, reason: collision with root package name */
    private static f3 f3852a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f3853b = new Object();

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    private static final mq<Void> f3854c = new lq();

    public iq(Context context) {
        b(context.getApplicationContext() != null ? context.getApplicationContext() : context);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.google.android.gms.internal.ads.f3 b(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.iq.f3853b
            monitor-enter(r0)
            com.google.android.gms.internal.ads.f3 r1 = com.google.android.gms.internal.ads.iq.f3852a     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L32
            com.google.android.gms.internal.ads.e0.a(r3)     // Catch: java.lang.Throwable -> L36
            boolean r1 = com.google.android.gms.common.util.e.b()     // Catch: java.lang.Throwable -> L36
            if (r1 != 0) goto L24
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.e0.O2     // Catch: java.lang.Throwable -> L36
            com.google.android.gms.internal.ads.z r2 = com.google.android.gms.internal.ads.qx2.e()     // Catch: java.lang.Throwable -> L36
            java.lang.Object r1 = r2.c(r1)     // Catch: java.lang.Throwable -> L36
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L36
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L36
            if (r1 == 0) goto L24
            r1 = 1
            goto L25
        L24:
            r1 = 0
        L25:
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.ads.f3 r3 = com.google.android.gms.internal.ads.zp.d(r3)     // Catch: java.lang.Throwable -> L36
            goto L30
        L2c:
            com.google.android.gms.internal.ads.f3 r3 = com.google.android.gms.internal.ads.j00.a(r3)     // Catch: java.lang.Throwable -> L36
        L30:
            com.google.android.gms.internal.ads.iq.f3852a = r3     // Catch: java.lang.Throwable -> L36
        L32:
            com.google.android.gms.internal.ads.f3 r3 = com.google.android.gms.internal.ads.iq.f3852a     // Catch: java.lang.Throwable -> L36
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            return r3
        L36:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L36
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.iq.b(android.content.Context):com.google.android.gms.internal.ads.f3");
    }

    public static dy1<fz2> d(String str) {
        ks ksVar = new ks();
        f3852a.c(new oq(str, ksVar));
        return ksVar;
    }

    public final dy1<String> a(int r15, String str, @androidx.annotation.i0 Map<String, String> map, @androidx.annotation.i0 byte[] bArr) throws IOException {
        pq pqVar = new pq(null);
        kq kqVar = new kq(this, str, pqVar);
        nr nrVar = new nr(null);
        nq nqVar = new nq(this, r15, str, pqVar, kqVar, bArr, map, nrVar);
        if (nr.a()) {
            try {
                nrVar.f(str, "GET", nqVar.e(), nqVar.E());
            } catch (sl2 e) {
                tr.i(e.getMessage());
            }
        }
        f3852a.c(nqVar);
        return pqVar;
    }

    public final dy1<String> c(String str, Map<String, String> map) {
        return a(0, str, map, null);
    }
}
