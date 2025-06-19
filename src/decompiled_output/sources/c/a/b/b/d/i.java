package c.a.b.b.d;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import c.a.b.b.d.l;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.t0;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

@com.google.android.gms.common.internal.v
@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static final int f1611a = 12451000;

    /* renamed from: b, reason: collision with root package name */
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static final String f1612b = "com.google.android.gms";

    /* renamed from: c, reason: collision with root package name */
    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final String f1613c = "com.google.android.play.games";

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static final String d = "com.android.vending";

    @com.google.android.gms.common.annotation.a
    static final int e = 39789;

    @com.google.android.gms.common.annotation.a
    static final int f = 10436;

    @com.google.android.gms.common.util.d0
    private static boolean g = false;

    @com.google.android.gms.common.util.d0
    private static boolean h = false;
    private static boolean i = false;

    @com.google.android.gms.common.util.d0
    private static boolean j = false;

    @com.google.android.gms.common.util.d0
    @com.google.android.gms.common.annotation.a
    static final AtomicBoolean k = new AtomicBoolean();
    private static final AtomicBoolean l = new AtomicBoolean();

    @com.google.android.gms.common.annotation.a
    i() {
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static void a(@RecentlyNonNull Context context) {
        if (k.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(f);
            }
        } catch (SecurityException unused) {
        }
    }

    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public static void b() {
        l.set(true);
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static void c(@RecentlyNonNull Context context, @RecentlyNonNull int r3) throws g, h {
        int r32 = f.i().k(context, r3);
        if (r32 != 0) {
            Intent intentE = f.i().e(context, r32, "e");
            StringBuilder sb = new StringBuilder(57);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(r32);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (intentE != null) {
                throw new h(r32, "Google Play Services not available", intentE);
            }
            throw new g(r32);
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static int d(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static int e(@RecentlyNonNull Context context) {
        r.q(true);
        return com.google.android.gms.common.util.e.a(context, context.getPackageName());
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static PendingIntent f(@RecentlyNonNull int r1, @RecentlyNonNull Context context, @RecentlyNonNull int r3) {
        return f.i().f(context, r1, r3);
    }

    @com.google.android.gms.common.util.d0
    @com.google.android.gms.common.annotation.a
    @Deprecated
    @androidx.annotation.h0
    public static String g(@RecentlyNonNull int r0) {
        return c.y(r0);
    }

    @RecentlyNullable
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static Intent h(@RecentlyNonNull int r2) {
        return f.i().e(null, r2, null);
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static Context i(@RecentlyNonNull Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static Resources j(@RecentlyNonNull Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    public static boolean k(@RecentlyNonNull Context context) {
        try {
            if (!j) {
                try {
                    PackageInfo packageInfoE = c.a.b.b.d.s.c.a(context).e("com.google.android.gms", 64);
                    j.a(context);
                    if (packageInfoE == null || j.g(packageInfoE, false) || !j.g(packageInfoE, true)) {
                        i = false;
                    } else {
                        i = true;
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                }
            }
            return i || !com.google.android.gms.common.util.l.i();
        } finally {
            j = true;
        }
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    @com.google.android.gms.common.internal.j
    public static int l(@RecentlyNonNull Context context) {
        return m(context, f1611a);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static int m(@RecentlyNonNull Context context, @RecentlyNonNull int r4) {
        try {
            context.getResources().getString(l.b.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !l.get()) {
            int r0 = t0.b(context);
            if (r0 == 0) {
                throw new IllegalStateException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
            }
            if (r0 != f1611a) {
                int r42 = f1611a;
                StringBuilder sb = new StringBuilder(320);
                sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
                sb.append(r42);
                sb.append(" but found ");
                sb.append(r0);
                sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                throw new IllegalStateException(sb.toString());
            }
        }
        return u(context, (com.google.android.gms.common.util.l.l(context) || com.google.android.gms.common.util.l.m(context)) ? false : true, r4);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static boolean n(@RecentlyNonNull Context context, @RecentlyNonNull int r1) {
        return com.google.android.gms.common.util.c0.a(context, r1);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static boolean o(@RecentlyNonNull Context context, @RecentlyNonNull int r3) {
        if (r3 == 18) {
            return true;
        }
        if (r3 == 1) {
            return v(context, "com.google.android.gms");
        }
        return false;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static boolean p(@RecentlyNonNull Context context, @RecentlyNonNull int r2) {
        if (r2 == 9) {
            return v(context, "com.android.vending");
        }
        return false;
    }

    @RecentlyNonNull
    @TargetApi(18)
    @com.google.android.gms.common.annotation.a
    public static boolean q(@RecentlyNonNull Context context) {
        Bundle applicationRestrictions;
        return com.google.android.gms.common.util.v.g() && (applicationRestrictions = ((UserManager) r.k(context.getSystemService("user"))).getApplicationRestrictions(context.getPackageName())) != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @RecentlyNonNull
    @com.google.android.gms.common.internal.v
    @com.google.android.gms.common.util.d0
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static boolean r(@RecentlyNonNull Context context) {
        return com.google.android.gms.common.util.l.e(context);
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    public static boolean s(@RecentlyNonNull int r2) {
        return r2 == 1 || r2 == 2 || r2 == 3 || r2 == 9;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    @Deprecated
    @TargetApi(19)
    public static boolean t(@RecentlyNonNull Context context, @RecentlyNonNull int r1, @RecentlyNonNull String str) {
        return com.google.android.gms.common.util.c0.b(context, r1, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    @com.google.android.gms.common.util.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int u(android.content.Context r9, boolean r10, int r11) throws android.content.pm.PackageManager.NameNotFoundException {
        /*
            java.lang.String r0 = "com.google.android.gms"
            r1 = 1
            r2 = 0
            if (r11 < 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = 0
        L9:
            com.google.android.gms.common.internal.r.a(r3)
            java.lang.String r3 = r9.getPackageName()
            android.content.pm.PackageManager r4 = r9.getPackageManager()
            r5 = 0
            r6 = 9
            java.lang.String r7 = "GooglePlayServicesUtil"
            if (r10 == 0) goto L32
            java.lang.String r5 = "com.android.vending"
            r8 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r5 = r4.getPackageInfo(r5, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L24
            goto L32
        L24:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires the Google Play Store, but it is missing."
        L2a:
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.w(r7, r9)
            return r6
        L32:
            r8 = 64
            android.content.pm.PackageInfo r8 = r4.getPackageInfo(r0, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lc8
            c.a.b.b.d.j.a(r9)
            boolean r9 = c.a.b.b.d.j.g(r8, r1)
            if (r9 != 0) goto L48
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but their signature is invalid."
            goto L2a
        L48:
            if (r10 == 0) goto L6b
            java.lang.Object r9 = com.google.android.gms.common.internal.r.k(r5)
            android.content.pm.PackageInfo r9 = (android.content.pm.PackageInfo) r9
            boolean r9 = c.a.b.b.d.j.g(r9, r1)
            if (r9 == 0) goto L64
            android.content.pm.Signature[] r9 = r5.signatures
            r9 = r9[r2]
            android.content.pm.Signature[] r10 = r8.signatures
            r10 = r10[r2]
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L6b
        L64:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play Store, but its signature is invalid."
            goto L2a
        L6b:
            int r9 = r8.versionCode
            int r9 = com.google.android.gms.common.util.g0.a(r9)
            int r10 = com.google.android.gms.common.util.g0.a(r11)
            if (r9 >= r10) goto La9
            int r9 = r8.versionCode
            java.lang.String r10 = java.lang.String.valueOf(r3)
            int r10 = r10.length()
            int r10 = r10 + 82
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            java.lang.String r10 = "Google Play services out of date for "
            r0.append(r10)
            r0.append(r3)
            java.lang.String r10 = ".  Requires "
            r0.append(r10)
            r0.append(r11)
            java.lang.String r10 = " but found "
            r0.append(r10)
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            android.util.Log.w(r7, r9)
            r9 = 2
            return r9
        La9:
            android.content.pm.ApplicationInfo r9 = r8.applicationInfo
            if (r9 != 0) goto Lc1
            android.content.pm.ApplicationInfo r9 = r4.getApplicationInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb2
            goto Lc1
        Lb2:
            r9 = move-exception
            java.lang.String r10 = java.lang.String.valueOf(r3)
            java.lang.String r11 = " requires Google Play services, but they're missing when getting application info."
            java.lang.String r10 = r10.concat(r11)
            android.util.Log.wtf(r7, r10, r9)
            return r1
        Lc1:
            boolean r9 = r9.enabled
            if (r9 != 0) goto Lc7
            r9 = 3
            return r9
        Lc7:
            return r2
        Lc8:
            java.lang.String r9 = java.lang.String.valueOf(r3)
            java.lang.String r10 = " requires Google Play services, but they are missing."
            java.lang.String r9 = r9.concat(r10)
            android.util.Log.w(r7, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.b.b.d.i.u(android.content.Context, boolean, int):int");
    }

    @TargetApi(21)
    static boolean v(Context context, String str) throws PackageManager.NameNotFoundException {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (com.google.android.gms.common.util.v.j()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !q(context);
    }
}
