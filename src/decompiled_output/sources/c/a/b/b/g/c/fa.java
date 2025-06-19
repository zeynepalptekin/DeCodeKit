package c.a.b.b.g.c;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class fa {
    private static final fa f = new fa(0, new int[0], new Object[0], false);

    /* renamed from: a, reason: collision with root package name */
    private int f1689a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f1690b;

    /* renamed from: c, reason: collision with root package name */
    private Object[] f1691c;
    private int d;
    private boolean e;

    private fa() {
        this(0, new int[8], new Object[8], true);
    }

    private fa(int r2, int[] r3, Object[] objArr, boolean z) {
        this.d = -1;
        this.f1689a = r2;
        this.f1690b = r3;
        this.f1691c = objArr;
        this.e = z;
    }

    public static fa a() {
        return f;
    }

    static fa b(fa faVar, fa faVar2) {
        int r0 = faVar.f1689a + faVar2.f1689a;
        int[] r1 = Arrays.copyOf(faVar.f1690b, r0);
        System.arraycopy(faVar2.f1690b, 0, r1, faVar.f1689a, faVar2.f1689a);
        Object[] objArrCopyOf = Arrays.copyOf(faVar.f1691c, r0);
        System.arraycopy(faVar2.f1691c, 0, objArrCopyOf, faVar.f1689a, faVar2.f1689a);
        return new fa(r0, r1, objArrCopyOf, true);
    }

    private static void d(int r2, Object obj, ab abVar) throws IOException {
        int r0 = r2 >>> 3;
        int r22 = r2 & 7;
        if (r22 == 0) {
            abVar.O(r0, ((Long) obj).longValue());
            return;
        }
        if (r22 == 1) {
            abVar.L(r0, ((Long) obj).longValue());
            return;
        }
        if (r22 == 2) {
            abVar.D(r0, (y5) obj);
            return;
        }
        if (r22 != 3) {
            if (r22 != 5) {
                throw new RuntimeException(q7.f());
            }
            abVar.K(r0, ((Integer) obj).intValue());
        } else if (abVar.a() == za.f1879a) {
            abVar.e(r0);
            ((fa) obj).h(abVar);
            abVar.g(r0);
        } else {
            abVar.g(r0);
            ((fa) obj).h(abVar);
            abVar.e(r0);
        }
    }

    static fa g() {
        return new fa();
    }

    final void c(int r3, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        int r0 = this.f1689a;
        if (r0 == this.f1690b.length) {
            int r1 = this.f1689a + (r0 < 4 ? 8 : r0 >> 1);
            this.f1690b = Arrays.copyOf(this.f1690b, r1);
            this.f1691c = Arrays.copyOf(this.f1691c, r1);
        }
        int[] r02 = this.f1690b;
        int r12 = this.f1689a;
        r02[r12] = r3;
        this.f1691c[r12] = obj;
        this.f1689a = r12 + 1;
    }

    final void e(ab abVar) throws IOException {
        if (abVar.a() == za.f1880b) {
            for (int r0 = this.f1689a - 1; r0 >= 0; r0--) {
                abVar.m(this.f1690b[r0] >>> 3, this.f1691c[r0]);
            }
            return;
        }
        for (int r02 = 0; r02 < this.f1689a; r02++) {
            abVar.m(this.f1690b[r02] >>> 3, this.f1691c[r02]);
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof fa)) {
            return false;
        }
        fa faVar = (fa) obj;
        int r2 = this.f1689a;
        if (r2 == faVar.f1689a) {
            int[] r3 = this.f1690b;
            int[] r4 = faVar.f1690b;
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
                Object[] objArr = this.f1691c;
                Object[] objArr2 = faVar.f1691c;
                int r32 = this.f1689a;
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

    final void f(StringBuilder sb, int r5) {
        for (int r0 = 0; r0 < this.f1689a; r0++) {
            w8.d(sb, r5, String.valueOf(this.f1690b[r0] >>> 3), this.f1691c[r0]);
        }
    }

    public final void h(ab abVar) throws IOException {
        if (this.f1689a == 0) {
            return;
        }
        if (abVar.a() == za.f1879a) {
            for (int r0 = 0; r0 < this.f1689a; r0++) {
                d(this.f1690b[r0], this.f1691c[r0], abVar);
            }
            return;
        }
        for (int r02 = this.f1689a - 1; r02 >= 0; r02--) {
            d(this.f1690b[r02], this.f1691c[r02], abVar);
        }
    }

    public final int hashCode() {
        int r0 = this.f1689a;
        int r1 = (r0 + 527) * 31;
        int[] r2 = this.f1690b;
        int r4 = 17;
        int r6 = 17;
        for (int r5 = 0; r5 < r0; r5++) {
            r6 = (r6 * 31) + r2[r5];
        }
        int r12 = (r1 + r6) * 31;
        Object[] objArr = this.f1691c;
        int r22 = this.f1689a;
        for (int r3 = 0; r3 < r22; r3++) {
            r4 = (r4 * 31) + objArr[r3].hashCode();
        }
        return r12 + r4;
    }

    public final void i() {
        this.e = false;
    }

    public final int j() {
        int r0 = this.d;
        if (r0 != -1) {
            return r0;
        }
        int r1 = 0;
        for (int r02 = 0; r02 < this.f1689a; r02++) {
            r1 += o6.d0(this.f1690b[r02] >>> 3, (y5) this.f1691c[r02]);
        }
        this.d = r1;
        return r1;
    }

    public final int k() {
        int r2;
        int r0 = this.d;
        if (r0 != -1) {
            return r0;
        }
        int r1 = 0;
        for (int r02 = 0; r02 < this.f1689a; r02++) {
            int r22 = this.f1690b[r02];
            int r3 = r22 >>> 3;
            int r23 = r22 & 7;
            if (r23 == 0) {
                r2 = o6.i0(r3, ((Long) this.f1691c[r02]).longValue());
            } else if (r23 == 1) {
                r2 = o6.r0(r3, ((Long) this.f1691c[r02]).longValue());
            } else if (r23 == 2) {
                r2 = o6.U(r3, (y5) this.f1691c[r02]);
            } else if (r23 == 3) {
                r2 = (o6.h0(r3) << 1) + ((fa) this.f1691c[r02]).k();
            } else {
                if (r23 != 5) {
                    throw new IllegalStateException(q7.f());
                }
                r2 = o6.y0(r3, ((Integer) this.f1691c[r02]).intValue());
            }
            r1 += r2;
        }
        this.d = r1;
        return r1;
    }
}
