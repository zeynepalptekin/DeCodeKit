package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.d0.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class an1 {

    /* renamed from: a, reason: collision with root package name */
    @androidx.annotation.i0
    public final vy2 f2719a;

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    public final m f2720b;

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    public final n8 f2721c;
    public final jw2 d;
    public final qw2 e;
    public final String f;
    public final ArrayList<String> g;
    public final ArrayList<String> h;
    public final z2 i;
    public final vw2 j;
    public final int k;
    public final com.google.android.gms.ads.d0.m l;
    public final py2 m;
    public final rm1 n;
    public final boolean o;

    private an1(cn1 cn1Var) {
        this.e = cn1Var.f3001b;
        this.f = cn1Var.d;
        this.f2719a = cn1Var.f3002c;
        this.d = new jw2(cn1Var.f3000a.d, cn1Var.f3000a.e, cn1Var.f3000a.f, cn1Var.f3000a.g, cn1Var.f3000a.h, cn1Var.f3000a.i, cn1Var.f3000a.j, cn1Var.f3000a.k || cn1Var.f, cn1Var.f3000a.l, cn1Var.f3000a.m, cn1Var.f3000a.n, cn1Var.f3000a.o, cn1Var.f3000a.p, cn1Var.f3000a.q, cn1Var.f3000a.r, cn1Var.f3000a.s, cn1Var.f3000a.t, cn1Var.f3000a.u, cn1Var.f3000a.v, cn1Var.f3000a.w, cn1Var.f3000a.x, cn1Var.f3000a.y);
        this.f2720b = cn1Var.e != null ? cn1Var.e : cn1Var.i != null ? cn1Var.i.i : null;
        this.g = cn1Var.g;
        this.h = cn1Var.h;
        this.i = cn1Var.g == null ? null : cn1Var.i == null ? new z2(new d.b().a()) : cn1Var.i;
        this.j = cn1Var.j;
        this.k = cn1Var.m;
        this.l = cn1Var.k;
        this.m = cn1Var.l;
        this.f2721c = cn1Var.n;
        this.n = new rm1(cn1Var.o);
        this.o = cn1Var.p;
    }

    public final f5 a() {
        com.google.android.gms.ads.d0.m mVar = this.l;
        if (mVar == null) {
            return null;
        }
        return mVar.l();
    }
}
