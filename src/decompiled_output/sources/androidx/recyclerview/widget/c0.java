package androidx.recyclerview.widget;

import androidx.annotation.i0;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes.dex */
public class c0<T> {
    public static final int j = -1;
    private static final int k = 10;
    private static final int l = 10;
    private static final int m = 1;
    private static final int n = 2;
    private static final int o = 4;

    /* renamed from: a, reason: collision with root package name */
    T[] f623a;

    /* renamed from: b, reason: collision with root package name */
    private T[] f624b;

    /* renamed from: c, reason: collision with root package name */
    private int f625c;
    private int d;
    private int e;
    private b f;
    private a g;
    private int h;
    private final Class<T> i;

    public static class a<T2> extends b<T2> {
        final b<T2> d;
        private final f e;

        public a(b<T2> bVar) {
            this.d = bVar;
            this.e = new f(bVar);
        }

        @Override // androidx.recyclerview.widget.t
        public void a(int r2, int r3) {
            this.e.a(r2, r3);
        }

        @Override // androidx.recyclerview.widget.t
        public void b(int r2, int r3) {
            this.e.b(r2, r3);
        }

        @Override // androidx.recyclerview.widget.t
        public void c(int r2, int r3) {
            this.e.c(r2, r3);
        }

        @Override // androidx.recyclerview.widget.c0.b, java.util.Comparator
        public int compare(T2 t2, T2 t22) {
            return this.d.compare(t2, t22);
        }

        @Override // androidx.recyclerview.widget.c0.b, androidx.recyclerview.widget.t
        public void d(int r2, int r3, Object obj) {
            this.e.d(r2, r3, obj);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public boolean e(T2 t2, T2 t22) {
            return this.d.e(t2, t22);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public boolean f(T2 t2, T2 t22) {
            return this.d.f(t2, t22);
        }

        @Override // androidx.recyclerview.widget.c0.b
        @i0
        public Object g(T2 t2, T2 t22) {
            return this.d.g(t2, t22);
        }

        @Override // androidx.recyclerview.widget.c0.b
        public void h(int r3, int r4) {
            this.e.d(r3, r4, null);
        }

        public void i() {
            this.e.e();
        }
    }

    public static abstract class b<T2> implements Comparator<T2>, t {
        @Override // java.util.Comparator
        public abstract int compare(T2 t2, T2 t22);

        public void d(int r1, int r2, Object obj) {
            h(r1, r2);
        }

        public abstract boolean e(T2 t2, T2 t22);

        public abstract boolean f(T2 t2, T2 t22);

        @i0
        public Object g(T2 t2, T2 t22) {
            return null;
        }

        public abstract void h(int r1, int r2);
    }

    public c0(@androidx.annotation.h0 Class<T> cls, @androidx.annotation.h0 b<T> bVar) {
        this(cls, bVar, 10);
    }

    public c0(@androidx.annotation.h0 Class<T> cls, @androidx.annotation.h0 b<T> bVar, int r3) {
        this.i = cls;
        this.f623a = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, r3));
        this.f = bVar;
        this.h = 0;
    }

    private void A(@androidx.annotation.h0 T[] tArr) {
        boolean z = !(this.f instanceof a);
        if (z) {
            h();
        }
        this.f625c = 0;
        this.d = this.h;
        this.f624b = this.f623a;
        this.e = 0;
        int r2 = D(tArr);
        this.f623a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, r2));
        while (true) {
            if (this.e >= r2 && this.f625c >= this.d) {
                break;
            }
            int r3 = this.f625c;
            int r4 = this.d;
            if (r3 >= r4) {
                int r1 = this.e;
                int r22 = r2 - r1;
                System.arraycopy(tArr, r1, this.f623a, r1, r22);
                this.e += r22;
                this.h += r22;
                this.f.c(r1, r22);
                break;
            }
            int r5 = this.e;
            if (r5 >= r2) {
                int r42 = r4 - r3;
                this.h -= r42;
                this.f.a(r5, r42);
                break;
            }
            T t = this.f624b[r3];
            T t2 = tArr[r5];
            int r52 = this.f.compare(t, t2);
            if (r52 < 0) {
                B();
            } else {
                if (r52 <= 0) {
                    if (this.f.f(t, t2)) {
                        T[] tArr2 = this.f623a;
                        int r6 = this.e;
                        tArr2[r6] = t2;
                        this.f625c++;
                        this.e = r6 + 1;
                        if (!this.f.e(t, t2)) {
                            b bVar = this.f;
                            bVar.d(this.e - 1, 1, bVar.g(t, t2));
                        }
                    } else {
                        B();
                    }
                }
                z(t2);
            }
        }
        this.f624b = null;
        if (z) {
            k();
        }
    }

    private void B() {
        this.h--;
        this.f625c++;
        this.f.a(this.e, 1);
    }

    private int D(@androidx.annotation.h0 T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.f);
        int r1 = 1;
        int r2 = 0;
        for (int r0 = 1; r0 < tArr.length; r0++) {
            T t = tArr[r0];
            if (this.f.compare(tArr[r2], t) == 0) {
                int r4 = m(t, tArr, r2, r1);
                if (r4 != -1) {
                    tArr[r4] = t;
                } else {
                    if (r1 != r0) {
                        tArr[r1] = t;
                    }
                    r1++;
                }
            } else {
                if (r1 != r0) {
                    tArr[r1] = t;
                }
                r2 = r1;
                r1++;
            }
        }
        return r1;
    }

    private void E() {
        if (this.f624b != null) {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    private int b(T t, boolean z) {
        int r0 = l(t, this.f623a, 0, this.h, 1);
        if (r0 == -1) {
            r0 = 0;
        } else if (r0 < this.h) {
            T t2 = this.f623a[r0];
            if (this.f.f(t2, t)) {
                if (this.f.e(t2, t)) {
                    this.f623a[r0] = t;
                    return r0;
                }
                this.f623a[r0] = t;
                b bVar = this.f;
                bVar.d(r0, 1, bVar.g(t2, t));
                return r0;
            }
        }
        g(r0, t);
        if (z) {
            this.f.c(r0, 1);
        }
        return r0;
    }

    private void f(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int r0 = D(tArr);
        if (this.h != 0) {
            q(tArr, r0);
            return;
        }
        this.f623a = tArr;
        this.h = r0;
        this.f.c(0, r0);
    }

    private void g(int r4, T t) {
        int r0 = this.h;
        if (r4 > r0) {
            throw new IndexOutOfBoundsException("cannot add item to " + r4 + " because size is " + this.h);
        }
        T[] tArr = this.f623a;
        if (r0 == tArr.length) {
            T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, tArr.length + 10));
            System.arraycopy(this.f623a, 0, tArr2, 0, r4);
            tArr2[r4] = t;
            System.arraycopy(this.f623a, r4, tArr2, r4 + 1, this.h - r4);
            this.f623a = tArr2;
        } else {
            System.arraycopy(tArr, r4, tArr, r4 + 1, r0 - r4);
            this.f623a[r4] = t;
        }
        this.h++;
    }

    private T[] j(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int l(T t, T[] tArr, int r8, int r9, int r10) {
        while (r8 < r9) {
            int r2 = (r8 + r9) / 2;
            T t2 = tArr[r2];
            int r4 = this.f.compare(t2, t);
            if (r4 < 0) {
                r8 = r2 + 1;
            } else {
                if (r4 == 0) {
                    if (this.f.f(t2, t)) {
                        return r2;
                    }
                    int r6 = p(t, r2, r8, r9);
                    return (r10 == 1 && r6 == -1) ? r2 : r6;
                }
                r9 = r2;
            }
        }
        if (r10 == 1) {
            return r8;
        }
        return -1;
    }

    private int m(T t, T[] tArr, int r5, int r6) {
        while (r5 < r6) {
            if (this.f.f(tArr[r5], t)) {
                return r5;
            }
            r5++;
        }
        return -1;
    }

    private int p(T t, int r5, int r6, int r7) {
        T t2;
        for (int r0 = r5 - 1; r0 >= r6; r0--) {
            T t3 = this.f623a[r0];
            if (this.f.compare(t3, t) != 0) {
                break;
            }
            if (this.f.f(t3, t)) {
                return r0;
            }
        }
        do {
            r5++;
            if (r5 >= r7) {
                return -1;
            }
            t2 = this.f623a[r5];
            if (this.f.compare(t2, t) != 0) {
                return -1;
            }
        } while (!this.f.f(t2, t));
        return r5;
    }

    private void q(T[] tArr, int r10) {
        boolean z = !(this.f instanceof a);
        if (z) {
            h();
        }
        this.f624b = this.f623a;
        int r2 = 0;
        this.f625c = 0;
        int r3 = this.h;
        this.d = r3;
        this.f623a = (T[]) ((Object[]) Array.newInstance((Class<?>) this.i, r3 + r10 + 10));
        this.e = 0;
        while (true) {
            if (this.f625c >= this.d && r2 >= r10) {
                break;
            }
            int r32 = this.f625c;
            int r4 = this.d;
            if (r32 == r4) {
                int r102 = r10 - r2;
                System.arraycopy(tArr, r2, this.f623a, this.e, r102);
                int r9 = this.e + r102;
                this.e = r9;
                this.h += r102;
                this.f.c(r9 - r102, r102);
                break;
            }
            if (r2 == r10) {
                int r42 = r4 - r32;
                System.arraycopy(this.f624b, r32, this.f623a, this.e, r42);
                this.e += r42;
                break;
            }
            T t = this.f624b[r32];
            T t2 = tArr[r2];
            int r5 = this.f.compare(t, t2);
            if (r5 > 0) {
                T[] tArr2 = this.f623a;
                int r52 = this.e;
                int r6 = r52 + 1;
                this.e = r6;
                tArr2[r52] = t2;
                this.h++;
                r2++;
                this.f.c(r6 - 1, 1);
            } else if (r5 == 0 && this.f.f(t, t2)) {
                T[] tArr3 = this.f623a;
                int r62 = this.e;
                this.e = r62 + 1;
                tArr3[r62] = t2;
                r2++;
                this.f625c++;
                if (!this.f.e(t, t2)) {
                    b bVar = this.f;
                    bVar.d(this.e - 1, 1, bVar.g(t, t2));
                }
            } else {
                T[] tArr4 = this.f623a;
                int r53 = this.e;
                this.e = r53 + 1;
                tArr4[r53] = t;
                this.f625c++;
            }
        }
        this.f624b = null;
        if (z) {
            k();
        }
    }

    private boolean t(T t, boolean z) {
        int r7 = l(t, this.f623a, 0, this.h, 2);
        if (r7 == -1) {
            return false;
        }
        v(r7, z);
        return true;
    }

    private void v(int r5, boolean z) {
        T[] tArr = this.f623a;
        System.arraycopy(tArr, r5 + 1, tArr, r5, (this.h - r5) - 1);
        int r0 = this.h - 1;
        this.h = r0;
        this.f623a[r0] = null;
        if (z) {
            this.f.a(r5, 1);
        }
    }

    private void z(T t) {
        T[] tArr = this.f623a;
        int r1 = this.e;
        tArr[r1] = t;
        int r12 = r1 + 1;
        this.e = r12;
        this.h++;
        this.f.c(r12 - 1, 1);
    }

    public int C() {
        return this.h;
    }

    public void F(int r6, T t) throws IndexOutOfBoundsException {
        E();
        T tN = n(r6);
        boolean z = tN == t || !this.f.e(tN, t);
        if (tN != t && this.f.compare(tN, t) == 0) {
            this.f623a[r6] = t;
            if (z) {
                b bVar = this.f;
                bVar.d(r6, 1, bVar.g(tN, t));
                return;
            }
            return;
        }
        if (z) {
            b bVar2 = this.f;
            bVar2.d(r6, 1, bVar2.g(tN, t));
        }
        v(r6, false);
        int r7 = b(t, false);
        if (r6 != r7) {
            this.f.b(r6, r7);
        }
    }

    public int a(T t) {
        E();
        return b(t, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void c(@androidx.annotation.h0 Collection<T> collection) {
        e(collection.toArray((Object[]) Array.newInstance((Class<?>) this.i, collection.size())), true);
    }

    public void d(@androidx.annotation.h0 T... tArr) {
        e(tArr, false);
    }

    public void e(@androidx.annotation.h0 T[] tArr, boolean z) {
        E();
        if (tArr.length == 0) {
            return;
        }
        if (z) {
            f(tArr);
        } else {
            f(j(tArr));
        }
    }

    public void h() {
        E();
        b bVar = this.f;
        if (bVar instanceof a) {
            return;
        }
        if (this.g == null) {
            this.g = new a(bVar);
        }
        this.f = this.g;
    }

    public void i() {
        E();
        int r0 = this.h;
        if (r0 == 0) {
            return;
        }
        Arrays.fill(this.f623a, 0, r0, (Object) null);
        this.h = 0;
        this.f.a(0, r0);
    }

    public void k() {
        E();
        b bVar = this.f;
        if (bVar instanceof a) {
            ((a) bVar).i();
        }
        b bVar2 = this.f;
        a aVar = this.g;
        if (bVar2 == aVar) {
            this.f = aVar.d;
        }
    }

    public T n(int r4) throws IndexOutOfBoundsException {
        int r1;
        if (r4 < this.h && r4 >= 0) {
            T[] tArr = this.f624b;
            return (tArr == null || r4 < (r1 = this.e)) ? this.f623a[r4] : tArr[(r4 - r1) + this.f625c];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + r4 + " but size is " + this.h);
    }

    public int o(T t) {
        if (this.f624b == null) {
            return l(t, this.f623a, 0, this.h, 4);
        }
        int r0 = l(t, this.f623a, 0, this.e, 4);
        if (r0 != -1) {
            return r0;
        }
        int r9 = l(t, this.f624b, this.f625c, this.d, 4);
        if (r9 != -1) {
            return (r9 - this.f625c) + this.e;
        }
        return -1;
    }

    public void r(int r3) throws IndexOutOfBoundsException {
        E();
        T tN = n(r3);
        v(r3, false);
        int r0 = b(tN, false);
        if (r3 != r0) {
            this.f.b(r3, r0);
        }
    }

    public boolean s(T t) {
        E();
        return t(t, true);
    }

    public T u(int r3) throws IndexOutOfBoundsException {
        E();
        T tN = n(r3);
        v(r3, true);
        return tN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void w(@androidx.annotation.h0 Collection<T> collection) {
        y(collection.toArray((Object[]) Array.newInstance((Class<?>) this.i, collection.size())), true);
    }

    public void x(@androidx.annotation.h0 T... tArr) {
        y(tArr, false);
    }

    public void y(@androidx.annotation.h0 T[] tArr, boolean z) {
        E();
        if (z) {
            A(tArr);
        } else {
            A(j(tArr));
        }
    }
}
