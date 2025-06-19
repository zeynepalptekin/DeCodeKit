package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class qc2 {
    private static final qc2 f = new qc2(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f4982a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f4983b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f4984c;
    private int d;
    private boolean e;

    private qc2() {
        this(0, new int[8], new Object[8], true);
    }

    private qc2(int r2, int[] r3, Object[] objArr, boolean z) {
        this.d = -1;
        this.f4982a = r2;
        this.f4983b = r3;
        this.f4984c = objArr;
        this.e = z;
    }

    static qc2 a(qc2 qc2Var, qc2 qc2Var2) {
        int r0 = qc2Var.f4982a + qc2Var2.f4982a;
        int[] r1 = Arrays.copyOf(qc2Var.f4983b, r0);
        System.arraycopy(qc2Var2.f4983b, 0, r1, qc2Var.f4982a, qc2Var2.f4982a);
        Object[] objArrCopyOf = Arrays.copyOf(qc2Var.f4984c, r0);
        System.arraycopy(qc2Var2.f4984c, 0, objArrCopyOf, qc2Var.f4982a, qc2Var2.f4982a);
        return new qc2(r0, r1, objArrCopyOf, true);
    }

    private static void d(int r2, Object obj, kd2 kd2Var) throws IOException {
        int r0 = r2 >>> 3;
        int r22 = r2 & 7;
        if (r22 == 0) {
            kd2Var.M(r0, ((Long) obj).longValue());
            return;
        }
        if (r22 == 1) {
            kd2Var.C(r0, ((Long) obj).longValue());
            return;
        }
        if (r22 == 2) {
            kd2Var.O(r0, (a82) obj);
            return;
        }
        if (r22 != 3) {
            if (r22 != 5) {
                throw new RuntimeException(w92.f());
            }
            kd2Var.F(r0, ((Integer) obj).intValue());
        } else if (kd2Var.H() == l92.e.l) {
            kd2Var.V(r0);
            ((qc2) obj).e(kd2Var);
            kd2Var.K(r0);
        } else {
            kd2Var.K(r0);
            ((qc2) obj).e(kd2Var);
            kd2Var.V(r0);
        }
    }

    public static qc2 h() {
        return f;
    }

    static qc2 i() {
        return new qc2();
    }

    final void b(kd2 kd2Var) throws IOException {
        if (kd2Var.H() == l92.e.m) {
            for (int r0 = this.f4982a - 1; r0 >= 0; r0--) {
                kd2Var.B(this.f4983b[r0] >>> 3, this.f4984c[r0]);
            }
            return;
        }
        for (int r02 = 0; r02 < this.f4982a; r02++) {
            kd2Var.B(this.f4983b[r02] >>> 3, this.f4984c[r02]);
        }
    }

    final void c(StringBuilder sb, int r5) {
        for (int r0 = 0; r0 < this.f4982a; r0++) {
            cb2.c(sb, r5, String.valueOf(this.f4983b[r0] >>> 3), this.f4984c[r0]);
        }
    }

    public final void e(kd2 kd2Var) throws IOException {
        if (this.f4982a == 0) {
            return;
        }
        if (kd2Var.H() == l92.e.l) {
            for (int r0 = 0; r0 < this.f4982a; r0++) {
                d(this.f4983b[r0], this.f4984c[r0], kd2Var);
            }
            return;
        }
        for (int r02 = this.f4982a - 1; r02 >= 0; r02--) {
            d(this.f4983b[r02], this.f4984c[r02], kd2Var);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof qc2)) {
            return false;
        }
        qc2 qc2Var = (qc2) obj;
        int r2 = this.f4982a;
        if (r2 == qc2Var.f4982a) {
            int[] r3 = this.f4983b;
            int[] r4 = qc2Var.f4983b;
            int r5 = 0;
            while (true) {
                if (r5 >= r2) {
                    z = true;
                    break;
                }
                if (r3[r5] != r4[r5]) {
                    z = false;
                    break;
                }
                r5++;
            }
            if (z) {
                Object[] objArr = this.f4984c;
                Object[] objArr2 = qc2Var.f4984c;
                int r32 = this.f4982a;
                int r42 = 0;
                while (true) {
                    if (r42 >= r32) {
                        z2 = true;
                        break;
                    }
                    if (!objArr[r42].equals(objArr2[r42])) {
                        z2 = false;
                        break;
                    }
                    r42++;
                }
                if (z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void f() {
        this.e = false;
    }

    public final int g() {
        int I;
        int r0 = this.d;
        if (r0 != -1) {
            return r0;
        }
        int r1 = 0;
        for (int r02 = 0; r02 < this.f4982a; r02++) {
            int r2 = this.f4983b[r02];
            int r3 = r2 >>> 3;
            int r22 = r2 & 7;
            if (r22 == 0) {
                I = v82.A0(r3, ((Long) this.f4984c[r02]).longValue());
            } else if (r22 == 1) {
                I = v82.C0(r3, ((Long) this.f4984c[r02]).longValue());
            } else if (r22 == 2) {
                I = v82.I(r3, (a82) this.f4984c[r02]);
            } else if (r22 == 3) {
                I = (v82.e0(r3) << 1) + ((qc2) this.f4984c[r02]).g();
            } else {
                if (r22 != 5) {
                    throw new IllegalStateException(w92.f());
                }
                I = v82.s(r3, ((Integer) this.f4984c[r02]).intValue());
            }
            r1 += I;
        }
        this.d = r1;
        return r1;
    }

    public final int hashCode() {
        int r0 = this.f4982a;
        int r1 = (r0 + 527) * 31;
        int[] r2 = this.f4983b;
        int r4 = 17;
        int r6 = 17;
        for (int r5 = 0; r5 < r0; r5++) {
            r6 = (r6 * 31) + r2[r5];
        }
        int r12 = (r1 + r6) * 31;
        Object[] objArr = this.f4984c;
        int r22 = this.f4982a;
        for (int r3 = 0; r3 < r22; r3++) {
            r4 = (r4 * 31) + objArr[r3].hashCode();
        }
        return r12 + r4;
    }

    public final int j() {
        int r0 = this.d;
        if (r0 != -1) {
            return r0;
        }
        int r1 = 0;
        for (int r02 = 0; r02 < this.f4982a; r02++) {
            r1 += v82.M(this.f4983b[r02] >>> 3, (a82) this.f4984c[r02]);
        }
        this.d = r1;
        return r1;
    }

    final void k(int r3, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int r0 = this.f4982a;
        if (r0 == this.f4983b.length) {
            int r1 = this.f4982a + (r0 < 4 ? 8 : r0 >> 1);
            this.f4983b = Arrays.copyOf(this.f4983b, r1);
            this.f4984c = Arrays.copyOf(this.f4984c, r1);
        }
        int[] r02 = this.f4983b;
        int r12 = this.f4982a;
        r02[r12] = r3;
        this.f4984c[r12] = obj;
        this.f4982a = r12 + 1;
    }
}
