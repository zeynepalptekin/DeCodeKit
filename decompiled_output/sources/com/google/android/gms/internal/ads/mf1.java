package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class mf1 implements ff1<jf1> {

    /* renamed from: a, reason: collision with root package name */
    private final cy1 f4401a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4402b;

    public mf1(cy1 cy1Var, Context context) {
        this.f4401a = cy1Var;
        this.f4402b = context;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    private static String c(Context context, PackageManager packageManager) {
        ActivityInfo activityInfo;
        ResolveInfo resolveInfoB = b(packageManager, "market://details?id=com.google.android.gms.ads");
        if (resolveInfoB == null || (activityInfo = resolveInfoB.activityInfo) == null) {
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

    private static String e(Context context) {
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

    @Override // com.google.android.gms.internal.ads.ff1
    public final dy1<jf1> a() {
        return this.f4401a.submit(new Callable(this) { // from class: com.google.android.gms.internal.ads.lf1

            /* renamed from: a, reason: collision with root package name */
            private final mf1 f4252a;

            {
                this.f4252a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4252a.d();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final /* synthetic */ com.google.android.gms.internal.ads.jf1 d() throws java.lang.Exception {
        /*
            r22 = this;
            r0 = r22
            android.content.Context r1 = r0.f4402b
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = "geo:0,0?q=donuts"
            android.content.pm.ResolveInfo r3 = b(r1, r3)
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L18
            r7 = 1
            goto L19
        L18:
            r7 = 0
        L19:
            java.lang.String r3 = "http://www.google.com"
            android.content.pm.ResolveInfo r3 = b(r1, r3)
            if (r3 == 0) goto L23
            r8 = 1
            goto L24
        L23:
            r8 = 0
        L24:
            java.lang.String r9 = r2.getCountry()
            java.lang.String r3 = android.os.Build.DEVICE
            java.lang.String r4 = "generic"
            boolean r10 = r3.startsWith(r4)
            android.content.Context r3 = r0.f4402b
            boolean r11 = com.google.android.gms.common.util.l.d(r3)
            android.content.Context r3 = r0.f4402b
            boolean r12 = com.google.android.gms.common.util.l.e(r3)
            java.lang.String r13 = r2.getLanguage()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L64
            android.os.LocaleList r2 = android.os.LocaleList.getDefault()
            r3 = 0
        L50:
            int r4 = r2.size()
            if (r3 >= r4) goto L64
            java.util.Locale r4 = r2.get(r3)
            java.lang.String r4 = r4.getLanguage()
            r14.add(r4)
            int r3 = r3 + 1
            goto L50
        L64:
            android.content.Context r2 = r0.f4402b
            java.lang.String r15 = c(r2, r1)
            android.content.Context r2 = r0.f4402b
            java.lang.String r16 = e(r2)
            java.lang.String r17 = android.os.Build.FINGERPRINT
            android.content.Context r2 = r0.f4402b
            if (r1 == 0) goto Lbf
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r4 = "http://www.example.com"
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r6 = "android.intent.action.VIEW"
            r3.<init>(r6, r4)
            android.content.pm.ResolveInfo r4 = r1.resolveActivity(r3, r5)
            r6 = 65536(0x10000, float:9.1835E-41)
            java.util.List r1 = r1.queryIntentActivities(r3, r6)
            if (r1 == 0) goto Lbf
            if (r4 == 0) goto Lbf
            r3 = 0
        L92:
            int r6 = r1.size()
            if (r3 >= r6) goto Lbf
            java.lang.Object r6 = r1.get(r3)
            android.content.pm.ResolveInfo r6 = (android.content.pm.ResolveInfo) r6
            android.content.pm.ActivityInfo r5 = r4.activityInfo
            java.lang.String r5 = r5.name
            android.content.pm.ActivityInfo r6 = r6.activityInfo
            java.lang.String r6 = r6.name
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto Lbb
            android.content.pm.ActivityInfo r1 = r4.activityInfo
            java.lang.String r1 = r1.packageName
            java.lang.String r2 = com.google.android.gms.internal.ads.bf2.a(r2)
            boolean r5 = r1.equals(r2)
            r18 = r5
            goto Lc1
        Lbb:
            int r3 = r3 + 1
            r5 = 0
            goto L92
        Lbf:
            r18 = 0
        Lc1:
            com.google.android.gms.internal.ads.dp r1 = com.google.android.gms.ads.internal.p.e()
            long r20 = r1.u()
            com.google.android.gms.internal.ads.jf1 r1 = new com.google.android.gms.internal.ads.jf1
            java.lang.String r19 = android.os.Build.MODEL
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.mf1.d():com.google.android.gms.internal.ads.jf1");
    }
}
