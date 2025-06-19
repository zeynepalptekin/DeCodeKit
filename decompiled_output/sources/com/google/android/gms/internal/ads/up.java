package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class up {

    /* renamed from: a, reason: collision with root package name */
    private final Object f5573a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @GuardedBy("lock")
    private String f5574b = "";

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("lock")
    private String f5575c = "";

    @GuardedBy("lock")
    private boolean d = false;

    @com.google.android.gms.common.util.d0
    private String e = "";

    @com.google.android.gms.common.util.d0
    private final void b(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            to.h.post(new xp(this, context, str, z, z2));
        } else {
            tr.h("Can not create dialog without Activity Context");
        }
    }

    private final String d(Context context) {
        String str;
        synchronized (this.f5573a) {
            if (TextUtils.isEmpty(this.f5574b)) {
                com.google.android.gms.ads.internal.p.c();
                String strO0 = to.o0(context, "debug_signals_id.txt");
                this.f5574b = strO0;
                if (TextUtils.isEmpty(strO0)) {
                    com.google.android.gms.ads.internal.p.c();
                    this.f5574b = to.q0();
                    com.google.android.gms.ads.internal.p.c();
                    to.N(context, "debug_signals_id.txt", this.f5574b);
                }
            }
            str = this.f5574b;
        }
        return str;
    }

    private final void e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = f(context, (String) qx2.e().c(e0.X2), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.p.c();
        to.G(context, str, builderBuildUpon.build().toString());
    }

    private final Uri f(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        builderBuildUpon.appendQueryParameter("linkedDeviceId", d(context));
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }

    @com.google.android.gms.common.util.d0
    private final boolean h(Context context, String str, String str2) {
        String strJ = j(context, f(context, (String) qx2.e().c(e0.V2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            tr.f("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strJ.trim());
            String strOptString = jSONObject.optString("gct");
            this.e = jSONObject.optString(androidx.core.app.p.t0);
            synchronized (this.f5573a) {
                this.f5575c = strOptString;
            }
            return true;
        } catch (JSONException e) {
            tr.d("Fail to get in app preview response json.", e);
            return false;
        }
    }

    @com.google.android.gms.common.util.d0
    private final boolean i(Context context, String str, String str2) {
        String strJ = j(context, f(context, (String) qx2.e().c(e0.W2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strJ)) {
            tr.f("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strJ.trim()).optString("debug_mode"));
            synchronized (this.f5573a) {
                this.d = zEquals;
            }
            return zEquals;
        } catch (JSONException e) {
            tr.d("Fail to get debug mode response json.", e);
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[PHI: r0 r1 r4
  0x0072: PHI (r0v3 'e' java.lang.Throwable) = (r0v2 'e' java.lang.Throwable), (r0v5 'e' java.lang.Throwable) binds: [B:18:0x0070, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0072: PHI (r1v3 java.lang.String) = (r1v2 java.lang.String), (r1v4 java.lang.String) binds: [B:18:0x0070, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]
  0x0072: PHI (r4v7 java.lang.String) = (r4v5 java.lang.String), (r4v10 java.lang.String) binds: [B:18:0x0070, B:13:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String j(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.google.android.gms.internal.ads.to r1 = com.google.android.gms.ads.internal.p.c()
            java.lang.String r5 = r1.m0(r3, r5)
            java.lang.String r1 = "User-Agent"
            r0.put(r1, r5)
            com.google.android.gms.internal.ads.iq r5 = new com.google.android.gms.internal.ads.iq
            r5.<init>(r3)
            com.google.android.gms.internal.ads.dy1 r3 = r5.c(r4, r0)
            r5 = 1
            com.google.android.gms.internal.ads.s<java.lang.Integer> r0 = com.google.android.gms.internal.ads.e0.Y2     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            com.google.android.gms.internal.ads.z r1 = com.google.android.gms.internal.ads.qx2.e()     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            java.lang.Object r0 = r1.c(r0)     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            int r0 = r0.intValue()     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            long r0 = (long) r0     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            java.lang.Object r0 = r3.get(r0, r2)     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L36 java.lang.InterruptedException -> L51 java.util.concurrent.TimeoutException -> L65
            return r0
        L36:
            r3 = move-exception
            java.lang.String r5 = "Error retriving a response from: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r0 = r4.length()
            if (r0 == 0) goto L48
            java.lang.String r4 = r5.concat(r4)
            goto L4d
        L48:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r5)
        L4d:
            com.google.android.gms.internal.ads.tr.c(r4, r3)
            goto L82
        L51:
            r0 = move-exception
            java.lang.String r1 = "Interrupted while retriving a response from: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r2 = r4.length()
            if (r2 == 0) goto L5f
            goto L72
        L5f:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
            goto L7c
        L65:
            r0 = move-exception
            java.lang.String r1 = "Timeout while retriving a response from: "
            java.lang.String r4 = java.lang.String.valueOf(r4)
            int r2 = r4.length()
            if (r2 == 0) goto L77
        L72:
            java.lang.String r4 = r1.concat(r4)
            goto L7c
        L77:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r1)
        L7c:
            com.google.android.gms.internal.ads.tr.c(r4, r0)
            r3.cancel(r5)
        L82:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.up.j(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    private final void k(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.p.c();
        to.j(context, f(context, (String) qx2.e().c(e0.U2), str, str2));
    }

    public final void a(Context context, String str, String str2, @androidx.annotation.i0 String str3) {
        boolean zM = m();
        if (!i(context, str, str2)) {
            k(context, str, str2);
            return;
        }
        if (!zM && !TextUtils.isEmpty(str3)) {
            e(context, str2, str3, str);
        }
        tr.f("Device is linked for debug signals.");
        b(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final boolean c(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !com.google.android.gms.ads.internal.p.m().m()) {
            return false;
        }
        tr.f("Sending troubleshooting signals to the server.");
        e(context, str, str2, str3);
        return true;
    }

    public final void g(Context context, String str, String str2) {
        if (!h(context, str, str2)) {
            b(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(this.e)) {
            tr.f("Creative is not pushed for this device.");
            b(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(this.e)) {
            tr.f("The app is not linked for creative preview.");
            k(context, str, str2);
        } else if ("0".equals(this.e)) {
            tr.f("Device is linked for in app preview.");
            b(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final String l() {
        String str;
        synchronized (this.f5573a) {
            str = this.f5575c;
        }
        return str;
    }

    public final boolean m() {
        boolean z;
        synchronized (this.f5573a) {
            z = this.d;
        }
        return z;
    }
}
