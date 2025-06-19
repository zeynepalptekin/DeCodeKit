package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class yh implements ci {
    private static final Object f = new Object();

    @com.google.android.gms.common.util.d0
    private static ci g;

    @com.google.android.gms.common.util.d0
    private static ci h;

    /* renamed from: a, reason: collision with root package name */
    private final Object f6135a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f6136b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakHashMap<Thread, Boolean> f6137c;
    private final ExecutorService d;
    private final as e;

    private yh(Context context) {
        this(context, as.h());
    }

    private yh(Context context, as asVar) {
        this.f6135a = new Object();
        this.f6137c = new WeakHashMap<>();
        this.d = du1.a().e(iu1.f3869b);
        this.f6136b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.e = asVar;
    }

    @com.google.android.gms.common.util.d0
    private final Uri.Builder c(String str, String str2, String str3, int r10) {
        boolean zF;
        String packageName;
        try {
            zF = c.a.b.b.d.s.c.a(this.f6136b).f();
        } catch (Throwable th) {
            tr.c("Error fetching instant app info", th);
            zF = false;
        }
        try {
            packageName = this.f6136b.getPackageName();
        } catch (Throwable unused) {
            tr.i("Cannot obtain package name, proceeding.");
            packageName = b.i.k.d.f1056b;
        }
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(zF)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
        String str4 = Build.MANUFACTURER;
        String string = Build.MODEL;
        if (!string.startsWith(str4)) {
            StringBuilder sb = new StringBuilder(String.valueOf(str4).length() + 1 + String.valueOf(string).length());
            sb.append(str4);
            sb.append(" ");
            sb.append(string);
            string = sb.toString();
        }
        Uri.Builder builderAppendQueryParameter2 = builderAppendQueryParameter.appendQueryParameter("device", string).appendQueryParameter("js", this.e.d).appendQueryParameter("appid", packageName).appendQueryParameter("exceptiontype", str).appendQueryParameter("stacktrace", str2).appendQueryParameter("eids", TextUtils.join(",", e0.d())).appendQueryParameter("exceptionkey", str3).appendQueryParameter("cl", "330794610").appendQueryParameter("rc", "dev").appendQueryParameter("session_id", qx2.f()).appendQueryParameter("sampling_rate", Integer.toString(r10)).appendQueryParameter("pb_tm", String.valueOf(g2.f3490c.a()));
        if (((Boolean) qx2.e().c(e0.h1)).booleanValue()) {
            builderAppendQueryParameter2.appendQueryParameter("gmscv", String.valueOf(c.a.b.b.d.f.i().b(this.f6136b))).appendQueryParameter("lite", this.e.h ? "1" : "0");
        }
        return builderAppendQueryParameter2;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[Catch: all -> 0x006b, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:12:0x0036, B:13:0x0038, B:16:0x0041, B:20:0x0050, B:21:0x0051, B:22:0x0060, B:23:0x0067, B:14:0x0039, B:15:0x0040), top: B:29:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.ci f(android.content.Context r4, com.google.android.gms.internal.ads.as r5) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.yh.f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.ci r1 = com.google.android.gms.internal.ads.yh.h     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L67
            com.google.android.gms.internal.ads.m1<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.g2.e     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 == 0) goto L60
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.e0.a5     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.z r2 = com.google.android.gms.internal.ads.qx2.e()     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r1 = r2.c(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L6b
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L6b
            if (r1 != 0) goto L60
            com.google.android.gms.internal.ads.yh r1 = new com.google.android.gms.internal.ads.yh     // Catch: java.lang.Throwable -> L6b
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L6b
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread r4 = r4.getThread()     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L51
            java.lang.Object r5 = r1.f6135a     // Catch: java.lang.Throwable -> L6b
            monitor-enter(r5)     // Catch: java.lang.Throwable -> L6b
            java.util.WeakHashMap<java.lang.Thread, java.lang.Boolean> r2 = r1.f6137c     // Catch: java.lang.Throwable -> L4e
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L4e
            r2.put(r4, r3)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            java.lang.Thread$UncaughtExceptionHandler r5 = r4.getUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.zh r2 = new com.google.android.gms.internal.ads.zh     // Catch: java.lang.Throwable -> L6b
            r2.<init>(r1, r5)     // Catch: java.lang.Throwable -> L6b
            r4.setUncaughtExceptionHandler(r2)     // Catch: java.lang.Throwable -> L6b
            goto L51
        L4e:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L6b
        L51:
            java.lang.Thread$UncaughtExceptionHandler r4 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.ai r5 = new com.google.android.gms.internal.ads.ai     // Catch: java.lang.Throwable -> L6b
            r5.<init>(r1, r4)     // Catch: java.lang.Throwable -> L6b
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r5)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.yh.h = r1     // Catch: java.lang.Throwable -> L6b
            goto L67
        L60:
            com.google.android.gms.internal.ads.bi r4 = new com.google.android.gms.internal.ads.bi     // Catch: java.lang.Throwable -> L6b
            r4.<init>()     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.yh.h = r4     // Catch: java.lang.Throwable -> L6b
        L67:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            com.google.android.gms.internal.ads.ci r4 = com.google.android.gms.internal.ads.yh.h
            return r4
        L6b:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6b
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yh.f(android.content.Context, com.google.android.gms.internal.ads.as):com.google.android.gms.internal.ads.ci");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[Catch: all -> 0x003a, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x0015, B:10:0x0027, B:11:0x002f, B:12:0x0036), top: B:18:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.ci g(android.content.Context r3) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.yh.f
            monitor-enter(r0)
            com.google.android.gms.internal.ads.ci r1 = com.google.android.gms.internal.ads.yh.g     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L36
            com.google.android.gms.internal.ads.m1<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.g2.e     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r1.a()     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r1 == 0) goto L2f
            com.google.android.gms.internal.ads.s<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.e0.a5     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.z r2 = com.google.android.gms.internal.ads.qx2.e()     // Catch: java.lang.Throwable -> L3a
            java.lang.Object r1 = r2.c(r1)     // Catch: java.lang.Throwable -> L3a
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L3a
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L3a
            if (r1 != 0) goto L2f
            com.google.android.gms.internal.ads.yh r1 = new com.google.android.gms.internal.ads.yh     // Catch: java.lang.Throwable -> L3a
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.yh.g = r1     // Catch: java.lang.Throwable -> L3a
            goto L36
        L2f:
            com.google.android.gms.internal.ads.bi r3 = new com.google.android.gms.internal.ads.bi     // Catch: java.lang.Throwable -> L3a
            r3.<init>()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.yh.g = r3     // Catch: java.lang.Throwable -> L3a
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.internal.ads.ci r3 = com.google.android.gms.internal.ads.yh.g
            return r3
        L3a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yh.g(android.content.Context):com.google.android.gms.internal.ads.ci");
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final void a(Throwable th, String str, float f2) {
        if (jr.s(th) == null) {
            return;
        }
        String name = th.getClass().getName();
        StringWriter stringWriter = new StringWriter();
        i72.a(th, new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        int r5 = 0;
        boolean z = Math.random() < ((double) f2);
        int r6 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (z) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c(name, string, str, r6).toString());
            int size = arrayList.size();
            while (r5 < size) {
                Object obj = arrayList.get(r5);
                r5++;
                final String str2 = (String) obj;
                final xr xrVar = new xr();
                this.d.execute(new Runnable(xrVar, str2) { // from class: com.google.android.gms.internal.ads.xh
                    private final xr d;
                    private final String e;

                    {
                        this.d = xrVar;
                        this.e = str2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.a(this.e);
                    }
                });
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.ci
    public final void b(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void e(java.lang.Thread r10, java.lang.Throwable r11) {
        /*
            r9 = this;
            r10 = 1
            r0 = 0
            if (r11 == 0) goto L3c
            r1 = r11
            r2 = 0
            r3 = 0
        L7:
            if (r1 == 0) goto L37
            java.lang.StackTraceElement[] r4 = r1.getStackTrace()
            int r5 = r4.length
            r6 = 0
        Lf:
            if (r6 >= r5) goto L32
            r7 = r4[r6]
            java.lang.String r8 = r7.getClassName()
            boolean r8 = com.google.android.gms.internal.ads.jr.w(r8)
            if (r8 == 0) goto L1e
            r2 = 1
        L1e:
            java.lang.Class<com.google.android.gms.internal.ads.yh> r8 = com.google.android.gms.internal.ads.yh.class
            java.lang.String r8 = r8.getName()
            java.lang.String r7 = r7.getClassName()
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L2f
            r3 = 1
        L2f:
            int r6 = r6 + 1
            goto Lf
        L32:
            java.lang.Throwable r1 = r1.getCause()
            goto L7
        L37:
            if (r2 == 0) goto L3c
            if (r3 != 0) goto L3c
            goto L3d
        L3c:
            r10 = 0
        L3d:
            if (r10 == 0) goto L46
            r10 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r0 = ""
            r9.a(r11, r0, r10)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.yh.e(java.lang.Thread, java.lang.Throwable):void");
    }
}
