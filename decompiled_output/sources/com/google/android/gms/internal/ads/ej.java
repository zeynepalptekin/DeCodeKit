package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;

/* loaded from: classes.dex */
public final class ej {
    private int A;
    private String B;
    private boolean C;

    /* renamed from: a, reason: collision with root package name */
    private int f3277a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f3278b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f3279c;
    private int d;
    private int e;
    private int f;
    private String g;
    private int h;
    private int i;
    private int j;
    private boolean k;
    private int l;
    private double m;
    private boolean n;
    private String o;
    private String p;
    private boolean q;
    private boolean r;
    private String s;
    private boolean t;
    private final boolean u;
    private boolean v;
    private String w;
    private String x;
    private float y;
    private int z;

    public ej(Context context) {
        DisplayMetrics displayMetrics;
        PackageManager packageManager = context.getPackageManager();
        c(context);
        d(context);
        f(context);
        Locale locale = Locale.getDefault();
        this.q = a(packageManager, "geo:0,0?q=donuts") != null;
        this.r = a(packageManager, "http://www.google.com") != null;
        this.s = locale.getCountry();
        qx2.a();
        this.t = jr.x();
        this.u = com.google.android.gms.common.util.l.d(context);
        this.v = com.google.android.gms.common.util.l.e(context);
        this.w = locale.getLanguage();
        this.x = b(context, packageManager);
        this.B = g(context);
        Resources resources = context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return;
        }
        this.y = displayMetrics.density;
        this.z = displayMetrics.widthPixels;
        this.A = displayMetrics.heightPixels;
    }

    public ej(Context context, fj fjVar) {
        c(context);
        d(context);
        f(context);
        this.o = Build.FINGERPRINT;
        this.p = Build.DEVICE;
        this.C = com.google.android.gms.common.util.v.d() && g1.a(context);
        this.q = fjVar.f3414b;
        this.r = fjVar.f3415c;
        this.s = fjVar.e;
        this.t = fjVar.f;
        this.u = fjVar.g;
        this.v = fjVar.h;
        this.w = fjVar.k;
        this.x = fjVar.l;
        this.B = fjVar.m;
        this.y = fjVar.t;
        this.z = fjVar.u;
        this.A = fjVar.v;
    }

    private static ResolveInfo a(PackageManager packageManager, String str) {
        try {
            return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.p.g().e(th, "DeviceInfo.getResolveInfo");
            return null;
        }
    }

    private static String b(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoA = a(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoA == null || (activityInfo = resolveInfoA.activityInfo) == null) {
            return null;
        }
        try {
            PackageInfo packageInfoE = c.a.b.b.d.s.c.a(context).e(activityInfo.packageName, 0);
            if (packageInfoE != null) {
                int r3 = packageInfoE.versionCode;
                String str = activityInfo.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(r3);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    private final void c(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        if (audioManager != null) {
            try {
                this.f3277a = audioManager.getMode();
                this.f3278b = audioManager.isMusicActive();
                this.f3279c = audioManager.isSpeakerphoneOn();
                this.d = audioManager.getStreamVolume(3);
                this.e = audioManager.getRingerMode();
                this.f = audioManager.getStreamVolume(2);
                return;
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.p.g().e(th, "DeviceInfo.gatherAudioInfo");
            }
        }
        this.f3277a = -2;
        this.f3278b = false;
        this.f3279c = false;
        this.d = 0;
        this.e = 2;
        this.f = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void d(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r6.getSystemService(r0)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r1 = "connectivity"
            java.lang.Object r1 = r6.getSystemService(r1)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            java.lang.String r2 = r0.getNetworkOperator()
            r5.g = r2
            boolean r2 = com.google.android.gms.common.util.v.q()
            r3 = 0
            if (r2 == 0) goto L31
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r2 = com.google.android.gms.internal.ads.e0.z5
            com.google.android.gms.internal.ads.z r4 = com.google.android.gms.internal.ads.qx2.e()
            java.lang.Object r2 = r4.c(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L31
            r2 = 0
            goto L35
        L31:
            int r2 = r0.getNetworkType()
        L35:
            r5.i = r2
            int r0 = r0.getPhoneType()
            r5.j = r0
            r0 = -2
            r5.h = r0
            r5.k = r3
            r0 = -1
            r5.l = r0
            com.google.android.gms.ads.internal.p.c()
            java.lang.String r2 = "android.permission.ACCESS_NETWORK_STATE"
            boolean r6 = com.google.android.gms.internal.ads.to.l0(r6, r2)
            if (r6 == 0) goto L6f
            android.net.NetworkInfo r6 = r1.getActiveNetworkInfo()
            if (r6 == 0) goto L67
            int r0 = r6.getType()
            r5.h = r0
            android.net.NetworkInfo$DetailedState r6 = r6.getDetailedState()
            int r6 = r6.ordinal()
            r5.l = r6
            goto L69
        L67:
            r5.h = r0
        L69:
            boolean r6 = r1.isActiveNetworkMetered()
            r5.k = r6
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ej.d(android.content.Context):void");
    }

    private final void f(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            this.m = -1.0d;
            this.n = false;
        } else {
            int intExtra = intentRegisterReceiver.getIntExtra(androidx.core.app.p.t0, -1);
            this.m = intentRegisterReceiver.getIntExtra(FirebaseAnalytics.b.u, -1) / intentRegisterReceiver.getIntExtra("scale", -1);
            this.n = intExtra == 2 || intExtra == 5;
        }
    }

    private static String g(Context context) {
        try {
            PackageInfo packageInfoE = c.a.b.b.d.s.c.a(context).e("com.android.vending", 128);
            if (packageInfoE != null) {
                int r1 = packageInfoE.versionCode;
                String str = packageInfoE.packageName;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
                sb.append(r1);
                sb.append(".");
                sb.append(str);
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final fj e() {
        return new fj(this.f3277a, this.q, this.r, this.g, this.s, this.t, this.u, this.v, this.f3278b, this.f3279c, this.w, this.x, this.B, this.d, this.h, this.i, this.j, this.e, this.f, this.y, this.z, this.A, this.m, this.n, this.k, this.l, this.o, this.C, this.p);
    }
}
