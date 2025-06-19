package com.google.android.gms.common.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2569a = Process.myUid();

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private static final Method f2570b = i();

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private static final Method f2571c = k();

    @androidx.annotation.i0
    private static final Method d = l();

    @androidx.annotation.i0
    private static final Method e = m();

    @androidx.annotation.i0
    private static final Method f = n();

    @androidx.annotation.i0
    private static final Method g = o();

    @androidx.annotation.i0
    private static final Method h = p();

    private e0() {
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static WorkSource a(@RecentlyNonNull Context context, @androidx.annotation.i0 String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = c.a.b.b.d.s.c.a(context).c(str, 0);
                if (applicationInfoC != null) {
                    return g(applicationInfoC.uid, str);
                }
                String strValueOf = String.valueOf(str);
                Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new String("Could not get applicationInfo from package: "));
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                String strValueOf2 = String.valueOf(str);
                Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new String("Could not find package: "));
            }
        }
        return null;
    }

    @RecentlyNullable
    @com.google.android.gms.common.annotation.a
    public static WorkSource b(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull String str2) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (context == null || context.getPackageManager() == null || str2 == null || str == null) {
            Log.w("WorkSourceUtil", "Unexpected null arguments");
            return null;
        }
        int r8 = e(context, str);
        if (r8 < 0) {
            return null;
        }
        WorkSource workSource = new WorkSource();
        Method method = g;
        if (method == null || h == null) {
            j(workSource, r8, str);
        } else {
            try {
                Object objInvoke = method.invoke(workSource, new Object[0]);
                if (r8 != f2569a) {
                    h.invoke(objInvoke, Integer.valueOf(r8), str);
                }
                h.invoke(objInvoke, Integer.valueOf(f2569a), str2);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Unable to assign chained blame through WorkSource", e2);
            }
        }
        return workSource;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static List<String> c(@androidx.annotation.i0 WorkSource workSource) {
        ArrayList arrayList = new ArrayList();
        int r2 = workSource == null ? 0 : f(workSource);
        if (r2 == 0) {
            return arrayList;
        }
        for (int r1 = 0; r1 < r2; r1++) {
            String strH = h(workSource, r1);
            if (!b0.b(strH)) {
                arrayList.add((String) com.google.android.gms.common.internal.r.k(strH));
            }
        }
        return arrayList;
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public static boolean d(@RecentlyNonNull Context context) {
        return (context == null || context.getPackageManager() == null || c.a.b.b.d.s.c.a(context).b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) ? false : true;
    }

    private static int e(Context context, String str) {
        try {
            ApplicationInfo applicationInfoC = c.a.b.b.d.s.c.a(context).c(str, 0);
            if (applicationInfoC != null) {
                return applicationInfoC.uid;
            }
            String strValueOf = String.valueOf(str);
            Log.e("WorkSourceUtil", strValueOf.length() != 0 ? "Could not get applicationInfo from package: ".concat(strValueOf) : new String("Could not get applicationInfo from package: "));
            return -1;
        } catch (PackageManager.NameNotFoundException unused) {
            String strValueOf2 = String.valueOf(str);
            Log.e("WorkSourceUtil", strValueOf2.length() != 0 ? "Could not find package: ".concat(strValueOf2) : new String("Could not find package: "));
            return -1;
        }
    }

    private static int f(WorkSource workSource) {
        Method method = d;
        if (method != null) {
            try {
                return ((Integer) com.google.android.gms.common.internal.r.k(method.invoke(workSource, new Object[0]))).intValue();
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            }
        }
        return 0;
    }

    private static WorkSource g(int r1, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        WorkSource workSource = new WorkSource();
        j(workSource, r1, str);
        return workSource;
    }

    @androidx.annotation.i0
    private static String h(@androidx.annotation.i0 WorkSource workSource, int r4) {
        Method method = f;
        if (method == null) {
            return null;
        }
        try {
            return (String) method.invoke(workSource, Integer.valueOf(r4));
        } catch (Exception e2) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
            return null;
        }
    }

    @androidx.annotation.i0
    private static Method i() {
        try {
            return WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void j(WorkSource workSource, int r7, @androidx.annotation.i0 String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (f2571c != null) {
            if (str == null) {
                str = "";
            }
            try {
                f2571c.invoke(workSource, Integer.valueOf(r7), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method = f2570b;
        if (method != null) {
            try {
                method.invoke(workSource, Integer.valueOf(r7));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }

    @androidx.annotation.i0
    private static Method k() {
        if (v.g()) {
            try {
                return WorkSource.class.getMethod("add", Integer.TYPE, String.class);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @androidx.annotation.i0
    private static Method l() {
        try {
            return WorkSource.class.getMethod("size", new Class[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    @androidx.annotation.i0
    private static Method m() {
        try {
            return WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused) {
            return null;
        }
    }

    @androidx.annotation.i0
    private static Method n() {
        if (v.g()) {
            try {
                return WorkSource.class.getMethod("getName", Integer.TYPE);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @androidx.annotation.i0
    private static final Method o() {
        if (v.o()) {
            try {
                return WorkSource.class.getMethod("createWorkChain", new Class[0]);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e2);
            }
        }
        return null;
    }

    @androidx.annotation.i0
    @SuppressLint({"PrivateApi"})
    private static final Method p() {
        if (v.o()) {
            try {
                return Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
            } catch (Exception e2) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e2);
            }
        }
        return null;
    }
}
