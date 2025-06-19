package c.a.b.b.g.c;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class l6 {

    /* renamed from: a, reason: collision with root package name */
    int f1759a;

    /* renamed from: b, reason: collision with root package name */
    int f1760b;

    /* renamed from: c, reason: collision with root package name */
    private int f1761c;
    m6 d;
    private boolean e;

    private l6() {
        this.f1760b = 100;
        this.f1761c = ActivityChooserView.f.j;
        this.e = false;
    }

    public static long b(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    static l6 c(byte[] bArr, int r7, int r8, boolean z) {
        n6 n6Var = new n6(bArr, r8);
        try {
            n6Var.h(r8);
            return n6Var;
        } catch (q7 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int k(int r1) {
        return (-(r1 & 1)) ^ (r1 >>> 1);
    }

    public abstract boolean A() throws IOException;

    public abstract int B();

    public abstract int a() throws IOException;

    public abstract void d(int r1) throws q7;

    public abstract double e() throws IOException;

    public abstract boolean f(int r1) throws IOException;

    public abstract float g() throws IOException;

    public abstract int h(int r1) throws q7;

    public abstract long i() throws IOException;

    public abstract void j(int r1);

    public abstract long l() throws IOException;

    public abstract int m() throws IOException;

    public abstract long n() throws IOException;

    public abstract int o() throws IOException;

    public abstract boolean p() throws IOException;

    public abstract String q() throws IOException;

    public abstract String r() throws IOException;

    public abstract y5 s() throws IOException;

    public abstract int t() throws IOException;

    public abstract int u() throws IOException;

    public abstract int v() throws IOException;

    public abstract long w() throws IOException;

    public abstract int x() throws IOException;

    public abstract long y() throws IOException;

    abstract long z() throws IOException;
}
