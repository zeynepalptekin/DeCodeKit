package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class st {

    /* renamed from: a, reason: collision with root package name */
    private final Context f5300a;

    /* renamed from: b, reason: collision with root package name */
    private final zt f5301b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f5302c;
    private mt d;

    public st(Context context, ViewGroup viewGroup, rw rwVar) {
        this(context, viewGroup, rwVar, null);
    }

    @com.google.android.gms.common.util.d0
    private st(Context context, ViewGroup viewGroup, zt ztVar, mt mtVar) {
        this.f5300a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f5302c = viewGroup;
        this.f5301b = ztVar;
        this.d = null;
    }

    public final void a() {
        com.google.android.gms.common.internal.r.f("onDestroy must be called from the UI thread.");
        mt mtVar = this.d;
        if (mtVar != null) {
            mtVar.j();
            this.f5302c.removeView(this.d);
            this.d = null;
        }
    }

    public final void b() {
        com.google.android.gms.common.internal.r.f("onPause must be called from the UI thread.");
        mt mtVar = this.d;
        if (mtVar != null) {
            mtVar.k();
        }
    }

    public final void c(int r12, int r13, int r14, int r15, int r16, boolean z, au auVar) {
        if (this.d != null) {
            return;
        }
        m0.a(this.f5301b.m().c(), this.f5301b.j0(), "vpr2");
        Context context = this.f5300a;
        zt ztVar = this.f5301b;
        mt mtVar = new mt(context, ztVar, r16, z, ztVar.m().c(), auVar);
        this.d = mtVar;
        this.f5302c.addView(mtVar, 0, new ViewGroup.LayoutParams(-1, -1));
        this.d.u(r12, r13, r14, r15);
        this.f5301b.G(false);
    }

    public final void d(int r2, int r3, int r4, int r5) {
        com.google.android.gms.common.internal.r.f("The underlay may only be modified from the UI thread.");
        mt mtVar = this.d;
        if (mtVar != null) {
            mtVar.u(r2, r3, r4, r5);
        }
    }

    public final mt e() {
        com.google.android.gms.common.internal.r.f("getAdVideoUnderlay must be called from the UI thread.");
        return this.d;
    }
}
