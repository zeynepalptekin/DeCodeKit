package com.google.android.gms.internal.ads;

import java.util.LinkedList;

/* loaded from: classes.dex */
final class so1 {

    /* renamed from: b, reason: collision with root package name */
    private final int f5287b;

    /* renamed from: c, reason: collision with root package name */
    private final int f5288c;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedList<cp1<?>> f5286a = new LinkedList<>();
    private final pp1 d = new pp1();

    public so1(int r2, int r3) {
        this.f5287b = r2;
        this.f5288c = r3;
    }

    private final void h() {
        while (!this.f5286a.isEmpty()) {
            if (!(com.google.android.gms.ads.internal.p.j().a() - this.f5286a.getFirst().d >= ((long) this.f5288c))) {
                return;
            }
            this.d.g();
            this.f5286a.remove();
        }
    }

    public final long a() {
        return this.d.a();
    }

    public final int b() {
        h();
        return this.f5286a.size();
    }

    public final cp1<?> c() {
        this.d.e();
        h();
        if (this.f5286a.isEmpty()) {
            return null;
        }
        cp1<?> cp1VarRemove = this.f5286a.remove();
        if (cp1VarRemove != null) {
            this.d.f();
        }
        return cp1VarRemove;
    }

    public final long d() {
        return this.d.b();
    }

    public final int e() {
        return this.d.c();
    }

    public final String f() {
        return this.d.d();
    }

    public final tp1 g() {
        return this.d.h();
    }

    public final boolean i(cp1<?> cp1Var) {
        this.d.e();
        h();
        if (this.f5286a.size() == this.f5287b) {
            return false;
        }
        this.f5286a.add(cp1Var);
        return true;
    }
}
