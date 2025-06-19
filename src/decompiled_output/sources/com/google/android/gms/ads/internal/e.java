package com.google.android.gms.ads.internal;

import android.content.Context;
import androidx.annotation.i0;
import com.google.android.gms.internal.ads.as;
import com.google.android.gms.internal.ads.wn;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private Context f2407a;

    /* renamed from: b, reason: collision with root package name */
    private long f2408b = 0;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(android.content.Context r8, com.google.android.gms.internal.ads.as r9, boolean r10, @androidx.annotation.i0 com.google.android.gms.internal.ads.wn r11, java.lang.String r12, @androidx.annotation.i0 java.lang.String r13, @androidx.annotation.i0 java.lang.Runnable r14) throws org.json.JSONException {
        /*
            r7 = this;
            com.google.android.gms.common.util.g r0 = com.google.android.gms.ads.internal.p.j()
            long r0 = r0.c()
            long r2 = r7.f2408b
            long r0 = r0 - r2
            r2 = 5000(0x1388, double:2.4703E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L17
            java.lang.String r8 = "Not retrying to fetch app settings"
            com.google.android.gms.internal.ads.tr.i(r8)
            return
        L17:
            com.google.android.gms.common.util.g r0 = com.google.android.gms.ads.internal.p.j()
            long r0 = r0.c()
            r7.f2408b = r0
            r0 = 0
            r1 = 1
            if (r11 != 0) goto L27
        L25:
            r0 = 1
            goto L54
        L27:
            long r2 = r11.a()
            com.google.android.gms.common.util.g r4 = com.google.android.gms.ads.internal.p.j()
            long r4 = r4.a()
            long r4 = r4 - r2
            com.google.android.gms.internal.ads.s<java.lang.Long> r2 = com.google.android.gms.internal.ads.e0.B2
            com.google.android.gms.internal.ads.z r3 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r2 = r3.c(r2)
            java.lang.Long r2 = (java.lang.Long) r2
            long r2 = r2.longValue()
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L4a
            r2 = 1
            goto L4b
        L4a:
            r2 = 0
        L4b:
            if (r2 != 0) goto L25
            boolean r11 = r11.b()
            if (r11 != 0) goto L54
            goto L25
        L54:
            if (r0 != 0) goto L57
            return
        L57:
            if (r8 != 0) goto L5f
            java.lang.String r8 = "Context not provided to fetch application settings"
            com.google.android.gms.internal.ads.tr.i(r8)
            return
        L5f:
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 == 0) goto L71
            boolean r11 = android.text.TextUtils.isEmpty(r13)
            if (r11 == 0) goto L71
            java.lang.String r8 = "App settings could not be fetched. Required parameters missing"
            com.google.android.gms.internal.ads.tr.i(r8)
            return
        L71:
            android.content.Context r11 = r8.getApplicationContext()
            if (r11 == 0) goto L78
            goto L79
        L78:
            r11 = r8
        L79:
            r7.f2407a = r11
            com.google.android.gms.internal.ads.jb r11 = com.google.android.gms.ads.internal.p.p()
            android.content.Context r0 = r7.f2407a
            com.google.android.gms.internal.ads.pb r9 = r11.b(r0, r9)
            com.google.android.gms.internal.ads.kb<org.json.JSONObject> r11 = com.google.android.gms.internal.ads.ob.f4669b
            java.lang.String r0 = "google.afma.config.fetchAppSettings"
            com.google.android.gms.internal.ads.gb r9 = r9.a(r0, r11, r11)
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ld0
            r11.<init>()     // Catch: java.lang.Exception -> Ld0
            boolean r0 = android.text.TextUtils.isEmpty(r12)     // Catch: java.lang.Exception -> Ld0
            if (r0 != 0) goto L9e
            java.lang.String r13 = "app_id"
            r11.put(r13, r12)     // Catch: java.lang.Exception -> Ld0
            goto La9
        L9e:
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch: java.lang.Exception -> Ld0
            if (r12 != 0) goto La9
            java.lang.String r12 = "ad_unit_id"
            r11.put(r12, r13)     // Catch: java.lang.Exception -> Ld0
        La9:
            java.lang.String r12 = "is_init"
            r11.put(r12, r10)     // Catch: java.lang.Exception -> Ld0
            java.lang.String r10 = "pn"
            java.lang.String r8 = r8.getPackageName()     // Catch: java.lang.Exception -> Ld0
            r11.put(r10, r8)     // Catch: java.lang.Exception -> Ld0
            com.google.android.gms.internal.ads.dy1 r8 = r9.b(r11)     // Catch: java.lang.Exception -> Ld0
            com.google.android.gms.internal.ads.ax1 r9 = com.google.android.gms.ads.internal.d.f2406a     // Catch: java.lang.Exception -> Ld0
            com.google.android.gms.internal.ads.cy1 r10 = com.google.android.gms.internal.ads.cs.f     // Catch: java.lang.Exception -> Ld0
            com.google.android.gms.internal.ads.dy1 r9 = com.google.android.gms.internal.ads.qx1.j(r8, r9, r10)     // Catch: java.lang.Exception -> Ld0
            if (r14 == 0) goto Lca
            com.google.android.gms.internal.ads.cy1 r10 = com.google.android.gms.internal.ads.cs.f     // Catch: java.lang.Exception -> Ld0
            r8.e(r14, r10)     // Catch: java.lang.Exception -> Ld0
        Lca:
            java.lang.String r8 = "ConfigLoader.maybeFetchNewAppSettings"
            com.google.android.gms.internal.ads.gs.a(r9, r8)     // Catch: java.lang.Exception -> Ld0
            return
        Ld0:
            r8 = move-exception
            java.lang.String r9 = "Error requesting application settings"
            com.google.android.gms.internal.ads.tr.c(r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.e.c(android.content.Context, com.google.android.gms.internal.ads.as, boolean, com.google.android.gms.internal.ads.wn, java.lang.String, java.lang.String, java.lang.Runnable):void");
    }

    public final void a(Context context, as asVar, String str, wn wnVar) throws JSONException {
        c(context, asVar, false, wnVar, wnVar != null ? wnVar.d() : null, str, null);
    }

    public final void b(Context context, as asVar, String str, @i0 Runnable runnable) throws JSONException {
        c(context, asVar, true, null, str, null, runnable);
    }
}
