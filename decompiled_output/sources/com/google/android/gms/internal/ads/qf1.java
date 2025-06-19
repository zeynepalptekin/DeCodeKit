package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class qf1 implements ff1<nf1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f5006a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f5007b;

    public qf1(cy1 cy1Var, Context context) {
        this.f5006a = cy1Var;
        this.f5007b = context;
    }

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<nf1> a() {
        return this.f5006a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.pf1

            /* renamed from: a, reason: collision with root package name */
            private final qf1 f4810a;

            {
                this.f4810a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4810a.b();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.nf1 b() throws java.lang.Exception {
        /*
            r8 = this;
            android.content.Context r0 = r8.f5007b
            java.lang.String r1 = "phone"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r2 = r0.getNetworkOperator()
            boolean r1 = com.google.android.gms.common.util.v.q()
            r3 = 0
            if (r1 == 0) goto L29
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.e0.z5
            com.google.android.gms.internal.ads.z r4 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r1 = r4.c(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L29
            r4 = 0
            goto L2e
        L29:
            int r1 = r0.getNetworkType()
            r4 = r1
        L2e:
            int r5 = r0.getPhoneType()
            r0 = -2
            com.google.android.gms.ads.internal.p.c()
            android.content.Context r1 = r8.f5007b
            java.lang.String r6 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r1 = com.google.android.gms.internal.ads.to.l0(r1, r6)
            r6 = -1
            if (r1 == 0) goto L67
            android.content.Context r0 = r8.f5007b
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r1 = r0.getActiveNetworkInfo()
            if (r1 == 0) goto L5e
            int r6 = r1.getType()
            android.net.NetworkInfo$DetailedState r1 = r1.getDetailedState()
            int r1 = r1.ordinal()
            goto L5f
        L5e:
            r1 = -1
        L5f:
            boolean r0 = r0.isActiveNetworkMetered()
            r7 = r1
            r3 = r6
            r6 = r0
            goto L6a
        L67:
            r3 = -2
            r6 = 0
            r7 = -1
        L6a:
            com.google.android.gms.internal.ads.nf1 r0 = new com.google.android.gms.internal.ads.nf1
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.qf1.b():com.google.android.gms.internal.ads.nf1");
    }
}
