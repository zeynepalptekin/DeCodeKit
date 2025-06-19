package b.f;

import androidx.annotation.h0;
import androidx.annotation.i0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E> {
    private static final boolean h = false;
    private static final String i = "ArraySet";
    private static final int[] j = new int[0];
    private static final Object[] k = new Object[0];
    private static final int l = 4;
    private static final int m = 10;

    @i0
    private static Object[] n;
    private static int o;

    @i0
    private static Object[] p;
    private static int q;
    private int[] d;
    Object[] e;
    int f;
    private h<E, E> g;

    class a extends h<E, E> {
        a() {
        }

        @Override // b.f.h
        protected void a() {
            b.this.clear();
        }

        @Override // b.f.h
        protected Object b(int r1, int r2) {
            return b.this.e[r1];
        }

        @Override // b.f.h
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // b.f.h
        protected int d() {
            return b.this.f;
        }

        @Override // b.f.h
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // b.f.h
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // b.f.h
        protected void g(E e, E e2) {
            b.this.add(e);
        }

        @Override // b.f.h
        protected void h(int r2) {
            b.this.s(r2);
        }

        @Override // b.f.h
        protected E i(int r1, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    public b(int r1) {
        if (r1 == 0) {
            this.d = j;
            this.e = k;
        } else {
            h(r1);
        }
        this.f = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@i0 b<E> bVar) {
        this();
        if (bVar != 0) {
            c(bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(@i0 Collection<E> collection) {
        this();
        if (collection != 0) {
            addAll(collection);
        }
    }

    private void h(int r6) {
        if (r6 == 8) {
            synchronized (b.class) {
                if (p != null) {
                    Object[] objArr = p;
                    this.e = objArr;
                    p = (Object[]) objArr[0];
                    this.d = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    q--;
                    return;
                }
            }
        } else if (r6 == 4) {
            synchronized (b.class) {
                if (n != null) {
                    Object[] objArr2 = n;
                    this.e = objArr2;
                    n = (Object[]) objArr2[0];
                    this.d = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    o--;
                    return;
                }
            }
        }
        this.d = new int[r6];
        this.e = new Object[r6];
    }

    private static void j(int[] r7, Object[] objArr, int r9) {
        if (r7.length == 8) {
            synchronized (b.class) {
                if (q < 10) {
                    objArr[0] = p;
                    objArr[1] = r7;
                    for (int r92 = r9 - 1; r92 >= 2; r92--) {
                        objArr[r92] = null;
                    }
                    p = objArr;
                    q++;
                }
            }
            return;
        }
        if (r7.length == 4) {
            synchronized (b.class) {
                if (o < 10) {
                    objArr[0] = n;
                    objArr[1] = r7;
                    for (int r93 = r9 - 1; r93 >= 2; r93--) {
                        objArr[r93] = null;
                    }
                    n = objArr;
                    o++;
                }
            }
        }
    }

    private h<E, E> l() {
        if (this.g == null) {
            this.g = new a();
        }
        return this.g;
    }

    private int n(Object obj, int r6) {
        int r0 = this.f;
        if (r0 == 0) {
            return -1;
        }
        int r1 = e.a(this.d, r0, r6);
        if (r1 < 0 || obj.equals(this.e[r1])) {
            return r1;
        }
        int r2 = r1 + 1;
        while (r2 < r0 && this.d[r2] == r6) {
            if (obj.equals(this.e[r2])) {
                return r2;
            }
            r2++;
        }
        for (int r12 = r1 - 1; r12 >= 0 && this.d[r12] == r6; r12--) {
            if (obj.equals(this.e[r12])) {
                return r12;
            }
        }
        return ~r2;
    }

    private int o() {
        int r0 = this.f;
        if (r0 == 0) {
            return -1;
        }
        int r1 = e.a(this.d, r0, 0);
        if (r1 < 0 || this.e[r1] == null) {
            return r1;
        }
        int r2 = r1 + 1;
        while (r2 < r0 && this.d[r2] == 0) {
            if (this.e[r2] == null) {
                return r2;
            }
            r2++;
        }
        for (int r12 = r1 - 1; r12 >= 0 && this.d[r12] == 0; r12--) {
            if (this.e[r12] == null) {
                return r12;
            }
        }
        return ~r2;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(@i0 E e) {
        int r2;
        int r1;
        if (e == null) {
            r1 = o();
            r2 = 0;
        } else {
            int r12 = e.hashCode();
            r2 = r12;
            r1 = n(e, r12);
        }
        if (r1 >= 0) {
            return false;
        }
        int r13 = ~r1;
        int r3 = this.f;
        if (r3 >= this.d.length) {
            int r4 = 4;
            if (r3 >= 8) {
                r4 = (r3 >> 1) + r3;
            } else if (r3 >= 4) {
                r4 = 8;
            }
            int[] r32 = this.d;
            Object[] objArr = this.e;
            h(r4);
            int[] r42 = this.d;
            if (r42.length > 0) {
                System.arraycopy(r32, 0, r42, 0, r32.length);
                System.arraycopy(objArr, 0, this.e, 0, objArr.length);
            }
            j(r32, objArr, this.f);
        }
        int r0 = this.f;
        if (r13 < r0) {
            int[] r33 = this.d;
            int r43 = r13 + 1;
            System.arraycopy(r33, r13, r33, r43, r0 - r13);
            Object[] objArr2 = this.e;
            System.arraycopy(objArr2, r13, objArr2, r43, this.f - r13);
        }
        this.d[r13] = r2;
        this.e[r13] = e;
        this.f++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@h0 Collection<? extends E> collection) {
        i(this.f + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void c(@h0 b<? extends E> bVar) {
        int r0 = bVar.f;
        i(this.f + r0);
        if (this.f != 0) {
            for (int r2 = 0; r2 < r0; r2++) {
                add(bVar.t(r2));
            }
        } else if (r0 > 0) {
            System.arraycopy(bVar.d, 0, this.d, 0, r0);
            System.arraycopy(bVar.e, 0, this.e, 0, r0);
            this.f = r0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int r0 = this.f;
        if (r0 != 0) {
            j(this.d, this.e, r0);
            this.d = j;
            this.e = k;
            this.f = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(@i0 Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@h0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int r1 = 0; r1 < this.f; r1++) {
                try {
                    if (!set.contains(t(r1))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] r0 = this.d;
        int r1 = this.f;
        int r3 = 0;
        for (int r2 = 0; r2 < r1; r2++) {
            r3 += r0[r2];
        }
        return r3;
    }

    public void i(int r5) {
        int[] r0 = this.d;
        if (r0.length < r5) {
            Object[] objArr = this.e;
            h(r5);
            int r52 = this.f;
            if (r52 > 0) {
                System.arraycopy(r0, 0, this.d, 0, r52);
                System.arraycopy(objArr, 0, this.e, 0, this.f);
            }
            j(r0, objArr, this.f);
        }
    }

    public int indexOf(@i0 Object obj) {
        return obj == null ? o() : n(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return l().m().iterator();
    }

    public boolean r(@h0 b<? extends E> bVar) {
        int r0 = bVar.f;
        int r1 = this.f;
        for (int r3 = 0; r3 < r0; r3++) {
            remove(bVar.t(r3));
        }
        return r1 != this.f;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(@i0 Object obj) {
        int r1 = indexOf(obj);
        if (r1 < 0) {
            return false;
        }
        s(r1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@h0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@h0 Collection<?> collection) {
        boolean z = false;
        for (int r0 = this.f - 1; r0 >= 0; r0--) {
            if (!collection.contains(this.e[r0])) {
                s(r0);
                z = true;
            }
        }
        return z;
    }

    public E s(int r8) {
        Object[] objArr = this.e;
        E e = (E) objArr[r8];
        int r2 = this.f;
        if (r2 <= 1) {
            j(this.d, objArr, r2);
            this.d = j;
            this.e = k;
            this.f = 0;
        } else {
            int[] r0 = this.d;
            if (r0.length <= 8 || r2 >= r0.length / 3) {
                int r02 = this.f - 1;
                this.f = r02;
                if (r8 < r02) {
                    int[] r22 = this.d;
                    int r3 = r8 + 1;
                    System.arraycopy(r22, r3, r22, r8, r02 - r8);
                    Object[] objArr2 = this.e;
                    System.arraycopy(objArr2, r3, objArr2, r8, this.f - r8);
                }
                this.e[this.f] = null;
            } else {
                int r6 = r2 > 8 ? r2 + (r2 >> 1) : 8;
                int[] r03 = this.d;
                Object[] objArr3 = this.e;
                h(r6);
                this.f--;
                if (r8 > 0) {
                    System.arraycopy(r03, 0, this.d, 0, r8);
                    System.arraycopy(objArr3, 0, this.e, 0, r8);
                }
                int r32 = this.f;
                if (r8 < r32) {
                    int r4 = r8 + 1;
                    System.arraycopy(r03, r4, this.d, r8, r32 - r8);
                    System.arraycopy(objArr3, r4, this.e, r8, this.f - r8);
                }
            }
        }
        return e;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f;
    }

    @i0
    public E t(int r2) {
        return (E) this.e[r2];
    }

    @Override // java.util.Collection, java.util.Set
    @h0
    public Object[] toArray() {
        int r0 = this.f;
        Object[] objArr = new Object[r0];
        System.arraycopy(this.e, 0, objArr, 0, r0);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    @h0
    public <T> T[] toArray(@h0 T[] tArr) {
        if (tArr.length < this.f) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f));
        }
        System.arraycopy(this.e, 0, tArr, 0, this.f);
        int length = tArr.length;
        int r1 = this.f;
        if (length > r1) {
            tArr[r1] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f * 14);
        sb.append('{');
        for (int r1 = 0; r1 < this.f; r1++) {
            if (r1 > 0) {
                sb.append(", ");
            }
            E eT = t(r1);
            if (eT != this) {
                sb.append(eT);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
