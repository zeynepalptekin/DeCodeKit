package b.f;

import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class f<E> implements Cloneable {
    private static final Object h = new Object();
    private boolean d;
    private long[] e;
    private Object[] f;
    private int g;

    public f() {
        this(10);
    }

    public f(int r2) {
        this.d = false;
        if (r2 == 0) {
            this.e = e.f892b;
            this.f = e.f893c;
        } else {
            int r22 = e.f(r2);
            this.e = new long[r22];
            this.f = new Object[r22];
        }
    }

    private void h() {
        int r0 = this.g;
        long[] jArr = this.e;
        Object[] objArr = this.f;
        int r5 = 0;
        for (int r4 = 0; r4 < r0; r4++) {
            Object obj = objArr[r4];
            if (obj != h) {
                if (r4 != r5) {
                    jArr[r5] = jArr[r4];
                    objArr[r5] = obj;
                    objArr[r4] = null;
                }
                r5++;
            }
        }
        this.d = false;
        this.g = r5;
    }

    public int A() {
        if (this.d) {
            h();
        }
        return this.g;
    }

    public E C(int r2) {
        if (this.d) {
            h();
        }
        return (E) this.f[r2];
    }

    public void b(long j, E e) {
        int r0 = this.g;
        if (r0 != 0 && j <= this.e[r0 - 1]) {
            q(j, e);
            return;
        }
        if (this.d && this.g >= this.e.length) {
            h();
        }
        int r02 = this.g;
        if (r02 >= this.e.length) {
            int r1 = e.f(r02 + 1);
            long[] jArr = new long[r1];
            Object[] objArr = new Object[r1];
            long[] jArr2 = this.e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.e = jArr;
            this.f = objArr;
        }
        this.e[r02] = j;
        this.f[r02] = e;
        this.g = r02 + 1;
    }

    public void c() {
        int r0 = this.g;
        Object[] objArr = this.f;
        for (int r3 = 0; r3 < r0; r3++) {
            objArr[r3] = null;
        }
        this.g = 0;
        this.d = false;
    }

    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.e = (long[]) this.e.clone();
            fVar.f = (Object[]) this.f.clone();
            return fVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean e(long j) {
        return m(j) >= 0;
    }

    public boolean f(E e) {
        return n(e) >= 0;
    }

    @Deprecated
    public void g(long j) {
        t(j);
    }

    @i0
    public E k(long j) {
        return l(j, null);
    }

    public E l(long j, E e) {
        int r3 = e.b(this.e, this.g, j);
        if (r3 >= 0) {
            Object[] objArr = this.f;
            if (objArr[r3] != h) {
                return (E) objArr[r3];
            }
        }
        return e;
    }

    public int m(long j) {
        if (this.d) {
            h();
        }
        return e.b(this.e, this.g, j);
    }

    public int n(E e) {
        if (this.d) {
            h();
        }
        for (int r0 = 0; r0 < this.g; r0++) {
            if (this.f[r0] == e) {
                return r0;
            }
        }
        return -1;
    }

    public boolean o() {
        return A() == 0;
    }

    public long p(int r4) {
        if (this.d) {
            h();
        }
        return this.e[r4];
    }

    public void q(long j, E e) {
        int r0 = e.b(this.e, this.g, j);
        if (r0 >= 0) {
            this.f[r0] = e;
            return;
        }
        int r02 = ~r0;
        if (r02 < this.g) {
            Object[] objArr = this.f;
            if (objArr[r02] == h) {
                this.e[r02] = j;
                objArr[r02] = e;
                return;
            }
        }
        if (this.d && this.g >= this.e.length) {
            h();
            r02 = ~e.b(this.e, this.g, j);
        }
        int r1 = this.g;
        if (r1 >= this.e.length) {
            int r12 = e.f(r1 + 1);
            long[] jArr = new long[r12];
            Object[] objArr2 = new Object[r12];
            long[] jArr2 = this.e;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = jArr;
            this.f = objArr2;
        }
        int r13 = this.g;
        if (r13 - r02 != 0) {
            long[] jArr3 = this.e;
            int r3 = r02 + 1;
            System.arraycopy(jArr3, r02, jArr3, r3, r13 - r02);
            Object[] objArr4 = this.f;
            System.arraycopy(objArr4, r02, objArr4, r3, this.g - r02);
        }
        this.e[r02] = j;
        this.f[r02] = e;
        this.g++;
    }

    public void r(@h0 f<? extends E> fVar) {
        int r0 = fVar.A();
        for (int r1 = 0; r1 < r0; r1++) {
            q(fVar.p(r1), fVar.C(r1));
        }
    }

    @i0
    public E s(long j, E e) {
        E eK = k(j);
        if (eK == null) {
            q(j, e);
        }
        return eK;
    }

    public void t(long j) {
        int r3 = e.b(this.e, this.g, j);
        if (r3 >= 0) {
            Object[] objArr = this.f;
            Object obj = objArr[r3];
            Object obj2 = h;
            if (obj != obj2) {
                objArr[r3] = obj2;
                this.d = true;
            }
        }
    }

    public String toString() {
        if (A() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.g * 28);
        sb.append('{');
        for (int r1 = 0; r1 < this.g; r1++) {
            if (r1 > 0) {
                sb.append(", ");
            }
            sb.append(p(r1));
            sb.append('=');
            E eC = C(r1);
            if (eC != this) {
                sb.append(eC);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean u(long j, Object obj) {
        int r1 = m(j);
        if (r1 < 0) {
            return false;
        }
        E eC = C(r1);
        if (obj != eC && (obj == null || !obj.equals(eC))) {
            return false;
        }
        v(r1);
        return true;
    }

    public void v(int r4) {
        Object[] objArr = this.f;
        Object obj = objArr[r4];
        Object obj2 = h;
        if (obj != obj2) {
            objArr[r4] = obj2;
            this.d = true;
        }
    }

    @i0
    public E w(long j, E e) {
        int r2 = m(j);
        if (r2 < 0) {
            return null;
        }
        Object[] objArr = this.f;
        E e2 = (E) objArr[r2];
        objArr[r2] = e;
        return e2;
    }

    public boolean x(long j, E e, E e2) {
        int r1 = m(j);
        if (r1 < 0) {
            return false;
        }
        Object obj = this.f[r1];
        if (obj != e && (e == null || !e.equals(obj))) {
            return false;
        }
        this.f[r1] = e2;
        return true;
    }

    public void z(int r2, E e) {
        if (this.d) {
            h();
        }
        this.f[r2] = e;
    }
}
