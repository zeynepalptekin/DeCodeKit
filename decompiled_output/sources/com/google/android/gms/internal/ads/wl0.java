package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wl0 {

    /* renamed from: a, reason: collision with root package name */
    m4 f5847a;

    /* renamed from: b, reason: collision with root package name */
    l4 f5848b;

    /* renamed from: c, reason: collision with root package name */
    a5 f5849c;
    z4 d;
    v8 e;
    final b.f.i<String, s4> f = new b.f.i<>();
    final b.f.i<String, r4> g = new b.f.i<>();

    public final wl0 a(z4 z4Var) {
        this.d = z4Var;
        return this;
    }

    public final ul0 b() {
        return new ul0(this);
    }

    public final wl0 c(l4 l4Var) {
        this.f5848b = l4Var;
        return this;
    }

    public final wl0 d(m4 m4Var) {
        this.f5847a = m4Var;
        return this;
    }

    public final wl0 e(a5 a5Var) {
        this.f5849c = a5Var;
        return this;
    }

    public final wl0 f(v8 v8Var) {
        this.e = v8Var;
        return this;
    }

    public final wl0 g(String str, s4 s4Var, r4 r4Var) {
        this.f.put(str, s4Var);
        this.g.put(str, r4Var);
        return this;
    }
}
