package b.g.a.i;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f948a;

    /* renamed from: b, reason: collision with root package name */
    public int f949b;

    /* renamed from: c, reason: collision with root package name */
    public int f950c;
    public int d;

    public boolean a(int r3, int r4) {
        int r32;
        int r0 = this.f948a;
        return r3 >= r0 && r3 < r0 + this.f950c && r4 >= (r32 = this.f949b) && r4 < r32 + this.d;
    }

    public int b() {
        return (this.f948a + this.f950c) / 2;
    }

    public int c() {
        return (this.f949b + this.d) / 2;
    }

    void d(int r2, int r3) {
        this.f948a -= r2;
        this.f949b -= r3;
        this.f950c += r2 * 2;
        this.d += r3 * 2;
    }

    boolean e(n nVar) {
        int r0;
        int r1;
        int r02 = this.f948a;
        int r12 = nVar.f948a;
        return r02 >= r12 && r02 < r12 + nVar.f950c && (r0 = this.f949b) >= (r1 = nVar.f949b) && r0 < r1 + nVar.d;
    }

    public void f(int r1, int r2, int r3, int r4) {
        this.f948a = r1;
        this.f949b = r2;
        this.f950c = r3;
        this.d = r4;
    }
}
