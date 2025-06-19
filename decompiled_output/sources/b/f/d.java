package b.f;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private int[] f888a;

    /* renamed from: b, reason: collision with root package name */
    private int f889b;

    /* renamed from: c, reason: collision with root package name */
    private int f890c;
    private int d;

    public d() {
        this(8);
    }

    public d(int r3) {
        if (r3 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (r3 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        r3 = Integer.bitCount(r3) != 1 ? Integer.highestOneBit(r3 - 1) << 1 : r3;
        this.d = r3 - 1;
        this.f888a = new int[r3];
    }

    private void d() {
        int[] r0 = this.f888a;
        int length = r0.length;
        int r2 = this.f889b;
        int r3 = length - r2;
        int r4 = length << 1;
        if (r4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        int[] r5 = new int[r4];
        System.arraycopy(r0, r2, r5, 0, r3);
        System.arraycopy(this.f888a, 0, r5, r3, this.f889b);
        this.f888a = r5;
        this.f889b = 0;
        this.f890c = length;
        this.d = r4 - 1;
    }

    public void a(int r3) {
        int r0 = (this.f889b - 1) & this.d;
        this.f889b = r0;
        this.f888a[r0] = r3;
        if (r0 == this.f890c) {
            d();
        }
    }

    public void b(int r3) {
        int[] r0 = this.f888a;
        int r1 = this.f890c;
        r0[r1] = r3;
        int r32 = this.d & (r1 + 1);
        this.f890c = r32;
        if (r32 == this.f889b) {
            d();
        }
    }

    public void c() {
        this.f890c = this.f889b;
    }

    public int e(int r3) {
        if (r3 < 0 || r3 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f888a[this.d & (this.f889b + r3)];
    }

    public int f() {
        int r0 = this.f889b;
        if (r0 != this.f890c) {
            return this.f888a[r0];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public int g() {
        int r0 = this.f889b;
        int r1 = this.f890c;
        if (r0 != r1) {
            return this.f888a[(r1 - 1) & this.d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f889b == this.f890c;
    }

    public int i() {
        int r0 = this.f889b;
        if (r0 == this.f890c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int r1 = this.f888a[r0];
        this.f889b = (r0 + 1) & this.d;
        return r1;
    }

    public int j() {
        int r0 = this.f889b;
        int r1 = this.f890c;
        if (r0 == r1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int r02 = this.d & (r1 - 1);
        int r12 = this.f888a[r02];
        this.f890c = r02;
        return r12;
    }

    public void k(int r2) {
        if (r2 <= 0) {
            return;
        }
        if (r2 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f890c = this.d & (this.f890c - r2);
    }

    public void l(int r2) {
        if (r2 <= 0) {
            return;
        }
        if (r2 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        this.f889b = this.d & (this.f889b + r2);
    }

    public int m() {
        return (this.f890c - this.f889b) & this.d;
    }
}
