package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
final class rb2 extends a82 {
    static final int[] m = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, ActivityChooserView.f.j};
    private final int h;
    private final a82 i;
    private final a82 j;
    private final int k;
    private final int l;

    private rb2(a82 a82Var, a82 a82Var2) {
        this.i = a82Var;
        this.j = a82Var2;
        int size = a82Var.size();
        this.k = size;
        this.h = size + a82Var2.size();
        this.l = Math.max(a82Var.y(), a82Var2.y()) + 1;
    }

    /* synthetic */ rb2(a82 a82Var, a82 a82Var2, qb2 qb2Var) {
        this(a82Var, a82Var2);
    }

    static a82 W(a82 a82Var, a82 a82Var2) {
        if (a82Var2.size() == 0) {
            return a82Var;
        }
        if (a82Var.size() == 0) {
            return a82Var2;
        }
        int size = a82Var.size() + a82Var2.size();
        if (size < 128) {
            return Y(a82Var, a82Var2);
        }
        if (a82Var instanceof rb2) {
            rb2 rb2Var = (rb2) a82Var;
            if (rb2Var.j.size() + a82Var2.size() < 128) {
                return new rb2(rb2Var.i, Y(rb2Var.j, a82Var2));
            }
            if (rb2Var.i.y() > rb2Var.j.y() && rb2Var.y() > a82Var2.y()) {
                return new rb2(rb2Var.i, new rb2(rb2Var.j, a82Var2));
            }
        }
        return size >= a0(Math.max(a82Var.y(), a82Var2.y()) + 1) ? new rb2(a82Var, a82Var2) : new tb2(null).c(a82Var, a82Var2);
    }

    private static a82 Y(a82 a82Var, a82 a82Var2) {
        int size = a82Var.size();
        int size2 = a82Var2.size();
        byte[] bArr = new byte[size + size2];
        a82Var.l(bArr, 0, 0, size);
        a82Var2.l(bArr, 0, size, size2);
        return a82.T(bArr);
    }

    static int a0(int r2) {
        int[] r0 = m;
        return r2 >= r0.length ? ActivityChooserView.f.j : r0[r2];
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final boolean A() {
        return this.h >= a0(this.l);
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final byte D(int r2) {
        a82.n(r2, this.h);
        return E(r2);
    }

    @Override // com.google.android.gms.internal.ads.a82
    final byte E(int r3) {
        int r0 = this.k;
        return r3 < r0 ? this.i.E(r3) : this.j.E(r3 - r0);
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final int G(int r3, int r4, int r5) {
        int r0 = r4 + r5;
        int r1 = this.k;
        if (r0 <= r1) {
            return this.i.G(r3, r4, r5);
        }
        if (r4 >= r1) {
            return this.j.G(r3, r4 - r1, r5);
        }
        int r12 = r1 - r4;
        return this.j.G(this.i.G(r3, r4, r12), 0, r5 - r12);
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final int I(int r3, int r4, int r5) {
        int r0 = r4 + r5;
        int r1 = this.k;
        if (r0 <= r1) {
            return this.i.I(r3, r4, r5);
        }
        if (r4 >= r1) {
            return this.j.I(r3, r4 - r1, r5);
        }
        int r12 = r1 - r4;
        return this.j.I(this.i.I(r3, r4, r12), 0, r5 - r12);
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final a82 V(int r4, int r5) {
        int r0 = a82.L(r4, r5, this.h);
        if (r0 == 0) {
            return a82.e;
        }
        if (r0 == this.h) {
            return this;
        }
        int r02 = this.k;
        if (r5 <= r02) {
            return this.i.V(r4, r5);
        }
        if (r4 >= r02) {
            return this.j.V(r4 - r02, r5 - r02);
        }
        a82 a82Var = this.i;
        return new rb2(a82Var.V(r4, a82Var.size()), this.j.V(0, r5 - this.k));
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a82)) {
            return false;
        }
        a82 a82Var = (a82) obj;
        if (this.h != a82Var.size()) {
            return false;
        }
        if (this.h == 0) {
            return true;
        }
        int r1 = B();
        int r3 = a82Var.B();
        if (r1 != 0 && r3 != 0 && r1 != r3) {
            return false;
        }
        qb2 qb2Var = null;
        sb2 sb2Var = new sb2(this, qb2Var);
        h82 next = sb2Var.next();
        sb2 sb2Var2 = new sb2(a82Var, qb2Var);
        h82 next2 = sb2Var2.next();
        int r32 = 0;
        int r6 = 0;
        int r7 = 0;
        while (true) {
            int size = next.size() - r32;
            int size2 = next2.size() - r6;
            int r10 = Math.min(size, size2);
            if (!(r32 == 0 ? next.W(next2, r6, r10) : next2.W(next, r32, r10))) {
                return false;
            }
            r7 += r10;
            int r11 = this.h;
            if (r7 >= r11) {
                if (r7 == r11) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (r10 == size) {
                next = sb2Var.next();
                r32 = 0;
            } else {
                r32 += r10;
                next = next;
            }
            if (r10 == size2) {
                next2 = sb2Var2.next();
                r6 = 0;
            } else {
                r6 += r10;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final String i(Charset charset) {
        return new String(c(), charset);
    }

    @Override // com.google.android.gms.internal.ads.a82
    final void j(x72 x72Var) throws IOException {
        this.i.j(x72Var);
        this.j.j(x72Var);
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final void r(byte[] bArr, int r4, int r5, int r6) {
        int r0 = r4 + r6;
        int r1 = this.k;
        if (r0 <= r1) {
            this.i.r(bArr, r4, r5, r6);
        } else {
            if (r4 >= r1) {
                this.j.r(bArr, r4 - r1, r5, r6);
                return;
            }
            int r12 = r1 - r4;
            this.i.r(bArr, r4, r5, r12);
            this.j.r(bArr, 0, r5 + r12, r6 - r12);
        }
    }

    @Override // com.google.android.gms.internal.ads.a82, java.lang.Iterable
    /* renamed from: s */
    public final f82 iterator() {
        return new qb2(this);
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final int size() {
        return this.h;
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final boolean u() {
        int r0 = this.i.G(0, 0, this.k);
        a82 a82Var = this.j;
        return a82Var.G(r0, 0, a82Var.size()) == 0;
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final m82 v() {
        return new r82(new vb2(this));
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final int y() {
        return this.l;
    }
}
