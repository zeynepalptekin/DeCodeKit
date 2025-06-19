package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class m82 {

    /* renamed from: a, reason: collision with root package name */
    int f4363a;

    /* renamed from: b, reason: collision with root package name */
    int f4364b;

    /* renamed from: c, reason: collision with root package name */
    int f4365c;
    t82 d;
    private boolean e;

    private m82() {
        this.f4364b = 100;
        this.f4365c = ActivityChooserView.f.j;
        this.e = false;
    }

    public static int B(int r1) {
        return (-(r1 & 1)) ^ (r1 >>> 1);
    }

    static m82 d(byte[] bArr, int r8, int r9, boolean z) {
        o82 o82Var = new o82(bArr, r8, r9, z);
        try {
            o82Var.z(r9);
            return o82Var;
        } catch (w92 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static long w(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract void A(int r1);

    public abstract double a() throws IOException;

    public abstract float b() throws IOException;

    public abstract String c() throws IOException;

    public abstract int e() throws IOException;

    public abstract long f() throws IOException;

    public abstract long g() throws IOException;

    public abstract int h() throws IOException;

    public abstract long i() throws IOException;

    public abstract int j() throws IOException;

    public abstract boolean k() throws IOException;

    public abstract String l() throws IOException;

    public abstract a82 m() throws IOException;

    public abstract int n() throws IOException;

    public abstract int o() throws IOException;

    public abstract int p() throws IOException;

    public abstract long q() throws IOException;

    public abstract int r() throws IOException;

    public abstract long s() throws IOException;

    abstract long t() throws IOException;

    public abstract boolean u() throws IOException;

    public abstract int v();

    public abstract void x(int r1) throws w92;

    public abstract boolean y(int r1) throws IOException;

    public abstract int z(int r1) throws w92;
}
