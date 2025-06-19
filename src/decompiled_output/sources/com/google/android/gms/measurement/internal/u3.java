package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class u3 extends y5 {

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReference<String[]> f6531c = new AtomicReference<>();
    private static final AtomicReference<String[]> d = new AtomicReference<>();
    private static final AtomicReference<String[]> e = new AtomicReference<>();

    u3(b5 b5Var) {
        super(b5Var);
    }

    @androidx.annotation.i0
    private static String t(String str, String[] strArr, String[] strArr2, AtomicReference<String[]> atomicReference) {
        String str2;
        com.google.android.gms.common.internal.r.k(strArr);
        com.google.android.gms.common.internal.r.k(strArr2);
        com.google.android.gms.common.internal.r.k(atomicReference);
        com.google.android.gms.common.internal.r.a(strArr.length == strArr2.length);
        for (int r2 = 0; r2 < strArr.length; r2++) {
            if (ha.B0(str, strArr[r2])) {
                synchronized (atomicReference) {
                    String[] strArr3 = atomicReference.get();
                    if (strArr3 == null) {
                        strArr3 = new String[strArr2.length];
                        atomicReference.set(strArr3);
                    }
                    if (strArr3[r2] == null) {
                        strArr3[r2] = strArr2[r2] + "(" + strArr[r2] + ")";
                    }
                    str2 = strArr3[r2];
                }
                return str2;
            }
        }
        return str;
    }

    @androidx.annotation.i0
    private final String u(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Object obj : objArr) {
            String strQ = obj instanceof Bundle ? q((Bundle) obj) : String.valueOf(obj);
            if (strQ != null) {
                if (sb.length() != 1) {
                    sb.append(", ");
                }
                sb.append(strQ);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private final boolean y() {
        return this.f6543a.J() && this.f6543a.B().A(3);
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ w3 B() {
        return super.B();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ Context F() {
        return super.F();
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

    @androidx.annotation.i0
    protected final String q(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!y()) {
            return bundle.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sb.length() != 8) {
                sb.append(", ");
            }
            sb.append(v(str));
            sb.append("=");
            Object obj = bundle.get(str);
            sb.append(obj instanceof Bundle ? u(new Object[]{obj}) : obj instanceof Object[] ? u((Object[]) obj) : obj instanceof ArrayList ? u(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sb.append("}]");
        return sb.toString();
    }

    @androidx.annotation.i0
    protected final String r(s sVar) {
        if (sVar == null) {
            return null;
        }
        if (!y()) {
            return sVar.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("origin=");
        sb.append(sVar.f);
        sb.append(",name=");
        sb.append(s(sVar.d));
        sb.append(",params=");
        n nVar = sVar.e;
        sb.append(nVar != null ? !y() ? nVar.toString() : q(nVar.l()) : null);
        return sb.toString();
    }

    @androidx.annotation.i0
    protected final String s(String str) {
        if (str == null) {
            return null;
        }
        return !y() ? str : t(str, z5.f6579c, z5.f6577a, f6531c);
    }

    @androidx.annotation.i0
    protected final String v(String str) {
        if (str == null) {
            return null;
        }
        return !y() ? str : t(str, c6.f6366b, c6.f6365a, d);
    }

    @androidx.annotation.i0
    protected final String w(String str) {
        if (str == null) {
            return null;
        }
        if (!y()) {
            return str;
        }
        if (!str.startsWith("_exp_")) {
            return t(str, b6.f6358b, b6.f6357a, e);
        }
        return "experiment_id(" + str + ")";
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ u4 x() {
        return super.x();
    }

    @Override // com.google.android.gms.measurement.internal.v5, com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.g z() {
        return super.z();
    }
}
