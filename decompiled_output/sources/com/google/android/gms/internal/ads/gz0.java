package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class gz0 implements iq1<fz0, iz0> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3596a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3597b;

    /* renamed from: c, reason: collision with root package name */
    private final nj f3598c;
    private final String d;
    private final int e;

    public gz0(Context context, String str, nj njVar, String str2, int r5) {
        this.f3596a = context;
        this.f3597b = str;
        this.f3598c = njVar;
        this.d = str2;
        this.e = r5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x024b, code lost:
    
        r2 = new java.lang.StringBuilder(46);
        r2.append("Received error HTTP response code: ");
        r2.append(r11);
        com.google.android.gms.internal.ads.tr.i(r2.toString());
        r4 = com.google.android.gms.internal.ads.xn1.INTERNAL_ERROR;
        r5 = new java.lang.StringBuilder(46);
        r5.append("Received error HTTP response code: ");
        r5.append(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0275, code lost:
    
        throw new com.google.android.gms.internal.ads.uv0(r4, r5.toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.gms.internal.ads.iz0 b(java.lang.String r21, com.google.android.gms.internal.ads.cj r22, org.json.JSONObject r23, java.lang.String r24) throws com.google.android.gms.internal.ads.uv0 {
        /*
            Method dump skipped, instructions count: 679
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.gz0.b(java.lang.String, com.google.android.gms.internal.ads.cj, org.json.JSONObject, java.lang.String):com.google.android.gms.internal.ads.iz0");
    }

    @Override // com.google.android.gms.internal.ads.iq1
    public final /* synthetic */ iz0 a(fz0 fz0Var) throws Exception {
        fz0 fz0Var2 = fz0Var;
        return b(fz0Var2.f3476b.b(), fz0Var2.f3476b, fz0Var2.f3475a, this.d);
    }
}
