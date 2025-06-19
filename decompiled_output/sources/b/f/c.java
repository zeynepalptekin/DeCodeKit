package b.f;

/* loaded from: classes.dex */
public final class c<E> {

    /* renamed from: a, reason: collision with root package name */
    private E[] f885a;

    /* renamed from: b, reason: collision with root package name */
    private int f886b;

    /* renamed from: c, reason: collision with root package name */
    private int f887c;
    private int d;

    public c() {
        this(8);
    }

    public c(int r3) {
        if (r3 < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        }
        if (r3 > 1073741824) {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
        r3 = Integer.bitCount(r3) != 1 ? Integer.highestOneBit(r3 - 1) << 1 : r3;
        this.d = r3 - 1;
        this.f885a = (E[]) new Object[r3];
    }

    private void d() {
        E[] eArr = this.f885a;
        int length = eArr.length;
        int r2 = this.f886b;
        int r3 = length - r2;
        int r4 = length << 1;
        if (r4 < 0) {
            throw new RuntimeException("Max array capacity exceeded");
        }
        E[] eArr2 = (E[]) new Object[r4];
        System.arraycopy(eArr, r2, eArr2, 0, r3);
        System.arraycopy(this.f885a, 0, eArr2, r3, this.f886b);
        this.f885a = eArr2;
        this.f886b = 0;
        this.f887c = length;
        this.d = r4 - 1;
    }

    public void a(E e) {
        int r0 = (this.f886b - 1) & this.d;
        this.f886b = r0;
        this.f885a[r0] = e;
        if (r0 == this.f887c) {
            d();
        }
    }

    public void b(E e) {
        E[] eArr = this.f885a;
        int r1 = this.f887c;
        eArr[r1] = e;
        int r3 = this.d & (r1 + 1);
        this.f887c = r3;
        if (r3 == this.f886b) {
            d();
        }
    }

    public void c() {
        l(m());
    }

    public E e(int r3) {
        if (r3 < 0 || r3 >= m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.f885a[this.d & (this.f886b + r3)];
    }

    public E f() {
        int r0 = this.f886b;
        if (r0 != this.f887c) {
            return this.f885a[r0];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public E g() {
        int r0 = this.f886b;
        int r1 = this.f887c;
        if (r0 != r1) {
            return this.f885a[(r1 - 1) & this.d];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public boolean h() {
        return this.f886b == this.f887c;
    }

    public E i() {
        int r0 = this.f886b;
        if (r0 == this.f887c) {
            throw new ArrayIndexOutOfBoundsException();
        }
        E[] eArr = this.f885a;
        E e = eArr[r0];
        eArr[r0] = null;
        this.f886b = (r0 + 1) & this.d;
        return e;
    }

    public E j() {
        int r0 = this.f886b;
        int r1 = this.f887c;
        if (r0 == r1) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int r02 = this.d & (r1 - 1);
        E[] eArr = this.f885a;
        E e = eArr[r02];
        eArr[r02] = null;
        this.f887c = r02;
        return e;
    }

    public void k(int r5) {
        int r2;
        if (r5 <= 0) {
            return;
        }
        if (r5 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int r1 = this.f887c;
        int r0 = r5 < r1 ? r1 - r5 : 0;
        int r12 = r0;
        while (true) {
            r2 = this.f887c;
            if (r12 >= r2) {
                break;
            }
            this.f885a[r12] = null;
            r12++;
        }
        int r02 = r2 - r0;
        int r52 = r5 - r02;
        this.f887c = r2 - r02;
        if (r52 > 0) {
            int length = this.f885a.length;
            this.f887c = length;
            int r03 = length - r52;
            for (int r53 = r03; r53 < this.f887c; r53++) {
                this.f885a[r53] = null;
            }
            this.f887c = r03;
        }
    }

    public void l(int r5) {
        if (r5 <= 0) {
            return;
        }
        if (r5 > m()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int length = this.f885a.length;
        int r1 = this.f886b;
        if (r5 < length - r1) {
            length = r1 + r5;
        }
        for (int r12 = this.f886b; r12 < length; r12++) {
            this.f885a[r12] = null;
        }
        int r13 = this.f886b;
        int r0 = length - r13;
        int r52 = r5 - r0;
        this.f886b = this.d & (r13 + r0);
        if (r52 > 0) {
            for (int r02 = 0; r02 < r52; r02++) {
                this.f885a[r02] = null;
            }
            this.f886b = r52;
        }
    }

    public int m() {
        return (this.f887c - this.f886b) & this.d;
    }
}
