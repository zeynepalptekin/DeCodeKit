package androidx.appcompat.widget;

/* loaded from: classes.dex */
class q0 {
    public static final int i = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    private int f182a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f183b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f184c = Integer.MIN_VALUE;
    private int d = Integer.MIN_VALUE;
    private int e = 0;
    private int f = 0;
    private boolean g = false;
    private boolean h = false;

    q0() {
    }

    public int a() {
        return this.g ? this.f182a : this.f183b;
    }

    public int b() {
        return this.f182a;
    }

    public int c() {
        return this.f183b;
    }

    public int d() {
        return this.g ? this.f183b : this.f182a;
    }

    public void e(int r2, int r3) {
        this.h = false;
        if (r2 != Integer.MIN_VALUE) {
            this.e = r2;
            this.f182a = r2;
        }
        if (r3 != Integer.MIN_VALUE) {
            this.f = r3;
            this.f183b = r3;
        }
    }

    public void f(boolean z) {
        int r2;
        if (z == this.g) {
            return;
        }
        this.g = z;
        if (this.h) {
            if (z) {
                int r22 = this.d;
                if (r22 == Integer.MIN_VALUE) {
                    r22 = this.e;
                }
                this.f182a = r22;
                r2 = this.f184c;
                if (r2 == Integer.MIN_VALUE) {
                }
            } else {
                int r23 = this.f184c;
                if (r23 == Integer.MIN_VALUE) {
                    r23 = this.e;
                }
                this.f182a = r23;
                r2 = this.d;
                if (r2 == Integer.MIN_VALUE) {
                }
            }
            this.f183b = r2;
        }
        this.f182a = this.e;
        r2 = this.f;
        this.f183b = r2;
    }

    public void g(int r3, int r4) {
        this.f184c = r3;
        this.d = r4;
        this.h = true;
        if (this.g) {
            if (r4 != Integer.MIN_VALUE) {
                this.f182a = r4;
            }
            if (r3 != Integer.MIN_VALUE) {
                this.f183b = r3;
                return;
            }
            return;
        }
        if (r3 != Integer.MIN_VALUE) {
            this.f182a = r3;
        }
        if (r4 != Integer.MIN_VALUE) {
            this.f183b = r4;
        }
    }
}
