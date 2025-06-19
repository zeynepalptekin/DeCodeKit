package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class cn1 {

    /* renamed from: a, reason: collision with root package name */
    private jw2 f3000a;

    /* renamed from: b, reason: collision with root package name */
    private qw2 f3001b;

    /* renamed from: c, reason: collision with root package name */
    private vy2 f3002c;
    private String d;
    private m e;
    private boolean f;
    private ArrayList<String> g;
    private ArrayList<String> h;
    private z2 i;
    private vw2 j;
    private com.google.android.gms.ads.d0.m k;

    @androidx.annotation.i0
    private py2 l;
    private n8 n;
    private int m = 1;
    private tm1 o = new tm1();
    private boolean p = false;

    public final cn1 B(jw2 jw2Var) {
        this.f3000a = jw2Var;
        return this;
    }

    public final qw2 F() {
        return this.f3001b;
    }

    public final jw2 b() {
        return this.f3000a;
    }

    public final String c() {
        return this.d;
    }

    public final tm1 d() {
        return this.o;
    }

    public final an1 e() {
        com.google.android.gms.common.internal.r.l(this.d, "ad unit must not be null");
        com.google.android.gms.common.internal.r.l(this.f3001b, "ad size must not be null");
        com.google.android.gms.common.internal.r.l(this.f3000a, "ad request must not be null");
        return new an1(this);
    }

    public final boolean f() {
        return this.p;
    }

    public final cn1 g(com.google.android.gms.ads.d0.m mVar) {
        this.k = mVar;
        if (mVar != null) {
            this.f = mVar.i();
            this.l = mVar.j();
        }
        return this;
    }

    public final cn1 h(z2 z2Var) {
        this.i = z2Var;
        return this;
    }

    public final cn1 i(n8 n8Var) {
        this.n = n8Var;
        this.e = new m(false, true, false);
        return this;
    }

    public final cn1 j(vw2 vw2Var) {
        this.j = vw2Var;
        return this;
    }

    public final cn1 l(boolean z) {
        this.p = z;
        return this;
    }

    public final cn1 m(boolean z) {
        this.f = z;
        return this;
    }

    public final cn1 n(m mVar) {
        this.e = mVar;
        return this;
    }

    public final cn1 o(an1 an1Var) {
        this.o.b(an1Var.n);
        this.f3000a = an1Var.d;
        this.f3001b = an1Var.e;
        this.f3002c = an1Var.f2719a;
        this.d = an1Var.f;
        this.e = an1Var.f2720b;
        this.g = an1Var.g;
        this.h = an1Var.h;
        this.i = an1Var.i;
        this.j = an1Var.j;
        cn1 cn1VarG = g(an1Var.l);
        cn1VarG.p = an1Var.o;
        return cn1VarG;
    }

    public final cn1 p(vy2 vy2Var) {
        this.f3002c = vy2Var;
        return this;
    }

    public final cn1 q(ArrayList<String> arrayList) {
        this.g = arrayList;
        return this;
    }

    public final cn1 s(ArrayList<String> arrayList) {
        this.h = arrayList;
        return this;
    }

    public final cn1 u(qw2 qw2Var) {
        this.f3001b = qw2Var;
        return this;
    }

    public final cn1 w(int r1) {
        this.m = r1;
        return this;
    }

    public final cn1 z(String str) {
        this.d = str;
        return this;
    }
}
