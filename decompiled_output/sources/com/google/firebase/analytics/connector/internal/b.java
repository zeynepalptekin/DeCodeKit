package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.measurement.c.a;
import com.google.android.gms.measurement.internal.a6;
import com.google.android.gms.measurement.internal.b6;
import com.google.android.gms.measurement.internal.q7;
import com.google.android.gms.measurement.internal.z5;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.a.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f6891a = new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", FirebaseAnalytics.a.g, "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f6892b = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");

    /* renamed from: c, reason: collision with root package name */
    private static final List<String> f6893c = Arrays.asList("auto", "app", "am");
    private static final List<String> d = Arrays.asList("_r", "_dbg");
    private static final List<String> e = Arrays.asList((String[]) com.google.android.gms.common.util.b.b(b6.f6357a, b6.f6358b));
    private static final List<String> f = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");

    public static a.c a(@h0 Bundle bundle) {
        r.k(bundle);
        a.c cVar = new a.c();
        cVar.f6881a = (String) a6.a(bundle, "origin", String.class, null);
        cVar.f6882b = (String) a6.a(bundle, a.C0190a.f6334b, String.class, null);
        cVar.f6883c = a6.a(bundle, "value", Object.class, null);
        cVar.d = (String) a6.a(bundle, a.C0190a.d, String.class, null);
        cVar.e = ((Long) a6.a(bundle, a.C0190a.e, Long.class, 0L)).longValue();
        cVar.f = (String) a6.a(bundle, a.C0190a.f, String.class, null);
        cVar.g = (Bundle) a6.a(bundle, a.C0190a.g, Bundle.class, null);
        cVar.h = (String) a6.a(bundle, a.C0190a.h, String.class, null);
        cVar.i = (Bundle) a6.a(bundle, a.C0190a.i, Bundle.class, null);
        cVar.j = ((Long) a6.a(bundle, a.C0190a.j, Long.class, 0L)).longValue();
        cVar.k = (String) a6.a(bundle, a.C0190a.k, String.class, null);
        cVar.l = (Bundle) a6.a(bundle, a.C0190a.l, Bundle.class, null);
        cVar.n = ((Boolean) a6.a(bundle, a.C0190a.n, Boolean.class, Boolean.FALSE)).booleanValue();
        cVar.m = ((Long) a6.a(bundle, a.C0190a.m, Long.class, 0L)).longValue();
        cVar.o = ((Long) a6.a(bundle, a.C0190a.o, Long.class, 0L)).longValue();
        return cVar;
    }

    public static boolean b(a.c cVar) {
        String str;
        if (cVar == null || (str = cVar.f6881a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = cVar.f6883c;
        if ((obj != null && q7.a(obj) == null) || !c(str) || !e(str, cVar.f6882b)) {
            return false;
        }
        String str2 = cVar.k;
        if (str2 != null && (!d(str2, cVar.l) || !f(str, cVar.k, cVar.l))) {
            return false;
        }
        String str3 = cVar.h;
        if (str3 != null && (!d(str3, cVar.i) || !f(str, cVar.h, cVar.i))) {
            return false;
        }
        String str4 = cVar.f;
        if (str4 != null) {
            return d(str4, cVar.g) && f(str, cVar.f, cVar.g);
        }
        return true;
    }

    public static boolean c(@h0 String str) {
        return !f6893c.contains(str);
    }

    public static boolean d(@h0 String str, @i0 Bundle bundle) {
        if (f6892b.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(@h0 String str, @h0 String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if (AppMeasurement.e.f6331c.equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (e.contains(str2)) {
            return false;
        }
        Iterator<String> it = f.iterator();
        while (it.hasNext()) {
            if (str2.matches(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean f(@h0 String str, @h0 String str2, @i0 Bundle bundle) {
        String str3;
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!c(str) || bundle == null) {
            return false;
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            if (bundle.containsKey(it.next())) {
                return false;
            }
        }
        char c2 = 65535;
        int r2 = str.hashCode();
        if (r2 != 101200) {
            if (r2 != 101230) {
                if (r2 == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            str3 = "fcm_integration";
        } else if (c2 == 1) {
            str3 = "fdl_integration";
        } else {
            if (c2 != 2) {
                return false;
            }
            str3 = "fiam_integration";
        }
        bundle.putString("_cis", str3);
        return true;
    }

    public static Bundle g(a.c cVar) {
        Bundle bundle = new Bundle();
        String str = cVar.f6881a;
        if (str != null) {
            bundle.putString("origin", str);
        }
        String str2 = cVar.f6882b;
        if (str2 != null) {
            bundle.putString(a.C0190a.f6334b, str2);
        }
        Object obj = cVar.f6883c;
        if (obj != null) {
            a6.b(bundle, obj);
        }
        String str3 = cVar.d;
        if (str3 != null) {
            bundle.putString(a.C0190a.d, str3);
        }
        bundle.putLong(a.C0190a.e, cVar.e);
        String str4 = cVar.f;
        if (str4 != null) {
            bundle.putString(a.C0190a.f, str4);
        }
        Bundle bundle2 = cVar.g;
        if (bundle2 != null) {
            bundle.putBundle(a.C0190a.g, bundle2);
        }
        String str5 = cVar.h;
        if (str5 != null) {
            bundle.putString(a.C0190a.h, str5);
        }
        Bundle bundle3 = cVar.i;
        if (bundle3 != null) {
            bundle.putBundle(a.C0190a.i, bundle3);
        }
        bundle.putLong(a.C0190a.j, cVar.j);
        String str6 = cVar.k;
        if (str6 != null) {
            bundle.putString(a.C0190a.k, str6);
        }
        Bundle bundle4 = cVar.l;
        if (bundle4 != null) {
            bundle.putBundle(a.C0190a.l, bundle4);
        }
        bundle.putLong(a.C0190a.m, cVar.m);
        bundle.putBoolean(a.C0190a.n, cVar.n);
        bundle.putLong(a.C0190a.o, cVar.o);
        return bundle;
    }

    public static void h(@h0 String str, @h0 String str2, @h0 Bundle bundle) {
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
    }

    public static boolean i(@h0 String str) {
        return !f6891a.contains(str);
    }

    public static boolean j(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int r1 = str.codePointAt(0);
        if (!Character.isLetter(r1)) {
            return false;
        }
        int length = str.length();
        int r12 = Character.charCount(r1);
        while (r12 < length) {
            int r3 = str.codePointAt(r12);
            if (r3 != 95 && !Character.isLetterOrDigit(r3)) {
                return false;
            }
            r12 += Character.charCount(r3);
        }
        return true;
    }

    public static boolean k(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int r1 = str.codePointAt(0);
        if (!Character.isLetter(r1) && r1 != 95) {
            return false;
        }
        int length = str.length();
        int r12 = Character.charCount(r1);
        while (r12 < length) {
            int r4 = str.codePointAt(r12);
            if (r4 != 95 && !Character.isLetterOrDigit(r4)) {
                return false;
            }
            r12 += Character.charCount(r4);
        }
        return true;
    }

    public static String l(String str) {
        String strA = z5.a(str);
        return strA != null ? strA : str;
    }

    public static String m(String str) {
        String strB = z5.b(str);
        return strB != null ? strB : str;
    }
}
