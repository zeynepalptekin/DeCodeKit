package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public abstract class qh2 implements li2, mi2 {

    /* renamed from: a, reason: collision with root package name */
    private final int f5014a;

    /* renamed from: b, reason: collision with root package name */
    private oi2 f5015b;

    /* renamed from: c, reason: collision with root package name */
    private int f5016c;
    private int d;
    private ho2 e;
    private long f;
    private boolean g = true;
    private boolean h;

    public qh2(int r1) {
        this.f5014a = r1;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void A0() {
        vp2.e(this.d == 1);
        this.d = 0;
        this.e = null;
        this.h = false;
        p();
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public aq2 C0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final boolean D0() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void E0(long j) throws sh2 {
        this.h = false;
        this.g = false;
        k(j, false);
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void F0(di2[] di2VarArr, ho2 ho2Var, long j) throws sh2 {
        vp2.e(!this.h);
        this.e = ho2Var;
        this.g = false;
        this.f = j;
        l(di2VarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final ho2 G0() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void H0() throws IOException {
        this.e.c();
    }

    @Override // com.google.android.gms.internal.ads.li2, com.google.android.gms.internal.ads.mi2
    public final int a() {
        return this.f5014a;
    }

    @Override // com.google.android.gms.internal.ads.li2
    public int c() throws sh2 {
        return 0;
    }

    protected final int g() {
        return this.f5016c;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final int getState() {
        return this.d;
    }

    protected void h() throws sh2 {
    }

    protected void i() throws sh2 {
    }

    protected final int j(fi2 fi2Var, bk2 bk2Var, boolean z) {
        int r8 = this.e.b(fi2Var, bk2Var, z);
        if (r8 == -4) {
            if (bk2Var.f()) {
                this.g = true;
                return this.h ? -4 : -3;
            }
            bk2Var.d += this.f;
        } else if (r8 == -5) {
            di2 di2Var = fi2Var.f3412a;
            long j = di2Var.z;
            if (j != Long.MAX_VALUE) {
                fi2Var.f3412a = di2Var.m(j + this.f);
            }
        }
        return r8;
    }

    protected void k(long j, boolean z) throws sh2 {
    }

    protected void l(di2[] di2VarArr, long j) throws sh2 {
    }

    @Override // com.google.android.gms.internal.ads.th2
    public void m(int r1, Object obj) throws sh2 {
    }

    protected final void n(long j) {
        this.e.a(j - this.f);
    }

    protected void o(boolean z) throws sh2 {
    }

    protected void p() {
    }

    protected final oi2 q() {
        return this.f5015b;
    }

    protected final boolean r() {
        return this.g ? this.h : this.e.t0();
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void start() throws sh2 {
        vp2.e(this.d == 1);
        this.d = 2;
        h();
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void stop() throws sh2 {
        vp2.e(this.d == 2);
        this.d = 1;
        i();
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final boolean v0() {
        return this.g;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void w0(int r1) {
        this.f5016c = r1;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void x0() {
        this.h = true;
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final void y0(oi2 oi2Var, di2[] di2VarArr, ho2 ho2Var, long j, boolean z, long j2) throws sh2 {
        vp2.e(this.d == 0);
        this.f5015b = oi2Var;
        this.d = 1;
        o(z);
        F0(di2VarArr, ho2Var, j2);
        k(j, z);
    }

    @Override // com.google.android.gms.internal.ads.mi2
    public final li2 z0() {
        return this;
    }
}
