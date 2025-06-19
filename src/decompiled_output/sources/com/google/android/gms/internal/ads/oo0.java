package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class oo0 {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4722a;

    /* renamed from: b, reason: collision with root package name */
    private final do0 f4723b;

    public oo0(Executor executor, do0 do0Var) {
        this.f4722a = executor;
        this.f4723b = do0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.dy1<java.util.List<com.google.android.gms.internal.ads.po0>> a(org.json.JSONObject r10, java.lang.String r11) {
        /*
            r9 = this;
            org.json.JSONArray r10 = r10.optJSONArray(r11)
            if (r10 != 0) goto Lf
            java.util.List r10 = java.util.Collections.emptyList()
            com.google.android.gms.internal.ads.dy1 r10 = com.google.android.gms.internal.ads.qx1.g(r10)
            return r10
        Lf:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r0 = r10.length()
            r1 = 0
            r2 = 0
        L1a:
            if (r2 >= r0) goto L7b
            org.json.JSONObject r3 = r10.optJSONObject(r2)
            if (r3 == 0) goto L70
            java.lang.String r4 = "name"
            java.lang.String r4 = r3.optString(r4)
            if (r4 == 0) goto L70
            java.lang.String r5 = "type"
            java.lang.String r5 = r3.optString(r5)
            java.lang.String r6 = "string"
            boolean r6 = r6.equals(r5)
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L3c
            r5 = 1
            goto L47
        L3c:
            java.lang.String r6 = "image"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L46
            r5 = 2
            goto L47
        L46:
            r5 = 0
        L47:
            if (r5 == r8) goto L60
            if (r5 == r7) goto L4c
            goto L70
        L4c:
            com.google.android.gms.internal.ads.do0 r5 = r9.f4723b
            java.lang.String r6 = "image_value"
            com.google.android.gms.internal.ads.dy1 r3 = r5.g(r3, r6)
            com.google.android.gms.internal.ads.qo0 r5 = new com.google.android.gms.internal.ads.qo0
            r5.<init>(r4)
            java.util.concurrent.Executor r4 = r9.f4722a
            com.google.android.gms.internal.ads.dy1 r3 = com.google.android.gms.internal.ads.qx1.i(r3, r5, r4)
            goto L75
        L60:
            com.google.android.gms.internal.ads.po0 r5 = new com.google.android.gms.internal.ads.po0
            java.lang.String r6 = "string_value"
            java.lang.String r3 = r3.optString(r6)
            r5.<init>(r4, r3)
            com.google.android.gms.internal.ads.dy1 r3 = com.google.android.gms.internal.ads.qx1.g(r5)
            goto L75
        L70:
            r3 = 0
            com.google.android.gms.internal.ads.dy1 r3 = com.google.android.gms.internal.ads.qx1.g(r3)
        L75:
            r11.add(r3)
            int r2 = r2 + 1
            goto L1a
        L7b:
            com.google.android.gms.internal.ads.dy1 r10 = com.google.android.gms.internal.ads.qx1.m(r11)
            com.google.android.gms.internal.ads.ru1 r11 = com.google.android.gms.internal.ads.no0.f4578a
            java.util.concurrent.Executor r0 = r9.f4722a
            com.google.android.gms.internal.ads.dy1 r10 = com.google.android.gms.internal.ads.qx1.i(r10, r11, r0)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.oo0.a(org.json.JSONObject, java.lang.String):com.google.android.gms.internal.ads.dy1");
    }
}
