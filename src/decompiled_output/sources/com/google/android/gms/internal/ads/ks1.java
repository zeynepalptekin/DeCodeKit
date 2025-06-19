package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.fm0;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ks1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f4144a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f4145b;

    /* renamed from: c, reason: collision with root package name */
    private final xr1 f4146c;
    private final yr1 d;
    private final qs1 e;
    private final qs1 f;
    private c.a.b.b.k.m<fm0.a> g;
    private c.a.b.b.k.m<fm0.a> h;

    @com.google.android.gms.common.util.d0
    private ks1(Context context, Executor executor, xr1 xr1Var, yr1 yr1Var, os1 os1Var, rs1 rs1Var) {
        this.f4144a = context;
        this.f4145b = executor;
        this.f4146c = xr1Var;
        this.d = yr1Var;
        this.e = os1Var;
        this.f = rs1Var;
    }

    private static fm0.a a(@androidx.annotation.h0 c.a.b.b.k.m<fm0.a> mVar, @androidx.annotation.h0 fm0.a aVar) {
        return !mVar.v() ? aVar : mVar.r();
    }

    public static ks1 b(@androidx.annotation.h0 Context context, @androidx.annotation.h0 Executor executor, @androidx.annotation.h0 xr1 xr1Var, @androidx.annotation.h0 yr1 yr1Var) {
        final ks1 ks1Var = new ks1(context, executor, xr1Var, yr1Var, new os1(), new rs1());
        ks1Var.g = ks1Var.d.b() ? ks1Var.h(new Callable(ks1Var) { // from class: com.google.android.gms.internal.ads.ns1

            /* renamed from: a, reason: collision with root package name */
            private final ks1 f4603a;

            {
                this.f4603a = ks1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4603a.e();
            }
        }) : c.a.b.b.k.p.g(ks1Var.e.a());
        ks1Var.h = ks1Var.h(new Callable(ks1Var) { // from class: com.google.android.gms.internal.ads.ms1

            /* renamed from: a, reason: collision with root package name */
            private final ks1 f4449a;

            {
                this.f4449a = ks1Var;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4449a.d();
            }
        });
        return ks1Var;
    }

    private final c.a.b.b.k.m<fm0.a> h(@androidx.annotation.h0 Callable<fm0.a> callable) {
        return c.a.b.b.k.p.d(this.f4145b, callable).i(this.f4145b, new c.a.b.b.k.g(this) { // from class: com.google.android.gms.internal.ads.ps1

            /* renamed from: a, reason: collision with root package name */
            private final ks1 f4884a;

            {
                this.f4884a = this;
            }

            @Override // c.a.b.b.k.g
            public final void e(Exception exc) {
                this.f4884a.f(exc);
            }
        });
    }

    public final fm0.a c() {
        return a(this.g, this.e.a());
    }

    final /* synthetic */ fm0.a d() throws Exception {
        return this.f.b(this.f4144a);
    }

    final /* synthetic */ fm0.a e() throws Exception {
        return this.e.b(this.f4144a);
    }

    final /* synthetic */ void f(Exception exc) {
        if (exc instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
        this.f4146c.b(2025, -1L, exc);
    }

    public final fm0.a g() {
        return a(this.h, this.f.a());
    }
}
