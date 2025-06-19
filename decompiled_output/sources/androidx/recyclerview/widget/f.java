package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class f implements t {
    private static final int i = 0;
    private static final int j = 1;
    private static final int k = 2;
    private static final int l = 3;
    final t d;
    int e = 0;
    int f = -1;
    int g = -1;
    Object h = null;

    public f(@androidx.annotation.h0 t tVar) {
        this.d = tVar;
    }

    @Override // androidx.recyclerview.widget.t
    public void a(int r4, int r5) {
        int r0;
        if (this.e == 2 && (r0 = this.f) >= r4 && r0 <= r4 + r5) {
            this.g += r5;
            this.f = r4;
        } else {
            e();
            this.f = r4;
            this.g = r5;
            this.e = 2;
        }
    }

    @Override // androidx.recyclerview.widget.t
    public void b(int r2, int r3) {
        e();
        this.d.b(r2, r3);
    }

    @Override // androidx.recyclerview.widget.t
    public void c(int r5, int r6) {
        int r0;
        if (this.e == 1 && r5 >= (r0 = this.f)) {
            int r2 = this.g;
            if (r5 <= r0 + r2) {
                this.g = r2 + r6;
                this.f = Math.min(r5, r0);
                return;
            }
        }
        e();
        this.f = r5;
        this.g = r6;
        this.e = 1;
    }

    @Override // androidx.recyclerview.widget.t
    public void d(int r6, int r7, Object obj) {
        int r3;
        if (this.e == 3) {
            int r0 = this.f;
            int r2 = this.g;
            if (r6 <= r0 + r2 && (r3 = r6 + r7) >= r0 && this.h == obj) {
                this.f = Math.min(r6, r0);
                this.g = Math.max(r2 + r0, r3) - this.f;
                return;
            }
        }
        e();
        this.f = r6;
        this.g = r7;
        this.h = obj;
        this.e = 3;
    }

    public void e() {
        int r0 = this.e;
        if (r0 == 0) {
            return;
        }
        if (r0 == 1) {
            this.d.c(this.f, this.g);
        } else if (r0 == 2) {
            this.d.a(this.f, this.g);
        } else if (r0 == 3) {
            this.d.d(this.f, this.g, this.h);
        }
        this.h = null;
        this.e = 0;
    }
}
