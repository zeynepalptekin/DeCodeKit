package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class c03 {

    /* renamed from: a, reason: collision with root package name */
    private final Date f2905a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2906b;

    /* renamed from: c, reason: collision with root package name */
    private final List<String> f2907c;
    private final int d;
    private final Set<String> e;
    private final Location f;
    private final boolean g;
    private final Bundle h;
    private final Map<Class<? extends com.google.android.gms.ads.mediation.b0>, com.google.android.gms.ads.mediation.b0> i;
    private final String j;
    private final String k;
    private final com.google.android.gms.ads.n0.b l;
    private final int m;
    private final Set<String> n;
    private final Bundle o;
    private final Set<String> p;
    private final boolean q;
    private final com.google.android.gms.ads.j0.a r;
    private final int s;
    private final String t;

    public c03(f03 f03Var) {
        this(f03Var, null);
    }

    public c03(f03 f03Var, com.google.android.gms.ads.n0.b bVar) {
        this.f2905a = f03Var.g;
        this.f2906b = f03Var.h;
        this.f2907c = f03Var.i;
        this.d = f03Var.j;
        this.e = Collections.unmodifiableSet(f03Var.f3349a);
        this.f = f03Var.k;
        this.g = f03Var.l;
        this.h = f03Var.f3350b;
        this.i = Collections.unmodifiableMap(f03Var.f3351c);
        this.j = f03Var.m;
        this.k = f03Var.n;
        this.l = bVar;
        this.m = f03Var.o;
        this.n = Collections.unmodifiableSet(f03Var.d);
        this.o = f03Var.e;
        this.p = Collections.unmodifiableSet(f03Var.f);
        this.q = f03Var.p;
        this.r = f03Var.q;
        this.s = f03Var.r;
        this.t = f03Var.s;
    }

    @Deprecated
    public final Date a() {
        return this.f2905a;
    }

    public final String b() {
        return this.f2906b;
    }

    public final Bundle c(Class<? extends com.google.android.gms.ads.mediation.customevent.a> cls) {
        Bundle bundle = this.h.getBundle("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
        if (bundle != null) {
            return bundle.getBundle(cls.getName());
        }
        return null;
    }

    public final Bundle d() {
        return this.o;
    }

    @Deprecated
    public final int e() {
        return this.d;
    }

    public final Set<String> f() {
        return this.e;
    }

    public final Location g() {
        return this.f;
    }

    public final boolean h() {
        return this.g;
    }

    @androidx.annotation.i0
    public final String i() {
        return this.t;
    }

    @Deprecated
    public final <T extends com.google.android.gms.ads.mediation.b0> T j(Class<T> cls) {
        return (T) this.i.get(cls);
    }

    public final Bundle k(Class<? extends com.google.android.gms.ads.mediation.m> cls) {
        return this.h.getBundle(cls.getName());
    }

    public final String l() {
        return this.j;
    }

    @Deprecated
    public final boolean m() {
        return this.q;
    }

    public final boolean n(Context context) {
        com.google.android.gms.ads.x xVarC = k03.v().c();
        qx2.a();
        String strL = jr.l(context);
        return this.n.contains(strL) || xVarC.d().contains(strL);
    }

    public final List<String> o() {
        return new ArrayList(this.f2907c);
    }

    public final String p() {
        return this.k;
    }

    public final com.google.android.gms.ads.n0.b q() {
        return this.l;
    }

    public final Map<Class<? extends com.google.android.gms.ads.mediation.b0>, com.google.android.gms.ads.mediation.b0> r() {
        return this.i;
    }

    public final Bundle s() {
        return this.h;
    }

    public final int t() {
        return this.m;
    }

    public final Set<String> u() {
        return this.p;
    }

    @androidx.annotation.i0
    public final com.google.android.gms.ads.j0.a v() {
        return this.r;
    }

    public final int w() {
        return this.s;
    }
}
