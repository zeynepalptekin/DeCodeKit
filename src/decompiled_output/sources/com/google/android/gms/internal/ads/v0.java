package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class v0 {

    @androidx.annotation.i0
    private v0 e;

    /* renamed from: b, reason: collision with root package name */
    private final List<t0> f5619b = new LinkedList();

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, String> f5620c = new LinkedHashMap();
    private final Object d = new Object();

    /* renamed from: a, reason: collision with root package name */
    @com.google.android.gms.common.util.d0
    boolean f5618a = true;

    public v0(boolean z, String str, String str2) {
        this.f5620c.put("action", str);
        this.f5620c.put(FirebaseAnalytics.b.f6877b, str2);
    }

    public final boolean a(t0 t0Var, long j, String... strArr) {
        synchronized (this.d) {
            for (String str : strArr) {
                this.f5619b.add(new t0(j, str, t0Var));
            }
        }
        return true;
    }

    public final void b(@androidx.annotation.i0 v0 v0Var) {
        synchronized (this.d) {
            this.e = v0Var;
        }
    }

    @androidx.annotation.i0
    public final t0 c(long j) {
        if (this.f5618a) {
            return new t0(j, null, null);
        }
        return null;
    }

    public final void d(String str, String str2) {
        l0 l0VarL;
        if (!this.f5618a || TextUtils.isEmpty(str2) || (l0VarL = com.google.android.gms.ads.internal.p.g().l()) == null) {
            return;
        }
        synchronized (this.d) {
            p0 p0VarE = l0VarL.e(str);
            Map<String, String> map = this.f5620c;
            map.put(str, p0VarE.a(map.get(str), str2));
        }
    }

    public final String e() {
        String string;
        StringBuilder sb = new StringBuilder();
        synchronized (this.d) {
            for (t0 t0Var : this.f5619b) {
                long jA = t0Var.a();
                String strB = t0Var.b();
                t0 t0VarC = t0Var.c();
                if (t0VarC != null && jA > 0) {
                    long jA2 = jA - t0VarC.a();
                    sb.append(strB);
                    sb.append('.');
                    sb.append(jA2);
                    sb.append(',');
                }
            }
            this.f5619b.clear();
            if (!TextUtils.isEmpty(null)) {
                sb.append((String) null);
            } else if (sb.length() > 0) {
                sb.setLength(sb.length() - 1);
            }
            string = sb.toString();
        }
        return string;
    }

    @com.google.android.gms.common.util.d0
    final Map<String, String> f() {
        synchronized (this.d) {
            l0 l0VarL = com.google.android.gms.ads.internal.p.g().l();
            if (l0VarL != null && this.e != null) {
                return l0VarL.a(this.f5620c, this.e.f());
            }
            return this.f5620c;
        }
    }
}
