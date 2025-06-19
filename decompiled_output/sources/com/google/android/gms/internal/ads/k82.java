package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
class k82 extends h82 {
    protected final byte[] h;

    k82(byte[] bArr) {
        if (bArr == null) {
            throw null;
        }
        this.h = bArr;
    }

    @Override // com.google.android.gms.internal.ads.a82
    public byte D(int r2) {
        return this.h[r2];
    }

    @Override // com.google.android.gms.internal.ads.a82
    byte E(int r2) {
        return this.h[r2];
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final int G(int r2, int r3, int r4) {
        int r0 = X() + r3;
        return wc2.e(r2, this.h, r0, r4 + r0);
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final int I(int r3, int r4, int r5) {
        return o92.c(r3, this.h, X() + r4, r5);
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final a82 V(int r4, int r5) {
        int r52 = a82.L(r4, r5, size());
        return r52 == 0 ? a82.e : new d82(this.h, X() + r4, r52);
    }

    @Override // com.google.android.gms.internal.ads.h82
    final boolean W(a82 a82Var, int r7, int r8) {
        if (r8 > a82Var.size()) {
            int size = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(r8);
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        int r0 = r7 + r8;
        if (r0 > a82Var.size()) {
            int size2 = a82Var.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: ");
            sb2.append(r7);
            sb2.append(", ");
            sb2.append(r8);
            sb2.append(", ");
            sb2.append(size2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (!(a82Var instanceof k82)) {
            return a82Var.V(r7, r0).equals(V(0, r8));
        }
        k82 k82Var = (k82) a82Var;
        byte[] bArr = this.h;
        byte[] bArr2 = k82Var.h;
        int r3 = X() + r8;
        int r82 = X();
        int r6 = k82Var.X() + r7;
        while (r82 < r3) {
            if (bArr[r82] != bArr2[r6]) {
                return false;
            }
            r82++;
            r6++;
        }
        return true;
    }

    protected int X() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a82) || size() != ((a82) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof k82)) {
            return obj.equals(this);
        }
        k82 k82Var = (k82) obj;
        int r0 = B();
        int r1 = k82Var.B();
        if (r0 == 0 || r1 == 0 || r0 == r1) {
            return W(k82Var, 0, size());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected final String i(Charset charset) {
        return new String(this.h, X(), size(), charset);
    }

    @Override // com.google.android.gms.internal.ads.a82
    final void j(x72 x72Var) throws IOException {
        x72Var.a(this.h, X(), size());
    }

    @Override // com.google.android.gms.internal.ads.a82
    protected void r(byte[] bArr, int r3, int r4, int r5) {
        System.arraycopy(this.h, r3, bArr, r4, r5);
    }

    @Override // com.google.android.gms.internal.ads.a82
    public int size() {
        return this.h.length;
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final boolean u() {
        int r0 = X();
        return wc2.j(this.h, r0, size() + r0);
    }

    @Override // com.google.android.gms.internal.ads.a82
    public final m82 v() {
        return m82.d(this.h, X(), size(), true);
    }
}
