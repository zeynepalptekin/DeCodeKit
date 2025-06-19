package b.f;

import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class j<E> implements Cloneable {
    private static final Object h = new Object();
    private boolean d;
    private int[] e;
    private Object[] f;
    private int g;

    public j() {
        this(10);
    }

    public j(int r2) {
        this.d = false;
        if (r2 == 0) {
            this.e = e.f891a;
            this.f = e.f893c;
        } else {
            int r22 = e.e(r2);
            this.e = new int[r22];
            this.f = new Object[r22];
        }
    }

    private void h() {
        int r0 = this.g;
        int[] r1 = this.e;
        Object[] objArr = this.f;
        int r5 = 0;
        for (int r4 = 0; r4 < r0; r4++) {
            Object obj = objArr[r4];
            if (obj != h) {
                if (r4 != r5) {
                    r1[r5] = r1[r4];
                    objArr[r5] = obj;
                    objArr[r4] = null;
                }
                r5++;
            }
        }
        this.d = false;
        this.g = r5;
    }

    public void A(int r2, E e) {
        if (this.d) {
            h();
        }
        this.f[r2] = e;
    }

    public int C() {
        if (this.d) {
            h();
        }
        return this.g;
    }

    public E D(int r2) {
        if (this.d) {
            h();
        }
        return (E) this.f[r2];
    }

    public void b(int r7, E e) {
        int r0 = this.g;
        if (r0 != 0 && r7 <= this.e[r0 - 1]) {
            q(r7, e);
            return;
        }
        if (this.d && this.g >= this.e.length) {
            h();
        }
        int r02 = this.g;
        if (r02 >= this.e.length) {
            int r1 = e.e(r02 + 1);
            int[] r2 = new int[r1];
            Object[] objArr = new Object[r1];
            int[] r3 = this.e;
            System.arraycopy(r3, 0, r2, 0, r3.length);
            Object[] objArr2 = this.f;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.e = r2;
            this.f = objArr;
        }
        this.e[r02] = r7;
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
    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.e = (int[]) this.e.clone();
            jVar.f = (Object[]) this.f.clone();
            return jVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public boolean e(int r1) {
        return m(r1) >= 0;
    }

    public boolean f(E e) {
        return n(e) >= 0;
    }

    @Deprecated
    public void g(int r1) {
        t(r1);
    }

    @i0
    public E k(int r2) {
        return l(r2, null);
    }

    public E l(int r4, E e) {
        int r42 = e.a(this.e, this.g, r4);
        if (r42 >= 0) {
            Object[] objArr = this.f;
            if (objArr[r42] != h) {
                return (E) objArr[r42];
            }
        }
        return e;
    }

    public int m(int r3) {
        if (this.d) {
            h();
        }
        return e.a(this.e, this.g, r3);
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
        return C() == 0;
    }

    public int p(int r2) {
        if (this.d) {
            h();
        }
        return this.e[r2];
    }

    public void q(int r7, E e) {
        int r0 = e.a(this.e, this.g, r7);
        if (r0 >= 0) {
            this.f[r0] = e;
            return;
        }
        int r02 = ~r0;
        if (r02 < this.g) {
            Object[] objArr = this.f;
            if (objArr[r02] == h) {
                this.e[r02] = r7;
                objArr[r02] = e;
                return;
            }
        }
        if (this.d && this.g >= this.e.length) {
            h();
            r02 = ~e.a(this.e, this.g, r7);
        }
        int r1 = this.g;
        if (r1 >= this.e.length) {
            int r12 = e.e(r1 + 1);
            int[] r2 = new int[r12];
            Object[] objArr2 = new Object[r12];
            int[] r3 = this.e;
            System.arraycopy(r3, 0, r2, 0, r3.length);
            Object[] objArr3 = this.f;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.e = r2;
            this.f = objArr2;
        }
        int r13 = this.g;
        if (r13 - r02 != 0) {
            int[] r22 = this.e;
            int r32 = r02 + 1;
            System.arraycopy(r22, r02, r22, r32, r13 - r02);
            Object[] objArr4 = this.f;
            System.arraycopy(objArr4, r02, objArr4, r32, this.g - r02);
        }
        this.e[r02] = r7;
        this.f[r02] = e;
        this.g++;
    }

    public void r(@h0 j<? extends E> jVar) {
        int r0 = jVar.C();
        for (int r1 = 0; r1 < r0; r1++) {
            q(jVar.p(r1), jVar.D(r1));
        }
    }

    @i0
    public E s(int r2, E e) {
        E eK = k(r2);
        if (eK == null) {
            q(r2, e);
        }
        return eK;
    }

    public void t(int r4) {
        int r42 = e.a(this.e, this.g, r4);
        if (r42 >= 0) {
            Object[] objArr = this.f;
            Object obj = objArr[r42];
            Object obj2 = h;
            if (obj != obj2) {
                objArr[r42] = obj2;
                this.d = true;
            }
        }
    }

    public String toString() {
        if (C() <= 0) {
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
            E eD = D(r1);
            if (eD != this) {
                sb.append(eD);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean u(int r2, Object obj) {
        int r22 = m(r2);
        if (r22 < 0) {
            return false;
        }
        E eD = D(r22);
        if (obj != eD && (obj == null || !obj.equals(eD))) {
            return false;
        }
        v(r22);
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

    public void w(int r2, int r3) {
        int r32 = Math.min(this.g, r3 + r2);
        while (r2 < r32) {
            v(r2);
            r2++;
        }
    }

    @i0
    public E x(int r3, E e) {
        int r32 = m(r3);
        if (r32 < 0) {
            return null;
        }
        Object[] objArr = this.f;
        E e2 = (E) objArr[r32];
        objArr[r32] = e;
        return e2;
    }

    public boolean z(int r2, E e, E e2) {
        int r22 = m(r2);
        if (r22 < 0) {
            return false;
        }
        Object obj = this.f[r22];
        if (obj != e && (e == null || !e.equals(obj))) {
            return false;
        }
        this.f[r22] = e2;
        return true;
    }
}
