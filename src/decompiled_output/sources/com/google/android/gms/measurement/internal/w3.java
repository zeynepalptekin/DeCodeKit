package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;

/* loaded from: classes.dex */
public final class w3 extends y5 {

    /* renamed from: c, reason: collision with root package name */
    private char f6550c;
    private long d;

    @androidx.annotation.u("this")
    private String e;
    private final y3 f;
    private final y3 g;
    private final y3 h;
    private final y3 i;
    private final y3 j;
    private final y3 k;
    private final y3 l;
    private final y3 m;
    private final y3 n;

    w3(b5 b5Var) {
        super(b5Var);
        this.f6550c = (char) 0;
        this.d = -1L;
        this.f = new y3(this, 6, false, false);
        this.g = new y3(this, 6, true, false);
        this.h = new y3(this, 6, false, true);
        this.i = new y3(this, 5, false, false);
        this.j = new y3(this, 5, true, false);
        this.k = new y3(this, 5, false, true);
        this.l = new y3(this, 4, false, false);
        this.m = new y3(this, 3, false, false);
        this.n = new y3(this, 2, false, false);
    }

    private static String D(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int r0 = str.lastIndexOf(46);
        return r0 == -1 ? str : str.substring(0, r0);
    }

    @com.google.android.gms.common.util.d0
    private final String P() {
        String str;
        synchronized (this) {
            if (this.e == null) {
                this.e = this.f6543a.M() != null ? this.f6543a.M() : "FA";
            }
            str = this.e;
        }
        return str;
    }

    protected static Object t(String str) {
        if (str == null) {
            return null;
        }
        return new x3(str);
    }

    @com.google.android.gms.common.util.d0
    private static String u(boolean z, Object obj) {
        String className;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        int r3 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return String.valueOf(obj);
            }
            String str = String.valueOf(obj).charAt(0) == '-' ? "-" : "";
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + 43 + str.length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return String.valueOf(obj);
        }
        if (!(obj instanceof Throwable)) {
            return obj instanceof x3 ? ((x3) obj).f6558a : z ? "-" : String.valueOf(obj);
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String strD = D(b5.class.getCanonicalName());
        StackTraceElement[] stackTrace = th.getStackTrace();
        int length = stackTrace.length;
        while (true) {
            if (r3 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[r3];
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && D(className).equals(strD)) {
                sb2.append(": ");
                sb2.append(stackTraceElement);
                break;
            }
            r3++;
        }
        return sb2.toString();
    }

    static String v(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String strU = u(z, obj);
        String strU2 = u(z, obj2);
        String strU3 = u(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strU)) {
            sb.append(str2);
            sb.append(strU);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strU2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strU2);
        }
        if (!TextUtils.isEmpty(strU3)) {
            sb.append(str3);
            sb.append(strU3);
        }
        return sb.toString();
    }

    @com.google.android.gms.common.util.d0
    protected final boolean A(int r2) {
        return Log.isLoggable(P(), r2);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    public final y3 E() {
        return this.f;
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
    }

    public final y3 G() {
        return this.g;
    }

    public final y3 H() {
        return this.h;
    }

    public final y3 I() {
        return this.i;
    }

    public final y3 J() {
        return this.j;
    }

    public final y3 K() {
        return this.k;
    }

    public final y3 L() {
        return this.l;
    }

    public final y3 M() {
        return this.m;
    }

    public final y3 N() {
        return this.n;
    }

    public final String O() {
        Pair<String, Long> pairA = i().d.a();
        if (pairA == null || pairA == j4.D) {
            return null;
        }
        String strValueOf = String.valueOf(pairA.second);
        String str = (String) pairA.first;
        StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 1 + String.valueOf(str).length());
        sb.append(strValueOf);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ m d() {
        return super.d();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ wa e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ u3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ ha h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ j4 i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.v5
    public final /* bridge */ /* synthetic */ xa j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.y5
    protected final boolean o() {
        return false;
    }

    @com.google.android.gms.common.util.d0
    protected final void w(int r2, String str) {
        Log.println(r2, P(), str);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    protected final void y(int r8, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) throws IllegalStateException {
        String str2;
        if (!z && A(r8)) {
            w(r8, v(false, str, obj, obj2, obj3));
        }
        if (z2 || r8 < 5) {
            return;
        }
        com.google.android.gms.common.internal.r.k(str);
        u4 u4VarD = this.f6543a.D();
        if (u4VarD == null) {
            str2 = "Scheduler not set. Not logging error/warn";
        } else {
            if (u4VarD.p()) {
                if (r8 < 0) {
                    r8 = 0;
                }
                u4VarD.v(new v3(this, r8 >= 9 ? 8 : r8, str, obj, obj2, obj3));
                return;
            }
            str2 = "Scheduler not initialized. Not logging error/warn";
        }
        w(6, str2);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
