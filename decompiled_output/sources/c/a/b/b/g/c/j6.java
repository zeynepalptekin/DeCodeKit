package c.a.b.b.g.c;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class j6 extends f6 {
    protected final byte[] h;

    j6(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.h = bArr;
    }

    @Override // c.a.b.b.g.c.y5
    public final boolean B() {
        int r0 = E();
        return ma.g(this.h, r0, h() + r0);
    }

    @Override // c.a.b.b.g.c.f6
    final boolean D(y5 y5Var, int r7, int r8) {
        if (r8 > y5Var.h()) {
            int r72 = h();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(r8);
            sb.append(r72);
            throw new IllegalArgumentException(sb.toString());
        }
        if (r8 > y5Var.h()) {
            int r6 = y5Var.h();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(r8);
            sb2.append(", ");
            sb2.append(r6);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(y5Var instanceof j6)) {
            return y5Var.l(0, r8).equals(l(0, r8));
        }
        j6 j6Var = (j6) y5Var;
        byte[] bArr = this.h;
        byte[] bArr2 = j6Var.h;
        int r2 = E() + r8;
        int r82 = E();
        int r62 = j6Var.E();
        while (r82 < r2) {
            if (bArr[r82] != bArr2[r62]) {
                return false;
            }
            r82++;
            r62++;
        }
        return true;
    }

    protected int E() {
        return 0;
    }

    @Override // c.a.b.b.g.c.y5
    public byte c(int r2) {
        return this.h[r2];
    }

    @Override // c.a.b.b.g.c.y5
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y5) || h() != ((y5) obj).h()) {
            return false;
        }
        if (h() == 0) {
            return true;
        }
        if (!(obj instanceof j6)) {
            return obj.equals(this);
        }
        j6 j6Var = (j6) obj;
        int r0 = C();
        int r1 = j6Var.C();
        if (r0 == 0 || r1 == 0 || r0 == r1) {
            return D(j6Var, 0, h());
        }
        return false;
    }

    @Override // c.a.b.b.g.c.y5
    public int h() {
        return this.h.length;
    }

    @Override // c.a.b.b.g.c.y5
    protected final int j(int r2, int r3, int r4) {
        return l7.a(r2, this.h, E(), r4);
    }

    @Override // c.a.b.b.g.c.y5
    public final y5 l(int r3, int r4) {
        int r32 = y5.x(0, r4, h());
        return r32 == 0 ? y5.e : new b6(this.h, E(), r32);
    }

    @Override // c.a.b.b.g.c.y5
    protected final String s(Charset charset) {
        return new String(this.h, E(), h(), charset);
    }

    @Override // c.a.b.b.g.c.y5
    final void t(v5 v5Var) throws IOException {
        v5Var.a(this.h, E(), h());
    }

    @Override // c.a.b.b.g.c.y5
    byte u(int r2) {
        return this.h[r2];
    }
}
