package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class f4 {
    private long A;
    private long B;
    private long C;
    private String D;
    private boolean E;
    private long F;
    private long G;

    /* renamed from: a, reason: collision with root package name */
    private final b5 f6385a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6386b;

    /* renamed from: c, reason: collision with root package name */
    private String f6387c;
    private String d;
    private String e;
    private String f;
    private long g;
    private long h;
    private long i;
    private String j;
    private long k;
    private String l;
    private long m;
    private long n;
    private boolean o;
    private long p;
    private boolean q;
    private boolean r;
    private String s;
    private Boolean t;
    private long u;
    private List<String> v;
    private String w;
    private long x;
    private long y;
    private long z;

    @androidx.annotation.y0
    f4(b5 b5Var, String str) {
        com.google.android.gms.common.internal.r.k(b5Var);
        com.google.android.gms.common.internal.r.g(str);
        this.f6385a = b5Var;
        this.f6386b = str;
        b5Var.x().c();
    }

    @androidx.annotation.y0
    public final String A() {
        this.f6385a.x().c();
        return this.d;
    }

    @androidx.annotation.y0
    public final void B(long j) {
        this.f6385a.x().c();
        this.E |= this.n != j;
        this.n = j;
    }

    @androidx.annotation.y0
    public final void C(String str) {
        this.f6385a.x().c();
        this.E |= !ha.B0(this.e, str);
        this.e = str;
    }

    @androidx.annotation.y0
    public final String D() {
        this.f6385a.x().c();
        return this.s;
    }

    @androidx.annotation.y0
    public final void E(long j) {
        this.f6385a.x().c();
        this.E |= this.u != j;
        this.u = j;
    }

    @androidx.annotation.y0
    public final void F(String str) {
        this.f6385a.x().c();
        this.E |= !ha.B0(this.f, str);
        this.f = str;
    }

    @androidx.annotation.y0
    public final String G() {
        this.f6385a.x().c();
        return this.w;
    }

    @androidx.annotation.y0
    public final void H(long j) {
        com.google.android.gms.common.internal.r.a(j >= 0);
        this.f6385a.x().c();
        this.E = (this.g != j) | this.E;
        this.g = j;
    }

    @androidx.annotation.y0
    public final void I(String str) {
        this.f6385a.x().c();
        this.E |= !ha.B0(this.j, str);
        this.j = str;
    }

    @androidx.annotation.y0
    public final String J() {
        this.f6385a.x().c();
        return this.e;
    }

    @androidx.annotation.y0
    public final void K(long j) {
        this.f6385a.x().c();
        this.E |= this.F != j;
        this.F = j;
    }

    @androidx.annotation.y0
    public final void L(String str) {
        this.f6385a.x().c();
        this.E |= !ha.B0(this.l, str);
        this.l = str;
    }

    @androidx.annotation.y0
    public final String M() {
        this.f6385a.x().c();
        return this.f;
    }

    @androidx.annotation.y0
    public final void N(long j) {
        this.f6385a.x().c();
        this.E |= this.G != j;
        this.G = j;
    }

    @androidx.annotation.y0
    public final void O(String str) {
        this.f6385a.x().c();
        this.E |= !ha.B0(this.D, str);
        this.D = str;
    }

    @androidx.annotation.y0
    public final long P() {
        this.f6385a.x().c();
        return this.h;
    }

    @androidx.annotation.y0
    public final void Q(long j) {
        this.f6385a.x().c();
        this.E |= this.x != j;
        this.x = j;
    }

    @androidx.annotation.y0
    public final long R() {
        this.f6385a.x().c();
        return this.i;
    }

    @androidx.annotation.y0
    public final void S(long j) {
        this.f6385a.x().c();
        this.E |= this.y != j;
        this.y = j;
    }

    @androidx.annotation.y0
    public final String T() {
        this.f6385a.x().c();
        return this.j;
    }

    @androidx.annotation.y0
    public final void U(long j) {
        this.f6385a.x().c();
        this.E |= this.z != j;
        this.z = j;
    }

    @androidx.annotation.y0
    public final long V() {
        this.f6385a.x().c();
        return this.k;
    }

    @androidx.annotation.y0
    public final void W(long j) {
        this.f6385a.x().c();
        this.E |= this.A != j;
        this.A = j;
    }

    @androidx.annotation.y0
    public final String X() {
        this.f6385a.x().c();
        return this.l;
    }

    @androidx.annotation.y0
    public final void Y(long j) {
        this.f6385a.x().c();
        this.E |= this.C != j;
        this.C = j;
    }

    @androidx.annotation.y0
    public final long Z() {
        this.f6385a.x().c();
        return this.m;
    }

    @androidx.annotation.y0
    public final void a(long j) {
        this.f6385a.x().c();
        this.E |= this.h != j;
        this.h = j;
    }

    @androidx.annotation.y0
    public final void a0(long j) {
        this.f6385a.x().c();
        this.E |= this.B != j;
        this.B = j;
    }

    @androidx.annotation.y0
    public final void b(Boolean bool) {
        this.f6385a.x().c();
        this.E |= !ha.c0(this.t, bool);
        this.t = bool;
    }

    @androidx.annotation.y0
    public final long b0() {
        this.f6385a.x().c();
        return this.n;
    }

    @androidx.annotation.y0
    public final void c(String str) {
        this.f6385a.x().c();
        this.E |= !ha.B0(this.f6387c, str);
        this.f6387c = str;
    }

    @androidx.annotation.y0
    public final void c0(long j) {
        this.f6385a.x().c();
        this.E |= this.p != j;
        this.p = j;
    }

    @androidx.annotation.y0
    public final void d(@androidx.annotation.i0 List<String> list) {
        this.f6385a.x().c();
        if (ha.o0(this.v, list)) {
            return;
        }
        this.E = true;
        this.v = list != null ? new ArrayList(list) : null;
    }

    @androidx.annotation.y0
    public final long d0() {
        this.f6385a.x().c();
        return this.u;
    }

    @androidx.annotation.y0
    public final void e(boolean z) {
        this.f6385a.x().c();
        this.E |= this.o != z;
        this.o = z;
    }

    @androidx.annotation.y0
    public final boolean e0() {
        this.f6385a.x().c();
        return this.o;
    }

    @androidx.annotation.y0
    public final boolean f() {
        this.f6385a.x().c();
        return this.E;
    }

    @androidx.annotation.y0
    public final long f0() {
        this.f6385a.x().c();
        return this.g;
    }

    @androidx.annotation.y0
    public final long g() {
        this.f6385a.x().c();
        return this.C;
    }

    @androidx.annotation.y0
    public final long g0() {
        this.f6385a.x().c();
        return this.F;
    }

    @androidx.annotation.y0
    public final long h() {
        this.f6385a.x().c();
        return this.B;
    }

    @androidx.annotation.y0
    public final long h0() {
        this.f6385a.x().c();
        return this.G;
    }

    @androidx.annotation.y0
    public final String i() {
        this.f6385a.x().c();
        return this.D;
    }

    @androidx.annotation.y0
    public final void i0() {
        this.f6385a.x().c();
        long j = this.g + 1;
        if (j > 2147483647L) {
            this.f6385a.B().I().b("Bundle index overflow. appId", w3.t(this.f6386b));
            j = 0;
        }
        this.E = true;
        this.g = j;
    }

    @androidx.annotation.y0
    public final String j() {
        this.f6385a.x().c();
        String str = this.D;
        O(null);
        return str;
    }

    @androidx.annotation.y0
    public final long j0() {
        this.f6385a.x().c();
        return this.x;
    }

    @androidx.annotation.y0
    public final long k() {
        this.f6385a.x().c();
        return this.p;
    }

    @androidx.annotation.y0
    public final long k0() {
        this.f6385a.x().c();
        return this.y;
    }

    @androidx.annotation.y0
    public final boolean l() {
        this.f6385a.x().c();
        return this.q;
    }

    @androidx.annotation.y0
    public final long l0() {
        this.f6385a.x().c();
        return this.z;
    }

    @androidx.annotation.y0
    public final boolean m() {
        this.f6385a.x().c();
        return this.r;
    }

    @androidx.annotation.y0
    public final long m0() {
        this.f6385a.x().c();
        return this.A;
    }

    @androidx.annotation.y0
    public final Boolean n() {
        this.f6385a.x().c();
        return this.t;
    }

    @androidx.annotation.i0
    @androidx.annotation.y0
    public final List<String> o() {
        this.f6385a.x().c();
        return this.v;
    }

    @androidx.annotation.y0
    public final void p() {
        this.f6385a.x().c();
        this.E = false;
    }

    @androidx.annotation.y0
    public final void q(long j) {
        this.f6385a.x().c();
        this.E |= this.i != j;
        this.i = j;
    }

    @androidx.annotation.y0
    public final void r(String str) {
        this.f6385a.x().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !ha.B0(this.d, str);
        this.d = str;
    }

    @androidx.annotation.y0
    public final void s(boolean z) {
        this.f6385a.x().c();
        this.E |= this.q != z;
        this.q = z;
    }

    @androidx.annotation.y0
    public final String t() {
        this.f6385a.x().c();
        return this.f6386b;
    }

    @androidx.annotation.y0
    public final void u(long j) {
        this.f6385a.x().c();
        this.E |= this.k != j;
        this.k = j;
    }

    @androidx.annotation.y0
    public final void v(String str) {
        this.f6385a.x().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !ha.B0(this.s, str);
        this.s = str;
    }

    @androidx.annotation.y0
    public final void w(boolean z) {
        this.f6385a.x().c();
        this.E |= this.r != z;
        this.r = z;
    }

    @androidx.annotation.y0
    public final String x() {
        this.f6385a.x().c();
        return this.f6387c;
    }

    @androidx.annotation.y0
    public final void y(long j) {
        this.f6385a.x().c();
        this.E |= this.m != j;
        this.m = j;
    }

    @androidx.annotation.y0
    public final void z(String str) {
        this.f6385a.x().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !ha.B0(this.w, str);
        this.w = str;
    }
}
